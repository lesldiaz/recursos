package agentes;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import java.util.HashMap;
import java.util.Iterator;

public class Agente6 extends Agent {
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
                    if (key.equals("convA4A6")){
                        String parts[] = lista.get(key).split(",");
                        for (int i = 0; i < parts.length; i++) {
                            System.out.println("Pred "+(i+1)+": "+ parts[i]);
                        }
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

    }

}
