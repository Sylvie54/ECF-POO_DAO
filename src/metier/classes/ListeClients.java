/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.classes;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Acer
 */
public class ListeClients {
   
    // Liste des clients 
    private static ArrayList<Client> listeClient = new ArrayList<Client>();

    /**
     * @return the listeClient
     */
    public static ArrayList<Client> getListeClient() {
        return listeClient;
    }
    
    
    
    public static Comparator<Client> comparatorNom = (Client  c1, Client  c2)
            -> c1.getRsSociete().toUpperCase().compareTo(c2.getRsSociete().toUpperCase());

    public static void setListeClient(ArrayList<Client> aListeClient) {
        listeClient = aListeClient;
    }
    
    // classe static: classe incluse dans une autre classe
    public static class TriListeClient implements Comparator<Client> {

        @Override
        public int compare(Client  c1, Client  c2)
        {

            return c1.getRsSociete().toUpperCase().compareTo(c2.getRsSociete().toUpperCase());
        }
    }
}




