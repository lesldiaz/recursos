package EjemploColaCircular;

import javax.swing.JOptionPane;

public class ColaCircular {

    int iFrente=-1;
    int iFinal=-1;
    String elementoscola[];
    int max=8;

    public ColaCircular(){
        elementoscola=new String [max];
    }
    public boolean Llena(){
        if(iFinal==max-1 && iFrente==0 || iFinal+1==iFrente){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean Vacia(){
        if(iFinal==-1 && iFrente==0){
            return true;
        }
        else{
            return false;
        }
    }
    public void Insertar(String dato){

        if(Llena()==true){
            JOptionPane.showMessageDialog(null,"LA COLA ESTA LLENA");
        }
        else{
            if(iFinal==max-1 && iFinal>0){
                iFinal=0;
                elementoscola[iFinal]=dato;
            }
            else{
                iFinal++;
                elementoscola[iFinal]=dato;
                iFrente=0;
            }
            
        }
    }
    public String Retirar(){
        String aux=null;
        if(Vacia()==true){
            System.out.print("La cola esta vacía \n");
        }
        else{
            elementoscola[iFrente]=aux;
            if(iFrente==iFinal){
                iFrente=-1;
                iFinal=-1;
            }
            else{
                iFrente++;
            }
        }
        return aux;
    }
    public void ImprimeCola(){
    if(this.Vacia())
        {
            JOptionPane.showMessageDialog(null,"LA COLA ESTÁ VACIA\n NO HAY DATOS QUE MOSTRAR","MOSTRAR DATOS",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int i;
            String MOSTRAR = "";
            for(int iCont=0; iCont<elementoscola.length; iCont++){
            MOSTRAR = MOSTRAR + elementoscola[iCont]+"\n";
            }
            JOptionPane.showMessageDialog(null,"TOTAL ES : "+elementoscola.length+"\n"+"LOS DATOS DE LA COLA SON : \n"+MOSTRAR,"MOSTRAR DATOS",JOptionPane.INFORMATION_MESSAGE);
        }
    
    }
}
