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
import java.sql.Date;
import metier.classes.Prospect;
import metier.classes.ListeProspects;

/**
 *
 * @author Acer
 */
public class ProspectDAO extends DAO<Prospect>{
       // constructeur, paramètre : la connexion
  public ProspectDAO(Connection conn) {
    super(conn);
  }
   private static final Connection conn = Connexion.getInstance();
   private static ResultSet resultat = null;
   
   /**
    * méthode de sélection de toutes les personnes
    * @return Arraylist Prospect
    * @throws Exception
    */
   @Override
    public ArrayList<Prospect>  liste() throws Exception{
        try {
                Statement stm = conn.createStatement(); // crÃ©ation d'un objet requÃªte directe 
                resultat = stm.executeQuery("SELECT *  FROM prospect");
                Prospect prospect;
                while (resultat.next())
                {
                    prospect = new Prospect(resultat.getInt("id"),
                            resultat.getString("raisonsociale"),
                            resultat.getString("adresse"),
                            resultat.getInt("chiffreaffaire"),
                            resultat.getDate("dateprospection"),
                            resultat.getInt("interesse"));
                    ListeProspects.getListeProspects().add(prospect);
                }
    
        }
        catch ( SQLException e )
        {
            throw new Exception (e.getMessage());
        }
        finally {
            resultat.close();
        }
        return ListeProspects.getListeProspects();
    }
    /**
     * méthode d'insertion d'une personne
     * @param prospect
     * @param Prospect prospect
     * @return int valeur de l'identifiant crée en auto incrément 
     * @throws java.lang.Exception
     */
  @Override
    public  int create(Prospect prospect) throws Exception {
        int idGenere = 0;
        String query = "INSERT INTO prospect ("
                + " raisonsociale,"
                + " adresse,"
                +"chiffreaffaire," 
                +"dateprospection," 
                +"interesse) VALUES ("
                + "?, ?, ?, ?, ?)";
        try{
        /*
            l'option RETURN_GENERATED_KEYS permet de réupéré dans le preparedStatement 
            la valeur de l'id qui vient d'être généré
        */    
            PreparedStatement pstatement =
            conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS );
            //  Recuperation des parametres pour le PreparedStatement
            pstatement.setString(1, prospect.getRsSociete());
            pstatement.setString(2, prospect.getAdrSociete());
            pstatement.setLong(3, prospect.getCaSociete());
            java.sql.Date sqlDate = new java.sql.Date(prospect.getDateProspection().getTime());
            pstatement.setDate(4,sqlDate );
            pstatement.setInt(5, prospect.getInterresse());
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
    public  void update(Prospect prospect) throws Exception {
        String query = "UPDATE prospect "
                + "SET raisonsociale = ? "
                + ", adresse = ? "
                + ",chiffreaffaire = ? "
                + ",interesse = ? "
                + "WHERE id = ? ";
        try(PreparedStatement pstatement = conn.prepareStatement(query)){
            //  Recuperation des parametres pour le PreparedStatement
            pstatement.setString(1, prospect.getRsSociete());
            pstatement.setString(2, prospect.getAdrSociete());
            pstatement.setLong(3, prospect.getCaSociete());
            pstatement.setInt(4, prospect.getInterresse());
            pstatement.setInt(5, prospect.getIdSociete());
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
    public void delete(Prospect prospect) throws Exception {
        String query = "DELETE FROM prospect WHERE id = ? ";
        try(PreparedStatement pstatement = conn.prepareStatement(query)){
           
            //  Recuperation des parametres pour le PreparedStatement
            pstatement.setInt(1, prospect.getIdSociete());
            //  Execution du PreparedStatement pour modif
            pstatement.executeUpdate();
        }catch(SQLException SQLex){
            SQLex.printStackTrace();
        }
    }
 
}
