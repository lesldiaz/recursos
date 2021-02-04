/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Lucho
 */
public class Vendedor extends Usuario{
    //Atributos
    String empresa, disponibilidad;
    List agenda;
    int contratoscompletados;
    
    //Constructor

    public Vendedor(String empresa, String disponibilidad, List agenda, int contratoscompletados, String nombres, String appelidos, String ci, String correo, String fechanacimiento, String contrasenia, List listacasas, int telefonoconvencional, int celular) {
        super(nombres, appelidos, ci, correo, fechanacimiento, contrasenia, listacasas, telefonoconvencional, celular);
        this.empresa = empresa;
        this.disponibilidad = disponibilidad;
        this.agenda = agenda;
        this.contratoscompletados = contratoscompletados;
    }

    public Vendedor(String empresa, String disponibilidad, List agenda, int contratoscompletados) {
        this.empresa = empresa;
        this.disponibilidad = disponibilidad;
        this.agenda = agenda;
        this.contratoscompletados = contratoscompletados;
    }

    public Vendedor() {
    }
    
    //Metodos

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public List getAgenda() {
        return agenda;
    }

    public void setAgenda(List agenda) {
        this.agenda = agenda;
    }

    public int getContratoscompletados() {
        return contratoscompletados;
    }

    public void setContratoscompletados(int contratoscompletados) {
        this.contratoscompletados = contratoscompletados;
    }

    public boolean comprobarDisponibilidad (Citas cita){
        boolean disponible;
        Date fechadisponible = new Date(disponibilidad);
        Date fechacita = new Date(cita.getFecha());
        SimpleDateFormat sdf1 = new SimpleDateFormat("MM");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd");
        String fechadi = sdf1.format(fechadisponible);
        String fechaci = sdf1.format(fechacita);
        String diadi = sdf2.format(fechadisponible);
        String diaci = sdf2.format(fechacita);
        if(fechadi.equals(fechaci) && diadi.equals(diaci))
            disponible = false;
        else{
            disponible = true;
        }
        return disponible;
    }
    
}
