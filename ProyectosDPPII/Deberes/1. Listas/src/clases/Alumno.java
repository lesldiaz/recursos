/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.*;

/**
 *
 * @author Lucho
 */
public class Alumno extends Persona implements Serializable{
    //Atributos
    private int nummatricula, semestre, nummateria;
    
    //Constructor
    public Alumno(int nummatricula, int semestre, int nummateria, String nombres, String apellidos, String id, String fechanacimiento) {
        super(nombres, apellidos, id, fechanacimiento);
        this.nummatricula = nummatricula;
        this.semestre = semestre;
        this.nummateria = nummateria;
    }

    public Alumno() {
    }
    
    //Metodos

    public int getNummatricula() {
        return nummatricula;
    }

    public void setNummatricula(int nummatricula) {
        this.nummatricula = nummatricula;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getNummateria() {
        return nummateria;
    }

    public void setNummateria(int nummateria) {
        this.nummateria = nummateria;
    }
    
}
