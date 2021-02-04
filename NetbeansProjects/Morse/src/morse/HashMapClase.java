/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author USRBET
 */
public class HashMapClase {
     HashMap <String,String> hm = new HashMap<> ();
     
     public void cargarHashMap() {
           hm.put(".-","a" );
           hm.put("-...","b" );
           hm.put("-.-.","c" );
           hm.put("-..","d" );
           hm.put(".","e" );
           hm.put("..-.","f" );
           hm.put("--.","g" );
           hm.put("....","h" );
           hm.put("..","i" );
           hm.put(".---","j" );
           hm.put("-.-","k" );
           hm.put(".-..","l" );
           hm.put("--","m" );
           hm.put("-.","n" );
           hm.put("---","o" );
           hm.put(".--.","p" );
           hm.put("--.-","q" );
           hm.put(".-.","r" );
           hm.put("...","s" );
           hm.put("-","t" );
           hm.put("..-","u" );
           hm.put("...-","v" );
           hm.put(".--","w" );
           hm.put("-..-","x" );
           hm.put("-.--","y" );
           hm.put("--..","z" );
           hm.put("a",".-");
           hm.put("b","-...");
           hm.put("c","-.-.");
           hm.put("d","-..");
           hm.put("e",".");
           hm.put("f","..-.");
           hm.put("g" ,"--.");
           hm.put("h","....");
           hm.put("i","..");
           hm.put("j",".---");
           hm.put("k","-.-");
           hm.put("l",".-..");
           hm.put("m","--");
           hm.put("n","-.");
           hm.put("o","---");
           hm.put("p",".--.");
           hm.put("q","--.-");
           hm.put("r",".-.");
           hm.put("s","...");
           hm.put("t","-");
           hm.put("u","..-");
           hm.put("v","...-");
           hm.put("w",".--");
           hm.put("x","-..-");
           hm.put("y","-.--");
           hm.put("z","--..");
     }
     
     public String obtenerValue(String key) {
        return hm.get(key);
    }
     
      public void recorrerHm(String token) {
          
        for (Map.Entry<String, String> entrySet : hm.entrySet()) {
            String key = entrySet.getKey();
            if (key.equals(token)){
                System.out.print(hm.get(key) + " ");
                }
        }
        
     }
}
