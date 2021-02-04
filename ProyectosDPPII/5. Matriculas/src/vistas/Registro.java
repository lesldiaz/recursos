/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.EscribirLeerArchivos;
import controlador.Validar;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author USRBET
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
    }

    Validar validar = new Validar();
    List<Usuario> usuarios = new ArrayList<>();
    EscribirLeerArchivos escribir = new EscribirLeerArchivos();
    List<String> campos = new ArrayList<>();
    List<Integer> camposV = validar.camposVacios(campos);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgaluodoc = new javax.swing.ButtonGroup();
        PRegistro = new javax.swing.JPanel();
        lblnombre = new javax.swing.JLabel();
        lblusario = new javax.swing.JLabel();
        lblclave = new javax.swing.JLabel();
        tfnomyap = new javax.swing.JTextField();
        tfusuario = new javax.swing.JTextField();
        pfcontra = new javax.swing.JPasswordField();
        jProgressBar1 = new javax.swing.JProgressBar();
        btnguardar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        rbtnAlumno = new javax.swing.JRadioButton();
        rbtndocente = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        getContentPane().setLayout(new java.awt.CardLayout());

        PRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Book Antiqua", 1, 12), new java.awt.Color(51, 102, 255))); // NOI18N

        lblnombre.setText("*Nombres y Apellidos");

        lblusario.setText("*Usuario");

        lblclave.setText("*Contraseña");

        pfcontra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pfcontraKeyPressed(evt);
            }
        });

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btgaluodoc.add(rbtnAlumno);
        rbtnAlumno.setSelected(true);
        rbtnAlumno.setText("Alumno");

        btgaluodoc.add(rbtndocente);
        rbtndocente.setText("Docente");

        javax.swing.GroupLayout PRegistroLayout = new javax.swing.GroupLayout(PRegistro);
        PRegistro.setLayout(PRegistroLayout);
        PRegistroLayout.setHorizontalGroup(
            PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblusario)
                    .addComponent(lblclave)
                    .addComponent(lblnombre))
                .addGap(31, 31, 31)
                .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfnomyap)
                    .addGroup(PRegistroLayout.createSequentialGroup()
                        .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PRegistroLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnguardar))
                            .addComponent(pfcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PRegistroLayout.createSequentialGroup()
                                .addComponent(btnsalir)
                                .addGap(93, 93, 93))
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PRegistroLayout.createSequentialGroup()
                        .addComponent(tfusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtnAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtndocente)))
                .addGap(41, 41, 41))
        );
        PRegistroLayout.setVerticalGroup(
            PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombre)
                    .addComponent(tfnomyap))
                .addGap(11, 11, 11)
                .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblusario, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnAlumno)
                    .addComponent(rbtndocente))
                .addGap(18, 18, 18)
                .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblclave, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pfcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnsalir)))
        );

        getContentPane().add(PRegistro, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        String nomyapell = tfnomyap.getText();
        String usuario = tfusuario.getText();
        String contrasenia = pfcontra.getText();
        boolean tipo;

        camposV = validar.camposVacios(campos);

        campos.add(nomyapell);
        campos.add(usuario);
        campos.add(contrasenia);

        if (!camposV.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos Obligatorios Vacios");//Mensajes
            for (Integer camposV1 : camposV) {
                switch (camposV1) {
                    case (0):
                        tfnomyap.setBackground(Color.red);
                        break;
                    case (1):
                        tfusuario.setBackground(Color.red);
                        break;
                    case (2):
                        pfcontra.setBackground(Color.red);
                        break;
                }
            }
        } else {

            String passEncriptada = validar.encriptaEnMD5(contrasenia);
            String pass2xEncriptada = validar.encriptaEnMD5(passEncriptada);
            tipo = rbtnAlumno.isSelected();
            Usuario usuarioaguardar = new Usuario(nomyapell, usuario, pass2xEncriptada, tipo);
            
            if (escribir.leerArchivo("lista_usuarios")==null){
                usuarios.add(usuarioaguardar);
                escribir.escribirArchivos(usuarios, "lista_usuarios");
            } else {
                usuarios = (List) escribir.leerArchivo("lista_usuarios");
                usuarios.add(usuarioaguardar);
                escribir.escribirArchivos(usuarios, "lista_usuarios");
            }
            JOptionPane.showMessageDialog(null, "Usuario Creado Exitosamente");
        }

    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void pfcontraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfcontraKeyPressed
        String clave = pfcontra.getText();
        jProgressBar1.setValue(validar.validarClave(clave));
        jProgressBar1.revalidate();//actualiza
    }//GEN-LAST:event_pfcontraKeyPressed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PRegistro;
    private javax.swing.ButtonGroup btgaluodoc;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblclave;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblusario;
    private javax.swing.JPasswordField pfcontra;
    private javax.swing.JRadioButton rbtnAlumno;
    private javax.swing.JRadioButton rbtndocente;
    private javax.swing.JTextField tfnomyap;
    private javax.swing.JTextField tfusuario;
    // End of variables declaration//GEN-END:variables
}
