/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import java.util.Scanner;

/**
 *
 * @author USRBET
 */
public class Morse {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Morse1 morse = new Morse1();
         String k = sc.nextLine();
         morse.Morse1(k);
    
        
        
    }
}
    

