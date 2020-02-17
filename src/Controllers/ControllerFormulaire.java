/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.AbstractDAOFactory;
import DAO.DAO;
import ecf.client.prospect.ecfCliProspDao;
import metier.classes.Client;
import metier.classes.ListeClients;
import metier.classes.ListeProspects;
import metier.classes.Prospect;
import metier.classes.Societe;

/**
 *
 * @author Acer
 */
public class ControllerFormulaire {
        static AbstractDAOFactory adf = ecfCliProspDao.choixFactory();
        
    public static void create(Societe societe) throws Exception {
        int identifiant;
        String typeSociete = societe.getClass().getSimpleName();
        switch (typeSociete) {
                case "Client" :
                Client client = (Client)societe;    
                DAO<Client> clientDao = adf.getClientDAO();
                identifiant = clientDao.create(client);
                client.setIdSociete(identifiant);
                ListeClients.getListeClient().add(client);
                break;
            case "Prospect" : 
                Prospect prospect = (Prospect)societe;    
                DAO<Prospect> prospectDao = adf.getProspectDAO();
                identifiant = prospectDao.create(prospect);
                prospect.setIdSociete(identifiant);
                ListeProspects.getListeProspects().add(prospect);
                break;
            default :
                throw new Exception ("classe inconnue" + typeSociete); 
        }
    } 
    
    public static void update(Societe societe) throws Exception {
        int index;
        String typeSociete = societe.getClass().getSimpleName();
        switch (typeSociete) {
            case "Client" :
                Client client = (Client)societe;    
                DAO<Client> clientDao = adf.getClientDAO();
                clientDao.update(client);
                index = ListeClients.getListeClient().indexOf(client);
                ListeClients.getListeClient().set(index, client); 
            case "Prospect" :
                DAO<Prospect> prospectDAO = adf.getProspectDAO();
                Prospect prospect = (Prospect)societe;
                prospectDAO.update(prospect);
                index = ListeProspects.getListeProspects().indexOf(prospect);
                ListeProspects.getListeProspects().set(index, prospect);
            default :
                throw new Exception ("classe inconnue" + typeSociete);     
        }
    } 
    public static void delete(Societe societe) throws Exception {
        String typeSociete = societe.getClass().getSimpleName();
        switch (typeSociete) {  
            case "Client" :
                DAO<Client> clientDao = adf.getClientDAO();
                Client client = (Client)societe;   
                clientDao.delete(client);
                ListeClients.getListeClient().remove(client);
            case "Prospect" :
                DAO<Prospect> prospectDAO = adf.getProspectDAO();
                Prospect prospect = (Prospect)societe;  
                prospectDAO.delete(prospect);
                ListeProspects.getListeProspects().remove(prospect);
            default :
                throw new Exception ("classe inconnue" + typeSociete); 
        }
    }
}

