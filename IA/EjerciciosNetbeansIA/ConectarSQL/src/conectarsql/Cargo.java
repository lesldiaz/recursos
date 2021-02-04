/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectarsql;

/**
 *
 * @author PAVILLION
 */
public class Cargo {
    private String codcar,nomcar,sueldo,fecha;

    public String getCodcar() {
        return codcar;
    }

    public void setCodcar(String codcar) {
        this.codcar = codcar;
    }

    public String getNomcar() {
        return nomcar;
    }

    public void setNomcar(String nomcar) {
        this.nomcar = nomcar;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "<html><b>Codigo de Cargo:</b> "+codcar + "<BR>" + "<b>Nombre del Cargo: </b>" + nomcar +"<BR><b>Sueldo Maximo: </b>"+sueldo+"<BR><b>Fecha de Creacion: </b>"+fecha;
    }
    
    
    
}
