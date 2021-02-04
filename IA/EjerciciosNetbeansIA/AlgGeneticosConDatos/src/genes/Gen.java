/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PAVILLION
 */
public class Gen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> op = new ArrayList<>();
       //ingresado por el usuario.
        op.add("3.10");
        op.add("5");
        op.add("4");
        op.add("true");
        op.add("2");
        op.add("INTEL");
        op.add("4");
        op.add("2.10");
        op.add("3");
        op.add("Solido");
        op.add("500");
        op.add("true");
        op.add("2");
        op.add("GTX");
        List<Computadora> com = new ListaComputadoras().cargarLista();
        Configuracion c = new Configuracion();
//        try{
        c.inicializar(com,op);
        c.evolucion();
//        }catch(Exception e){
//            System.err.println("Intentelo de nuevo ^-^");
//        }
    }
    
}
