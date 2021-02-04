/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;



/**
 *
 * @author Leslie Diaz
 */
public class Potitos {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaingredientes = new ArrayList<>();
        ArrayList<String> listaaceptados = new ArrayList<>();
        ArrayList<String> listanoaceptados = new ArrayList<>();
        int numerodias;

        try {
            do {
                System.out.println("Ingrese el numero de dias a analizar:");
                numerodias = Integer.parseInt(sc.nextLine());

            } while (numerodias <= 0);
            for (int i = 0; i < numerodias; i++) {
                System.out.println("Ingrese el numero de potitos");
                int numpotitos = Integer.parseInt(sc.nextLine());
                    for (int j = 0; j < numpotitos; j++) {
                        String ingredientes = sc.nextLine();
                        
                        String [] ingrediente = ingredientes.split(" ");
//                        StringTokenizer st = new StringTokenizer(ingredientes," ");
//                        for (; st.hasMoreTokens();) {
//                            String token = st.nextToken();
//                            listaingredientes.add(token);
//                        }
//                        String inicio = listaingredientes.get(0);
                        
                        if (ingrediente[0].equals("SI:")) {
                            for (int k = 1; k < (ingrediente.length - 1); k++) {
                                String ingredienteapro = ingrediente[k];
                                listaaceptados.add(ingredienteapro);
                            }
                        }
                        if (ingrediente[0].equals("NO:")){
                            for (int l = 1; l < (ingrediente.length - 1); l++) {
                                String ingredientenoapro = ingrediente[l];
                                listanoaceptados.add(ingredientenoapro);
                            }
                        }
                    }
                        
                        for (String comida : listaaceptados) {
                            if (listanoaceptados.contains(comida)) {
                                listanoaceptados.remove(comida);
                            }
                        }
                        Collections.sort(listanoaceptados);//ordena la lista
                        
                        for (int m = 0; m < listanoaceptados.size(); m++) {
                            System.out.print(listanoaceptados.get(m) + " ");
                            
                        }

                    
                     
                }
            
           

        } catch (Exception e) {
            System.out.println("Error");
            main(args);
        }}
    
}
