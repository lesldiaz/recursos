
package gendspizza;

import java.io.PrintWriter;
import java.text.DecimalFormat;

public class GenDSPizza {

    public void escribepizz(PrintWriter pw){
        /*
        //Math.random()*(N-M+1)+M  valores entre m y n
        */
        DecimalFormat f1 = new DecimalFormat("#.00");
        double m=Math.random()*(58.0-55.0+1)+55.0;
        double q=Math.random()*(23.0-15.0+1)+15.0;
        double c=Math.random()*(7.6-4.0+1.0)+4.0;
        double ch=Math.random()*(3.9-3.2+1.0)+3.2;
        double ca=Math.random()*(4.6-3.4+1.0)+3.4;
        double t=Math.random()*(5.0-4.0+1.0)+4.0;
        double j=0.0,p=0.0;
        //double j=Math.random()*(4.2-3.5+1.0)+3.5;
        //double p=Math.random()*(4.2-3.5+1.0)+3.5;
        
//        
//        System.out.println(f1.format(p));
        
    }
    
}
