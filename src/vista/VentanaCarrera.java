/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import controlador.ControladorCarrera;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Carrera;
import modelo.Universidad;

/**
 *
 * @author Andrs
 */
public class VentanaCarrera extends javax.swing.JInternalFrame {

    DefaultTableModel mod = new DefaultTableModel();
    private ControladorCarrera cntrlCarr = new ControladorCarrera();
    
    public VentanaCarrera() {
        initComponents();
        this.setSize(880,620);
        llenarTitulo();
        iniciarTabla();

    }

    public void limpiar(){
        txtNombre.setText("");
        txtCod.setText("");
        spnDur.setValue(0);
        rbPresencial.setSelected(false);
        rbVirtual.setSelected(false);
        cmbTit.setSelectedIndex(0);
    }
    
    public void llenarTitulo(){
        String[] ciudades={"Ingeniero", "Doctor", "Arquitecto", "Licenciado"};
        cmbTit.setModel(new javax.swing.DefaultComboBoxModel<>(ciudades));
    }
    
    public void iniciarTabla(){
        
        String[] titulos={"Codigo", "Nombre", "Duracion", "Modalidad", "Titulo"};
        mod.setColumnIdentifiers(titulos);
        tblLista.setModel(mod);
    }
    
    public void actualizarTabla(ArrayList<Carrera> lstc){
        mod = new DefaultTableModel();
        String[] titulos={"Codigo", "Nombre", "Duracion", "Modalidad", "Titulo"};
        mod.setColumnIdentifiers(titulos);
        for (Carrera c: lstc) {
            mod.addRow(new Object[]{c.getCod(),c.getNomb(),c.getDuracion(), c.getModalidad(), c.getTitulo()});
        }
        tblLista.setModel(mod);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbTit = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        rbPresencial = new javax.swing.JRadioButton();
        rbVirtual = new javax.swing.JRadioButton();
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
        spnDur = new javax.swing.JSpinner();
        btnGuardar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbTit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbTit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 110, -1));

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

        rbPresencial.setText("Presencial");
        jPanel1.add(rbPresencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        rbVirtual.setText("Virtual");
        jPanel1.add(rbVirtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        jLabel1.setText("Titulo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel2.setText("Modalidad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 190, -1));

        Duracion.setText("Duracion (Ciclos)");
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
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, -1));
        jPanel1.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 190, -1));

        jLabel4.setText("Codigo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));
        jPanel1.add(spnDur, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 90, 40));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaMouseClicked
        txtNombre.setText(tblLista.getValueAt(tblLista.getSelectedRow(), 1)+"");
        txtCod.setText(tblLista.getValueAt(tblLista.getSelectedRow(), 0)+"");
        spnDur.setValue(tblLista.getValueAt(tblLista.getSelectedRow(), 2));
        if((tblLista.getValueAt(tblLista.getSelectedRow(), 3)+"").equals("Virtual")){
            rbVirtual.setSelected(true);
            rbPresencial.setSelected(false);
        }else{
            rbVirtual.setSelected(false);
            rbPresencial.setSelected(true);
        }
        
        for (int i = 0; i < cmbTit.getItemCount(); i++) {
            String c=cmbTit.getItemAt(i)+"";
            if(c.equals(tblLista.getValueAt(tblLista.getSelectedRow(), 4)+"")){
                cmbTit.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_tblListaMouseClicked

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        String n="",c="",t="", m="";
        int d;
        n=txtNombre.getText();
        t=(String) cmbTit.getSelectedItem();
        if(rbVirtual.isSelected()){
            m="Virtual";
        }else if(rbPresencial.isSelected()){
            m="Presencial";
        }
        c=txtCod.getText();
        d=(int) spnDur.getValue();

        if(cntrlCarr.anadirCarrera(c, n, d, m, t)){
            actualizarTabla(cntrlCarr.getLista());
            JOptionPane.showMessageDialog(null, "Se añadio con exito","Añadido", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo crear la Universidad.","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int i = tblLista.getSelectedRow();
        if(i!=-1){
            cntrlCarr.borrarCarrera(i);
            actualizarTabla(cntrlCarr.getLista());
            JOptionPane.showMessageDialog(null, "Se elimino con exito","Eliminado", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento para eliminar","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int i = tblLista.getSelectedRow();
        String n="",c="",t="", m="";
        int d;
        n=txtNombre.getText();
        t=(String) cmbTit.getSelectedItem();
        if(rbVirtual.isSelected()){
            m="Virtual";
        }else if(rbPresencial.isSelected()){
            m="Presencial";
        }
        c=txtCod.getText();
        d=(int) spnDur.getValue();
        
        if(i!=-1){
            cntrlCarr.modificarCarrera(i, c, n, d, m, t);
            actualizarTabla(cntrlCarr.getLista());
            JOptionPane.showMessageDialog(null, "Se modifico con exito","Modificado", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento para modificar","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        cntrlCarr.getServicio().almacenarArchivo(cntrlCarr.getLista(), "carrera.dat");
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        cntrlCarr.getServicio().setLstCarrera(cntrlCarr.getServicio().recuperarArchivo("carrera.dat"));
        actualizarTabla(cntrlCarr.getLista());
    }//GEN-LAST:event_btnCargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Duracion;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbTit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbPresencial;
    private javax.swing.JRadioButton rbVirtual;
    private javax.swing.JSpinner spnDur;
    private javax.swing.JTable tblLista;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
