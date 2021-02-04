/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author USRBET
 */
public class Docente extends Persona {
    //Atributos
    private int numalumnos;
    private double sueldo;
    
    //Constructor
    //Super Constructor (cuando se hereda algo)(lo que se hereda (con "super") y los atributos de la clase(de la forma habitual))
    public Docente(int numalumnos, double sueldo, String nombres, String apellidos, String ID, String fechanacimiento) {
        super(nombres, apellidos, ID, fechanacimiento);
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
