
package modelo;

public class Curso {
    
    private String codigo,nombre,aula;
    private int creditos;

    public Curso(String codigo, String nombre, String aula, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.aula = aula;
        this.creditos = creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    
    public String toString(){
    return "Nombre: "+this.nombre+"\tCodigo: "+this.codigo+"\tAula: "+this.aula+"\n";
    }
   
    
}
