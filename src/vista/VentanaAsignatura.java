/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import controlador.ControladorAsignatura;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Asignatura;

/**
 *
 * @author Andrs
 */
public class VentanaAsignatura extends javax.swing.JInternalFrame {

    DefaultTableModel mod = new DefaultTableModel();
    private ControladorAsignatura cntrlAsig = new ControladorAsignatura();
    public VentanaAsignatura() {
        initComponents();

    }

    public void limpiar(){
        txtNombre.setText("");
        txtCod.setText("");
        spnEst.setValue(0);
        spnCred.setValue(0);
        spnNiv.setValue(0);
    }
    
    
    public void iniciarTabla(){
        String[] titulos={"Codigo", "Nombre", "Niveles", "Creditos", "Num.Estudiantes"};
        mod.setColumnIdentifiers(titulos);
        tblLista.setModel(mod);
    }
    
    public void actualizarTabla(ArrayList<Asignatura> lsta){
        mod = new DefaultTableModel();
        String[] titulos={"Codigo", "Nombre", "Niveles", "Creditos", "Num.Estudiantes"};
        mod.setColumnIdentifiers(titulos);
        for (Asignatura a: lsta) {
            mod.addRow(new Object[]{a.getCod(),a.getNomb(),a.getNivel(), a.getCreditos(), a.getNumEst()});
        }
        tblLista.setModel(mod);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        Duracion = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        spnEst = new javax.swing.JSpinner();
        spnNiv = new javax.swing.JSpinner();
        spnCred = new javax.swing.JSpinner();
        btnGuardar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLista);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 540, -1));

        jLabel1.setText("Ciclo en el que se toma:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel2.setText("Creditos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 190, -1));

        Duracion.setText("Numero de estudiantes");
        jPanel1.add(Duracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, -1));
        jPanel1.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 190, -1));

        jLabel4.setText("Codigo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));
        jPanel1.add(spnEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 90, 40));
        jPanel1.add(spnNiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 100, 30));
        jPanel1.add(spnCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 100, 30));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, -1, -1));

        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaMouseClicked
        txtNombre.setText(tblLista.getValueAt(tblLista.getSelectedRow(), 1)+"");
        txtCod.setText(tblLista.getValueAt(tblLista.getSelectedRow(), 0)+"");
        spnEst.setValue(tblLista.getValueAt(tblLista.getSelectedRow(), 4));
        spnCred.setValue(tblLista.getValueAt(tblLista.getSelectedRow(), 3));
        spnNiv.setValue(tblLista.getValueAt(tblLista.getSelectedRow(), 2));
        
    }//GEN-LAST:event_tblListaMouseClicked

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        String n="",c="";
        int est, niv, cred;
        n=txtNombre.getText();
        c=txtCod.getText();
        
        est=(int) spnEst.getValue();
        niv=(int) spnNiv.getValue();
        cred=(int) spnCred.getValue();
        if(cntrlAsig.anadirAsignatura(c, n, niv, cred, est)){
            actualizarTabla(cntrlAsig.getLista());
            JOptionPane.showMessageDialog(null, "Se añadio con exito","Añadido", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo crear la Universidad.","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int i = tblLista.getSelectedRow();
        if(i!=-1){
            cntrlAsig.borrarAsignatura(i);
            actualizarTabla(cntrlAsig.getLista());
            JOptionPane.showMessageDialog(null, "Se elimino con exito","Eliminado", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento para eliminar","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int i = tblLista.getSelectedRow();
        String n="",c="";
        int est, niv, cred;
        n=txtNombre.getText();
        c=txtCod.getText();
        
        est=(int) spnEst.getValue();
        niv=(int) spnNiv.getValue();
        cred=(int) spnCred.getValue();

        if(i!=-1){
            cntrlAsig.modificarAsignatura(i, c, n, niv, cred, est);
            actualizarTabla(cntrlAsig.getLista());
            JOptionPane.showMessageDialog(null, "Se modifico con exito","Modificado", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento para modificar","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        cntrlAsig.getAsigServImpl().almacenarArchivo(cntrlAsig.getLista(), "asignatura.dat");

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        cntrlAsig.getAsigServImpl().setLstAsig(cntrlAsig.getAsigServImpl().recuperarArchivo("asignatura.dat"));
        actualizarTabla(cntrlAsig.getLista());
    }//GEN-LAST:event_btnCargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Duracion;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnCred;
    private javax.swing.JSpinner spnEst;
    private javax.swing.JSpinner spnNiv;
    private javax.swing.JTable tblLista;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
