/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.AuxiliarArticulo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PAVILLION
 */
public class User {
   
    private String nombre, apellido,correo,fechanacimiento,contrasenia,ubicacion="Ecuador";
    private int id;
    ArrayList<AuxiliarArticulo> listacarrito = new ArrayList<>();

    public User(String nombre, String apellido,String correo, String fechanacimiento,  String contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechanacimiento = fechanacimiento;
        this.contrasenia = contrasenia;
    }

    public ArrayList<AuxiliarArticulo> getListacarrito() {
        return listacarrito;
    }

    public void setListacarrito(ArrayList<AuxiliarArticulo> listacarrito) {
        this.listacarrito = listacarrito;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public User() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
