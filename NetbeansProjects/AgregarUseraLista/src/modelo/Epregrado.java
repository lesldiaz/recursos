
package modelo;

public class Epregrado extends Estudiante {
    
    private String club;

    public Epregrado(String club, String nombre, String apellido, String ci, String numUnico) {
        super(nombre, apellido, ci, numUnico);
        this.club = club;
    }

   public void imprimir(){
        System.out.println("EL club al que pertence es: " + this.club);
    }
    
    
}
