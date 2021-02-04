
package javaapplication8;

public class Epregrado extends Estudiante {
    
    private String club;

    public Epregrado(String datos,String club) {
        super(datos);
        this.club=club;
    }
    
    public void imprimir(){
        System.out.println("EL club al que pertence es: " + this.club);
    }
    
    
}
