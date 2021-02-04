
package torreshanoi;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class MultiplicacionSuma {

    public static void main(String[] args) {
      Scanner sc= new Scanner (System.in);//Obj de la clase Scanner
      int a,b,c;//declaracion de variables
      a = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer numero:"));
      b = Integer.parseInt(JOptionPane.showInputDialog("Escribe el segundo numero:"));
      c=multiplicacion(a,b);//manda los parametros al metodo y lo guarda en la variable C;
      JOptionPane.showMessageDialog(null,"Resultado: "+ c);
    }
     public static int multiplicacion(int a, int b){
        if(b==0) 
          return 0;
        else
          return (a+multiplicacion(a,b-1));   
     }
          
}
