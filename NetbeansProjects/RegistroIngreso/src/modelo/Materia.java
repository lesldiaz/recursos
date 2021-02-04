/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Leslie Diaz
 */
public class Materia implements Serializable {
    private String nombremateria,codigo, aula,grupo;
    private int numcreditos;

    public Materia(String nombremateria, String codigo, String aula, String grupo, int numcreditos) {
        this.nombremateria = nombremateria;
        this.codigo = codigo;
        this.aula = aula;
        this.grupo = grupo;
        this.numcreditos = numcreditos;
    }

    

    public String getNombremateria() {
        return nombremateria;
    }

    public void setNombremateria(String nombremateria) {
        this.nombremateria = nombremateria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getNumcreditos() {
        return numcreditos;
    }

    public void setNumcreditos(int numcreditos) {
        this.numcreditos = numcreditos;
    }

    @Override
    public String toString() {
        return codigo; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
