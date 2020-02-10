/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAO.DAO;
import DAO.DAOFactory;
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
    
    public static void create(Societe societe) throws Exception {
        if (societe instanceof Client) {
            Client client = (Client)societe;    
            DAO<Client> clientDao =  clientDao = DAOFactory.getClientDAO();
            int identifiant = clientDao.create(client);
            client.setIdSociete(identifiant);
            ListeClients.getListeClient().add(client);
        }
        else {
            Prospect prospect = (Prospect)societe;    
            DAO<Prospect> prospectDao =  prospectDao = DAOFactory.getProspectDAO();
            int identifiant = prospectDao.create(prospect);
            prospect.setIdSociete(identifiant);
            ListeProspects.getListeProspects().add(prospect);
    }
    } 
    public static void update(Societe societe) throws Exception {
        if (societe instanceof Client) {
            DAO<Client> clientDao = DAOFactory.getClientDAO();
            Client client = (Client)societe;   
            clientDao.update(client);
            int index = ListeClients.getListeClient().indexOf(client);
            ListeClients.getListeClient().set(index, client); 
        }
        else {
            DAO<Prospect> prospectDAO = DAOFactory.getProspectDAO();
            Prospect prospect = (Prospect)societe;
            prospectDAO.update(prospect);
            int index = ListeProspects.getListeProspects().indexOf(prospect);
            ListeProspects.getListeProspects().set(index, prospect);
        }
    } 
    public static void delete(Societe societe) throws Exception {
        if (societe instanceof Client) {
            DAO<Client> clientDao = DAOFactory.getClientDAO();
            Client client = (Client)societe;   
            clientDao.delete(client);
            ListeClients.getListeClient().remove(client);
        }
        else {
            DAO<Prospect> prospectDAO = DAOFactory.getProspectDAO();
            Prospect prospect = (Prospect)societe;  
            prospectDAO.delete(prospect);
            ListeProspects.getListeProspects().remove(prospect);
        }
        
    }
}
