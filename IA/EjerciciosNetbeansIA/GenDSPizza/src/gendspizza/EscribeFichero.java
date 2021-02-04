/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gendspizza;

import java.io.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class EscribeFichero {

    GenDSPizza gdp = new GenDSPizza();

    public static void main(String[] args) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("L:\\Familia\\Documents\\2018A-QUINTOSEMESTRE\\IA\\doc.arff", true);
            pw = new PrintWriter(fichero);
            DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
            simbolos.setDecimalSeparator('.');
            DecimalFormat f1 = new DecimalFormat("#.00", simbolos);
            for (int i = 0; i < 2084; i++) {
                double m = Math.random() * (65.0 - 50.0 + 1) + 50.0;
                double q = Math.random() * (30.0 - 10.0 + 1) + 10.0;
                double c = Math.random() * (10.0 - 1.0 + 1.0) + 1.0;
                double ch = Math.random() * (7.0 - 1.0 + 1.0) + 1.0;
                double ca = Math.random() * (7.0 - 1.0 + 1.0) + 1.0;
                double t = Math.random() * (10.0 - 1.0 + 1.0) + 1.0;
                double j = 0.0, p = 0.0;
                String cal= compcalidadB(m,q,c,ch,ca,t);
                String values = "P4,"+f1.format(m) + "," + f1.format(q) + "," + f1.format(c) + "," + f1.format(ch)
                        + "," + f1.format(ca) + "," + f1.format(t) + "," + j + "," + p + ","+cal;
                 pw.println(values);
            }
            //for good
//             for (int i = 0; i < 2084; i++) {
//                double m = Math.random() * (58.0 - 55.0 + 1) + 55.0;
//                double q = Math.random() * (25.0 - 14.0 + 1) + 15.0;
//                double c = Math.random() * (8.6 - 3.0 + 1.0) + 4.0;
//                double ch = Math.random() * (4.9 - 2.2 + 1.0) + 3.2;
//                double ca = Math.random() * (5.6 - 2.4 + 1.0) + 3.4;
//                double t = Math.random() * (7.0 - 2.0 + 1.0) + 4.0;
//                double j = 0.0, p = 0.0;
//                String cal= compcalidad(q, c, ch, ca, t);
//                String values = "P4,"+f1.format(m) + "," + f1.format(q) + "," + f1.format(c) + "," + f1.format(ch)
//                        + "," + f1.format(ca) + "," + f1.format(t) + "," + j + "," + p + ","+cal;
//                 pw.println(values);
//            }
//           
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    public static String compcalidad(double q,double c,double ch,double ca,double t){
        String cal="";
        int point=0;
        if (q>15.0&&q<23.0){
            point++;
        }
        if (c>4.0&&c<7.6){
            point++; 
        }
        if (ch>3.2&&ch<3.9){
            point++; 
        }
        if (ca>3.4&&ca<4.6){
            point++; 
        }
        if (t>4.0&&t<5.0){
            point++; 
        }
        
        if(point>3){
            cal="great";
        }else{
            cal="good";
        }
        return cal;
    }
    
     public static String compcalidadB(double m,double q,double c,double ch,double ca,double t){
        String cal="";
        int pointm=0,point=0;
        if (m>55.0&&q<58.0){
            pointm++;
        }
        if (q>15.0&&q<23.0){
            point=point+1;
        }
        if (c>4.0&&c<7.6){
            point=point+1; 
        }
        if (ch>3.2&&ch<3.9){
            point=point+1; 
        }
        if (ca>3.4&&ca<4.6){
            point=point+1; 
        }
        if (t>4.0&&t<5.0){
            point=point+1; 
        }
        if (point>3 && pointm==1){
            cal="great";
        }else {
        point =0;
        if (q>14.0&&q<25.0){
            point++;
        }
        if (c>3.0&&c<8.6){
            point++; 
        }
        if (ch>2.2&&ch<4.9){
            point++; 
        }
        if (ca>2.4&&ca<5.6){
            point++; 
        }
        if (t>2.0&&t<7.0){
            point++; 
        }
        if(point>3 && pointm==1){
            cal="good";
        }else{
            cal="bad";
        }
        }
        return cal;
    }
}
