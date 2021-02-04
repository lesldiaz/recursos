
package torreshanoi;
import javax.swing.JOptionPane;

public class Potencia {

    public static void main(String[] args) {
        int resultado,base,exponente;
        base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la base:"));
        exponente=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del exponente:"));
        resultado = potencia(base,exponente);
        JOptionPane.showMessageDialog(null,"Resultado de " + base + " elevado a "+ exponente 
                + " es "+ resultado);
    }
    
   public static int potencia( int base, int exponente) {
        if(exponente == 0) {
        return 1;
        } else {
        return base * potencia(base, exponente -1); // llamada recursiva
        }
    }
}
