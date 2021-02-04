/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Lucho
 */
public class HiloBusqueda extends Thread {

    //Atributos
    private JList<AuxiliarArticulo> lista;
    private String busqueda, campo;
    private Conexion cnx;

    //Constructor
    public HiloBusqueda(JList<AuxiliarArticulo> lista) {
        this.lista = lista;
    }

    //Metodos
    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    @Override
    public void run() {
        cnx = new Conexion();
        cnx.obtener();
        DefaultListModel model = new DefaultListModel();
        lista.setModel(model);
        int aux = 0;
        try {
            PreparedStatement ps = cnx.getCnx().prepareStatement("SELECT * FROM articulo WHERE " + campo + " LIKE '%" + busqueda + "%'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                AuxiliarArticulo ap = new AuxiliarArticulo();
                ap.setIdPersona(rs.getInt("Persona_idPersona"));
                ap.setTitulo(rs.getString("titulo"));
                ap.setCategoria(rs.getString("categoria"));
                ap.setDescripcion(rs.getString("descricion"));
                ap.setTipoprecio(rs.getString("tipoprecio"));
                ap.setMarca(rs.getString("marca"));
                ap.setPrecio(Integer.parseInt(rs.getString("precio")));
                if("1".equals(rs.getString("nuevo"))){
                    ap.setNuevo(true);
                }else{
                    ap.setNuevo(false);
                }
                if("1".equals(rs.getString("usado"))){
                    ap.setNuevo(true);
                }else{
                    ap.setNuevo(false);
                }
                model.addElement(ap);
                lista.setModel(model);
                lista.revalidate();
            }

        } catch (SQLException ex) {

        }
    }

}
