/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import modelo.Usuario;
//import sun.text.normalizer.UBiDiProps;

/**
 *
 * @author Lucho
 */
public class UsuarioBD {

    Validar v = new Validar();

    //Atributos
    private Conexion conexion;

    //Constructor
    public UsuarioBD(Conexion conexion) {
        this.conexion = conexion;
    }

    //Metodos
    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    public int agregarUsuario(Usuario usuario) {
        int valor = -1;
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("INSERT INTO usuario VALUES (0,'" + usuario.getNombres() + "','" + usuario.getApellidos() + "','" + usuario.getCi() + "','" + usuario.getTelefonoconvencional() + "','" + usuario.getCorreo() + "','" + usuario.getFechanacimiento() + "','" + usuario.getContrasenia() + "','" + usuario.getCelular() + "','" + usuario.getTransacciones() + "')");
            valor = ps.executeUpdate();
            conexion.cerrar();
        } catch (SQLException ex) {
            valor = -1;
        }
        return valor;
    }

    public Usuario login(String correo, String contrasenia) {
        Usuario u = new Usuario();
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT * FROM usuario WHERE correo='" + correo + "' AND contrasenia ='" + contrasenia + "'");
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                u.setNombres(resultado.getString("nombres"));
                u.setApellidos(resultado.getString("apellidos"));
                u.setCi(resultado.getString("ci"));
                u.setTelefonoconvencional(Integer.parseInt(resultado.getString("telefonoconvencional")));
                u.setCorreo(resultado.getString("correo"));
                u.setFechanacimiento(resultado.getString("fechanacimiento"));
                u.setContrasenia(resultado.getString("contrasenia"));
                u.setCelular(Integer.parseInt(resultado.getString("celular")));
                u.setTransacciones(resultado.getInt("Transacciones"));
                u.setId(Integer.parseInt(resultado.getString("idPersona")));
            } else {
                u = new Usuario("", "", "", "", "", "", 0, 0, 0);
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            u = new Usuario("", "", "", "", "", "", 0, 0, 0);
        }
        return u;
    }

    public boolean comprobar(String ci, String email) {
        boolean disponible = false;
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT nombres, apellidos FROM usuario WHERE ci='" + ci + "' OR correo ='" + email + "'");
            ResultSet resultado = ps.executeQuery();
            if (!resultado.next()) {
                disponible = true;
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            disponible = false;
        }
        return disponible;
    }

    public int cambiarTransacciones(Usuario u) {
        int valor = -1;
        int aux = 0;
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT transacciones FROM usuario WHERE ci='" + u.getCi() + "'");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                aux = Integer.parseInt(rs.getString("transacciones"));
                if (aux < 11) {
                    aux++;
                } else {
                    aux = 10;
                }
            }
            ps = conexion.getCnx().prepareStatement("UPDATE usuario SET transacciones='" + aux + "' WHERE ci ='" + u.getCi() + "'");
            valor = ps.executeUpdate();
            conexion.cerrar();
        } catch (SQLException ex) {
            valor = -1;
        }
        return valor;
    }

    public int cambiarUsuario(Usuario u) {
        int valor = -1;
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("UPDATE usuario SET nombres='"+u.getNombres()+"',apellidos='"+u.getApellidos()+"',telefonoconvencional='"+u.getTelefonoconvencional()+"',celular='"+u.getCelular()+"' WHERE ci='"+u.getCi()+"' AND correo='"+u.getCorreo()+"' AND contrasenia ='"+u.getContrasenia()+"'");
            valor = ps.executeUpdate();
            conexion.cerrar();
        } catch (SQLException ex){
            valor = -1;
        }
        return valor;
    }

    public Usuario obtenerUsuario (int idPersona){
        Usuario u = new Usuario();
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT * FROM usuario WHERE idPersona ="+idPersona+"");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                u.setNombres(rs.getString("nombres"));
                u.setApellidos(rs.getString("apellidos"));
                u.setCi(rs.getString("ci"));
                u.setTelefonoconvencional(Integer.parseInt(rs.getString("telefonoconvencional")));
                u.setCorreo(rs.getString("correo"));
                u.setFechanacimiento(rs.getString("fechanacimiento"));
                u.setContrasenia(rs.getString("contrasenia"));
                u.setCelular(Integer.parseInt(rs.getString("celular")));
                u.setTransacciones(rs.getInt("Transacciones"));
                u.setId(idPersona);
            } else {
                u = new Usuario("", "", "", "", "", "", 0, 0, 0);
            }
        } catch (SQLException ex) {
            u= null;
        }
        return u;
    }
    
}
