/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecf.client.prospect;

import DAO.AbstractDAOFactory;
import DAO.DAO;
import DAO.DAOFactory;
import frames.MenuPrincipal;
import javax.swing.JOptionPane;
import metier.classes.Client;
import metier.classes.ListeClients;
import metier.classes.ListeProspects;
import metier.classes.Prospect;
/**
 * application gérant des clients et des prospects
 * @author Sylvie
 */
public class ecfCliProspDao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            AbstractDAOFactory adf = choixFactory();
            DAO<Client> clientDao = adf.getClientDAO();
            ListeClients.setListeClient(clientDao.liste());
            DAO<Prospect> prospectDao = adf.getProspectDAO();
            ListeProspects.setListeProspects(prospectDao.liste());
        }
           
                        
//            // méthode de classe de la classe Client : initListeClient()
//            Client.initListeClient();
//            // méthode de classe de la classe Prospect : initListeProspect()
//            Prospect.initListeProspect();
        
        catch (Exception e)
            { JOptionPane.showMessageDialog(null,e.getMessage() , "erreur init listes" , JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }  
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
    } 
    public static AbstractDAOFactory choixFactory() {
        AbstractDAOFactory adf = AbstractDAOFactory.getFactory(AbstractDAOFactory.DAO_FACTORY);
        AbstractDAOFactory adfJson = AbstractDAOFactory.getFactory(AbstractDAOFactory.Json_DAO_FACTORY);
        return adf;
    }
    
}
