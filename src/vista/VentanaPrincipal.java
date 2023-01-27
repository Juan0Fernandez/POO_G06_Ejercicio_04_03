/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.util.ArrayList;
import modelo.Asignatura;
import modelo.Carrera;
import modelo.Universidad;
import servicio.AsignaturaServiceImpl;
import servicio.CarreraServiceImpl;
import servicio.UniversidadServiceImpl;



/**
 *
 * @author Andrs
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    
    VentanaCarrera vntCarr = new VentanaCarrera();
    VentanaAsignatura vntAsi = new VentanaAsignatura();
    VentanaUniversidad vntUni = new VentanaUniversidad();
    
    public VentanaPrincipal() {
        initComponents();
        this.setSize(890,650);
        this.setLocationRelativeTo(null);
        
        this.jDesktopPane1.add(vntAsi);
        this.jDesktopPane1.add(vntCarr);
        this.jDesktopPane1.add(vntUni);
        
        vntUni.setVisible(false);
        vntCarr.setVisible(false);
        vntAsi.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnUni = new javax.swing.JMenu();
        mnCarr = new javax.swing.JMenu();
        mnAsi = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 865, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );

        mnUni.setText("Universidad");
        mnUni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnUniMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnUni);

        mnCarr.setText("Carrera");
        mnCarr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnCarrMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnCarr);

        mnAsi.setText("Asignatura");
        mnAsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnAsiMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnAsi);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnAsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnAsiMouseClicked
        vntUni.setVisible(false);
        vntCarr.setVisible(false);
        vntAsi.setVisible(true);
    }//GEN-LAST:event_mnAsiMouseClicked

    private void mnCarrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnCarrMouseClicked
        vntUni.setVisible(false);
        vntCarr.setVisible(true);
        vntAsi.setVisible(false);
    }//GEN-LAST:event_mnCarrMouseClicked

    private void mnUniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnUniMouseClicked
        vntUni.setVisible(true);
        vntCarr.setVisible(false);
        vntAsi.setVisible(false);
    }//GEN-LAST:event_mnUniMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnAsi;
    private javax.swing.JMenu mnCarr;
    private javax.swing.JMenu mnUni;
    // End of variables declaration//GEN-END:variables
}
