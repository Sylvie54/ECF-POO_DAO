/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.classes;

import metier.exceptions.MetiersException;

/**
 * societe : classe abstraite dont hérite Client et Prospect
 * permet la gestion des clients ou des sociétés
 * @author Sylvie
 */
public abstract class Societe {
    
// -------------------------- Attributs ---------------------------

    private int idSociete;
    private String rsSociete;
    private String typeSociete;
    private String domaineSociete;
    private String adrSociete;
    private String telSociete;
    private long caSociete;
    private String commentaireSociete;
    private long nbreEmplSociete; 
        
      
    public int getIdSociete()
    {
        return idSociete;
    }
  /**
  * Identifiant Societe
  * @param VarIdSociete : paramètre d'entrée du setteur
  */        
    public final void setIdSociete(int VarIdSociete)  {
        this.idSociete= VarIdSociete;
    }   
    

    /**
     * raison sociale de la société
     * @return the rsSociete
     */
    public String getRsSociete()
    {
        return rsSociete;
    }
    
 /**
 * Raison sociale RsSociete: test si la longueur est égale à zéro
 * @param Var_RsSociete
 * @throws Exception : Exceptions_Metiers 
 */
    public final void setRsSociete(String Var_RsSociete) throws MetiersException
    {
        
       if (Var_RsSociete.isEmpty())
        {
            throw (new MetiersException("raison sociale vide"));
        }
        this.rsSociete= Var_RsSociete;
    } 

    /**
     * @return the TypeSociete
     */
    public String getTypeSociete() {
        return this.typeSociete;
    }

    /**
     * @param TypeSociete the TypeSociete to set
     */
    public final void setTypeSociete(String TypeSociete) {
        this.typeSociete= TypeSociete;
    }

    /**
     * @return the DomaineSociete
     */
    public String getDomaineSociete() {
        return this.domaineSociete;
    }

    /**
     * @param DomaineSociete the DomaineSociete to set
     */
    public final void setDomaineSociete(String DomaineSociete) {
        this.domaineSociete= DomaineSociete;
    }

    /**
     * @return the AdrSociete
     */
    public String getAdrSociete() {
        return this.adrSociete;
    }

    /**
     * @param AdrSociete the AdrSociete to set
     */
    public final void setAdrSociete(String AdrSociete) {
        this.adrSociete= AdrSociete;
    }

    /**
     * @return the TelCLient
     */
    public String getTelSociete() {
        return this.telSociete;
    }

    /**
     * @param TelSociete the TelSociete to set
     */
    public final void setTelSociete(String TelSociete) {
        this.telSociete = TelSociete;
    }

    /**
     * @return the CaSociete
     */
    public long getCaSociete() {
        return this.caSociete;
    }

    /**
     * 
     * @param CaSociete
     * @throws Exception : Exceptions_Metiers
     * @see metier.exceptions.MetiersException
     */
    public final void setCaSociete(long CaSociete) throws MetiersException{
        if (CaSociete < 100)
        {
          throw (new MetiersException("chiffre d'affaire inférieur à 100"));   
        }
        this.caSociete= CaSociete;
    }

    /**
     * @return the CommentaireCLient
     */
    public String getCommentaireSociete() {
        return this.commentaireSociete;
    }

    /**
     * @param CommentaireSociete the CommentaireCLient to set
     */
    public final void setCommentaireSociete(String CommentaireSociete) {
        this.commentaireSociete = CommentaireSociete;
    }

    /**
     * @return the NbreEmplSociete : nombre d'employés de la société
     */
    public long getNbreEmplSociete() {
        return this.nbreEmplSociete;
    }

    /**
     * @param NbreEmplSociete the NbreEmplSociete to set
     */
    public final void setNbreEmplSociete(long NbreEmplSociete) {
        this.nbreEmplSociete= NbreEmplSociete;
    }
    
    /**
     * Constructeur par défaut
     */
    public Societe() {
        
    }
 
    /**
     * Constructeur avec l' Id de la société et sa raison sociale
     * @param IdSociete Identifiant de la société
     * @param RsSociete Raison sociale de la société
     * @throws Exception 
     */
    public Societe(int IdSociete, String RsSociete) throws MetiersException
    {
       this.setIdSociete(IdSociete);
       this.setRsSociete(RsSociete);
    }
    
    /**
     * Constructeur de la totalité des attributs de la classe Societe
     * @param IdSociete : Identifiant de la société
     * @param RsSociete : Raison sociale de la société
     * @param TypeSociete : type de la société
     * @param DomaineSociete : domaine de la société
     * @param AdrSociete : adresse de la société
     * @param TelSociete : téléphone de la société
     * @param CaSociete : chiffre d'affaire de la société
     * @param CommentaireSociete : commentaire si besoin
     * @param NbreEmplSociete : nombre d'employés de la société
     * @throws Exception 
     */
    public Societe(int IdSociete,
            String RsSociete,
            String TypeSociete,
            String DomaineSociete,String AdrSociete,
            String TelSociete,
            long CaSociete,
            String CommentaireSociete,
            long NbreEmplSociete)
        throws MetiersException
    {
        this.setIdSociete(IdSociete);
        this.setRsSociete(RsSociete);
        this.setTypeSociete(TypeSociete);
        this.setDomaineSociete(DomaineSociete);
        this.setAdrSociete(AdrSociete);
        this.setTelSociete(TelSociete);
        this.setCaSociete(CaSociete);
        this.setCommentaireSociete(CommentaireSociete);
        this.setNbreEmplSociete(NbreEmplSociete);
        
    }
    
    /**
     * Constructeur avec l' Id de la société, sa raison sociale, son adresse et son chiffre d'affaire hérité de la classe Societe
     * @param IdSociete : Identifiant de la société
     * @param RsSociete : Raison sociale de la société
     * @param AdrSociete : adresse de la société
     * @param CaSociete : chiffre d'affaire de la société
     * @throws Exception 
     */
    public Societe(int IdSociete,
            String RsSociete,
            String AdrSociete,
            long CaSociete)
       throws MetiersException
    {
       this.setIdSociete(IdSociete);
       this.setRsSociete(RsSociete);
       this.setAdrSociete(AdrSociete);
       this.setCaSociete(CaSociete);
    }
    @Override
    public String toString() {
        return rsSociete;
    }
         
}
