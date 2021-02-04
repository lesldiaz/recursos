/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Imagen;
import controlador.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import modelo.*;

/**
 *
 * @author Leslie Diaz
 */
public class AgregarCasa extends javax.swing.JFrame {

    Terreno t = new Terreno();
    Casa c = new Casa();
    Departamento d = new Departamento();
    Validar v = new Validar();
    int auxn;
    Conexion cnx = new Conexion();
    PropiedadBD pbd = new PropiedadBD(cnx);
    Usuario aux;

    /**
     * Creates new form AgregarCasa
     */
    public AgregarCasa(Usuario u) {
        initComponents();
        this.setSize(800, 600);
        setAlwaysOnTop(false);
        setLocationRelativeTo(null);
        setResizable(false);  // no me deja maximizar
        snumpisos.setEnabled(false);
        aux = u;
        Object[] sector;
        sector = pbd.leerSectores().toArray();
        DefaultComboBoxModel model = new DefaultComboBoxModel(sector);
        cbsector.setModel(model);
        validacionPegar();
       }
    
    public void validacionPegar(){
        InputMap map1 = areadescripcion.getInputMap(areadescripcion.WHEN_FOCUSED);
        map1.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        
        InputMap map2 = txtnombre.getInputMap(txtnombre.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        
        InputMap map3 = txtsector.getInputMap(txtsector.WHEN_FOCUSED);
        map3.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        
        InputMap map4 = txtcallep.getInputMap(txtcallep.WHEN_FOCUSED);
        map4.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        
        InputMap map5 = txtcalles.getInputMap(txtcalles.WHEN_FOCUSED);
        map5.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        
        InputMap map6 = txtnumero.getInputMap(txtnumero.WHEN_FOCUSED);
        map6.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        
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
        cbtipop = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbtipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cbsector = new javax.swing.JComboBox<>();
        txtsector = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcallep = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcalles = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        sextension = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        shabitaciones = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        sbanios = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        sprecio = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        spiso = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        snumpisos = new javax.swing.JSpinner();
        cbparqueadero = new javax.swing.JCheckBox();
        cbpatio = new javax.swing.JCheckBox();
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 102)), "Agregar Casa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 18))); // NOI18N
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setLayout(new java.awt.GridLayout(15, 2));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel7.setText("Tipo de Propiedad: ");
        jPanel2.add(jLabel7);

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.X_AXIS));

        cbtipop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cbtipop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Departamento", "Casa", "Terreno" }));
        cbtipop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtipopActionPerformed(evt);
            }
        });
        jPanel6.add(cbtipop);

        jPanel2.add(jPanel6);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setText("Condicion de la Propiedad: ");
        jPanel2.add(jLabel2);

        cbtipo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Venta", "Arriendo" }));
        jPanel2.add(cbtipo);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setText("Añada un nombre a su Propiedad: ");
        jPanel2.add(jLabel3);

        txtnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnombreFocusGained(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtnombre);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setText("Sector: ");
        jPanel2.add(jLabel4);

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.X_AXIS));

        cbsector.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cbsector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsectorActionPerformed(evt);
            }
        });
        jPanel5.add(cbsector);

        txtsector.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtsectorFocusGained(evt);
            }
        });
        txtsector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsectorKeyTyped(evt);
            }
        });
        jPanel5.add(txtsector);

        jPanel2.add(jPanel5);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setText("Calle Principal:");
        jPanel2.add(jLabel5);

        txtcallep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcallepFocusGained(evt);
            }
        });
        txtcallep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcallepKeyTyped(evt);
            }
        });
        jPanel2.add(txtcallep);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setText("Calle Secundaria: ");
        jPanel2.add(jLabel6);

        txtcalles.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcallesFocusGained(evt);
            }
        });
        txtcalles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcallesKeyTyped(evt);
            }
        });
        jPanel2.add(txtcalles);

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setText("Numero de Propiedad: ");
        jPanel2.add(jLabel8);

        txtnumero.setToolTipText("EJM: E55-55");
        txtnumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnumeroFocusGained(evt);
            }
        });
        txtnumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumeroKeyTyped(evt);
            }
        });
        jPanel2.add(txtnumero);

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel9.setText("Extension:");
        jPanel2.add(jLabel9);

        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.X_AXIS));

        sextension.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        sextension.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sextensionKeyTyped(evt);
            }
        });
        jPanel7.add(sextension);

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel14.setText("metros cuadrados");
        jPanel7.add(jLabel14);

        jPanel2.add(jPanel7);

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel10.setText("Numero de Habitaciones: ");
        jPanel2.add(jLabel10);

        shabitaciones.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        shabitaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                shabitacionesKeyTyped(evt);
            }
        });
        jPanel2.add(shabitaciones);

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel13.setText("Numero de Baños:");
        jPanel2.add(jLabel13);

        sbanios.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        sbanios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sbaniosKeyTyped(evt);
            }
        });
        jPanel2.add(sbanios);

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel11.setText("Precio: ");
        jPanel2.add(jLabel11);

        sprecio.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        sprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sprecioKeyTyped(evt);
            }
        });
        jPanel2.add(sprecio);

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel15.setText("Piso: ");
        jPanel2.add(jLabel15);

        spiso.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spiso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spisoKeyTyped(evt);
            }
        });
        jPanel2.add(spiso);

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel16.setText("Numero de Pisos:");
        jPanel2.add(jLabel16);

        snumpisos.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        snumpisos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                snumpisosKeyTyped(evt);
            }
        });
        jPanel2.add(snumpisos);

        cbparqueadero.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cbparqueadero.setText("Parqueadero");
        jPanel2.add(cbparqueadero);

        cbpatio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cbpatio.setText("Patio");
        jPanel2.add(cbpatio);

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
        pbd = new PropiedadBD(cnx);
        String nombre = txtnombre.getText();
        String sector = txtsector.getText();
        String contrato = (String) cbtipo.getSelectedItem();
        String callep = txtcallep.getText();
        String calles = txtcalles.getText();
        String numerop = txtnumero.getText();
        String extension, numhab, numban, precio, piso, numpisos;
        if ((int) sextension.getValue() <= 0) {
            extension = "";
        } else {
            extension = sextension.getValue() + "";
            System.out.println(extension);

        }
        if ((int) shabitaciones.getValue() <= 0) {
            numhab = "";
        } else {
            numhab = shabitaciones.getValue() + "";
        }
        if ((int) sbanios.getValue() <= 0) {
            numban = "";
        } else {
            numban = sbanios.getValue() + "";
        }
        if ((int) sprecio.getValue() <= 0) {
            precio = "";
        } else {
            precio = sprecio.getValue() + "";
        }
        if ((int) spiso.getValue() <= 0) {
            piso = "";
        } else {
            piso = spiso.getValue() + "";
        }
        if ((int) snumpisos.getValue() <= 0) {
            numpisos = "";
        } else {
            numpisos = snumpisos.getValue() + "";
        }
        boolean parqueadero = cbparqueadero.isSelected();
        boolean patio = cbpatio.isSelected();
        String descrip = areadescripcion.getText();

        ArrayList<String> campos = new ArrayList<>();
        campos.add(nombre);
        campos.add(callep);
        campos.add(numerop);
        campos.add(calles);
        campos.add(sector);
        campos.add(extension);
        campos.add(descrip);

        if (cbtipop.getSelectedIndex() == 0) {
            campos.add(piso);
            campos.add(numhab);
            campos.add(numban);
            campos.add(precio);
        } else if (cbtipop.getSelectedIndex() == 1) {
            campos.add(numpisos);
            campos.add(numhab);
            campos.add(numban);
            campos.add(precio);
        } else {
            campos.add(precio);
        }

        List<Integer> vacios = v.camposVacios(campos);
        if (!vacios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completar los Campos Vacios o Incorrectos");
            for (Integer camposVacio : vacios) {
                if (null != camposVacio) {
                    switch (camposVacio) {
                        case 0:
                            txtnombre.setBackground(Color.red);
                            break;
                        case 1:
                            txtcallep.setBackground(Color.red);
                            break;
                        case 2:
                            txtnumero.setBackground(Color.red);
                            break;
                        case 3:
                            txtcalles.setBackground(Color.red);
                            break;
                        case 4:
                            txtsector.setBackground(Color.red);
                            break;
                        case 5:
                            sextension.getEditor().setBackground(Color.red);
                            break;
                        case 6:
                            areadescripcion.setBackground(Color.red);
                            break;
//                        case 7:
//                            if (cbtipop.getSelectedIndex() == 0) {
//                                spiso.getEditor().setBackground(Color.red);
//                            } else if (cbtipop.getSelectedIndex() == 1) {
//                                snumpisos.getEditor().setBackground(Color.red);
//                            } else {
//                                sprecio.getEditor().setBackground(Color.red);
//                            }
//                            break;
//                        case 8:
//                            shabitaciones.getEditor().setBackground(Color.red);
//                            break;
//                        case 9:
//                            sbanios.getEditor().setBackground(Color.red);
//                            break;
//                        case 10:
//                            sprecio.getEditor().setBackground(Color.red);
//                            break;
                        default:
                            break;
                    }
                }
            }
        } else {
            switch (cbtipop.getSelectedIndex()) {
                case 0:
                    d.setNombre(nombre);
                    d.setCalleprincipal(callep);
                    d.setNumerocasa(numerop);
                    d.setCallesecundaria(calles);
                    d.setSector(sector);
                    d.setExtension(Integer.parseInt(extension));
                    d.setDescripcion(descrip);
                    d.setTipocontrato(contrato);
                    d.setPiso(Integer.parseInt(piso));
                    d.setPatio(patio);
                    d.setParqueadero(parqueadero);
                    d.setNumerocuartos(Integer.parseInt(numhab));
                    d.setNumerobanios(Integer.parseInt(numban));
                    d.setPrecio(Double.parseDouble(precio));
                    auxn = pbd.agregarDepartamento(d, aux.getId());
                    if (auxn == -1) {
                        JOptionPane.showMessageDialog(null, "Error en el Guardado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Guardado Exitoso");
                        Principal p = new Principal(aux);
                        p.setVisible(true);
                        dispose();
                    }
                    break;
                case 1:
                    c.setNombre(nombre);
                    c.setSector(sector);
                    c.setCalleprincipal(callep);
                    c.setCallesecundaria(calles);
                    c.setDescripcion(descrip);
                    c.setNumerocasa(numerop);
                    c.setExtension(Integer.parseInt(extension));
                    c.setTipocontrato(contrato);
                    c.setNumeropisos(Integer.parseInt(numpisos));
                    c.setParqueadero(parqueadero);
                    c.setPatio(patio);
                    c.setNumerocuartos(Integer.parseInt(numhab));
                    c.setNumerobanios(Integer.parseInt(numban));
                    c.setPrecio(Double.parseDouble(precio));
                    auxn = pbd.agregarCasa(c, aux.getId());
                    if (auxn == -1) {
                        JOptionPane.showMessageDialog(null, "Error en el Guardado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Guardado exitoso");
                        Principal p = new Principal(aux);
                        p.setVisible(true);
                        dispose();
                    }
                    break;
                case 2:
                    t.setNombre(nombre);
                    t.setSector(sector);
                    t.setCalleprincipal(callep);
                    t.setCallesecundaria(calles);
                    t.setDescripcion(descrip);
                    t.setNumerocasa(numerop);
                    t.setExtension(Integer.parseInt(extension));
                    t.setTipocontrato(contrato);
                    t.setPrecio(Double.parseDouble(precio));
                    auxn = pbd.agregarTerreno(t, aux.getId());
                    if (auxn == -1) {
                        JOptionPane.showMessageDialog(null, "Error en el Guardado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Guardado Exitoso");
                        Principal p = new Principal(aux);
                        p.setVisible(true);
                        dispose();
                    }
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        Principal p = new Principal(aux);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void cbtipopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipopActionPerformed
        if (cbtipop.getSelectedIndex() == 0) {
            snumpisos.setEnabled(false);
            spiso.setEnabled(true);
            sbanios.setEnabled(true);
            shabitaciones.setEnabled(true);
            cbparqueadero.setEnabled(true);
            cbpatio.setEnabled(true);
            cbtipo.setEnabled(true);
        } else if (cbtipop.getSelectedIndex() == 1) {
            spiso.setEnabled(false);
            snumpisos.setEnabled(true);
            sbanios.setEnabled(true);
            shabitaciones.setEnabled(true);
            cbparqueadero.setEnabled(true);
            cbpatio.setEnabled(true);
            cbtipo.setEnabled(true);
        } else {
            sbanios.setEnabled(false);
            shabitaciones.setEnabled(false);
            snumpisos.setEnabled(false);
            spiso.setEnabled(false);
            cbparqueadero.setEnabled(false);
            cbpatio.setEnabled(false);
            cbtipo.setSelectedIndex(0);
            cbtipo.setEnabled(false);
        }
    }//GEN-LAST:event_cbtipopActionPerformed

    private void txtnombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreFocusGained
        txtnombre.setBackground(Color.white);
    }//GEN-LAST:event_txtnombreFocusGained

    private void txtsectorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtsectorFocusGained
        txtsector.setBackground(Color.white);
    }//GEN-LAST:event_txtsectorFocusGained

    private void txtcallepFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcallepFocusGained
        txtcallep.setBackground(Color.white);
    }//GEN-LAST:event_txtcallepFocusGained

    private void txtcallesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcallesFocusGained
        txtcalles.setBackground(Color.white);
    }//GEN-LAST:event_txtcallesFocusGained

    private void txtnumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnumeroFocusGained
        txtnumero.setBackground(Color.white);
    }//GEN-LAST:event_txtnumeroFocusGained

    private void areadescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_areadescripcionFocusGained
        areadescripcion.setBackground(Color.white);
    }//GEN-LAST:event_areadescripcionFocusGained

    private void cbsectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsectorActionPerformed
        String aux = (String) cbsector.getSelectedItem();
        txtsector.setText(aux);
        txtsector.setBackground(Color.white);
    }//GEN-LAST:event_cbsectorActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
       char car = evt.getKeyChar();
       if ( (car<'a' || car>'z')&&(car<'A' || car>'Z')&& (car !='ñ')&& (car !='á')&& (car !='í')&& (car !='ó')&& (car !='ú')&& (car !='Ñ')&&(car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
           getToolkit().beep();
           evt.consume();
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void sextensionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sextensionKeyTyped
      
    }//GEN-LAST:event_sextensionKeyTyped

    private void txtsectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsectorKeyTyped
        char car = evt.getKeyChar();
       if ( (car<'a' || car>'z')&&(car<'A' || car>'Z')&& (car !='ñ')&& (car !='á')&& (car !='í')&& (car !='ó')&& (car !='ú')&& (car !='Ñ')&&(car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
           getToolkit().beep();
           evt.consume();
        }
    }//GEN-LAST:event_txtsectorKeyTyped

    private void shabitacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_shabitacionesKeyTyped
       
    }//GEN-LAST:event_shabitacionesKeyTyped

    private void sbaniosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sbaniosKeyTyped
        
    }//GEN-LAST:event_sbaniosKeyTyped

    private void sprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sprecioKeyTyped
       
    }//GEN-LAST:event_sprecioKeyTyped

    private void spisoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spisoKeyTyped
       
    }//GEN-LAST:event_spisoKeyTyped

    private void snumpisosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snumpisosKeyTyped
       
    }//GEN-LAST:event_snumpisosKeyTyped

    private void areadescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areadescripcionKeyTyped
       char car = evt.getKeyChar();
       if ( (car<'0'|| car >'9') && (car<'a' || car>'z')&&(car<'A' || car>'Z')&& (car !='-')&&(car !='ñ')&& (car !='é')&& (car !='á')&& (car !='í')&& (car !='ó')&& (car !='ú')&& (car !='Ñ')&&(car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)&& (car!=(char)KeyEvent.VK_COLON)&& (car!=(char)KeyEvent.VK_COMMA)){
           getToolkit().beep();
           evt.consume();
        }
      
    }//GEN-LAST:event_areadescripcionKeyTyped

    private void txtcallepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcallepKeyTyped
        char car = evt.getKeyChar();
       if ( (car<'0'|| car >'9') && (car<'a' || car>'z')&&(car<'A' || car>'Z')&&(car !='ñ')&& (car !='á')&& (car !='í')&& (car !='ó')&& (car !='ú')&& (car !='Ñ')&&(car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
           getToolkit().beep();
           evt.consume();
        }
    }//GEN-LAST:event_txtcallepKeyTyped

    private void txtcallesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcallesKeyTyped
        char car = evt.getKeyChar();
       if ( (car<'0'|| car >'9') && (car<'a' || car>'z')&&(car<'A' || car>'Z')&&(car !='ñ')&& (car !='á')&& (car !='í')&& (car !='ó')&& (car !='ú')&& (car !='Ñ')&&(car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
           getToolkit().beep();
           evt.consume();
        }
    }//GEN-LAST:event_txtcallesKeyTyped

    private void txtnumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeroKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
       if ( (car<'0'|| car >'9') && (car<'A' || car>'Z')&& (car !='-')&&(car !='ñ')&& (car !='á')&& (car !='í')&& (car !='ó')&& (car !='ú')&& (car !='Ñ')&&(car!=(char)KeyEvent.VK_BACK_SPACE) && (car!=(char)KeyEvent.VK_SPACE)){
           getToolkit().beep();
           evt.consume();
        }
    }//GEN-LAST:event_txtnumeroKeyTyped

//    /**
//     * @param args the command line arguments
//     */
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
    private javax.swing.JCheckBox cbparqueadero;
    private javax.swing.JCheckBox cbpatio;
    private javax.swing.JComboBox<String> cbsector;
    private javax.swing.JComboBox<String> cbtipo;
    private javax.swing.JComboBox<String> cbtipop;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner sbanios;
    private javax.swing.JSpinner sextension;
    private javax.swing.JSpinner shabitaciones;
    private javax.swing.JSpinner snumpisos;
    private javax.swing.JSpinner spiso;
    private javax.swing.JSpinner sprecio;
    private javax.swing.JTextField txtcallep;
    private javax.swing.JTextField txtcalles;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtsector;
    // End of variables declaration//GEN-END:variables
}
