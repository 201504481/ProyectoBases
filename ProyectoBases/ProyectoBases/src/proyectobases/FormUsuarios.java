/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobases;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static proyectobases.Conexion.*;
/**
 *
 * @author eljul
 */
public class FormUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form FormBancos
     */
    public FormUsuarios() {
        initComponents();
        ActualizarCBs();
        ActualizarRol();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CBAgregar = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CBModificar = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        CBROL = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CBEliminar = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Rol");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Contraseña");

        CBAgregar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "CLIENTE" }));
        CBAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBAgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jTextField5)
                    .addComponent(CBAgregar, 0, 296, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar", jPanel1);

        jLabel2.setText("Id Usuario");

        CBModificar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBModificarItemStateChanged(evt);
            }
        });
        CBModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBModificarMouseClicked(evt);
            }
        });

        jLabel3.setText("Nombre Actual");

        jTextField2.setEditable(false);

        jLabel4.setText("Nombre nuevo");

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Rol");

        CBROL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "CLIENTE" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(CBModificar, 0, 283, Short.MAX_VALUE)
                            .addComponent(CBROL, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CBROL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("Modificar", jPanel2);

        jLabel5.setText("Id Usuario");

        CBEliminar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBEliminarItemStateChanged(evt);
            }
        });
        CBEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBEliminarMouseClicked(evt);
            }
        });

        jLabel6.setText("Nombre Usuario");

        jTextField4.setEditable(false);

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CBEliminar, 0, 276, Short.MAX_VALUE)
                            .addComponent(jTextField4)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jTabbedPane1.addTab("Eliminar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Conectar();
        try {
            String query ="Insert into USUARIO(USUARIO.nombre, USUARIO.password, USUARIO.IDROL) VALUES ( \'" + jTextField1.getText() + "\',  \'" + jTextField5.getText() + "\', " + CBAgregar.getItemAt(CBAgregar.getSelectedIndex()).split("-")[0]+ ")";
            rs = st.executeQuery(query);
            JOptionPane.showMessageDialog(this, "Se ingreso el usuario " + jTextField1.getText() + " correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Ingreso invalido o base de datos no disponible " + e);
        }finally{
            try {
                rs.close();
                RealizarCommit();
            } catch (SQLException ex) {
                Logger.getLogger(FormUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        ActualizarCBs();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Conectar();
        try {
            String query = "update USUARIO set USUARIO.nombre=\'" + jTextField3.getText() + "\', USUARIO.IDROL = " + CBROL.getItemAt(CBROL.getSelectedIndex()).split("-")[0] + "  where USUARIO.IDUSUARIO = " + CBModificar.getItemAt(CBModificar.getSelectedIndex()).toString();
            System.out.println(query);
            rs = st.executeQuery(query);
            JOptionPane.showMessageDialog(this, "Nombre de banco actualizado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar el nombre del banco");
        } finally{
            try {
                rs.close();
                RealizarCommit();
            } catch (SQLException ex) {
                Logger.getLogger(FormUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        ActualizarCBs();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Conectar();
        try {
            String query = "delete from USUARIO where USUARIO.IDUSUARIO = " + CBEliminar.getItemAt(CBEliminar.getSelectedIndex()).toString();
            System.out.println(query);
            rs = st.executeQuery(query);
            JOptionPane.showMessageDialog(this, "usuario eliminado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al elimnar usuario");
        } finally{
            try {
                rs.close();
                RealizarCommit();
            } catch (SQLException ex) {
                Logger.getLogger(FormUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        ActualizarCBs();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CBModificarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBModificarItemStateChanged
        Conectar();
        try {
            String query = "Select USUARIO.NOMBRE from USUARIO where USUARIO.IDUSUARIO = " + CBModificar.getItemAt(CBModificar.getSelectedIndex()).toString();
            rs = st.executeQuery(query);

            if(rs.next()){
                jTextField2.setText(rs.getObject(1).toString());
            }
        } catch (Exception e) {
            
        } finally{
            try {
                rs.close();
                RealizarCommit();
            } catch (SQLException ex) {
                Logger.getLogger(FormUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CBModificarItemStateChanged

    private void CBEliminarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBEliminarItemStateChanged
        Conectar();
        try {
            String query = "Select USUARIO.NOMBRE from USUARIO where USUARIO.IDUSUARIO = " + CBEliminar.getItemAt(CBEliminar.getSelectedIndex()).toString();
            rs = st.executeQuery(query);

            if(rs.next()){
                jTextField4.setText(rs.getObject(1).toString());
            }
        } catch (Exception e) {
            
        } finally{
            try {
                rs.close();
                RealizarCommit();
            } catch (SQLException ex) {
                Logger.getLogger(FormUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CBEliminarItemStateChanged

    private void CBModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBModificarMouseClicked
        ActualizarCBs();        // TODO add your handling code here:
    }//GEN-LAST:event_CBModificarMouseClicked

    private void CBEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBEliminarMouseClicked
        ActualizarCBs();        // TODO add your handling code here:
    }//GEN-LAST:event_CBEliminarMouseClicked

    private void CBAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBAgregarMouseClicked
        ActualizarRol();        // TODO add your handling code here:
    }//GEN-LAST:event_CBAgregarMouseClicked

    public void ActualizarCBs(){
        CBModificar.removeAllItems();
        CBEliminar.removeAllItems();
        Conectar();
        try {
            String query ="Select USUARIO.IDUSUARIO from USUARIO";
            rs = st.executeQuery(query);
            LinkedList<String> lista = new LinkedList<>();
            while(rs.next()){
                String idBanco = rs.getObject(1).toString();
                lista.add(idBanco);
            }
            rs.close();
            RealizarCommit();
            for(int i = 0; i < lista.size(); i++){
                CBModificar.addItem(lista.get(i));
                CBEliminar.addItem(lista.get(i));
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar los datos");
        }
    }
    
    public void RealizarCommit(){
        try {
            Conectar();
            String query ="commit";
            rs = st.executeQuery(query);
        } catch (Exception e) {
        } finally{
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(FormUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void ActualizarRol(){
        CBAgregar.removeAllItems();
        CBROL.removeAllItems();
        Conectar();
        try {
            String query ="Select ROL.IDROL, ROL.NOMBRE from ROL";
            rs = st.executeQuery(query);
            LinkedList<String> lista = new LinkedList<>();
            LinkedList<String> lista2 = new LinkedList<>();
            while(rs.next()){
                String idBanco = rs.getObject(1).toString();
                String nombreBanco = rs.getObject(2).toString();
                lista.add(idBanco);
                lista2.add(nombreBanco);
            }
            rs.close();
            RealizarCommit();
            for(int i = 0; i < lista.size(); i++){
                CBAgregar.addItem(lista.get(i) + "-" + lista2.get(i));
                CBROL.addItem(lista.get(i) + "-" + lista2.get(i));
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar los datos de roles");
        }
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
            java.util.logging.Logger.getLogger(FormUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBAgregar;
    private javax.swing.JComboBox<String> CBEliminar;
    private javax.swing.JComboBox<String> CBModificar;
    private javax.swing.JComboBox<String> CBROL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
