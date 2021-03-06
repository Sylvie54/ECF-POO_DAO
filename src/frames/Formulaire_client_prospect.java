/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;
import java.util.Date;
import javax.swing.JOptionPane;
import metier.classes.*;
import metier.classes.Prospect.Interre;
import metier.exceptions.MetiersException;
import Controllers.*;
import java.time.LocalDate;
import utilitaires.Utilitaire;

/**
 *
 * @author Sylvie
 */
public class Formulaire_client_prospect extends javax.swing.JFrame {

    private Societe societe; 
    private static int choix = 0;
    private int modifSup;
    private int index;
    /**
     * Creates new form Formulaire_Client
     * constructeur par défaut
     */
    public Formulaire_client_prospect() {
        initComponents();
        initComboInterre();
    }
    /**
     * Création
     * constructeur surchargé avec le paramètre choix (client : 1, prospect  : 2) 
     * @param choix Client ou Prospect
     */
    public Formulaire_client_prospect(int choix) {
        this.choix = choix;
        initComponents();
        initComboInterre();
        affichage();
    }
    /**
     * Modification
     * constructeur surchargé avec comme paramètre la référence de l'objet Societe
     * appel de la méthode init() initialisant les textes du formulaire avec les valeurs des attibuts de l'objet
     * @param societe Classe Societe
     */
    public Formulaire_client_prospect(Societe societe, int modifSup, int index) {
        initComponents();
        initComboInterre();
        this.societe = societe;
        this.modifSup = modifSup;
        this.index = index;
        init(this.modifSup);
        affichage();
    }
    /**
     * méthode d'initialisation des textes du formulaire cavec les valeurs des attibuts de l'objet passé en paramètre
     */
    public final void init(int p_modifSup)
    {
        txtNomClient.setText(societe.getRsSociete());
        txtAdresse.setText(societe.getAdrSociete());
        txtChiffreAffaire.setText(Long.toString(societe.getCaSociete()));
        if (p_modifSup == 2) {
         txtNomClient.setEditable(false);
         txtAdresse.setEditable(false);
         txtChiffreAffaire.setEditable(false);
        }
        if  (societe instanceof Prospect )
            { 
                Prospect leProspect = (Prospect)societe; 
                txtdateProsp.setText(leProspect.getDateProspection().format(utilitaires.Utilitaire.FORMADATE));
                if ( leProspect.getInterresse() == 0) {
                    cbxInterre.setSelectedIndex(0);
                }
                else {
                    cbxInterre.setSelectedIndex(1);
                }
                if (p_modifSup == 2) {
                    txtdateProsp.setEditable(false);
                    cbxInterre.setEditable(false);
                            
                }
            }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitre = new javax.swing.JLabel();
        passage_param = new javax.swing.JLabel();
        btnQuitter = new javax.swing.JButton();
        btnRetour = new javax.swing.JButton();
        lbNomClient = new javax.swing.JLabel();
        txtNomClient = new javax.swing.JTextField();
        lbAdresse = new javax.swing.JLabel();
        txtAdresse = new javax.swing.JTextField();
        lblCa = new javax.swing.JLabel();
        txtChiffreAffaire = new javax.swing.JTextField();
        btnValidation = new javax.swing.JButton();
        lblDateProspection = new javax.swing.JLabel();
        cbxInterre = new javax.swing.JComboBox<>();
        lblInterre = new javax.swing.JLabel();
        txtdateProsp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitre.setText(" ");
        lblTitre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnQuitter.setText("Quitter");
        btnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitterActionPerformed(evt);
            }
        });

        btnRetour.setText("Retour accueil");
        btnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourActionPerformed(evt);
            }
        });

        lbNomClient.setText("Nom Client");

        txtNomClient.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomClientFocusPerformed(evt);
            }
        });
        txtNomClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomClientActionPerformed(evt);
            }
        });

        lbAdresse.setText("Adresse");

        lblCa.setText("chiffres d'affaire");

        txtChiffreAffaire.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtChiffreAffaireFocusPerformed(evt);
            }
        });

        btnValidation.setText("Valider");
        btnValidation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidationActionPerformed(evt);
            }
        });

        lblDateProspection.setText("Date Prospection (jj-mm-aaaa)");

        lblInterre.setText("Interressé ?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNomClient)
                            .addComponent(lbAdresse)
                            .addComponent(lblCa)
                            .addComponent(lblInterre, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomClient, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChiffreAffaire, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxInterre, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDateProspection, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtdateProsp, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 373, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRetour)
                            .addComponent(btnQuitter)
                            .addComponent(btnValidation))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(passage_param)
                        .addGap(178, 178, 178))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(lblTitre)
                .addGap(32, 32, 32)
                .addComponent(passage_param)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomClient)
                    .addComponent(txtNomClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAdresse)
                    .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCa)
                    .addComponent(txtChiffreAffaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateProspection)
                    .addComponent(txtdateProsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxInterre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInterre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addComponent(btnValidation)
                .addGap(64, 64, 64)
                .addComponent(btnRetour)
                .addGap(18, 18, 18)
                .addComponent(btnQuitter)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitterActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnQuitterActionPerformed

    private void btnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourActionPerformed
        MenuPrincipal menuprincipal = new MenuPrincipal();
        menuprincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetourActionPerformed

    private void txtNomClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomClientActionPerformed
    }//GEN-LAST:event_txtNomClientActionPerformed

    private void txtNomClientFocusPerformed(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomClientFocusPerformed
    }//GEN-LAST:event_txtNomClientFocusPerformed

    private void txtChiffreAffaireFocusPerformed(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtChiffreAffaireFocusPerformed
        try {
            Long.parseLong(txtChiffreAffaire.getText());
        } catch (NumberFormatException e) {
           System.out.println("évènement perte de focus chiffre d'affaire" + e.getMessage()); 
           JOptionPane.showMessageDialog(null,"le chiffre d'affaire doit être numérique" ,
                   "erreur perte focus" , JOptionPane.INFORMATION_MESSAGE);
           txtChiffreAffaire.requestFocus();
        }
        
    }//GEN-LAST:event_txtChiffreAffaireFocusPerformed

    private void btnValidationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidationActionPerformed
        try {
           int interre; 
           // ***********   modification ou suppression ************
           if (societe != null)
           { 
              // ----------- modification --------------- 
              if (modifSup == 1) {
                societe.setRsSociete(txtNomClient.getText());
                societe.setAdrSociete(txtAdresse.getText());
                societe.setCaSociete(Long.parseLong(txtChiffreAffaire.getText())); 
                if (societe instanceof Client)
                { 
                    Client client = (Client)societe;
                    ControllerFormulaire.update(client);
                }
                else
                {
                    if (cbxInterre.getSelectedIndex() == 0) {
                        interre = 0;
                    }
                    else {
                        interre = 1;
                    }
                        
                    Prospect prospect = (Prospect)societe;
                    prospect.setDateProspection(testDateProsp());
                    prospect.setInterresse(interre);
                    ControllerFormulaire.update(prospect);
                } 
            JOptionPane.showMessageDialog(null,"maj effectuée" , "" , JOptionPane.INFORMATION_MESSAGE);
            MenuPrincipal menuprincipal = new MenuPrincipal();
            menuprincipal.setVisible(true);
            this.dispose();
              }
              // suppression
              
              else {
                  String lib;  
                if (choix == 1) {
                    lib = "client";
                }
                else
                {
                    lib = "prospect";
                }
                int valid =   JOptionPane.showConfirmDialog(null,
                    "voulez vous supprimer le " + lib + " " + societe.getRsSociete() + " ?");
                if (valid == 0) {
                    if (choix ==1 ) {
                        Controllers.ControllerFormulaire.delete(societe);
                    }
                    else {
                        ControllerFormulaire.delete(societe);
                    }
               JOptionPane.showMessageDialog(null,"suppression effectuée" , "" , JOptionPane.INFORMATION_MESSAGE);
           }
            MenuPrincipal menuprincipal = new MenuPrincipal();
            menuprincipal.setVisible(true);
            this.dispose();
              }
           }      
           // ----------------  sinon, création   ------------------
           else
           {
               if (choix == 1)
               {
                   // recup nbClient et incrémentation
                   
                   Client client = new Client(0, txtNomClient.getText(), txtAdresse.getText(),
                   Long.parseLong(txtChiffreAffaire.getText()));
                   ControllerFormulaire.create(client);
               }
               else
               {
                   // récup nbProspect et incrémentationint interre;
                    if (cbxInterre.getSelectedIndex() == 0) {
                        interre = 0;
                    }
                    else {
                        interre = 1;
                    }
                   LocalDate dateprosp = testDateProsp();
                   Prospect prospect = new Prospect(0, txtNomClient.getText(), txtAdresse.getText(),
                   Long.parseLong(txtChiffreAffaire.getText()), dateprosp, interre);
                   ControllerFormulaire.create(prospect);
                   
                }
               JOptionPane.showMessageDialog(null,"ajout effectué" , "" , JOptionPane.INFORMATION_MESSAGE);
               txtNomClient.setText("");
               txtAdresse.setText("");
               txtChiffreAffaire.setText("");
           }
           
       }
       catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"le chiffre d'affaire doit être numérique" , "erreur NumberFormatException" , JOptionPane.ERROR_MESSAGE);
        }
       catch (MetiersException e)  {
            JOptionPane.showMessageDialog(null,e.getMessage() , "vient de la classe métier" , JOptionPane.ERROR_MESSAGE);
       }
       catch (Exception e)  {
            JOptionPane.showMessageDialog(null,"un problème est survenu" , "erreur Exception" , JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(0);
       }
    }//GEN-LAST:event_btnValidationActionPerformed
      
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulaire_client_prospect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulaire_client_prospect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulaire_client_prospect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulaire_client_prospect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulaire_client_prospect().setVisible(true);
            }
        });
    }
    private LocalDate testDateProsp() throws Exception{
       LocalDate dateprosp=null;
       try { 
       dateprosp = LocalDate.parse(txtdateProsp.getText(),utilitaires.Utilitaire.FORMADATE);
       }
       catch (Exception e) {
           throw  new MetiersException ("la date de prospection n'est pas au bon format");
       }
       return dateprosp;
    }

    private final void affichage()
    {         
        if ((societe instanceof Client) || (choix == 1))
        {   
           lblTitre.setText("Gestion des Clients");
           lblDateProspection.setVisible(false);
           txtdateProsp.setVisible(false);
           lblInterre.setVisible(false);
           cbxInterre.setVisible(false);
        }
        else
        {
           lblTitre.setText("Gestion des prospects");
           lblDateProspection.setVisible(true);
           txtdateProsp.setVisible(true);
        }
    }
    private void  initComboInterre() {
        for (Interre interre : Prospect.Interre.values() )
        {
            cbxInterre.addItem(interre.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuitter;
    private javax.swing.JButton btnRetour;
    private javax.swing.JButton btnValidation;
    private javax.swing.JComboBox<String> cbxInterre;
    private javax.swing.JLabel lbAdresse;
    private javax.swing.JLabel lbNomClient;
    private javax.swing.JLabel lblCa;
    private javax.swing.JLabel lblDateProspection;
    private javax.swing.JLabel lblInterre;
    private javax.swing.JLabel lblTitre;
    private javax.swing.JLabel passage_param;
    private javax.swing.JTextField txtAdresse;
    private javax.swing.JTextField txtChiffreAffaire;
    private javax.swing.JTextField txtNomClient;
    private javax.swing.JTextField txtdateProsp;
    // End of variables declaration//GEN-END:variables
}



