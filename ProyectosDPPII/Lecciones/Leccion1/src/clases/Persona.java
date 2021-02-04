/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;

/**
 *
 * @author Lucho
 */
public class Persona implements Serializable{
    //Atributos
    private String nombres, apellidos, id, fechanacimiento;
    
    //Constructor

    public Persona(String nombres, String apellidos, String id, String fechanacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.id = id;
        this.fechanacimiento = fechanacimiento;
    }

    public Persona() {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    
    public int calcularEdad (String fechanacimiento){
        int edad = 0;
        return edad;
    }
}
