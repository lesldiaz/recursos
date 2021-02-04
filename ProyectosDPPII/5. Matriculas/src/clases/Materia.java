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
public class Materia implements Serializable{
    
    //Atributos
    private String nombre, codigo, aula, grupo;
    private int numerocreditos;
    private static final long serialVersionUID = 0104;
    
    //Constructor

    public Materia(String nombre, String codigo, String aula, String grupo, int numerocreditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.aula = aula;
        this.grupo = grupo;
        this.numerocreditos = numerocreditos;
    }
    
    public Materia() {
    }
    
    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getNumerocreditos() {
        return numerocreditos;
    }

    public void setNumerocreditos(int numerocreditos) {
        this.numerocreditos = numerocreditos;
    }

    @Override
    public String toString() {
        return getNombre(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
