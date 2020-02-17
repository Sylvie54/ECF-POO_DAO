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
    private static int indice = 0; 
   
    public JsonProspectDAO(Connection conn) {
    super(conn);
  }
    
    public  int create(Prospect prospect) throws Exception {
        System.out.println("create Json Prospect à coder");
        indice++;
        return indice;
    }

  /**
  * Méthode pour effacer
  * @param obj
  * @throws java.lang.Exception 
  */
    @Override
    public  void delete(Prospect prospect) throws Exception {
        System.out.println("delete Json Prospect à coder");
  }

  /**
  * Méthode de mise à jour
  * @param obj
 
  * @throws java.lang.Exception
  */
    @Override
    public void update(Prospect prospect) throws Exception {
        System.out.println("updatete Json Prospect à coder");
  }
 
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
        System.out.println(" Json Prospect rien à trouver");
        return null;
  }
}
