/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Lucho
 */
public class HiloBasedeDatos extends Thread {

    //Atributos
    private JProgressBar barra;
    private JList<AuxiliarArticulo> lista;
    private Conexion cnx;

    //Constructor
    public HiloBasedeDatos(JProgressBar barra, JList<AuxiliarArticulo> lista, ArticuloBD pbd) {
        this.barra = barra;
        this.lista = lista;
    }

    //Metodos
    @Override
    public void run() {
        
        cnx = new Conexion();
        cnx.obtener();
        DefaultListModel model = new DefaultListModel();
        int aux=0;
        try {
            PreparedStatement ps = cnx.getCnx().prepareStatement("SELECT * FROM articulo");
            ResultSet rs = ps.executeQuery();
            if (rs.last()) {
                aux = rs.getRow();
                barra.setMaximum(aux);
                rs.beforeFirst();
            }
            for (int i =1; rs.next();i++) {
                AuxiliarArticulo ap = new AuxiliarArticulo();
                barra.setValue(i);
                ap.setIdPersona(rs.getInt("Persona_idPersona"));
                ap.setTitulo(rs.getString("titulo"));
                ap.setDescripcion(rs.getString("descripcion"));
                ap.setCategoria(rs.getString("categoria"));
                model.addElement(ap);
                lista.setModel(model);
                lista.revalidate();
                sleep(750);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la carga de los datos");
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloBasedeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        barra.setString("Cargado Completado");
    }

}
