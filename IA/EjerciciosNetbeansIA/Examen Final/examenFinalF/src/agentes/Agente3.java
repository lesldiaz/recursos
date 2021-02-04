package agentes;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import java.util.HashMap;
import java.util.Iterator;

public class Agente3 extends Agent {
HashMap<String, String> lista = new HashMap<String, String>();
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

           ACLMessage mens = blockingReceive();
           lista.put(mens.getConversationId(), mens.getContent());
           if (lista.size() == 2) {
                Iterator it = lista.keySet().iterator();
                while (it.hasNext()) {
                    String key = (String) it.next();
                    if (key.equals("convA1A3")&& lista.get(key).equals("Completado")){
                        enviarMensaje("IniciaPred","Agente4","convA3A4");
                    }else if (key.equals("convA2A3")){
                        enviarMensaje(lista.get(key),"Agente5","convA3A5");
                    }
                }
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
