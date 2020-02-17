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
public abstract class AbstractDAOFactory {
    public static final int DAO_FACTORY = 0;
  public static final int Json_DAO_FACTORY = 1;

  //Retourne un objet Classe interagissant avec la BDD
  public abstract DAO getClientDAO() throws Exception;
   
  //Retourne un objet Professeur interagissant avec la BDD
  public abstract DAO getProspectDAO() throws Exception;
   
  //Méthode permettant de récupérer les Factory
  public static AbstractDAOFactory getFactory(int type){
    switch(type){
      case DAO_FACTORY:
        return new DAOFactory();
      case Json_DAO_FACTORY: 
        return new JsonDAOFactory();
      default:
        return null;
    }
  }
}
