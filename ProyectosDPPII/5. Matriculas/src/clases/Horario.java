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
public class Horario implements Serializable{
    
    //Atributos
    private String dia, horainicio, horafinal;
    private static final long serialVersionUID = 1997;
    
    //Constructor
    public Horario(String Dia, String horainicio, String horafinal) {
        this.dia = Dia;
        this.horainicio = horainicio;
        this.horafinal = horafinal;
    }

    public Horario() {
    }

    //Metodos
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public String getHorafinal() {
        return horafinal;
    }

    public void setHorafinal(String horafinal) {
        this.horafinal = horafinal;
    }

    @Override
    public String toString() {
        return (dia+": "+horainicio+" - "+horafinal); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
