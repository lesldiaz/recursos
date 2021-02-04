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
public class Alumno extends Persona {
    //Atributos
    private int nummatricula, semestre, nummateria;
    
    //Constructor

    public Alumno(int nummatricula, int semestre, int nummateria, String nombres, String apellidos, String ID, String fechanacimiento) {
        super(nombres, apellidos, ID, fechanacimiento);
        this.nummatricula = nummatricula;
        this.semestre = semestre;
        this.nummateria = nummateria;
    }

    public Alumno() {
    }
    
    //Metodos

    public int getNumMatricula() {
        return nummatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.nummatricula = numMatricula;
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
