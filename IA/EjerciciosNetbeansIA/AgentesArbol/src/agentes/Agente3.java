package agentes;


import Modelo.ArbodeExpresiones;
import Modelo.Nodo;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Agente3 extends Agent {
    ArbodeExpresiones ar = new ArbodeExpresiones();
    ArrayList<Nodo> lisno = new ArrayList<>();
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

    /*
	 * class Comportamiento extends CyclicBehaviour{ //comportamiento ciclico
		@Override
		public void action() {
			System.out.println("Soy el " + getName());
			
		}
		
	} 
     */
    class Comportamiento extends Behaviour {
        
        private boolean bandera = false;
        
        @Override
        public void action() {
            try {
                ACLMessage men = blockingReceive();
                Nodo raiz = (Nodo) men.getContentObject();
                imprimePre(raiz);
                enviarMensaje(lisno, "Agente1", "convA1A3");
                bandera = true;
            } catch (UnreadableException ex) {
                System.err.println("El objeto no esta serializado");
            }
            
        }

        @Override
        public boolean done() {
            // TODO Auto-generated method stub
            return bandera;
        }
        
       private void enviarMensaje(ArrayList<Nodo> contenido, String receptor, String idCon) {
            try {
                AID id = new AID(); //agent id (con quien te vas a comunicar)
                id.setLocalName(receptor); //receptor
                ACLMessage acl = new ACLMessage(ACLMessage.REQUEST);
                acl.addReceiver(id);
                acl.setSender(getAgent().getAID()); //-->> //sI ESTOY EN OTRA CLASE (getAgent().getAID())
                acl.setContentObject(contenido); //Serializado por que voy a pasar un objeto por un protocolo de comunicacion
                acl.setLanguage("espaniol");
                acl.setConversationId(idCon);
                send(acl);
            } catch (IOException ex) {
                Logger.getLogger(Agente3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    public void imprimePre(Nodo n) {
        if (n != null) {
            lisno.add(n);
            imprimePre(n.getNodoDerecho());
            imprimePre(n.getNodoIzquierdo());
        }
    }

    }

}
