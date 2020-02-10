package metier.classes;


import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class TriListe implements Comparator<Societe> {
      
    public int compare(Societe  c1, Societe  c2)
    {

        return c1.getRsSociete().toUpperCase().compareTo(c2.getRsSociete().toUpperCase());
    }
}
