/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import metier.classes.Client;
import metier.classes.Contrat;
import metier.classes.ListeClients;


/**
 *
 * @author Sylvie
 */
public class ClientDAO extends DAO<Client> {
    // constructeur, paramètre : la connexion
  public ClientDAO(Connection conn) {
    super(conn);
  }
   private static final Connection conn = Connexion.getInstance();
   private static ResultSet resultat = null;
   
   /**
    * méthode de sélection de toutes les personnes
    * @return Arraylist Client
    * @throws Exception
    */
   @Override
    public ArrayList<Client>  liste() throws Exception{
        try {
                Statement stm = conn.createStatement(); // crÃ©ation d'un objet requÃªte directe 
                resultat = stm.executeQuery("SELECT *  FROM client");
                Client client;
                while (resultat.next())
                {
                    client = new Client(resultat.getInt("id"),
                            resultat.getString("raisonsociale"),
                            resultat.getString("adresse"),
                            resultat.getInt("chiffreaffaire"));
                    ListeClients.getListeClient().add(client);
                }
    
        }
        catch ( SQLException e )
        {
            throw new Exception (e.getMessage());
        }
        finally {
            resultat.close();
        }
        return ListeClients.getListeClient();
    }
    /**
     * méthode d'insertion d'une personne
     * @param client
     * @param Client client
     * @return int valeur de l'identifiant crée en auto incrément 
     * @throws java.lang.Exception
     */
  @Override
    public  int create(Client client) throws Exception {
        int idGenere = 0;
        String query = "INSERT INTO client ("
                + " raisonsociale,"
                + " adresse,"
                +"chiffreaffaire) VALUES ("
                + "?, ?, ?)";
        try{
        /*
            l'option RETURN_GENERATED_KEYS permet de réupéré dans le preparedStatement 
            la valeur de l'id qui vient d'être généré
        */    
            PreparedStatement pstatement =
            conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS );
            //  Recuperation des parametres pour le PreparedStatement
            pstatement.setString(1, client.getRsSociete());
            pstatement.setString(2, client.getAdrSociete());
            pstatement.setLong(3, client.getCaSociete());
            //  Execution du PreparedStatement pour insertion
            pstatement.executeUpdate();
            // récupération de l'id généré
            resultat= pstatement.getGeneratedKeys();
            while (resultat.next()) {
                idGenere = resultat.getInt(1);
            }
        }catch(SQLException SQLex){
            throw new ExceptionDAO("message : " + SQLex.getMessage());
        }
        resultat.close();
        return idGenere;
        
    }
    /**
     * 
     * @param person Person
     * @param ancId String ancien nom de la personne
     * @throws java.lang.Exception
     */
    public  void update(Client client) throws Exception {
        String query = "UPDATE client "
                + "SET raisonsociale = ? "
                + ", adresse = ? "
                + ",chiffreaffaire = ? "
                + "WHERE id = ? ";
        try(PreparedStatement pstatement = conn.prepareStatement(query)){
            //  Recuperation des parametres pour le PreparedStatement
            pstatement.setString(1, client.getRsSociete());
            pstatement.setString(2, client.getAdrSociete());
            pstatement.setLong(3, client.getCaSociete());
            pstatement.setInt(4, client.getIdSociete());
            //  Execution du PreparedStatement pour modif
            pstatement.executeUpdate();
        }catch(SQLException SQLex){
            throw new ExceptionDAO(SQLex.getMessage());
        }
        
    }
    /**
     * méthode de supression d' une personne
     * @param person Person
     * @throws java.lang.Exception
     */
    public void delete(Client client) throws Exception {
        String query = "DELETE FROM client WHERE id = ? ";
        try(PreparedStatement pstatement = conn.prepareStatement(query)){
            //  Recuperation des parametres pour le PreparedStatement
            pstatement.setInt(1, client.getIdSociete());
            //  Execution du PreparedStatement pour modif
            pstatement.executeUpdate();
        }catch(SQLException SQLex){
            SQLex.printStackTrace();
        }
    }
    /**
     * méthode DAO qui retourne un objet Client y compris ses contrats 
     * @param rsSociete raison sociale du client à retourner
     * @return objet client + ses contrats
     * @throws Exception 
     */ 
    public Client find(String rsSociete) throws Exception {
        Client client=null;
        try {
            PreparedStatement stm = conn.prepareStatement("SELECT *  FROM client where raisonsociale =  ?"); 
            stm.setString(1, rsSociete);
            resultat = stm.executeQuery();
            int idClient = 0;
            while (resultat.next())
            {
                idClient =resultat.getInt("id");
                client = new Client(resultat.getInt("id"),
                        resultat.getString("raisonsociale"),
                        resultat.getString("adresse"),
                        resultat.getInt("chiffreaffaire"));
                ListeClients.getListeClient().add(client);
            }
            PreparedStatement stmContrat = conn.prepareStatement("SELECT *  FROM contrat where idclient =  ?"); 
            stmContrat.setInt(1, idClient);
            resultat = stmContrat.executeQuery();
            while (resultat.next())
            {
                Contrat contrat;
                contrat = new Contrat(resultat.getInt("idContrat"),
                        resultat.getString("libellecontrat"),
                        resultat.getDouble("montantContrat"),
                // transforme une date SQL en LocalDate        
                        resultat.getDate("datedebcontrat").toLocalDate(),
                        resultat.getDate("datefincontrat").toLocalDate());
                        client.getListeContrats().add(contrat);
            }
    
        }
        catch ( SQLException e )
        {
            throw new Exception (e.getMessage());
        }
        finally {
            resultat.close();
        }
        return client;
    }

 
}
