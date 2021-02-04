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
    private JList<AuxiliarPropiedad> lista;
    private PropiedadBD pbd;
    private Conexion cnx;

    //Constructor
    public HiloBasedeDatos(JProgressBar barra, JList<AuxiliarPropiedad> lista, PropiedadBD pbd) {
        this.barra = barra;
        this.lista = lista;
        this.pbd = pbd;
    }

    //Metodos
    @Override
    public void run() {
        
        cnx = new Conexion();
        cnx.obtener();
        DefaultListModel model = new DefaultListModel();
        int aux=0;
        try {
            PreparedStatement ps = cnx.getCnx().prepareStatement("SELECT * FROM propiedad");
            ResultSet rs = ps.executeQuery();
            if (rs.last()) {
                aux = rs.getRow();
                barra.setMaximum(aux);
                rs.beforeFirst();
            }
            for (int i =1; rs.next();i++) {
                AuxiliarPropiedad ap = new AuxiliarPropiedad();
                barra.setValue(i);
                ap.setIdPersona(rs.getInt("Persona_idPersona"));
                ap.setNombre(rs.getString("nombre"));
                ap.setNumeropropiedad(rs.getString("numeropropiedad"));
                ap.setDescripcion(rs.getString("descripcion"));
                ap.setSector(rs.getString("sector"));
                ap.setTipoc(rs.getString("tipocontrato"));
                model.addElement(ap);
                lista.setModel(model);
                lista.revalidate();
                sleep(500);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la carga de los datos");
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloBasedeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
