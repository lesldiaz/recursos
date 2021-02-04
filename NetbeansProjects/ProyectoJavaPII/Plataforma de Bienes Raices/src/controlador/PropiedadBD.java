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
public class PropiedadBD {

    Validar v = new Validar();

    //Atributos
    private Conexion conexion;

    //Constructor
    public PropiedadBD(Conexion conexion) {
        this.conexion = conexion;
    }

    //Metodos
    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    public int agregarCasa(Casa c, int idusuario) {
        int valor = -1;
        int aux = 0;
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("INSERT INTO propiedad VALUES (0,'" + c.getNombre() + "','" + c.getCalleprincipal() + "','" + c.getNumerocasa() + "','" + c.getCallesecundaria() + "','" + c.getSector() + "','" + c.getExtension() + "','" + c.getDescripcion() + "','" + c.getTipocontrato() + "','" + idusuario + "')");
            valor = ps.executeUpdate();
            ps = conexion.getCnx().prepareStatement("SELECT idPropiedad from propiedad WHERE nombre = '" + c.getNombre() + "' AND descripcion ='" + c.getDescripcion() + "' AND numeropropiedad='" + c.getNumerocasa() + "'");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                aux = rs.getInt("idPropiedad");
                System.err.println(rs.getInt("idPropiedad"));
                ps = conexion.getCnx().prepareStatement("INSERT INTO casa VALUES (0," + c.getNumeropisos() + "," + c.isPatio() + "," + c.isParqueadero() + "," + c.getNumerocuartos() + "," + c.getNumerobanios() + "," + aux + "," + c.getPrecio() + ")");
                valor = ps.executeUpdate();
                System.err.println(valor);
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            valor = -1;
        }
        return valor;
    }

    public int agregarDepartamento(Departamento d, int idusuario) {
        int valor = -1;
        int aux = 0;
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("INSERT INTO propiedad VALUES (0,'" + d.getNombre() + "','" + d.getCalleprincipal() + "','" + d.getNumerocasa() + "','" + d.getCallesecundaria() + "','" + d.getSector() + "','" + d.getExtension() + "','" + d.getDescripcion() + "','" + d.getTipocontrato() + "','" + idusuario + "')");
            valor = ps.executeUpdate();
            ps = conexion.getCnx().prepareStatement("SELECT idPropiedad from propiedad WHERE nombre = '" + d.getNombre() + "' AND descripcion ='" + d.getDescripcion() + "' AND numeropropiedad='" + d.getNumerocasa() + "'");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                aux = rs.getInt("idPropiedad");
                ps = conexion.getCnx().prepareStatement("INSERT INTO departamento VALUES (0," + d.getPiso() + "," + d.isPatio() + "," + d.isParqueadero() + "," + d.getNumerocuartos() + "," + d.getNumerobanios() + "," + aux + "," + d.getPrecio() + ")");
                valor = ps.executeUpdate();
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            valor = -1;
        }
        return valor;
    }

    public int agregarTerreno(Terreno t, int idusuario) {
        int valor = -1;
        int aux = 0;
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("INSERT INTO propiedad VALUES (0,'" + t.getNombre() + "','" + t.getCalleprincipal() + "','" + t.getNumerocasa() + "','" + t.getCallesecundaria() + "','" + t.getSector() + "','" + t.getExtension() + "','" + t.getDescripcion() + "','" + t.getTipocontrato() + "','" + idusuario + "')");
            valor = ps.executeUpdate();
            ps = conexion.getCnx().prepareStatement("SELECT idPropiedad from propiedad WHERE nombre = '" + t.getNombre() + "' AND descripcion ='" + t.getDescripcion() + "' AND numeropropiedad='" + t.getNumerocasa() + "'");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                aux = rs.getInt("idPropiedad");
                ps = conexion.getCnx().prepareStatement("INSERT INTO terreno VALUES (0," + t.getPrecio() + "," + aux + ")");
                valor = ps.executeUpdate();
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            valor = -1;
        }
        return valor;
    }

    public ArrayList leerSectores() {
        ArrayList<String> aux = new ArrayList<>();
        int valor = -1;
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT sector FROM propiedad");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                aux.add(rs.getString("sector"));
            }
        } catch (Exception e) {
            aux.clear();
        }
        conexion.cerrar();
        return aux;
    }

    public int propiedades(Usuario u) {
        int contador = 0;
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT idPropiedad FROM propiedad WHERE Persona_idPersona =" + u.getId() + "");
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

    public ArrayList nombrePropiedades(Usuario u) {
        ArrayList<String> aux = new ArrayList<>();
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT nombre FROM propiedad where Persona_idPersona = " + u.getId() + "");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                aux.add(rs.getString("nombre"));
            }
            Collections.sort(aux);
        } catch (SQLException ex) {
            aux.clear();
        }
        return aux;
    }

    public int eliminarPropiedad(Usuario u, String nombre) {
        int valor = -1;
        int aux;
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT idPropiedad FROM propiedad WHERE nombre = '" + nombre + "'");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                aux = rs.getInt("idPropiedad");
                ps = conexion.getCnx().prepareStatement("DELETE FROM casa WHERE IDPROPIEDAD='" + aux + "'");
                valor = ps.executeUpdate();
                ps = conexion.getCnx().prepareStatement("DELETE FROM departamento WHERE IDPROPIEDAD=" + aux + "");
                valor = ps.executeUpdate();
                ps = conexion.getCnx().prepareStatement("DELETE FROM terreno WHERE IDPROPIEDAD='" + aux + "'");
                valor = ps.executeUpdate();
                ps = conexion.getCnx().prepareStatement("DELETE FROM propiedad where idPropiedad =" + aux + "");
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

    public AuxiliarTipoPropiedad informacionPropiedad(AuxiliarPropiedad p) {
        AuxiliarTipoPropiedad cdt = new AuxiliarTipoPropiedad();
        int auxp = 0;
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT * FROM propiedad WHERE Persona_idPersona ='" + p.getIdPersona() + "' AND nombre = '" + p.getNombre() + "' AND numeropropiedad = '" + p.getNumeropropiedad() + "' AND sector ='" + p.getSector() + "' AND tipocontrato = '" + p.getTipoc() + "'");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                auxp = rs.getInt("idPropiedad");
                cdt.setNombre(rs.getString("nombre"));
                cdt.setCalleprincipal(rs.getString("calleprincipal"));
                cdt.setNumerocasa(rs.getString("numeropropiedad"));
                cdt.setCallesecundaria(rs.getString("callesecundaria"));
                cdt.setSector(rs.getString("sector"));
                cdt.setExtension(rs.getInt("extension"));
                cdt.setDescripcion(rs.getString("descripcion"));
                cdt.setTipocontrato(rs.getString("tipocontrato"));
                ps = conexion.getCnx().prepareStatement("SELECT * FROM casa,departamento,terreno WHERE casa.IDPROPIEDAD=" + auxp + "");
                rs = ps.executeQuery();
                if (rs.next()) {
                    cdt.setTipop("Casa");
                    cdt.setPiso(0);
                   cdt.setNumeropisos(rs.getInt("numeropisos"));
                    cdt.setPatio(rs.getBoolean("patio"));
                    cdt.setParqueadero(rs.getBoolean("parqueadero"));
                    cdt.setNumerocuartos(rs.getInt("numerocuartos"));
                    cdt.setNumerobanios(rs.getInt("numerobanios"));
                    cdt.setPrecio(rs.getDouble("precio"));
                } else {
                    ps = conexion.getCnx().prepareStatement("SELECT * FROM departamento WHERE IDPROPIEDAD=" + auxp + "");
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        cdt.setTipop("Departamento");
                        cdt.setNumeropisos(0);
                        cdt.setPiso(rs.getInt("piso"));
                        cdt.setPatio(rs.getBoolean("patio"));
                        cdt.setParqueadero(rs.getBoolean("parqueadero"));
                        cdt.setNumerocuartos(rs.getInt("numerocuartos"));
                        cdt.setNumerobanios(rs.getInt("numerobanios"));
                        cdt.setPrecio(rs.getDouble("precio"));
                    } else {
                        ps = conexion.getCnx().prepareStatement("SELECT * FROM terreno WHERE IDPROPIEDAD=" + auxp + "");
                        rs = ps.executeQuery();
                        if (rs.next()) {
                            cdt.setTipop("Terreno");
                            cdt.setPrecio(rs.getDouble("valormetro"));
                            cdt.setNumeropisos(0);
                            cdt.setPiso(0);
                        }
                    }

                }
            }
        } catch (SQLException ex) {
            cdt = new AuxiliarTipoPropiedad();
        }
        return cdt;
    }
}
