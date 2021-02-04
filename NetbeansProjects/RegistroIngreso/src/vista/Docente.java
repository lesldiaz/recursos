/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import clases.Materia;
import controlador.LeerEscribirArchivos;
import java.util.HashMap;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import modelo.Usuario;

/**
 *
 * @author USRBET
 */
public class Docente extends javax.swing.JFrame {

    /**
     * Creates new form Docente
     */
    LeerEscribirArchivos leerarc = new LeerEscribirArchivos ();
    List <Materia> materias = (List <Materia>) leerarc.leerArchivo("listaMateria");
    
    public void actualizarListas (List lista, JList listaVista){
        DefaultListModel model = new DefaultListModel();  // index es la posicion en la que quiero guardar
        for (int i = 0; i < lista.size(); i++) {
            model.addElement(lista.get(i));
        }
        
        listaVista.setModel(model);
        listaVista.revalidate();
    }
    
    public Docente(String nombreyApellido) {
        initComponents();
       txtDocente.setText(nombreyApellido);
       setLocationRelativeTo(null);
       actualizarListas(materias,jlistMaterias);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDocente = new javax.swing.JLabel();
        bcancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlistMaterias = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jlistAlumnos = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDocente.setText("jlabel");
        txtDocente.setToolTipText("");
        getContentPane().add(txtDocente, java.awt.BorderLayout.PAGE_START);

        bcancelar.setText("Cancelar");
        bcancelar.setMargin(new java.awt.Insets(2, 6, 2, 6));
        bcancelar.setMaximumSize(new java.awt.Dimension(30, 23));
        bcancelar.setMinimumSize(new java.awt.Dimension(30, 23));
        bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelarActionPerformed(evt);
            }
        });
        getContentPane().add(bcancelar, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jlistMaterias.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jlistMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlistMateriasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jlistMaterias);

        jPanel2.add(jScrollPane3);

        jScrollPane4.setViewportView(jlistAlumnos);

        jPanel2.add(jScrollPane4);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlistMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlistMateriasMouseClicked
       Materia materia = (Materia) jlistMaterias.getSelectedValue();
       HashMap <Object,Object> hashmap = (HashMap <Object,Object>) leerarc.leerArchivo("archivoHashMap");
       List <Usuario> alumnosmateria = (List <Usuario>) hashmap.get(materia.getCodigo());
       actualizarListas(alumnosmateria,jlistAlumnos);
          
    }//GEN-LAST:event_jlistMateriasMouseClicked

    private void bcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelarActionPerformed
     System.exit(0);
    }//GEN-LAST:event_bcancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Docente("Docente").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcancelar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList jlistAlumnos;
    private javax.swing.JList jlistMaterias;
    private javax.swing.JLabel txtDocente;
    // End of variables declaration//GEN-END:variables
}
