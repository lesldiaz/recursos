/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas;

import java.util.Scanner;

/**
 *
 * @author Leslie Diaz
 */
public class Pangrama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingresa tu oracion");
        String oracion = sc.nextLine();
        oracion = oracion.toLowerCase();
       
        if(oracion.length()<=1 || oracion.length()<= 1000){
            if(oracion.contains("a")&&oracion.contains("b")&&oracion.contains("c")&&oracion.contains("d")&&oracion.contains("e")&&
                oracion.contains("f")&&oracion.contains("g")&&oracion.contains("h")&&oracion.contains("i")&&oracion.contains("j")&&
                oracion.contains("k")&&oracion.contains("l")&&oracion.contains("m")&&oracion.contains("n")&&oracion.contains("o")&&
                oracion.contains("p")&&oracion.contains("q")&&oracion.contains("r")&&oracion.contains("s")&&oracion.contains("t")&&
                oracion.contains("u")&&oracion.contains("v")&&oracion.contains("w")&&oracion.contains("x")&&oracion.contains("y")&&
                oracion.contains("z")){
            System.out.println("Pangrama");
        }else{
            System.out.println("No Pangrama");
            main(args);
        }
       }else {
           System.out.println("Haz superado el limite maximo de longitud, intentalo denuevo");
           main(args); 
        }
    
    }  
}
