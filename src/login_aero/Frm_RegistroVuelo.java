/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_aero;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodos_sql.ConexionBD;
import metodos_sql.Metodos_sql;

/**
 *
 * @author David Solarte
 */
public class Frm_RegistroVuelo extends javax.swing.JFrame {
      ConexionBD conexion = new ConexionBD();
    Connection conec = conexion.conectar();
    
    Metodos_sql metodos = new Metodos_sql();
    /**
     * Creates new form Frm_RegistroVuelo
     */
    public Frm_RegistroVuelo() {
        initComponents();
        metodos.consultar_id_avion(cbxIdAvion);
        MostrarVuelos();
        setLocationRelativeTo(null);
        
    }
    void limpiarCajas(){
    txtIdVuelo.setText(null);
    txtSalida.setText(null);
    txtLlegada.setText(null);
    txtOrigen.setText(null);
    txtDestino.setText(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIdVuelo = new javax.swing.JTextField();
        cbxIdAvion = new javax.swing.JComboBox<>();
        cdxTipo = new javax.swing.JComboBox<>();
        txtOrigen = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        txtSalida = new javax.swing.JTextField();
        txtLlegada = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVuelos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        cdxEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE VUELOS");

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Vuelos"));

        jLabel2.setText("Id Vuelo:");

        jLabel3.setText("Id Avión:");

        jLabel4.setText("Tipo Avión:");

        jLabel5.setText("Fecha Salida:");

        jLabel6.setText("Fecha Legada:");

        jLabel7.setText("Origen:");

        jLabel8.setText("Destino:");

        cbxIdAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxIdAvionActionPerformed(evt);
            }
        });

        cdxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mercancia", "Pasajeros" }));

        txtDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdVuelo)
                    .addComponent(cbxIdAvion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cdxTipo, 0, 120, Short.MAX_VALUE)
                    .addComponent(txtOrigen)
                    .addComponent(txtDestino)
                    .addComponent(txtSalida)
                    .addComponent(txtLlegada))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxIdAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cdxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnModificar.setText("Modificar Vuelo");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar Vuelo");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificar)
                    .addComponent(btnRegistrar))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Vuelos Programados"));

        tablaVuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaVuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVuelosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVuelos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado del Vuelo"));

        cdxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En Proceso", "Finalizado" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cdxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cdxEstado)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnRegresar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Frm_admin ventana = new Frm_admin();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (txtIdVuelo.getText().isEmpty() || txtSalida.getText().isEmpty() || txtLlegada.getText().isEmpty() || txtOrigen.getText().isEmpty() || txtDestino.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Complete todos los campos.");
    
    
    }else {int i = metodos.guardarvuelo(txtIdVuelo.getText(),cbxIdAvion.getSelectedItem().toString(), cdxTipo.getSelectedItem().toString(), txtSalida.getText(),txtLlegada.getText(),txtOrigen.getText(),txtDestino.getText(),cdxEstado.getSelectedItem().toString());
       
       if (i > 0){
           JOptionPane.showMessageDialog(this, "Datos Guardados Exitosamente");
       }else{
           JOptionPane.showMessageDialog(this,"No se pudo guardar los datos, \ningrese los datos correctamente." );
       }
       }
       MostrarVuelos();
       limpiarCajas();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtIdVuelo.getText().isEmpty() || txtSalida.getText().isEmpty() || txtLlegada.getText().isEmpty() || txtOrigen.getText().isEmpty() || txtDestino.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Complete todos los campos.");
    
    
    }else {
        Metodos_sql mod = new Metodos_sql();
        mod.modificarvuelo(txtIdVuelo.getText(),cbxIdAvion.getSelectedItem().toString(), cdxTipo.getSelectedItem().toString(), txtSalida.getText(),txtLlegada.getText(),txtOrigen.getText(),txtDestino.getText(),  cdxEstado.getSelectedItem().toString());
        }
        
       MostrarVuelos();
       limpiarCajas();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tablaVuelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVuelosMouseClicked
        DefaultTableModel tusuario = (DefaultTableModel) tablaVuelos.getModel();
        txtIdVuelo.setText(tusuario.getValueAt(tablaVuelos.getSelectedRow(), 0)+ "");
        cbxIdAvion.setActionCommand(tusuario.getValueAt(tablaVuelos.getSelectedRow(), 1)+ "");
        cdxTipo.setActionCommand(tusuario.getValueAt(tablaVuelos.getSelectedRow(), 2)+ "");
        txtSalida.setText(tusuario.getValueAt(tablaVuelos.getSelectedRow(), 3)+ "");
        txtLlegada.setText(tusuario.getValueAt(tablaVuelos.getSelectedRow(), 4)+ "");
        txtOrigen.setText(tusuario.getValueAt(tablaVuelos.getSelectedRow(), 5)+ "");
        txtDestino.setText(tusuario.getValueAt(tablaVuelos.getSelectedRow(), 6)+ "");
        
    }//GEN-LAST:event_tablaVuelosMouseClicked

    private void cbxIdAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxIdAvionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxIdAvionActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_RegistroVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_RegistroVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_RegistroVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_RegistroVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_RegistroVuelo().setVisible(true);
            }
        });
    }
    
    public void MostrarVuelos(){
        DefaultTableModel tvuelo = new DefaultTableModel();
        tvuelo.addColumn("Id Vuelo");
        tvuelo.addColumn("Id Avion");
        tvuelo.addColumn("Tipo de Avión");
        tvuelo.addColumn("Salida");
        tvuelo.addColumn("Llegada");
        tvuelo.addColumn("Origen");
        tvuelo.addColumn("Destino");
        tvuelo.addColumn("Estado");
        tablaVuelos.setModel(tvuelo);
        
        String []datos = new String[8];
        
        try {
            Statement leer = conec.createStatement();
            ResultSet resultado = leer.executeQuery("SELECT * FROM vuelos");
            
            while (resultado.next()){
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                datos[6] = resultado.getString(7);
                datos[7] = resultado.getString(8);
                
                tvuelo.addRow(datos);
            }
            tablaVuelos.setModel(tvuelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "Error en la consulta");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbxIdAvion;
    private javax.swing.JComboBox<String> cdxEstado;
    private javax.swing.JComboBox<String> cdxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVuelos;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtIdVuelo;
    private javax.swing.JTextField txtLlegada;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtSalida;
    // End of variables declaration//GEN-END:variables
}
