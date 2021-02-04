package agentes;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import java.util.Random;

public class Agente5 extends Agent {

    @Override
    protected void setup() { //Inicializacion del Agente (Varaibles y Comportamiento)
        // TODO Auto-generated method stub
        addBehaviour(new Comportamiento()); //a�adir comportamiento
        super.setup();
    }

    @Override
    protected void takeDown() { //Matar al agente, antes de que muera, puedo poner una rutina en este metodo
        // TODO Auto-generated method stub
        System.out.println(getName() + " ha muerto ......");
        super.takeDown();
    }

  
    class Comportamiento extends Behaviour {

        private boolean bandera = false;
        int sum = 8;

        @Override
        public void action() {

             ACLMessage mensaje = blockingReceive();
             String parts[] = mensaje.getContent().split(",");
             double []partes = new double [3];
             double []partes1 = new double [3];
             double []partes2 = new double [3];
             for (int i = 0; i < parts.length; i++) {
                if (i<3){
                    partes[0]=Double.parseDouble(parts[0]);
                    partes[1]=Double.parseDouble(parts[1]);
                    partes[2]=Double.parseDouble(parts[2]);
                    partes1[0]=Double.parseDouble(parts[3]);
                    partes1[1]=Double.parseDouble(parts[4]);
                    partes1[2]=Double.parseDouble(parts[5]);
                    partes2[0]=Double.parseDouble(parts[6]);
                    partes2[1]=Double.parseDouble(parts[7]);
                    partes2[2]=Double.parseDouble(parts[8]);
                    
                    
                }
                 System.out.println("Pred "+(i+1)+": "+ parts[i]);
             }
             enviarMensaje("0", "Agente6", "convA5A6");
             bandera=true;
        }
        public void combrobarM(double[]partes){
            double mayor = partes[0];
            for (int i = 1; i < partes.length; i++) {
                
                if(partes[i]>){
                    
                }
            }
            
        }
        @Override
        public boolean done() {
            // TODO Auto-generated method stub
            return bandera;
        }

        private void enviarMensaje(String contenido, String receptor, String idCon) {
            AID id = new AID(); //agent id (con quien te vas a comunicar)
            id.setLocalName(receptor); //receptor
            ACLMessage acl = new ACLMessage(ACLMessage.INFORM);
            acl.addReceiver(id);
            acl.setSender(getAgent().getAID()); //-->> //sI ESTOY EN OTRA CLASE (getAgent().getAID())
            acl.setContent(contenido); //Serializado por que voy a pasar un objeto por un protocolo de comunicacion
            acl.setLanguage("espaniol");
            acl.setConversationId(idCon);
            send(acl);
        }
    }

}
