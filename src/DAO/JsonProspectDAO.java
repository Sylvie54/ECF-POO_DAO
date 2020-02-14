/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.util.ArrayList;
import metier.classes.Client;
import metier.classes.Prospect;

/**
 *
 * @author Acer
 */
public class JsonProspectDAO extends DAO<Prospect>{
    private static final Connection conn = null;
    
    public JsonProspectDAO(Connection conn) {
    super(conn);
  }
    
    public  int create(Prospect prospect) throws Exception {
        return 0;
    }

  /**
  * Méthode pour effacer
  * @param obj
  * @throws java.lang.Exception 
  */
    @Override
  public  void delete(Prospect prospect) throws Exception {
      
  }

  /**
  * Méthode de mise à jour
  * @param obj
 
  * @throws java.lang.Exception
  */
    @Override
  public void update(Prospect prospect) throws Exception {
      
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
  public  ArrayList<Prospect> liste() throws Exception {
       System.out.println("liste client vide");
       ArrayList<Prospect> listeProspects = new ArrayList<Prospect>();
      return listeProspects;
  }
  
  
  public Prospect find(String raisonSociale) throws Exception {
      return null;
  }
}
