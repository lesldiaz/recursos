
package javaapplication8;

import java.util.ArrayList;

public class Estudiante {

    private String ci;
    private String numU;
    private String nombre;
    private String apellido;
    private static ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

    public Estudiante(String datos) {
        String[] cadena = datos.split(",");
        this.ci = cadena[0];
        this.numU = cadena[1];
        this.nombre = cadena[2];
        this.apellido = cadena[3];
    }
    
    public String getNombre(){
     return this.nombre;
    }

    public void setEstudiantes(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
    
    

    public String toString() {
       return "Nombre Completo: " + this.nombre + "\t" + this.apellido+"\tCedula: " + this.ci + "\tNumero Unico: " + this.numU+"\n";
    }

}
