/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Lucho
 */
public class Citas {
    //Atributos
    String diadelasemana, fecha, hora;
    
    //Constructor

    public Citas(String diadelasemana, String fecha, String hora) {
        this.diadelasemana = diadelasemana;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Citas() {
    }
    
    //Metodos

    public String getDiadelasemana() {
        return diadelasemana;
    }

    public void setDiadelasemana(String diadelasemana) {
        this.diadelasemana = diadelasemana;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
}
