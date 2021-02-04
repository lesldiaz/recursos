package agentes;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import java.util.Random;

public class Agente1 extends Agent {

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
            int ran = new Random().nextInt(50);
            int sum = new Random().nextInt(10);
            System.out.println("Valor inicial:"+ran);
            enviarMensaje(ran + "", "Agente3", "convA1A3");
            enviarMensaje(sum + "", "Agente2", "convA1A2");
            ACLMessage mensaje = blockingReceive();

            if (mensaje.getConversationId().equals("convA1A3")) {
                enviarMensaje("Numero Mayor a 30 en R3: " + mensaje.getContent(), "Agente6", "convA1A6");
                bandera = true;
                //doDelete(); para matarlo, tiene que ser un comportamiento ciclico  
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
