/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas;

import java.util.*;

/**
 *
 * @author Leslie Diaz
 */
public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <String> listacad = new ArrayList<>();
        List <String> listaaux = new ArrayList<>();
        System.out.println("Ingrese la frase: ");
        String oracion = sc.nextLine();
        String[] oracioncad= oracion.split(" ");
        for (String oracioncad1 : oracioncad) {
                listacad.add(oracioncad1);
        }
        
    
        for (int j = listacad.size()-1; j >=0; j--) {
            String lista = listacad.get(j);
            System.out.print(lista +" ");
        }
    }
    
}
