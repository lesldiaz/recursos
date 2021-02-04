package agentes;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import java.util.ArrayList;

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
        private ArrayList<String> list = new ArrayList();
        @Override
        public void action() {
                
            ACLMessage mens = blockingReceive();
                
            switch (mens.getConversationId()) {
                case "convA8A1":
                    list.add(mens.getContent());
                    break;
                case "convA7A1":
                   list.add(mens.getContent());
                    break;
                case "convA6A1":
                    list.add(mens.getContent());
                    break;
                case "convA5A1":
                    list.add(mens.getContent());
                    break;
                case "convA4A1":
                    list.add(mens.getContent());
                    break;
                case "convA3A1":
                    list.add(mens.getContent());
                    break;
                case "convA2A1":
                    list.add(mens.getContent());
                    break;
                default:
                    break;
            }
                
                if (list.size() == 7){
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    enviarMensaje("OK2", "Agente2", "convA2A1");
                    enviarMensaje("OK3", "Agente3", "convA3A1");
                    enviarMensaje("OK4", "Agente4", "convA4A1");
                    enviarMensaje("OK5", "Agente5", "convA5A1");
                    enviarMensaje("OK6", "Agente6", "convA6A1");
                    enviarMensaje("OK7", "Agente7", "convA7A1");
                    enviarMensaje("OK8", "Agente8", "convA8A1");
                    
                    bandera=true;
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
            ACLMessage acl = new ACLMessage(ACLMessage.REQUEST);
            acl.addReceiver(id);
            acl.setSender(getAgent().getAID()); //-->> //sI ESTOY EN OTRA CLASE (getAgent().getAID())
            acl.setContent(contenido); //Serializado por que voy a pasar un objeto por un protocolo de comunicacion
            acl.setLanguage("espaniol");
            acl.setConversationId(idCon);
            send(acl);
        }
    }

}
