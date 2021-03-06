/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import metier.classes.*;



/**
 *
 * @author Sylvie
 * @version : 1.3
 * ECF POO Java - Exception - Collections
 */
public class MenuPrincipal extends javax.swing.JFrame {
   
    // variable indiquant si c'est une gestion de clients (1) ou prospects (2)
    int choix;
    // variable indiquant si c'est une modification (1) ou une suppression (2)
    int modifSup;
    /**
     * Creates new form MenuPrincipal
     * initialisation des 2 listes : clients et prospects
     */
    public MenuPrincipal() {
        initComponents();
        // le panel Action (creation/modification) non visble
        panelAction.setVisible(false);
        // le panel Combo (affichage de la comboBox et du bouton validation) non visble
        panelCombo.setVisible(false);
        btnRetour.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitre = new javax.swing.JLabel();
        btnQuitter = new javax.swing.JButton();
        panelChoix = new javax.swing.JPanel();
        btnClient = new javax.swing.JButton();
        btnProspect = new javax.swing.JButton();
        panelAction = new javax.swing.JPanel();
        btnAfficher = new javax.swing.JButton();
        btnSuppression = new javax.swing.JButton();
        btnCreation = new javax.swing.JButton();
        btnModification = new javax.swing.JButton();
        btnAffichageContrat = new javax.swing.JButton();
        lblChoix = new javax.swing.JLabel();
        btnRetour = new javax.swing.JButton();
        panelCombo = new javax.swing.JPanel();
        cbxChoix = new javax.swing.JComboBox<>();
        btnValidation = new javax.swing.JButton();
        lblCombo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 1000));

        labelTitre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitre.setText("Gestion Clients Propects");
        labelTitre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnQuitter.setText("Quitter");
        btnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitterActionPerformed(evt);
            }
        });

        panelChoix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnClient.setText("Client");
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });

        btnProspect.setText("Prospect");
        btnProspect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProspectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelChoixLayout = new javax.swing.GroupLayout(panelChoix);
        panelChoix.setLayout(panelChoixLayout);
        panelChoixLayout.setHorizontalGroup(
            panelChoixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChoixLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnClient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(btnProspect)
                .addGap(52, 52, 52))
        );
        panelChoixLayout.setVerticalGroup(
            panelChoixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChoixLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelChoixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClient)
                    .addComponent(btnProspect))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        panelAction.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAfficher.setText("Affichage");
        btnAfficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfficherActionPerformed(evt);
            }
        });

        btnSuppression.setText("Suppression");
        btnSuppression.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppressionActionPerformed(evt);
            }
        });

        btnCreation.setText("Création");
        btnCreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreationActionPerformed(evt);
            }
        });

        btnModification.setText("Modification");
        btnModification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificationActionPerformed(evt);
            }
        });

        btnAffichageContrat.setText("Affichage contrats");
        btnAffichageContrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAffichageContratActionPerformed(evt);
            }
        });

        lblChoix.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblChoix.setText("jLabel2");

        javax.swing.GroupLayout panelActionLayout = new javax.swing.GroupLayout(panelAction);
        panelAction.setLayout(panelActionLayout);
        panelActionLayout.setHorizontalGroup(
            panelActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActionLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnCreation)
                .addGap(27, 27, 27)
                .addComponent(btnModification)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChoix, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelActionLayout.createSequentialGroup()
                        .addComponent(btnSuppression)
                        .addGap(18, 18, 18)
                        .addComponent(btnAfficher)
                        .addGap(18, 18, 18)
                        .addComponent(btnAffichageContrat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelActionLayout.setVerticalGroup(
            panelActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblChoix, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreation)
                    .addComponent(btnModification)
                    .addComponent(btnSuppression)
                    .addComponent(btnAfficher)
                    .addComponent(btnAffichageContrat))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        btnRetour.setText("Retour");
        btnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourActionPerformed(evt);
            }
        });

        panelCombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnValidation.setText("Valider");
        btnValidation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidationActionPerformed(evt);
            }
        });

        lblCombo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCombo.setText("jLabel2");

        javax.swing.GroupLayout panelComboLayout = new javax.swing.GroupLayout(panelCombo);
        panelCombo.setLayout(panelComboLayout);
        panelComboLayout.setHorizontalGroup(
            panelComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComboLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnValidation))
            .addGroup(panelComboLayout.createSequentialGroup()
                .addGroup(panelComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelComboLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cbxChoix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelComboLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        panelComboLayout.setVerticalGroup(
            panelComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComboLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxChoix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(btnValidation))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 625, Short.MAX_VALUE)
                                .addComponent(btnRetour))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnQuitter)))
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(panelChoix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(labelTitre)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(labelTitre)
                .addGap(76, 76, 76)
                .addComponent(panelChoix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(panelAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnRetour)
                .addGap(72, 72, 72)
                .addComponent(btnQuitter)
                .addGap(123, 123, 123))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Bouton Quitter
     * @param evt 
     */
    private void btnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitterActionPerformed
       System.exit(0);
        
    }//GEN-LAST:event_btnQuitterActionPerformed
    /**
     * Bouton Action : Client
     * choix = 1
     * @param evt 
     */
    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed
        // choix 1 gestion des clients
        choix = 1;
        lblChoix.setText("Clients");
        panelAction.setVisible(true);
        panelChoix.setVisible(false);
        btnRetour.setVisible(true);
     
    }//GEN-LAST:event_btnClientActionPerformed
    /**
     * panel choix (client/prospect) visible,
     * panel action (création/modification),
     * panel de la combobox et son bouton validation non visible
     * @param evt 
     */
    private void btnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourActionPerformed
        panelChoix.setVisible(true);
        panelAction.setVisible(false);
        panelCombo.setVisible(false);
        btnRetour.setVisible(false);
         btnAffichageContrat.setVisible(true);
    }//GEN-LAST:event_btnRetourActionPerformed

   /**
     * Bouton Validation de modification
     * lecture de la liste
     * quand le client ou le prospect est trouvé -> instanciation d'un objet de la classe Formulaire_Client
     * avec comme paramètre l'objet sélectionné 
     * @param evt 
     */
    private void btnValidationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidationActionPerformed
        int index = cbxChoix.getSelectedIndex()-1;
       // si il n'y a pas de sélection -> erreur 
       try {
       if (cbxChoix.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(null,"vous devez faire une sélection" , "" , JOptionPane.INFORMATION_MESSAGE);
        }
       // sinon on passe en paramètre au formulaire de saisie/modification un objet societe
       // correspondant soit à l'objet client, soit l'objet prospect sélectionné
        else
        {
            Societe societe = null;
            // récup de l'objet sélectionné dans la combobox
            if (choix == 1)
            {
                societe = ListeClients.getListeClient().get(cbxChoix.getSelectedIndex()-1);
            }
            else
            {
                societe = ListeProspects.getListeProspects().get(cbxChoix.getSelectedIndex()-1);
            }
                // instanciation de l'objet formulaire avec en paramètres :
                // l'objet à modifier ou supprimer, si modif (1) ou suppression (2) et index de l'objet dans la liste
            if (modifSup == 1 || modifSup == 2 ) {    
                
                Formulaire_client_prospect formulaire_Client = new Formulaire_client_prospect(societe, modifSup, index);
                formulaire_Client.setVisible(true);
            }
            // ---------------   modifSup = 3 : affichage des contrats du client
            else { // modifSup = 3 : affichage contrats
                Client client = (Client)societe;
                System.out.println(client.getRsSociete());
                AffContratsClient affContratsClient = new AffContratsClient(client.getRsSociete());
                affContratsClient.setVisible(true);
            }
            // fermeture de cette fenêtre
            this.dispose();
            }
            panelChoix.setVisible(true);
            panelAction.setVisible(false);
            panelCombo.setVisible(false);
            
       }
       catch (Exception e) {
            JOptionPane.showMessageDialog(null,"un problème est survenu" , "erreur Exception" , JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(0);   
        }
    }//GEN-LAST:event_btnValidationActionPerformed

    private void btnProspectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProspectActionPerformed
        // choix 2 gestion des prospects        
        choix = 2;
        lblChoix.setText("Prospects");
        panelAction.setVisible(true);
        panelChoix.setVisible(false);
        btnRetour.setVisible(true);
        btnAffichageContrat.setVisible(false);
    }//GEN-LAST:event_btnProspectActionPerformed

    private void btnSuppressionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppressionActionPerformed
        // supression
        modifSup = 2;
        selectionSociete();
    }//GEN-LAST:event_btnSuppressionActionPerformed

    private void btnAfficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfficherActionPerformed
        // choix : 1 pour client, 2 pour prospect
        Affichage affichage = new Affichage(choix);
        // supprime l'action de fermeture quand l'utilisateur appuie sur la croix
        affichage.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        affichage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAfficherActionPerformed

    private void btnCreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreationActionPerformed
        Formulaire_client_prospect  formulaireClient = new Formulaire_client_prospect(choix);
        formulaireClient.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCreationActionPerformed

    private void btnModificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificationActionPerformed
       // modification
       modifSup = 1;
       selectionSociete();
                                              
    }//GEN-LAST:event_btnModificationActionPerformed

    private void btnAffichageContratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAffichageContratActionPerformed
        // affichage des contrats d'un client
        modifSup = 3;
        selectionSociete();
    }//GEN-LAST:event_btnAffichageContratActionPerformed
    /**
     * méthode  qui remplit la combobox 
     */
    private void selectionSociete() {
        // vidage des éléments
       cbxChoix.removeAllItems();
       
        // remplissage combo box client si choix = 1, prospect sinon
       if (choix == 1 )
       {
            lblCombo.setText("Gestion des clients");
            // Tri avec la classe static TriListeClient de la classe ListClient
            Collections.sort(ListeClients.getListeClient(),new ListeClients.TriListeClient());
            cbxChoix.addItem("sélectionnez un client ");
//          for (Client client : Client.getListeClient())   
            ListeClients.getListeClient().forEach((client) -> {
                {
                    cbxChoix.addItem(client.getRsSociete());
                }
            });
        }    
        else
        {
            lblCombo.setText("Gestion des prospects");
            // Tri avec la classe Triliste implémentant l'interface Comparator typé Societe
            Collections.sort(ListeProspects.getListeProspects(),new TriListe());
            cbxChoix.addItem("sélectionnez un prospect ");
            for (Prospect prospect : ListeProspects.getListeProspects())
            { 
                cbxChoix.addItem(prospect.getRsSociete());
            }
        }
        // affichage du panel contenant la comboBox
        panelCombo.setVisible(true);
        // le panel Action (création/mofdification) devient non visible
        panelAction.setVisible(false);
    }
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAffichageContrat;
    private javax.swing.JButton btnAfficher;
    private javax.swing.JButton btnClient;
    private javax.swing.JButton btnCreation;
    private javax.swing.JButton btnModification;
    private javax.swing.JButton btnProspect;
    private javax.swing.JButton btnQuitter;
    private javax.swing.JButton btnRetour;
    private javax.swing.JButton btnSuppression;
    private javax.swing.JButton btnValidation;
    private javax.swing.JComboBox<String> cbxChoix;
    private javax.swing.JLabel labelTitre;
    private javax.swing.JLabel lblChoix;
    private javax.swing.JLabel lblCombo;
    private javax.swing.JPanel panelAction;
    private javax.swing.JPanel panelChoix;
    private javax.swing.JPanel panelCombo;
    // End of variables declaration//GEN-END:variables
}
