/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;



/**
 *
 * @author Acer
 */
public class Connexion  {
  
    private static Connection conn = null;
    private static ResultSet Resultat = null;
   
    private Connexion() throws Exception {
        File fichier = null;
        try {
            final Properties prop = new Properties();
            fichier = new File("properties");
         if (!fichier.exists())
         {
            fichier = new File("C:\\Users\\Acer\\Documents\\NetBeansProjects\\Projet_Client_Prospect_DAO\\ECFCliProsDAO\\src\\resources\\database.properties");  
         }   
         
        FileInputStream input = new FileInputStream(fichier);
         
        // load a properties file
	prop.load(input);
            
            String driver =(prop.getProperty("sgbd.driver"));        
            String mysqlUser = prop.getProperty("sgbd.login");
            String mysqlPassword = prop.getProperty("sgbd.password");
            String connexionString = prop.getProperty("sgbd.connexionString"); 
            Class.forName(driver);
            conn = DriverManager.getConnection(connexionString, mysqlUser, mysqlPassword);  
        }    
        catch ( ClassNotFoundException e )
        {
            e.printStackTrace();
            System.exit(0);
        }    
        catch (Exception e) {
            e.printStackTrace();
            conn.close();
            System.exit(0);
        }
        
    } 

    public static Connection getInstance()
   {
       
   if(conn == null){
       try
       {    
      new Connexion();
       }
       catch (Exception e)
               {
                   e.printStackTrace(); 
               }        
    }
       
    return conn;
  }  
    public static void closeConnection() throws Exception{
        if (!conn.isClosed()) {
            conn.close();
        }    
    }
 
}
