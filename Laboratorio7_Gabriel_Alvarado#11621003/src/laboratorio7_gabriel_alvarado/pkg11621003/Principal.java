/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio7_gabriel_alvarado.pkg11621003;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Gabriel Alvarado
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_nombrec = new javax.swing.JTextField();
        tf_id = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_producto = new javax.swing.JTextField();
        tf_precio = new javax.swing.JTextField();
        tf_tiempo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tf_nombreCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cb_productos = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cb_cajero = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tf_edadCliente = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Cajero");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 90, 50));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        jLabel2.setText("nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel3.setText("ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));
        jPanel1.add(tf_nombrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 200, -1));
        jPanel1.add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 200, -1));

        jTabbedPane1.addTab("Creacion de Cajeros", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Producto");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 59, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Nombre");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Precio");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 70, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Tiempo");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 90, -1));
        jPanel2.add(tf_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 129, 199, -1));
        jPanel2.add(tf_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 222, 199, -1));
        jPanel2.add(tf_tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 305, 200, -1));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, 20));

        jTabbedPane1.addTab("Creacion de productos", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Nombre de cliente");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        tf_nombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreClienteActionPerformed(evt);
            }
        });
        jPanel3.add(tf_nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 141, -1));

        jLabel9.setText("Productos");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jPanel3.add(cb_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 110, -1));

        jButton4.setText("Cargar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 80, -1));

        jLabel10.setText("Cajero");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jPanel3.add(cb_cajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 100, -1));

        jButton6.setText("Realizar compra");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        jButton7.setText("Cargar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 70, -1));

        jLabel11.setText("Edad");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 40, -1));

        tf_edadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_edadClienteActionPerformed(evt);
            }
        });
        jPanel3.add(tf_edadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 120, -1));

        jButton8.setText("Guardar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 120, 40));

        jButton3.setText("Agregar orden");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jTabbedPane1.addTab("Crear cliente", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nombre;
        int precio;
        int tiempo;
        nombre = tf_producto.getText();
        precio = Integer.parseInt(tf_precio.getText());
        tiempo = Integer.parseInt(tf_tiempo.getText());
        ListProductos.add(new Productos(nombre, precio, tiempo));

    //
        tf_producto.setText("");
        tf_precio.setText("");
        tf_tiempo.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre;
        String id;
        nombre = tf_nombrec.getText();
        id = tf_id.getText();
        Cajero c = new Cajero(nombre, id);
        ListCajero.add(c);
        
        // 
        tf_nombrec.setText("");
        tf_id.setText("");
        c.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultComboBoxModel model = (DefaultComboBoxModel) cb_productos.getModel();
        for (Productos t : ListProductos) {
            model.addElement(t);
        }
        cb_productos.setModel(model);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        DefaultComboBoxModel model = (DefaultComboBoxModel) cb_cajero.getModel();
        for (Cajero q : ListCajero) {
            model.addElement(q);
        }
        cb_cajero.setModel(model);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void tf_edadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_edadClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_edadClienteActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String nombre;
        int edad;
        String cajero = cb_cajero.getSelectedItem().toString();
        nombre = tf_nombreCliente.getText();
        edad = Integer.parseInt(tf_edadCliente.getText());
        Orden o = new Orden(cajero, nombre);
        ListCliente.add(new Cliente(nombre, cajero, o));

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   String cliente;
   String cajero;
   cliente = tf_nombreCliente.getText();
   cajero = cb_cajero.getSelectedItem().toString();
   
   ListOrden.add(new Orden(cajero, cliente));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      int i = cb_productos.getSelectedIndex();
     ListOrden.get(i).getListProductos().add(ListProductos.get(i));
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tf_nombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_cajero;
    private javax.swing.JComboBox cb_productos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField tf_edadCliente;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_nombreCliente;
    private javax.swing.JTextField tf_nombrec;
    private javax.swing.JTextField tf_precio;
    private javax.swing.JTextField tf_producto;
    private javax.swing.JTextField tf_tiempo;
    // End of variables declaration//GEN-END:variables
ArrayList<Productos> ListProductos = new ArrayList();
    ArrayList<Cliente> ListCliente = new ArrayList();
    ArrayList<Orden> ListOrden = new ArrayList();
    ArrayList<Cajero> ListCajero = new ArrayList();
    int i = 0;

}
