/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.classes;

import java.time.LocalDate;

/**
 *
 * @author Acer
 */
public class Contrat {
    private int idContrat;
    private String libelleContrat;
    private double montantContrat;
    private LocalDate dateDebutContrat;
    private LocalDate dateFinContrat;

    public Contrat(int idContrat,
                String libelleContrat,
                double montantContrat,
                LocalDate dateDebutContrat,
                LocalDate dateFinContrat) {
        this.setIdContrat(idContrat);
        this.setLibelleContrat(libelleContrat);
        this.setMontantContrat(montantContrat);
        this.setDateDebutContrat(dateDebutContrat);
        this.setDateFinContrat(dateFinContrat);
    }
    

    public int getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(int idContrat) {
        this.idContrat = idContrat;
    }

    public String getLibelleContrat() {
        return libelleContrat;
    }

    public void setLibelleContrat(String libelleContrat) {
        this.libelleContrat = libelleContrat;
    }

    public double getMontantContrat() {
        return montantContrat;
    }

    public void setMontantContrat(double montantContrat) {
        this.montantContrat = montantContrat;
    }

    public LocalDate getDateDebutContrat() {
        return dateDebutContrat;
    }

    public void setDateDebutContrat(LocalDate dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }

    public LocalDate getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(LocalDate dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }

    @Override
    public String toString() {
        return "Contrat{" + "idContrat=" + idContrat + ", libelleContrat=" + libelleContrat + ","
                + " montantContrat=" + montantContrat + ", dateDebutContrat=" + dateDebutContrat + ", dateFinContrat=" + dateFinContrat + '}';
    }
    
    
}
