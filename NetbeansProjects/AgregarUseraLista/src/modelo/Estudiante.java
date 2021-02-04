
package modelo;



public class Estudiante {

    private String nombre,apellido,ci,numUnico;
    
public Estudiante(String nombre, String apellido, String ci, String numUnico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.numUnico = numUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNumUnico() {
        return numUnico;
    }

    public void setNumUnico(String numUnico) {
        this.numUnico = numUnico;
    }

    public String toString() {
       return "Nombre Completo: " + this.nombre + "  " + this.apellido+"  "+ "Cedula: " + this.ci + "  "+ "Numero Unico: " + this.numUnico+" ";
    }

}
