/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.classes;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class ListeProspects {
    
    private static ArrayList<Prospect> listeProspects = new ArrayList<Prospect>();

    /**
     * @return the listeProspects
     */
    public static ArrayList<Prospect> getListeProspects() {
        return listeProspects;
    }

    public static void setListeProspects(ArrayList<Prospect> aListeProspects) {
        listeProspects = aListeProspects;
    }
}
