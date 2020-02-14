/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;

/**
 *
 * @author Acer
 */
public class DAOFactory extends AbstractDAOFactory {
   
    protected static final Connection conn = Connexion.getInstance()  ;   
   
  /**
  * Retourne un objet Classe interagissant avec la BDD
  * @return DAO
  * @throws java.lang.Exception
  */
  public  DAO getClientDAO() throws Exception{
    return new ClientDAO(conn);
  }
  public  DAO getProspectDAO() throws Exception{
    return new ProspectDAO(conn);
  }
  
}
