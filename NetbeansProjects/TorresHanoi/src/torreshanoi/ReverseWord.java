package torreshanoi;
import javax.swing.JOptionPane;

public class ReverseWord {

    public static void main(String[] args) {
        String palabra,pinvert;
        palabra=JOptionPane.showInputDialog("Ingrese la palabra para revertir: ");
        pinvert=reverse(palabra);
        JOptionPane.showMessageDialog(null,"La palabra invertida es:\n"+pinvert);
    }
    public static String reverse(String palabra) {
        if (palabra.length() == 1)
        return palabra;
    else 
        return reverse(palabra.substring(1)) + palabra.charAt(0);
    }
    
}

