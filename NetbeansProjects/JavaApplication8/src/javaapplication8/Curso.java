
package javaapplication8;

public class Curso {
    
    private String codigo;
    private String nombre;
    private int creditos;
    private String aula;
    
    public Curso(String c, int x){
        
        String[] corte = c.split(",");
        corte[0]=this.codigo;
        corte[1]=this.nombre;
        corte[2]=this.aula;
        this.creditos=x;
    }
    public String toString(){
    return "Nombre: "+this.nombre+"\tCodigo: "+this.codigo+"\tAula: "+this.aula+"\n";
    }
    public int getCreditos(){
     return creditos;
    }
    
}
