/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.exceptions;

/**
 * Classe des exceptions venant des classes "métier"
 * @author Acer
 */
public class MetiersException extends Exception {
   
    public MetiersException(String message) {
           super( message );
    }
    
}
