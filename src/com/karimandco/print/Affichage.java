/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karimandco.print;

import com.karimandco.admin.Connexion;
import com.karimandco.admin.DialogPanneauAdministration;
import com.karimandco.auth.CurriculumVitae;
import com.karimandco.auth.DialogFormConnexion;
import com.karimandco.auth.Utilisateur;
import com.karimandco.cv.DialogFormCv;
import com.karimandco.end.JPanelConnexionBanque;
import com.karimandco.importexport.ImportExportCSV;
import com.karimandco.importexport.ImportExportJSON;
import com.karimandco.importexport.ImportExportXML;
import com.karimandco.pdf.SelectionnerPDF;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Damien
 */
public class Affichage extends javax.swing.JFrame {

    public com.karimandco.auth.DialogFormConnexion cConnexion;
    public com.karimandco.cv.DialogFormCv cCv;
    public com.karimandco.admin.DialogPanneauAdministration gAdmin;

    /**
     * Creates new form Affichage
     */
    public Affichage() {
        initComponents();
        this.jMenuConnexion.setVisible(true);
        this.jMenuCv.setVisible(false);
        this.jMenuAdministrationGestionAdmin.setVisible(false);
        this.jMenu1.setVisible(false);
        jLayeredPaneAdministration.setVisible(false);
        this.setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jLayeredPaneAdministration = new javax.swing.JLayeredPane();
        choisirImage1 = new com.karimandco.image.ChoisirImage();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuConnexion = new javax.swing.JMenu();
        jMenuCv = new javax.swing.JMenu();
        jMenuAdministrationGestionAdmin = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuAdministrationExportationXml = new javax.swing.JMenuItem();
        jMenuAdministrationExportationCsv = new javax.swing.JMenuItem();
        jMenuAdministrationExportationJson = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPaneAdministration.setLayer(choisirImage1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPaneAdministrationLayout = new javax.swing.GroupLayout(jLayeredPaneAdministration);
        jLayeredPaneAdministration.setLayout(jLayeredPaneAdministrationLayout);
        jLayeredPaneAdministrationLayout.setHorizontalGroup(
            jLayeredPaneAdministrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneAdministrationLayout.createSequentialGroup()
                .addGap(462, 462, 462)
                .addComponent(choisirImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(547, Short.MAX_VALUE))
        );
        jLayeredPaneAdministrationLayout.setVerticalGroup(
            jLayeredPaneAdministrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPaneAdministrationLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(choisirImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
        );

        jMenuConnexion.setText("Profil");
        jMenuConnexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuConnexionMouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenuConnexion);

        jMenuCv.setText("Curriculum vitae");
        jMenuCv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCvMouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenuCv);

        jMenuAdministrationGestionAdmin.setText("Administration");
        jMenuAdministrationGestionAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAdministrationGestionAdminMouseClicked(evt);
            }
        });

        jMenuItem1.setText("Gestion Administration");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuAdministrationGestionAdmin.add(jMenuItem1);

        jMenuAdministrationExportationXml.setText("exportation XML");
        jMenuAdministrationGestionAdmin.add(jMenuAdministrationExportationXml);

        jMenuAdministrationExportationCsv.setText("exportation CSV");
        jMenuAdministrationExportationCsv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAdministrationExportationCsvMouseClicked(evt);
            }
        });
        jMenuAdministrationGestionAdmin.add(jMenuAdministrationExportationCsv);

        jMenuAdministrationExportationJson.setText("exportation JSON");
        jMenuAdministrationExportationJson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAdministrationExportationJsonMouseClicked(evt);
            }
        });
        jMenuAdministrationGestionAdmin.add(jMenuAdministrationExportationJson);

        jMenuBar2.add(jMenuAdministrationGestionAdmin);

        jMenu1.setText("photo");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPaneAdministration)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPaneAdministration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuConnexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConnexionMouseClicked
        cConnexion = new DialogFormConnexion(this);
        cConnexion.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cConnexion.getjPanelConnexionBanque1().getPanneauIdentifiant().getChamp2().setText("admin");
        cConnexion.getjPanelConnexionBanque1().getPanneauMdp().getChampSecret1().setText("123456");
        cConnexion.getjPanelConnexionBanque1().getjButtonConfirmerConnexion().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Boolean estConnecter = Utilisateur.getInstance().getEstConnecte();
                Utilisateur.getInstance().setEstConnecte(estConnecter);
                if (cConnexion.getjPanelConnexionBanque1().getConnexionOk()) {
                    cConnexion.dispose();
                    cConnexion.setVisible(false);
                    jMenuBar2.setVisible(true);
                    if (Utilisateur.getInstance().getStatut() == 1) {
                        jMenuAdministrationGestionAdmin.setVisible(true);
                        jMenuCv.setVisible(true);
                        jMenu1.setVisible(true);
                    } else {
                        jMenuAdministrationGestionAdmin.setVisible(false);
                        jMenuCv.setVisible(true);
                        jMenu1.setVisible(true);
                    }
                } else {
                    cConnexion.setVisible(true);
                }
            }

            @Override
            public void mousePressed(MouseEvent me) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent me) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
        cConnexion.setLocationRelativeTo(this);
        cConnexion.setModal(true);
        cConnexion.setVisible(true);
    }//GEN-LAST:event_jMenuConnexionMouseClicked

    private void jMenuCvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCvMouseClicked
        cCv = new DialogFormCv(this);
        System.out.println(Utilisateur.getInstance().getId());
        System.out.println(CurriculumVitae.getInstance().getIdCv().get(0));
        cCv.getPanneauCv().setIdUtilisateur(Utilisateur.getInstance().getId());
        CurriculumVitae.getInstance();
        cCv.getPanneauCv().setIdCV(CurriculumVitae.getInstance().getIdCv().get(0));
        cCv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cCv.setLocationRelativeTo(this);
        cCv.setModal(true);
        cCv.setVisible(true);
        jLayeredPaneAdministration.setVisible(false);
    }//GEN-LAST:event_jMenuCvMouseClicked

    private void jMenuAdministrationGestionAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAdministrationGestionAdminMouseClicked
        ImportExportXML objEXML = new ImportExportXML("src\\com\\karimandco\\importexport\\BddExporterXml.xml");
        objEXML.exportFichier();
        jLayeredPaneAdministration.setVisible(false);
    }//GEN-LAST:event_jMenuAdministrationGestionAdminMouseClicked

    private void jMenuAdministrationExportationCsvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAdministrationExportationCsvMouseClicked
        ImportExportCSV objECvs = new ImportExportCSV("src\\com\\karimandco\\importexport\\BddExporterCsv.csv");
        objECvs.exportFichier();
        jLayeredPaneAdministration.setVisible(false);
    }//GEN-LAST:event_jMenuAdministrationExportationCsvMouseClicked

    private void jMenuAdministrationExportationJsonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAdministrationExportationJsonMouseClicked
        ImportExportJSON objEJson = new ImportExportJSON("src\\com\\karimandco\\importexport\\BddExporterJson.json");
        objEJson.exportFichier();
        jLayeredPaneAdministration.setVisible(false);
    }//GEN-LAST:event_jMenuAdministrationExportationJsonMouseClicked

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
//       
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        gAdmin = new DialogPanneauAdministration(this);
        gAdmin.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        gAdmin.setLocationRelativeTo(this);
        System.out.println("coucou");
        gAdmin.setModal(true);
        gAdmin.setVisible(true);
        jLayeredPaneAdministration.setVisible(false);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        jLayeredPaneAdministration.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Affichage jFrame = new Affichage();
                jFrame.setVisible(true);
                jFrame.setExtendedState(jFrame.MAXIMIZED_BOTH);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.karimandco.image.ChoisirImage choisirImage1;
    private javax.swing.JLayeredPane jLayeredPaneAdministration;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuAdministrationExportationCsv;
    private javax.swing.JMenuItem jMenuAdministrationExportationJson;
    private javax.swing.JMenuItem jMenuAdministrationExportationXml;
    private javax.swing.JMenu jMenuAdministrationGestionAdmin;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenuConnexion;
    private javax.swing.JMenu jMenuCv;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
