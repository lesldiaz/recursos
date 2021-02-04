/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

/**
 *
 * @author Leslie Diaz
 */
public class Parrafo {

    public Parrafo() {
    }
    
    

 StringBuffer cadena = new StringBuffer();
    public Parrafo(String [] oracion) {
       for (int i = 0; i < oracion.length; i++) {
            cadena = cadena.append(oracion[i]);
            
       }
        cadena.toString();    
    }
public void mayusPalabra (String cadena, int pos){
    
    if (pos < cadena.length()){
       char inicio = cadena.charAt(pos);
        System.out.println(inicio);
       mayusPalabra (cadena, pos +1);
    } 
}    
    
}
