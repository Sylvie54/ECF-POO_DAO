/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Acer
 */


import java.sql.Connection;
import java.util.ArrayList;

public abstract class DAO<T> {
  protected Connection connect = null;
   
  public DAO(Connection conn){
    this.connect = conn;
  }
   
  /**
  * Méthode de création
  * @param obj
  * @throws java.lang.Exception 
  */
  public abstract int create(T obj) throws Exception;

  /**
  * Méthode pour effacer
  * @param obj
  * @throws java.lang.Exception 
  */
  public abstract void delete(T obj) throws Exception;

  /**
  * Méthode de mise à jour
  * @param obj
 
  * @throws java.lang.Exception
  */
  public abstract void update(T obj) throws Exception;

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
  public abstract ArrayList<T> liste() throws Exception;
  
  public abstract T find(String raisonSociale) throws Exception;
}

