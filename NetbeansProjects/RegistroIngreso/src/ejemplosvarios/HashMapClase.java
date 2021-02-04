/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosvarios;

import java.util.HashMap;
import java.util.Map;

public class HashMapClase {

    HashMap<Object, Object> hm = new HashMap<>();

    public void cargarHashMap() {
        hm.put("00152", 53);
        hm.put(55, "Hola");
        hm.put(new Vehiculo("PID-456", "Azul", "Toyota", "900"), 60000);

    }

    public Object obtenerValue(Object key) {
        return hm.get(key);
    }

    public void imprimirTodo() {
        for (Map.Entry<Object, Object> entrySet : hm.entrySet()) {
            Object key = entrySet.getKey();
            Object value = entrySet.getValue();
            System.out.println(key + " valor es: " + value);
        }
    }

    public static void main(String argv[]) {
        HashMapClase hash = new HashMapClase();
        hash.cargarHashMap();
        hash.obtenerValue(55);
        hash.imprimirTodo();

    }

}

