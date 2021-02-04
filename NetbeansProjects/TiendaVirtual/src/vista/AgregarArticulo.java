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
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import modelo.*;

/**
 *
 * @author Leslie Diaz
 */
public class AgregarArticulo extends javax.swing.JFrame {

    Articulo a = new Articulo();
    Validar v = new Validar();
    int auxn;
    Conexion cnx = new Conexion();
    ArticuloBD pbd = new ArticuloBD(cnx);
    User aux;

    /**
     * Creates new form AgregarCasa
     */
    public AgregarArticulo(User u) {
        initComponents();
        this.setSize(800, 600);
        setAlwaysOnTop(false);
        setLocationRelativeTo(null);
        setResizable(false);  // no me deja maximizar

        aux = u;
        Object[] marca;
        marca = pbd.leerMarca().toArray();
        DefaultComboBoxModel model = new DefaultComboBoxModel(marca);
        cbmarca.setModel(model);
        validacionPegar();
    }

    public void validacionPegar() {
        InputMap map1 = areadescripcion.getInputMap(areadescripcion.WHEN_FOCUSED);
        map1.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        InputMap map2 = txttitulo.getInputMap(txttitulo.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        InputMap map3 = txtmarca.getInputMap(txtmarca.WHEN_FOCUSED);
        map3.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

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
        jPanel6 = new javax.swing.JPanel();
        cbcategoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtmarca = new javax.swing.JTextField();
        cbmarca = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txttitulo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        sprecio = new javax.swing.JSpinner();
        cbtipoprecio = new javax.swing.JComboBox<>();
        cbnuevo = new javax.swing.JCheckBox();
        cbusado = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areadescripcion = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnagregar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 102)), "Agregar Articulo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 18))); // NOI18N
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setLayout(new java.awt.GridLayout(5, 2));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel7.setText("Categoria: ");
        jPanel2.add(jLabel7);

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.X_AXIS));

        cbcategoria.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cbcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenadores de Escritorio", "Laptops", "Celulares", "Tablets", "Camaras Digitales" }));
        cbcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcategoriaActionPerformed(evt);
            }
        });
        jPanel6.add(cbcategoria);

        jPanel2.add(jPanel6);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setText("Marca: ");
        jPanel2.add(jLabel2);

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.X_AXIS));
        jPanel4.add(txtmarca);

        cbmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmarcaActionPerformed(evt);
            }
        });
        jPanel4.add(cbmarca);

        jPanel2.add(jPanel4);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setText("Titulo: ");
        jPanel2.add(jLabel3);

        txttitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttituloFocusGained(evt);
            }
        });
        txttitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttituloKeyTyped(evt);
            }
        });
        jPanel2.add(txttitulo);

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel11.setText("Precio (dolares): ");
        jPanel2.add(jLabel11);

        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.X_AXIS));

        sprecio.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel9.add(sprecio);

        cbtipoprecio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Precio Fijo", "Negociable", "Gratuito" }));
        cbtipoprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtipoprecioActionPerformed(evt);
            }
        });
        jPanel9.add(cbtipoprecio);

        jPanel2.add(jPanel9);

        cbnuevo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cbnuevo.setText("Nuevo");
        cbnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnuevoActionPerformed(evt);
            }
        });
        jPanel2.add(cbnuevo);

        cbusado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cbusado.setText("Usado");
        jPanel2.add(cbusado);

        jPanel1.add(jPanel2);

        jPanel8.setLayout(new java.awt.GridLayout(1, 2));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel12.setText("Descripcion: ");
        jPanel8.add(jLabel12);

        areadescripcion.setColumns(20);
        areadescripcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        areadescripcion.setLineWrap(true);
        areadescripcion.setRows(5);
        areadescripcion.setWrapStyleWord(true);
        areadescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                areadescripcionFocusGained(evt);
            }
        });
        areadescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                areadescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(areadescripcion);

        jPanel8.add(jScrollPane1);

        jPanel1.add(jPanel8);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.X_AXIS));

        btnagregar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/visto.png"))); // NOI18N
        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        jPanel3.add(btnagregar);

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

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        cnx = new Conexion();
        pbd = new ArticuloBD(cnx);
        String titulo = txttitulo.getText();
        String marca = txtmarca.getText();
        String categoria = (String) cbcategoria.getSelectedItem();
        String tipoprecio = (String) cbtipoprecio.getSelectedItem();

        String precio;
        if ((int) sprecio.getValue() == 0) {
            precio = "";
        } else {
            precio = sprecio.getValue() + "";
        }

        boolean nuevo = cbnuevo.isSelected();
        boolean usado = cbusado.isSelected();
        String descrip = areadescripcion.getText();

        ArrayList<String> campos = new ArrayList<>();
        campos.add(titulo);
        campos.add(marca);
        campos.add(precio);
        campos.add(descrip);
        List<Integer> vacios = v.camposVacios(campos);
        if (!vacios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completar los Campos Vacios o Incorrectos");
            for (Integer camposVacio : vacios) {
                if (null != camposVacio) {
                    switch (camposVacio) {
                        case 0:
                            txttitulo.setBackground(Color.red);
                            break;
                        case 1:
                            txtmarca.setBackground(Color.red);
                            break;
                        case 2:
                            sprecio.setBackground(Color.red);
                            break;
                        case 3:
                            areadescripcion.setBackground(Color.red);
                            break;
                        default:
                            break;
                    }
                }
            }
        } else {
            a.setCategoria(categoria);
            a.setMarca(marca);
            a.setTitulo(titulo);
            a.setTipoprecio(tipoprecio);
            a.setPrecio((int) Double.parseDouble(precio));
            a.setDescripcion(descrip);
            a.setNuevo(nuevo);
            a.setUsado(usado);
            auxn = pbd.agregarArticulo(a, aux.getId());
            if (auxn == -1) {
                JOptionPane.showMessageDialog(null, "Error en el Guardado");
            } else {
                JOptionPane.showMessageDialog(null, "Guardado Exitoso");
                Principal p = new Principal(aux);
                p.setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        Principal p = new Principal(aux);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void cbcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcategoriaActionPerformed

    }//GEN-LAST:event_cbcategoriaActionPerformed

    private void txttituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttituloFocusGained
        txttitulo.setBackground(Color.white);
    }//GEN-LAST:event_txttituloFocusGained

    private void areadescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_areadescripcionFocusGained
        areadescripcion.setBackground(Color.white);
    }//GEN-LAST:event_areadescripcionFocusGained

    private void txttituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttituloKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car != 'ñ') && (car != 'á') && (car != 'í') && (car != 'ó') && (car != 'ú') && (car != 'Ñ') && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txttituloKeyTyped

    private void areadescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areadescripcionKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && (car != '-') && (car != 'ñ') && (car != 'é') && (car != 'á') && (car != 'í') && (car != 'ó') && (car != 'ú') && (car != 'Ñ') && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE) && (car != (char) KeyEvent.VK_COLON) && (car != (char) KeyEvent.VK_COMMA)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_areadescripcionKeyTyped

    private void cbnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbnuevoActionPerformed

    private void cbmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmarcaActionPerformed
        // TODO add your handling code here:
        String aux = (String) cbmarca.getSelectedItem();
        txtmarca.setText(aux);
        txtmarca.setBackground(Color.white);
    }//GEN-LAST:event_cbmarcaActionPerformed

    private void cbtipoprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipoprecioActionPerformed
        if (cbtipoprecio.getSelectedIndex() == 2) {
            sprecio.setEnabled(false);
            SpinnerModel model = new SpinnerNumberModel(0,0,0,0);
            sprecio.setModel(model);

        }else if(cbtipoprecio.getSelectedIndex()==0){
            sprecio.setEnabled(true);
            SpinnerModel model = new SpinnerNumberModel(0, 0,1000000, 1);
            
            sprecio.setModel(model);
        }else if(cbtipoprecio.getSelectedIndex()==1){
            sprecio.setEnabled(true);
            SpinnerModel model = new SpinnerNumberModel(0, 0,1000000, 1);
            sprecio.setModel(model);
        }
    }//GEN-LAST:event_cbtipoprecioActionPerformed

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
    private javax.swing.JTextArea areadescripcion;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JComboBox<String> cbcategoria;
    private javax.swing.JComboBox<String> cbmarca;
    private javax.swing.JCheckBox cbnuevo;
    private javax.swing.JComboBox<String> cbtipoprecio;
    private javax.swing.JCheckBox cbusado;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner sprecio;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txttitulo;
    // End of variables declaration//GEN-END:variables
}
