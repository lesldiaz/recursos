/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Leslie Diaz
 */
public class Fracciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <String> listatoken = new ArrayList<>();
        System.out.println("Ingrese el valor. Por favor utilice coma decimal");
        try{
            float fraccion = sc.nextFloat();
            String valor = String.valueOf(fraccion);
            StringTokenizer st = new StringTokenizer(valor);
             
                for (; st.hasMoreTokens();) {
                    String token = st.nextToken();
                    listatoken.add(token);
                }
            int posicion = listatoken.indexOf(",");
            int numdecimal=valor.length()-posicion;

            String multiplicador = "1";
            for (int i = 0; i < numdecimal; i++) {
                multiplicador = multiplicador + "0";
            }
            
            int denominador = Integer.parseInt(multiplicador);
            int numerador= (int) (denominador * fraccion);
            
            
            
            for (int i = 2; i <= denominador ; i++) {
                if(numerador%i==0&&denominador%i==0){
                    numerador=numerador/i;
                    denominador=denominador/i;
                    i=1;
                }
            }
            System.out.println("Equivalente a: " + numerador + "/" + denominador);
        
        }catch(Exception e){
            System.out.println("Ingrese solo numeros \n");
            main(args);
            
        }
        
       
    }
    
}

