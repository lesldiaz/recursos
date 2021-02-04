/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derivacion;

/**
 *
 * @author PAVILLION
 */
public class Derivada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p = 1;
        double dt = 0.1;
        double valorderiv = 2;
        CalcularDerivada cd = new CalcularDerivada();
        double resul = cd.calcularDerivada(dt,p);
         System.out.println(resul);  
//        while(resul != valorderiv){
//            dt=dt/2;
//            resul = cd.calcularDerivada(dt, p);
//        }
//       
//        System.out.println(resul);  
    }
    
}
