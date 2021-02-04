/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.User;


/**
 *
 * @author Lucho
 */
public class UserBD {

   

    //Atributos
    private Conexion conexion;

    //Constructor
    public UserBD(Conexion conexion) {
        this.conexion = conexion;
    }

    //Metodos
    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    public int agregarUsuario(User usuario) {
        int valor = -1;
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("INSERT INTO user VALUES (0,'" + usuario.getNombre() + "','" + usuario.getApellido() +  "','"  + usuario.getCorreo() + "','" + usuario.getFechanacimiento() + "','" + usuario.getContrasenia() +  "')");
            valor = ps.executeUpdate();
            conexion.cerrar();
        } catch (SQLException ex) {
            valor = -1;
        }
        return valor;
    }

    public User login(String correo, String contrasenia) {
        User u = new User();
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT * FROM user WHERE correo='" + correo + "' AND contrasenia ='" + contrasenia + "'");
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                u.setNombre(resultado.getString("nombre"));
                u.setApellido(resultado.getString("apellido"));
                u.setCorreo(resultado.getString("correo"));
                u.setFechanacimiento(resultado.getString("fechanacimiento"));
                u.setContrasenia(resultado.getString("contrasenia"));
                u.setId(Integer.parseInt(resultado.getString("idPersona")));
            } else {
                u = new User("", "", "", "", "");
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            u = new User("", "", "", "", "");
        }
        return u;
    }

    public boolean comprobar(String email) {
        boolean disponible = false;
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT nombre, apellido FROM user WHERE correo ='" + email + "'");
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

//    public int cambiarTransacciones(Usuario u) {
//        int valor = -1;
//        int aux = 0;
//        try {
//            conexion.obtener();
//            PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT transacciones FROM usuario WHERE ci='" + u.getCi() + "'");
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                aux = Integer.parseInt(rs.getString("transacciones"));
//                if (aux < 11) {
//                    aux++;
//                } else {
//                    aux = 10;
//                }
//            }
//            ps = conexion.getCnx().prepareStatement("UPDATE usuario SET transacciones='" + aux + "' WHERE ci ='" + u.getCi() + "'");
//            valor = ps.executeUpdate();
//            conexion.cerrar();
//        } catch (SQLException ex) {
//            valor = -1;
//        }
//        return valor;
//    }

    public int cambiarUsuario(User u) {
        int valor = -1;
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("UPDATE user SET nombre='"+u.getNombre()+"',apellido='"+u.getApellido()+"', fechanacimiento = '"+u.getFechanacimiento()+"' WHERE correo='"+u.getCorreo()+"' AND contrasenia ='"+u.getContrasenia()+"'");
            valor = ps.executeUpdate();
            conexion.cerrar();
        } catch (SQLException ex){
            valor = -1;
        }
        return valor;
    }

    public User obtenerUsuario (int idPersona){
        User u = new User();
        try {
            conexion.obtener();
            PreparedStatement ps = conexion.getCnx().prepareStatement("SELECT * FROM user WHERE idPersona ="+idPersona+"");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                u.setNombre(rs.getString("nombre"));
                u.setApellido(rs.getString("apellido"));
                u.setCorreo(rs.getString("correo"));
                u.setFechanacimiento(rs.getString("fechanacimiento"));
                u.setContrasenia(rs.getString("contrasenia"));
                u.setId(idPersona);
            } else {
                u=new User("", "", "", "", "");
            }
        } catch (SQLException ex) {
            u= null;
        }
        return u;
    }
    
    public User leerUsuario (String nombre, String apellido, String correo, String fechanacimiento, String contrasenia){
        User u= new User(nombre, apellido, correo, fechanacimiento, contrasenia);
        return u;
    }
    
}
