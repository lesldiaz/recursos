/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Boing747;

/**
 *
 * @author PAVILLION
 */
public class AccionesBoing {
    ArrayList<String> lista = new ArrayList<>();
    LeerEscribirArchivos escribir = new LeerEscribirArchivos();

    public void acciones(Boing747 boing) {
        String viaje = String.valueOf(boing.getViajes());
        lista.add(0, viaje);
    }
    
    
    public void accionesBoing(String accion){
       if (escribir.leerArchivo("listaAccionesBoing")==null){
                lista.add(accion);
                escribir.escribirarchivo(lista, "listaAccionesBoing");
            } else {
               lista = (ArrayList) escribir.leerArchivo("listaAccionesBoing");
            lista.add(accion);
             escribir.escribirarchivo(lista, "listaAccionesBoing");
            }
        
            
    }
    
    
}
