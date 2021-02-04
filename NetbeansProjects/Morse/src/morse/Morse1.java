/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author USRBET
 */
public class Morse1 {
    
    ArrayList <String> listatokens = new ArrayList<>();
    HashMapClase hmc = new HashMapClase();

    public void Morse1(String palabra) {
        StringTokenizer st = new StringTokenizer(palabra);
        int i = 0;
        for (;st.hasMoreTokens(); i ++) {
           String token = st.nextToken();
            listatokens.add(token);
        }
        
        
        for (int j = 0; j < listatokens.size(); j++) {
             String tokenvalue = listatokens.get(j);
             hmc.cargarHashMap();
//            if(validar.esMorseOLetras(tokenvalue)==true){
             hmc.recorrerHm(tokenvalue);
//                System.out.println(listatokens.size());
//              
//            }else{
//                hmc.recorrerHm(tokenvalue);
//                
//            }
//            
//            
        }
    }
           
                
    
}
        
        
        
    
    
    
    

