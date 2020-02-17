/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.classes;

import java.time.LocalDate;
import java.util.Date;

/**
 * Classe Prospect héritée de la classe abstraite Societe
 * @author Acer
 */
public class Prospect extends Societe {
    public enum Interre {
        oui,
        non;
    }
    private LocalDate dateProspection;
    private int interresse;

    public int getInterresse() {
        return interresse;
    }

    public void setInterresse(int interresse) {
        this.interresse = interresse;
    }
    
    /**
     * @return the dateProspection
     */
    public final LocalDate getDateProspection() {
        return dateProspection;
    }

    /**
     * @param dateProspection the dateProspection to set
     */
    public final void setDateProspection(LocalDate dateProspection) throws Exception {
        this.dateProspection = dateProspection;
    }
    /**
     * constructeur par défaut
     */
    public Prospect()
    {
        
    }
    
    /**
     * 
     * Constructeur avec l' Id du client, sa raison sociale, son adresse et son chiffre d'affaire hérité de la classe Societe
     * @param IdSociete : Identifiant de la société
     * @param RsSociete : Raison sociale de la société
     * @param AdrSociete : adresse de la société
     * @param CaSociete : chiffre d'affaire de la société
     * @throws Exception 
     */
    public Prospect(int IdSociete, String RsSociete, String AdrSociete,long CaSociete) throws Exception
    {
        super (IdSociete,RsSociete,AdrSociete, CaSociete);
    }
    
    /**
     * 
     * Constructeur avec l' Id du client, sa raison sociale, son adresse et son chiffre d'affaire hérité de la classe Societe
     * @param IdSociete : Identifiant de la société
     * @param RsSociete : Raison sociale de la société
     * @param AdrSociete : adresse de la société
     * @param CaSociete : chiffre d'affaire de la société
     * @param dateProspection : date de prospection
     * @throws Exception 
     */
    public Prospect(int IdSociete, String RsSociete, String AdrSociete,
            long CaSociete, LocalDate dateProspection, int interre) throws Exception
    {
        super (IdSociete,RsSociete,AdrSociete, CaSociete);
        this.setDateProspection(dateProspection);
        this.setInterresse(interre);
    }
    
    /**
     * 
     * Constructeur de la totalité des attributs de la classe Client
     * @param IdSociete : Identifiant de la société
     * @param RsSociete : Raison sociale de la société
     * @param TypeSociete : type de la société
     * @param DomaineSociete : domaine de la société
     * @param AdrSociete : adresse de la société
     * @param TelSociete : téléphone de la société
     * @param CaSociete : chiffre d'affaire de la société
     * @param CommentaireSociete : commentaire si besoin
     * @param NbreEmplSociete : nombre d'employés de la société
     * @param nbContrats : nombre de contrats
     * @param dateProspection : date de prospection
     * @throws Exception 
     */    
    public Prospect(int IdSociete,
            String RsSociete,
            String TypeSociete,
            String DomaineSociete,
            String AdrSociete,
            String TelSociete,
            long CaSociete,
            String CommentaireSociete,
            long NbreEmplSociete,
            LocalDate dateProspection) throws Exception
    {
        super(IdSociete,RsSociete,TypeSociete,DomaineSociete,AdrSociete,
        TelSociete,CaSociete,CommentaireSociete,NbreEmplSociete);
        this.setDateProspection(dateProspection);
    }
    public Prospect(int IdSociete,
            String RsSociete,
            String TypeSociete,
            String DomaineSociete,
            String AdrSociete,
            String TelSociete,
            long CaSociete,
            String CommentaireSociete,
            long NbreEmplSociete,
            LocalDate dateProspection,
            int interresse) throws Exception
    {
        super(IdSociete,RsSociete,TypeSociete,DomaineSociete,AdrSociete,
        TelSociete,CaSociete,CommentaireSociete,NbreEmplSociete);
        this.setDateProspection(dateProspection);
        this.setInterresse(interresse);
    }
    
    
    
}
