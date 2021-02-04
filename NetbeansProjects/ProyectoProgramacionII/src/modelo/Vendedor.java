/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.*;

/**
 *
 * @author Leslie Diaz
 */
public class Vendedor extends Usuario {
    private String empresaproveniente;
    private int contratoscompletados;
    private List agendadisponible;
    private int telefconvencional,celular;
//    disponibilidad:String

    public Vendedor(String empresaproveniente, int contratoscompletados, List agendadisponible, String nombresusuario, String apellidopaterno, String apellidomaterno, String documentoidentidad, String fechanacimiento, String email, String password, int telefconvencional, int celular) {
        super(nombresusuario, apellidopaterno, apellidomaterno, documentoidentidad, fechanacimiento, email, password, telefconvencional, celular);
        this.empresaproveniente = empresaproveniente;
        this.contratoscompletados = contratoscompletados;
        this.agendadisponible = agendadisponible;
    }

   

    public String getEmpresaproveniente() {
        return empresaproveniente;
    }

    public void setEmpresaproveniente(String empresaproveniente) {
        this.empresaproveniente = empresaproveniente;
    }

    public int getContratoscompletados() {
        return contratoscompletados;
    }

    public void setContratoscompletados(int contratoscompletados) {
        this.contratoscompletados = contratoscompletados;
    }

    public List getAgendadisponible() {
        return agendadisponible;
    }

    public void setAgendadisponible(List agendadisponible) {
        this.agendadisponible = agendadisponible;
    }
    
    
}
