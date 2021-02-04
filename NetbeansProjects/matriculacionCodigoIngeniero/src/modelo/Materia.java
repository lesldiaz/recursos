/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author USRBET
 */
public class Materia implements Serializable {

    private String materia;

    public Materia(String materia) {
        this.materia = materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    @Override
    public String toString() {
        return materia; //To change body of generated methods, choose Tools | Templates.
    }
}
