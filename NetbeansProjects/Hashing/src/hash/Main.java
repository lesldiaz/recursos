/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

import java.util.Scanner;

/**
 *
 * @author PAVILLION
 */
public class Main {

    public static void main(String[] args) {
        Hashing hash = new Hashing(10);
        String [] elementos = {"52","32","22","18","40","35","77","56","80","60"};
        hash.funHash(elementos, hash.arreglo);
        hash.mostrarTabla();

    }   
    
}
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Ingrese el elemento a buscar: ");
//        String buscado = hash.busClave(sc.nextLine());
//        if (buscado==null){
//            System.out.println("El elemento buscado no se encuentra en la tabla");
//        }