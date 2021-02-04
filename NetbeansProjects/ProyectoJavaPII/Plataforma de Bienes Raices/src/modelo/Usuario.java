/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lucho
 */
public class Usuario {

    Scanner sc = new Scanner(System.in);
    
    //Atributos
    private String nombres, apellidos, ci, correo, fechanacimiento, contrasenia;
    private int telefonoconvencional, celular, transacciones, id;

    //Constructor
    public Usuario(String nombres, String apellidos, String ci, String correo, String fechanacimiento, String contrasenia, int telefonoconvencional, int celular, int transacciones) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ci = ci;
        this.correo = correo;
        this.fechanacimiento = fechanacimiento;
        this.contrasenia = contrasenia;
        this.telefonoconvencional = telefonoconvencional;
        this.celular = celular;
        this.transacciones = transacciones;
    }

    public Usuario() {
    }
    
    //Metodos
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getTelefonoconvencional() {
        return telefonoconvencional;
    }

    public void setTelefonoconvencional(int telefonoconvencional) {
        this.telefonoconvencional = telefonoconvencional;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    
    public int getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(int transacciones) {
        this.transacciones = transacciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
