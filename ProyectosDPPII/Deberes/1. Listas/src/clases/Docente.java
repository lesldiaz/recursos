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
public class Docente extends Persona implements Serializable{
    //Atributos
    private int numalumnos;
    private double sueldo;
    
    //Constructor

    public Docente(int numalumnos, double sueldo, String nombres, String apellidos, String id, String fechanacimiento) {
        super(nombres, apellidos, id, fechanacimiento);
        this.numalumnos = numalumnos;
        this.sueldo = sueldo;
    }

    public Docente() {
    }
    
    //Metodos

    public int getNumalumnos() {
        return numalumnos;
    }

    public void setNumalumnos(int numalumnos) {
        this.numalumnos = numalumnos;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
