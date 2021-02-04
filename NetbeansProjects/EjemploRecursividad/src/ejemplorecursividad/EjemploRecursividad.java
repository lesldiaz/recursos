
package ejemplorecursividad;

import java.util.Scanner;

public class EjemploRecursividad {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngrese el numero ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.println("\nFactorial de " + numero + " es " + new Factorial().calcularFactorial(numero));
        
        
        char inicio ='I';
        char aux = 'A';
        char fin = 'F';
        
        System.out.print("\nIngrese el numero de discos: ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("\nLos movimientos a realizar son: ");
        new TorreHanoi().resolverHanoi(num,inicio,fin,aux);
       
    }
    
}

