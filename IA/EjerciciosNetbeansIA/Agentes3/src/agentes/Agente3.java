package agentes;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import java.util.Random;

public class Agente3 extends Agent {

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

        //int err = 0;

        @Override
        public void action() {
            System.out.println("Soy el agente:" + getName());
            ACLMessage mensaje = blockingReceive();
            System.out.println(mensaje.getContent());
            //System.out.println(mensaje.getSender().getLocalName()); //Imprime quien me envio el mensaje

            if (mensaje.getConversationId().equals("convA1A3")) {
                if (mensaje.getContent().equals("Ejecuta el modelo")) {
                   int err = new Random().nextInt(100);
                   enviarMensaje(err+"", mensaje.getSender().getLocalName(), "convA1A3");
                }
            }

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
        //SNIFER: MONITOREAR LA CMUNICACION DE AGENTES EN UN CONTENEDOR

        @Override
        public boolean done() {
            // TODO Auto-generated method stub
            return false;
        }

    }

}
