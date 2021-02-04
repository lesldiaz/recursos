package torreshanoi;
import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Hanoi {
static int nummov=0;
    static ArrayList<String> movimientos = new ArrayList<String>();
    
	public static void main(String[] args) {
	int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Numero de discos: "));
        int discos= Hanoi(n,1,2,3);  //1:origen  2:auxiliar 3:destino
       // JOptionPane.showMessageDialog(null,"Numero de movimientos: " + discos);
        String mostrar="";
        for(int x=0;x<movimientos.size();x++) {
            mostrar = mostrar + movimientos.get(x)+"\n";
        }
        JOptionPane.showMessageDialog(null,"Numero de movimientos: " + discos + "\n" + "Movimientos: \n" + mostrar);
        String mostrar1="";
        for (int j=2; j<11; j++){
            int num1=nummov(j);
            mostrar1= mostrar1 + "Movimientos para "+j+" discos: "+num1 + "\n";
        }
        JOptionPane.showMessageDialog(null, "Movimientos para discos desde 2 hasta 10: \n" + mostrar1);
        }
        //Método Torres de Hanoi Recursivo
	public static int Hanoi(int n, int origen,  int auxiliar, int destino){
	if(n==1){
	 // System.out.println("mover disco de " + origen + " a " + destino);
          String mov= "Mover disco de "+ origen + " a " + destino;
          movimientos.add(mov);
        }else{
	     Hanoi(n-1, origen, destino, auxiliar);
             //System.out.println("mover disco de "+ origen + " a " + destino);
             String mov= "Mover disco de "+ origen + " a " + destino;
             movimientos.add(mov);
	     Hanoi(n-1, auxiliar, origen, destino);
        }
	nummov++;
        return nummov;
        }
        public static int nummov(int numdiscos){
            return (int) (pow(2,numdiscos) - 1);
        }
}