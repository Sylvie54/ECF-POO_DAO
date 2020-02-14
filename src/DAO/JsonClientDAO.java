/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.util.ArrayList;
import metier.classes.Client;

/**
 *
 * @author Acer
 */
public class JsonClientDAO  extends DAO<Client>{
    private static final Connection conn = null;
    
    public JsonClientDAO(Connection conn) {
    super(conn);
  }
    
    public  int create(Client client) throws Exception {
        return 0;
    }

  /**
  * Méthode pour effacer
  * @param obj
  * @throws java.lang.Exception 
  */
    @Override
  public  void delete(Client client) throws Exception {
      
  }

  /**
  * Méthode de mise à jour
  * @param obj
 
  * @throws java.lang.Exception
  */
    @Override
  public void update(Client client) throws Exception {
      
  }
 
  /**
  * Méthode de recherche des informations
  * @param id
  * @return T
  */
 // public abstract T find(int id) throws Exception;
  
  /**
  * Méthode de liste
  * @return T
     * @throws java.lang.Exception
  */
    @Override
  public  ArrayList<Client> liste() throws Exception {
        System.out.println("liste client vide");
        ArrayList<Client> listeClient = new ArrayList<>();
        return listeClient;
  }
  
  
  public Client find(String raisonSociale) throws Exception {
      return null;
  }
}
