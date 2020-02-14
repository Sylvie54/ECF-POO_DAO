/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.DAOFactory.conn;

/**
 *
 * @author Acer
 */
public class JsonDAOFactory extends AbstractDAOFactory{
    public  DAO getClientDAO() throws Exception{
        System.out.println("JsonFactory getClient à coder");
        return new JsonClientDAO(conn);
  }
  public  DAO getProspectDAO() throws Exception{
        System.out.println("JsonFactory getProspect à coder");
        return new JsonProspectDAO(conn);
  }
}
