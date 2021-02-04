
package EjemploColaCircular;
import java.io.*;
import javax.swing.JOptionPane;
public class Main {
    
    public static void main(String[] args){
        ColaCircular clcircular = new ColaCircular();
         int Opcion=0;
         
        do
        {
            try{
                Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. INGRESAR DATOS\n"+
                    "2. ELIMINAR DATOS\n"+
                    "3. VISUALIZAR CONTENIDO\n"+
                    "4. SALIR\n"+
                    "--------------------------------------------------------\n"+
                    "INGRESE LA OPCION [1 - 4]","MENU COLA",JOptionPane.QUESTION_MESSAGE));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"INGRESE UNA OPCION VALIDA \n","ERROR OPCION",JOptionPane.WARNING_MESSAGE);
            } 
            switch(Opcion)
            {
                case 1: 
                    String ITEM;
                    ITEM = JOptionPane.showInputDialog(null,"INGRESE EL ITEM A AGREGAR"); 
                    clcircular.Insertar(ITEM);
                    break;
                case 2: 
                    clcircular.Retirar();
                break;
                case 3: 
                    clcircular.ImprimeCola();
                case 4: System.exit(0);break;
                default: JOptionPane.showMessageDialog(null,"INGRESE UNA OPCION VALIDA \n","ERROR OPCION",JOptionPane.WARNING_MESSAGE);break;
            }
        }
        while(true); //-- CONTINUAR HASTA QUE OPCION SEA IGUAL A 5
    }
    
}
