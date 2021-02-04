/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author USRBET
 */
public class HashMapClase {

    HashMap<Object, Object> hm = new HashMap<>();

    public void cargarHashMap() {
        hm.put("000111", 53);
        hm.put(55, "Hola");
        hm.put(new Auto("GGI-504", "Ban", "Rojo", "500"), 6000);
        }

    public void obtenerValue(Object key) {
        System.out.println(hm.get(key));
    }

    public void imprimirAll() {
        for (Map.Entry<Object, Object> entrySet : hm.entrySet()) {
            Object key = entrySet.getKey();
            Object value = entrySet.getValue();
            System.out.println(key + " valor es: " + value);
        }
    }
    
    public static void main (String [] args) {
        HashMapClase ejemplo = new HashMapClase();
        ejemplo.cargarHashMap();
        ejemplo.obtenerValue("GGI-504");
        System.out.println("\n");
        ejemplo.imprimirAll();
    }
    
}
