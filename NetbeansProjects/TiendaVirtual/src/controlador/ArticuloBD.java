/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;

/**
 *
 * @author Lucho
 */
public class ArticuloBD {

    //Atributos
    private Conexion conexion;

    //Constructor
    public ArticuloBD(Conexion conexion) {
        this.conexion = conexion;
    }

    //Metodos
    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    public int agregarArticulo(Articulo c, int idusuario) {
        int valor = -1;
        int nuevo;
        int usado;
        if (c.isNuevo() == true) {
            nuevo = 1;
        } else {
            nuevo = 0;
        }

        if (c.isUsado() == true) {
            usado = 1;
        } else {
            usado = 0;
        }
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("INSERT INTO articulo VALUES (NULL,'" + c.getCategoria() + "','" + c.getMarca() + "','" + c.getTitulo() + "','" + c.getTipoprecio() + "','" + c.getDescripcion() + "','" + nuevo + "','" + usado + "','" + c.getPrecio() + "','" + idusuario + "')");
            valor = ps.executeUpdate();
            System.err.println(valor);
            conexion.cerrar();

        } catch (SQLException ex) {
            Logger.getLogger(ArticuloBD.class.getName()).log(Level.SEVERE, null, ex);
            valor = -1;
        }
        return valor;
    }

    public ArrayList leerMarca() {
        ArrayList<String> aux = new ArrayList<>();
        int valor = -1;
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT marca FROM articulo");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                aux.add(rs.getString("marca"));
            }
        } catch (Exception e) {
            aux.clear();
        }
        conexion.cerrar();
        return aux;
    }

    public int articulos(User u) {
        int contador = 0;
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT idArticulo FROM articulo WHERE Persona_idPersona =" + u.getId() + "");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                contador = 2;
            } else {
                contador = 0;
            }
        } catch (SQLException ex) {
            contador = 0;
        }
        return contador;
    }

    public ArrayList nombreArticulo(User u) {
        ArrayList<String> aux = new ArrayList<>();
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT titulo FROM articulo where Persona_idPersona = " + u.getId() + "");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                aux.add(rs.getString("titulo"));
            }
            Collections.sort(aux);
        } catch (SQLException ex) {
            aux.clear();
        }
        return aux;
    }

    public int eliminarPropiedad(User u, String nombre) {
        int valor = -1;
        int aux;
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT idArticulo FROM articulo WHERE titulo = '" + nombre + "'");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                aux = rs.getInt("idArticulo");
                ps = conexion.getCnx().prepareStatement("DELETE FROM articulo WHERE idArticulo='" + aux + "'");
                valor = ps.executeUpdate();

            } else {
                valor = -1;
            }
        } catch (SQLException ex) {
            valor = -1;
        }
        return valor;
    }

    //SELECT casa.* FROM departamento,casa,terreno WHERE casa.IDPROPIEDAD=departamento.IDPROPIEDAD AND terreno.IDPROPIEDAD=1
    public AuxiliarArticulo informacionArticulo(AuxiliarArticulo p) {

        AuxiliarArticulo cdt = new AuxiliarArticulo();

        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT * FROM articulo WHERE Persona_idPersona =" + p.getIdPersona() + " AND titulo = '" + p.getTitulo() + "' AND categoria ='" + p.getCategoria() + "'");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                cdt.setTitulo(rs.getString("titulo"));
                cdt.setDescripcion(rs.getString("descricion"));
                cdt.setCategoria(rs.getString("categoria"));
                cdt.setMarca(rs.getString("marca"));
                cdt.setTipoprecio(rs.getString("tipoprecio"));
                if (rs.getInt("nuevo") == 1) {
                    cdt.setNuevo(true);
                } else {
                    cdt.setNuevo(false);
                }
                
                if (rs.getInt("usado") == 1) {
                    cdt.setUsado(true);
                } else {
                    cdt.setUsado(false);
                }
                cdt.setPrecio(rs.getInt("precio"));
            }

        } catch (SQLException ex) {
            cdt = new AuxiliarArticulo();
        }
        return cdt;
    }
//

    public ArrayList busqueda(String busqueda, String campo) {
        ArrayList<AuxiliarArticulo> aux = new ArrayList<>();
        try {
            conexion.obtener();

            PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT * FROM articulo WHERE " + campo + "='" + busqueda + "'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

            }

//              PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT * FROM articulo WHERE " + campo + "='" + busqueda + "'");
        } catch (SQLException ex) {
            aux.clear();
        }
        return aux;
    }

}
