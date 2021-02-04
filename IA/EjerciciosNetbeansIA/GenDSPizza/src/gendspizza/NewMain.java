/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gendspizza;

import java.text.DecimalFormat;

import java.text.DecimalFormatSymbols;
/**
 *
 * @author PAVILLION
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        DecimalFormat f1 = new DecimalFormat("#.00",simbolos);
        double m = Math.random() * (58.0 - 55.0 + 1) + 55.0;
        double q = Math.random() * (23.0 - 15.0 + 1) + 15.0;
        double c = Math.random() * (7.6 - 4.0 + 1.0) + 4.0;
        double ch = Math.random() * (3.9 - 3.2 + 1.0) + 3.2;
        double ca = Math.random() * (4.6 - 3.4 + 1.0) + 3.4;
        double t = Math.random() * (5.0 - 4.0 + 1.0) + 4.0;
        double j = 0.0, p = 0.0;
        System.out.println(f1.format(m) + "," + f1.format(q) + "," + f1.format(c) + "," + f1.format(ch) +
                "," + f1.format(ca) + "," + f1.format(t) + "," + j + "," + p+",great");
       

    }
    
    

}
