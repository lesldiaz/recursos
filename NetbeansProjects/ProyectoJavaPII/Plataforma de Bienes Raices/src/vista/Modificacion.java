/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.*;
import java.awt.Color;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import modelo.Usuario;

/**
 *
 * @author Leslie Diaz
 */
public class Modificacion extends javax.swing.JFrame {

    Conexion conexion = new Conexion();
    Validar validar = new Validar();
    String passEncrip, cedulaPas;
    Color color = new Color(180, 076, 067);
    Usuario salida = new Usuario();
    UsuarioBD ubd = new UsuarioBD(conexion);
    Usuario auxu = new Usuario();

    public Modificacion(Usuario u) {
        initComponents();
        setLocationRelativeTo(null);
        Date aux = new Date();
        datefechana.setMaxSelectableDate(aux);
        datefechana.getDateEditor().setEnabled(false);
        txtapepat.setText(u.getApellidos().substring(0, u.getApellidos().indexOf(" ")));
        txtapemat.setText(u.getApellidos().substring(u.getApellidos().indexOf(" ") + 1, u.getApellidos().length()));
        txtnombres.setText(u.getNombres());
        txtdocide.setText(u.getCi());
        txtdocide.setEnabled(false);
        txttelefono.setText("0" + u.getTelefonoconvencional());
        if (u.getCelular() == 0) {
            txtcelular.setText("");
        } else {
            txtcelular.setText("0" + u.getCelular());
        }
        formatemail.setText(u.getCorreo());
        formatemail.setEnabled(false);
        auxu = u;
        validacionPegar();
    }

    public void validacionPegar() {
        InputMap map1 = txtapepat.getInputMap(txtapepat.WHEN_FOCUSED);
        map1.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        InputMap map2 = txtapemat.getInputMap(txtapemat.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        InputMap map3 = txtnombres.getInputMap(txtnombres.WHEN_FOCUSED);
        map3.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        InputMap map4 = txtdocide.getInputMap(txtdocide.WHEN_FOCUSED);
        map4.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        InputMap map5 = txttelefono.getInputMap(txttelefono.WHEN_FOCUSED);
        map5.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        InputMap map6 = txtcelular.getInputMap(txtcelular.WHEN_FOCUSED);
        map6.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        InputMap map7 = formatemail.getInputMap(formatemail.WHEN_FOCUSED);
        map7.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        InputMap map8 = txtpass.getInputMap(txtpass.WHEN_FOCUSED);
        map8.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtapepat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtapemat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        rbci = new javax.swing.JRadioButton();
        rbpasa = new javax.swing.JRadioButton();
        txtdocide = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        datefechana = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcelular = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        formatemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnmodificar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 51, 102)), "Modificar Usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 18))); // NOI18N
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridLayout(10, 2));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setText("Apellido Paterno:");
        jPanel1.add(jLabel1);

        txtapepat.setToolTipText("Solo Utilize Letras");
        txtapepat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtapepatFocusGained(evt);
            }
        });
        txtapepat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapepatKeyTyped(evt);
            }
        });
        jPanel1.add(txtapepat);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setText("Apellido Materno:");
        jPanel1.add(jLabel2);

        txtapemat.setToolTipText("Solo Utilize Letras");
        txtapemat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtapematFocusGained(evt);
            }
        });
        txtapemat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapematKeyTyped(evt);
            }
        });
        jPanel1.add(txtapemat);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setText("Nombres:");
        jPanel1.add(jLabel3);

        txtnombres.setToolTipText("Solo Utilize Letras");
        txtnombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnombresFocusGained(evt);
            }
        });
        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombresKeyTyped(evt);
            }
        });
        jPanel1.add(txtnombres);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setText("Documento de Identidad:");
        jPanel3.add(jLabel4, new java.awt.GridBagConstraints());

        buttonGroup1.add(rbci);
        rbci.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        rbci.setSelected(true);
        rbci.setText("C.I.");
        jPanel3.add(rbci, new java.awt.GridBagConstraints());

        buttonGroup1.add(rbpasa);
        rbpasa.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        rbpasa.setText("Pasaporte");
        jPanel3.add(rbpasa, new java.awt.GridBagConstraints());

        jPanel1.add(jPanel3);

        txtdocide.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdocideFocusGained(evt);
            }
        });
        txtdocide.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdocideKeyTyped(evt);
            }
        });
        jPanel1.add(txtdocide);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setText("Fecha de Nacimiento:");
        jPanel1.add(jLabel5);

        datefechana.setToolTipText("");
        datefechana.setDateFormatString("dd-MM-YYYY");
        datefechana.setFocusable(false);
        jPanel1.add(datefechana);

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setText("Telefono Convencional: ");
        jPanel1.add(jLabel8);

        txttelefono.setToolTipText("Nueve Numeros");
        txttelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttelefonoFocusGained(evt);
            }
        });
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txttelefono);

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel9.setText("Celular (Opcional):");
        jPanel1.add(jLabel9);

        txtcelular.setToolTipText("Diez Numeros");
        txtcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcelularKeyTyped(evt);
            }
        });
        jPanel1.add(txtcelular);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setText("Correo Electrónico:");
        jPanel1.add(jLabel6);

        formatemail.setToolTipText("ejemplo@email.com");
        formatemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formatemailFocusGained(evt);
            }
        });
        formatemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formatemailKeyTyped(evt);
            }
        });
        jPanel1.add(formatemail);

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel7.setText("Ingrese la Contraseña:");
        jPanel1.add(jLabel7);

        txtpass.setToolTipText("minimo 8 caracteres");
        txtpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpassFocusGained(evt);
            }
        });
        jPanel1.add(txtpass);
        jPanel1.add(jPanel4);

        jPanel5.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 34, 0));

        btnmodificar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/visto.png"))); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnmodificar);

        btncancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btncancelar);

        jPanel5.add(jPanel2, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel5, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        conexion = new Conexion();
        ubd.setConexion(conexion);
        int telefono = 0;
        int cel = 0;
        int aux = 0;

        String apepat = txtapepat.getText();
        String apemat = txtapemat.getText();
        String nombre = txtnombres.getText();
        String docide = txtdocide.getText();
        String email = formatemail.getText();
        String convencional = txttelefono.getText();
        String celular = txtcelular.getText();
        String pass = txtpass.getText();
        String fechanacimiento = "";
        try {
            Date fecha = datefechana.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            fechanacimiento = sdf.format(fecha);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Al menos selecciona una fecha válida!", "Error!", JOptionPane.INFORMATION_MESSAGE);
//            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }

        ArrayList<String> campos = new ArrayList<>();
        campos.add(apepat);
        campos.add(apemat);
        campos.add(nombre);
        campos.add(docide);
        campos.add(email);
        campos.add(pass);
        campos.add(convencional);
        campos.add(fechanacimiento);

        List<Integer> camposVacios = validar.camposVacios(campos);
        if (!camposVacios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completar los Campos Vacios o Incorrectos");
            for (Integer camposVacio : camposVacios) {
                if (null != camposVacio) {
                    switch (camposVacio) {
                        case 0:
                            txtapepat.setBackground(color);
                            break;
                        case 1:
                            txtapemat.setBackground(color);
                            break;
                        case 2:
                            txtnombres.setBackground(color);
                            break;
                        case 3:
                            txtdocide.setBackground(color);
                            break;
                        case 4:
                            formatemail.setBackground(color);
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
                            break;
                        case 6:
                            txttelefono.setBackground(color);
                            break;
                        default:
                            break;
                    }
                }
            }
        } else {
            passEncrip = validar.encriptaEnMD5(pass);
            passEncrip = validar.encriptaEnMD5(passEncrip);

            boolean estado = validar.isEmail(email);
            if (estado == true) {
                formatemail.setBackground(Color.white);
            } else {
                mensaje();
                formatemail.setBackground(color);
            }

            if (convencional.length() <= 8) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero de telefono valido");
            } else if (celular.length() > 0 && celular.length() <= 9) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero de celular valido");
            } else {
                salida.setApellidos(apepat + " " + apemat);
                salida.setNombres(nombre);
                salida.setFechanacimiento(fechanacimiento);
                telefono = Integer.parseInt(convencional);
                if (celular.equals("")) {
                    cel = 0;
                } else {
                    cel = Integer.parseInt(celular);
                }
                salida.setCelular(cel);
                salida.setTelefonoconvencional(telefono);
                salida.setCi(auxu.getCi());
                salida.setContrasenia(passEncrip);
                salida.setCorreo(auxu.getCorreo());
                salida.setTransacciones(auxu.getTransacciones());
                if (auxu.getContrasenia().equals(passEncrip)) {
                    aux = ubd.cambiarUsuario(salida);
                    if (aux == -1) {
                        JOptionPane.showMessageDialog(null, "Error en el cambio");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cambio Exitoso");
                        new Principal(salida).setVisible(true);
                        dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
                }

            }
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        new Principal(auxu).setVisible(true);
        dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    public void mensaje() {
        JOptionPane.showMessageDialog(null, "Campo /os incorrecto /os", "Validacion de Campos", JOptionPane.INFORMATION_MESSAGE);
    }

    private void txtapepatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapepatKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car != 'ñ') && (car != 'é') && (car != 'á') && (car != 'í') && (car != 'ó') && (car != 'ú') && (car != 'Ñ') && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtapepatKeyTyped

    private void txtapematKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapematKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car != 'ñ') && (car != 'é') && (car != 'á') && (car != 'í') && (car != 'ó') && (car != 'ú') && (car != 'Ñ') && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtapematKeyTyped

    private void txtnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car != 'ñ') && (car != 'é') && (car != 'á') && (car != 'í') && (car != 'ó') && (car != 'ú') && (car != 'Ñ') && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtnombresKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
        if (txttelefono.getText().length() > 8) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelularKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
        if (txtcelular.getText().length() > 9) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtcelularKeyTyped

    private void formatemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formatemailKeyTyped
        char car = evt.getKeyChar();
        if (car == ';') {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_formatemailKeyTyped

    private void txtpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassFocusGained
        txtpass.setBackground(Color.white);
    }//GEN-LAST:event_txtpassFocusGained

    private void formatemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formatemailFocusGained
        formatemail.setBackground(Color.white);
    }//GEN-LAST:event_formatemailFocusGained

    private void txttelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttelefonoFocusGained
        txttelefono.setBackground(Color.white);
    }//GEN-LAST:event_txttelefonoFocusGained

    private void txtdocideFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdocideFocusGained
        txtdocide.setBackground(Color.white);
    }//GEN-LAST:event_txtdocideFocusGained

    private void txtnombresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombresFocusGained
        txtnombres.setBackground(Color.white);
    }//GEN-LAST:event_txtnombresFocusGained

    private void txtapematFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtapematFocusGained
        txtapemat.setBackground(Color.white);
    }//GEN-LAST:event_txtapematFocusGained

    private void txtapepatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtapepatFocusGained
        txtapepat.setBackground(Color.white);
    }//GEN-LAST:event_txtapepatFocusGained

    private void txtdocideKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdocideKeyTyped
   
    }//GEN-LAST:event_txtdocideKeyTyped

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
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Registro().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser datefechana;
    private javax.swing.JTextField formatemail;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton rbci;
    private javax.swing.JRadioButton rbpasa;
    private javax.swing.JTextField txtapemat;
    private javax.swing.JTextField txtapepat;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtdocide;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
