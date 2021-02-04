/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Lucho
 */
public class AuxiliarPropiedad {
    
    private String nombre, numeropropiedad, descripcion, sector, tipoc;
    private int idPersona;

    public AuxiliarPropiedad() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeropropiedad() {
        return numeropropiedad;
    }

    public void setNumeropropiedad(String numeropropiedad) {
        this.numeropropiedad = numeropropiedad;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getTipoc() {
        return tipoc;
    }

    public void setTipoc(String tipoc) {
        this.tipoc = tipoc;
    }


    
    @Override
    public String toString() {
        return ("<html><b>Nombre de la Propiedad:</b> "+nombre + "<BR>" + "<b>Descripcion: </b>" + descripcion +"<BR><b>Sector: </b>"+sector+"<BR><b>Tipo de Contrato: </b>"+tipoc);
    }
    
    
    
}
