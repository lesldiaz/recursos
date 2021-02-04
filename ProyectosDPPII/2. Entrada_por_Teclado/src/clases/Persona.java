/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author USRBET
 */
public class Persona {
    //Atributos
    private String nombres, apellidos, ID, fechanacimiento;
    
    //Constructor
    public Persona(String nombres, String apellidos, String ID, String fechanacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ID = ID;
        this.fechanacimiento = fechanacimiento;
    }

    public Persona() {
    }
    
    
    //Metodos
    public String getNombres (){
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int calcularEdad(String fechanacimiento) {
        int edad=0;
        //pendiente
        return edad;
    }
}
    
