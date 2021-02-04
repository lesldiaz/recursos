
import javax.swing.JOptionPane;
 
public class MainColaArray 
{
    public static ColaArray Cola;
     
    public static void main(String[] ARGUMENTOS)
    {    
        int MAX;
 
        MAX = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL TAMAÑO DE LA COLA"));   
        Cola = new ColaArray(MAX);
         
        MenuCola();
    }
     
    public static void MenuCola()
    {
        int Opcion;
         
        do
        {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. INGRESAR DATOS\n"+
                    "2. ELIMINAR DATOS\n"+
                    "3. VISUALIZAR DATOS\n"+
                    "4. VACIAR COLA\n"+
                    "5. SALIR\n"+
                    "--------------------------------------------------------\n"+
                    "INGRESE LA OPCION [1 - 5]","MENU PILA",JOptionPane.QUESTION_MESSAGE));
             
            switch(Opcion)
            {
                case 1: Cola.InsertarCola();break;
                case 2: Cola.EliminarCola();break;
                case 3: Cola.MostrarCola();break;
                case 4: Cola.VaciarCola();break;
                case 5: System.exit(0);break;
                default: JOptionPane.showMessageDialog(null,"INGRESE UNA OPCION VALIDA \n","ERROR OPCION",JOptionPane.WARNING_MESSAGE);break;
            }
        }
        while(true); //-- CONTINUAR HASTA QUE OPCION SEA IGUAL A 5
    }
}

