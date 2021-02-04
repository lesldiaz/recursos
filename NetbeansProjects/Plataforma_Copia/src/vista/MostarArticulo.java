/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.*;
import modelo.*;

/**
 *
 * @author Leslie Diaz
 */
public class MostarArticulo extends javax.swing.JFrame {
    int auxn;
    Conexion cnx = new Conexion();
    ArticuloBD pbd = new ArticuloBD(cnx);
    AuxiliarArticulo cdt = new AuxiliarArticulo();
    User aux;

    /**
     * Creates new form AgregarCasa
     */
    public MostarArticulo(AuxiliarArticulo ap, User u) {
        initComponents();
        this.setSize(800, 600);
        setAlwaysOnTop(false);
        setLocationRelativeTo(null);
        setResizable(false);  // no me deja maximizar
        cdt = pbd.informacionArticulo(ap);
        lbelprecio.setText((double) Math.round(cdt.getPrecio() * 100d) / 100d + "");
        lbeltitulo.setText(cdt.getTitulo());
        lbelmarca.setText(cdt.getMarca());
        lbelcategoria.setText(cdt.getCategoria());
        lbeldescripcion.setText(cdt.getDescripcion());
        cbusado.setSelected(cdt.isUsado());
        cbnuevo.setSelected(cdt.isNuevo());
        aux = u;
       
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbelcategoria = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbelmarca = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbeltitulo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lbelprecio = new javax.swing.JLabel();
        lbeltipoprecio = new javax.swing.JLabel();
        cbnuevo = new javax.swing.JCheckBox();
        cbusado = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lbeldescripcion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnsiguiente = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 102)), "Informacion del Articulo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 18))); // NOI18N
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setLayout(new java.awt.GridLayout(5, 2));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel7.setText("Categoria: ");
        jPanel2.add(jLabel7);
        jPanel2.add(lbelcategoria);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setText("Marca: ");
        jPanel2.add(jLabel2);
        jPanel2.add(lbelmarca);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setText("Titulo: ");
        jPanel2.add(jLabel3);
        jPanel2.add(lbeltitulo);

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel11.setText("Precio (dolares): ");
        jPanel2.add(jLabel11);

        jPanel9.setLayout(new java.awt.GridLayout(1, 2));
        jPanel9.add(lbelprecio);
        jPanel9.add(lbeltipoprecio);

        jPanel2.add(jPanel9);

        cbnuevo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cbnuevo.setText("Nuevo");
        cbnuevo.setEnabled(false);
        cbnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnuevoActionPerformed(evt);
            }
        });
        jPanel2.add(cbnuevo);

        cbusado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cbusado.setText("Usado");
        cbusado.setEnabled(false);
        jPanel2.add(cbusado);

        jPanel1.add(jPanel2);

        jPanel8.setLayout(new java.awt.GridLayout(1, 2));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel12.setText("Descripcion: ");
        jPanel8.add(jLabel12);
        jPanel8.add(lbeldescripcion);

        jPanel1.add(jPanel8);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.X_AXIS));

        btnsiguiente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnsiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/visto.png"))); // NOI18N
        btnsiguiente.setText("Datos del Contacto");
        btnsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnsiguiente);

        btncancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btncancelar);

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguienteActionPerformed
        new PerfilUsuario(aux, "Datos de Contacto").setVisible(true);
    }//GEN-LAST:event_btnsiguienteActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void cbnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbnuevoActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AgregarCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AgregarCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AgregarCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AgregarCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AgregarCasa().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnsiguiente;
    private javax.swing.JCheckBox cbnuevo;
    private javax.swing.JCheckBox cbusado;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbelcategoria;
    private javax.swing.JLabel lbeldescripcion;
    private javax.swing.JLabel lbelmarca;
    private javax.swing.JLabel lbelprecio;
    private javax.swing.JLabel lbeltipoprecio;
    private javax.swing.JLabel lbeltitulo;
    // End of variables declaration//GEN-END:variables
}
