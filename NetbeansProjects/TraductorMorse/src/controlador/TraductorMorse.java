/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JTextArea;


/**
 *
 * @author Leslie
 */
public class TraductorMorse {

    HashMap<String, String> hm = new HashMap<>();

    public void cargarHashMapMorse() {
        hm.put(".-", "a");
        hm.put("-...", "b");
        hm.put("-.-.", "c");
        hm.put("-..", "d");
        hm.put(".", "e");
        hm.put("..-.", "f");
        hm.put("--.", "g");
        hm.put("....", "h");
        hm.put("..", "i");
        hm.put(".---", "j");
        hm.put("-.-", "k");
        hm.put(".-..", "l");
        hm.put("--", "m");
        hm.put("-.", "n");
        hm.put("--.--", "ñ");
        hm.put("---", "o");
        hm.put(".--.", "p");
        hm.put("--.-", "q");
        hm.put(".-.", "r");
        hm.put("...", "s");
        hm.put("-", "t");
        hm.put("..-", "u");
        hm.put("...-", "v");
        hm.put(".--", "w");
        hm.put("-..-", "x");
        hm.put("-.--", "y");
        hm.put("--..", "z");
        hm.put("-----","0");
        hm.put(".----","1");
        hm.put("..---","2");
        hm.put("...--","3");
        hm.put("....-","4");
        hm.put(".....","5");
        hm.put("-....","6");
        hm.put("--...","7");
        hm.put("---..","8");
        hm.put("----.","9");
        hm.put(".-.-.-",".");
        hm.put("-.-.--",",");
    }

    public String obtenerValue(String key) {
        return hm.get(key);
    }

    public String recorrerHm(String token) {
        String palabra = "";
        for (Map.Entry<String, String> entrySet : hm.entrySet()) {
            String key = entrySet.getKey();
            if (key.equals(token)) {
                palabra = palabra + hm.get(key);
            }else {}
        }  
       return palabra;
       
    }

    public void traducirMorseTexto(String palabra, JTextArea ta) {
        String palabracomp = "";
        String pala = "";
        String[] cadena = palabra.split(" ");
        for (int j = 0; j < cadena.length; j++) {
            String value = cadena[j];
            cargarHashMapMorse();
            pala = recorrerHm(value);
            if(pala.isEmpty()){
                pala=" Caracter No Encontrado";
            }
            palabracomp += pala;
}
       
        ta.setText(palabracomp + "");
       
    }
}
