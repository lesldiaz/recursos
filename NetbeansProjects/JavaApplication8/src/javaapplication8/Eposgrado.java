
package javaapplication8;

public class Eposgrado extends Estudiante {
    
    private String diploma;
    
    public Eposgrado(String datos, String diploma){
        super(datos);   
        this.diploma=diploma;
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
