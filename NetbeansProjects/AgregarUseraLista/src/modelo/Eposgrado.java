
package modelo;

public class Eposgrado extends Estudiante {
    
    private String diploma;

    public Eposgrado(String diploma, String nombre, String apellido, String ci, String numUnico) {
        super(nombre, apellido, ci, numUnico);
        this.diploma = diploma;
    }
    
   
    public void imprimir(){
        System.out.println("Tiene un diploma en: " + this.diploma);
    }


    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }
    

}
