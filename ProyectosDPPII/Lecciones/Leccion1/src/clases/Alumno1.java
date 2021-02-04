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
public class Alumno1 extends Persona implements Serializable{
    //Atributos
    int matricula;
    int semestre;
    
    //Constructor
    public Alumno1(int matricula, int semestre, String nombres, String apellidos, String id, String fechanacimiento) {
        super(nombres, apellidos, id, fechanacimiento);
        this.matricula = matricula;
        this.semestre = semestre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
}
