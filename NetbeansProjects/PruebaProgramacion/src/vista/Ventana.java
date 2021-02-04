/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import controlador.Validacion;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;

import java.io.File;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Usuario;

/**
 *
 * @author USRBET
 */
public class Ventana extends javax.swing.JFrame {
    Validacion validar = new Validacion();
    ArrayList <Usuario> listaUsuario = new ArrayList<>();
    String ruta;
    
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Solo archivos JPG y PNG","jpg","png"); // puedo poner todas las extensiones que queramos
        file.setFileFilter(filtro);
        setLocationRelativeTo(null);
        this.setSize(500,300);
        this.setTitle("Prueba Programacion");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        file = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtimagen = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.X_AXIS));

        jPanel4.setLayout(new java.awt.GridLayout(3, 2, 0, 30));

        jLabel1.setText("Nombre:");
        jPanel4.add(jLabel1);

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel4.add(txtnombre);

        jLabel2.setText("Apellidos:");
        jPanel4.add(jLabel2);

        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });
        jPanel4.add(txtapellido);

        jLabel3.setText("Cedula:");
        jPanel4.add(jLabel3);

        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        jPanel4.add(txtcedula);

        jPanel2.add(jPanel4);

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        jPanel6.setLayout(new java.awt.GridLayout());

        txtimagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtimagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(txtimagen);

        jPanel5.add(jPanel6);

        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2);

        jPanel5.add(jPanel7);

        jPanel2.add(jPanel5);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char car = evt.getKeyChar();
       if ( (car<'a' || car>'z')&&(car<'A' || car>'Z')&& (car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
           evt.consume();
        JOptionPane.showMessageDialog(null,"Solo Letras", "Caracteres no Válidos",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        char car = evt.getKeyChar();
       if ( (car<'a' || car>'z')&&(car<'A' || car>'Z')&& (car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
           evt.consume();
        JOptionPane.showMessageDialog(null,"Solo Letras", "Caracteres no Válidos",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int aux = file.showOpenDialog(null);
        if (aux == 0) { // solo si selecciona un archivo se abre/ejecuta la accion siguiente 
            File f = file.getSelectedFile();

            ruta = f.getPath();

            ImageIcon ii = new ImageIcon(ruta);
            ImageIcon icono = new ImageIcon(ii.getImage().getScaledInstance(txtimagen.getWidth(), txtimagen.getHeight(), Image.SCALE_DEFAULT));
            txtimagen.setIcon(icono);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre= txtnombre.getText();
        String apellido = txtapellido.getText();
        String cedula = txtcedula.getText();
        boolean docu = validar.verificarCedula(cedula);
        ArrayList<String> campos = new ArrayList<>();
        
        campos.add(nombre);
        campos.add(apellido);
        campos.add(cedula);
        
        List<Integer> camposVacios = validar.camposVacios(campos);
        
        if (!camposVacios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completar los Campos Vacios");
            for (Integer camposVacio : camposVacios) {
                if (null != camposVacio) {
                    switch (camposVacio) {
                        case 0:
                            txtnombre.setBackground(Color.RED);
                            break;
                        case 1:
                            txtapellido.setBackground(Color.RED);
                            break;
                        case 2:
                            txtcedula.setBackground(Color.RED);
                            break;
                        default:
                            break;
                    }
                }
            }
        } else {
            if (docu == false) {
                JOptionPane.showMessageDialog(null, "Cedula no Existe");
            } else {
                Usuario usuarioaux = new Usuario(nombre, apellido, cedula, ruta);
                if (validar.leerArchivo("listaUsuarios") == null) {
                    
                    listaUsuario.add(usuarioaux);
                    validar.escribirarchivo(listaUsuario, "listaUsuarios");
                } else {
                    
                    listaUsuario = (ArrayList) validar.leerArchivo("listaUsuarios");
                    listaUsuario.add(usuarioaux);
                    validar.escribirarchivo(listaUsuario, "listaUsuarios");
                }
                JOptionPane.showMessageDialog(null, "Ingreso Exitoso");

            }
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser file;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JLabel txtimagen;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
