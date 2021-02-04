
package javaapplication8;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaApplication8 {

    public static void main(String[] args) {
        Curso m = new Curso("SIC216,P2,506",6);
        Curso n = new Curso("SIC414,Compiladores,402",4);
        Curso o = new Curso("SIC616,Comp.Dist,301",10);
        Curso p = new Curso("MCS114,Algoritmos,302",6);
        Eposgrado ep1= new Eposgrado("1234,111,DAVID,CRUZ","Fisica");
        Eposgrado ep2= new Eposgrado("5678,222,OSCAR,UMATAMBO","Quimica");
        Eposgrado ep3= new Eposgrado("9101,333,DGABY,BAYOLA","Lenguaje");
        Eposgrado ep4= new Eposgrado("1121,444,CARLOS,MANTILLA","Sociales");
        Eposgrado ep5= new Eposgrado("3141,555,SANDRA,CHICAIZA","Biologia");
        Epregrado epr1 = new Epregrado("3213,31231,juan,chavez","Haking");
        Epregrado epr2 = new Epregrado("1234,65642,omar,vallejo","Cine y Foro");
        Epregrado epr3 = new Epregrado("5678,78945,andrez,martines","Contacto con la musica");
        Epregrado epr4 = new Epregrado("9101,19722,karla,ramirez","Ensamblaje");
        Epregrado epr5 = new Epregrado("1121,49687,wendy,catagña","Deportes");
        ArrayList<Estudiante> x = new ArrayList<Estudiante>();
        x.add(ep1);
        x.add(ep2);
        x.add(ep3);
        x.add(ep4);
        x.add(ep5);
        x.add(epr1);
        x.add(epr2);
        x.add(epr3);
        x.add(epr4);
        x.add(epr5);
        Iterator<Estudiante> i = x.iterator();
        
        
        
    }   
    
}
