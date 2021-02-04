import javax.swing.JOptionPane;
 
public class ColaArray 
{
    int[] COLA;
    int TOPE;
    int MAX;
 
    //-- CUANDO NO SE LE ASIGNA EL TAMA�O MAXIMO
    public ColaArray()
    {
        this.TOPE = 0;
        this.MAX = 100;
        this.COLA = new int[this.MAX+1];
    }
     
    //-- CUANDO SE LE ASIGNA EL TAMA�O MAXIMO
    public ColaArray(int MAX)
    {
        this.TOPE = 0;
        this.MAX = MAX;
        this.COLA = new int[this.MAX+1];        
    }
 
    public int GetTOPE() 
    {
        return TOPE;
    }
       
    public void VaciarCola()
    {
        this.TOPE = 0;         
    }
     
    public boolean IsColaLlena()
    {
        if(this.MAX == this.TOPE)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
     
    public boolean IsColaVacia()
    {
        if(this.TOPE == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
     
    public void InsertarCola()
    {
        if(this.IsColaLlena())
        {
            JOptionPane.showMessageDialog(null,"LA COLA ESTA LLENA");
        }
        else
        {
            int ITEM;
 
            ITEM = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL ITEM A AGREGAR"));            
             
            this.TOPE++;
            this.COLA[this.TOPE] = ITEM;
             
            JOptionPane.showMessageDialog(null,"EL ITEM " + ITEM + " SE INSERTO A LA COLA");
        }        
    }
     
    public void EliminarCola()
    {
        if(this.IsColaVacia())
        {
            JOptionPane.showMessageDialog(null,"LA COLA ESTA VACIA");
        }
        else
        {
            int ITEM = this.COLA[this.TOPE];
            this.TOPE--;
             
            JOptionPane.showMessageDialog(null,"EL ITEM " + ITEM + " SE ELIMINO DE LA COLA");
        }        
    }
     
    public void MostrarCola()
    {
        if(this.IsColaVacia())
        {
            JOptionPane.showMessageDialog(null,"LA COLA ESTÁ VACIA\n NO HAY DATOS QUE MOSTRAR","MOSTRAR DATOS",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int i;
            String MOSTRAR = "";
             
            for(i=1;i<=this.TOPE;i++)
            {
                MOSTRAR = MOSTRAR + this.COLA[i]+"\n";
            }
            JOptionPane.showMessageDialog(null,"TOTAL ES : "+this.TOPE+"\n"+"LOS DATOS DE LA COLA SON : \n"+MOSTRAR,"MOSTRAR DATOS",JOptionPane.INFORMATION_MESSAGE);
        }
    }    
}
