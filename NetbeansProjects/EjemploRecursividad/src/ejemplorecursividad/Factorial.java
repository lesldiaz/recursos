/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplorecursividad;

/**
 *
 * @author USRBET
 */
public class Factorial {
    public int calcularFactorial(int valor){
        if (valor == 0){
            return 1;
        }else{
            return valor * calcularFactorial(valor-1); //recursividad
        }
        
       
    }
}
