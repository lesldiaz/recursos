package agentes;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class Agente2 extends Agent {
	@Override
	protected void setup() { //Inicializacion del Agente (Varaibles y Comportamiento)
		// TODO Auto-generated method stub
		addBehaviour(new Comportamiento());
		super.setup();
	}
	
	@Override								
	protected void takeDown() { //Matar al agente, antes de que muera, puedo poner una rutina en este metodo
		// TODO Auto-generated method stub
		super.takeDown();
	}
	
	
	class Comportamiento extends CyclicBehaviour{
		@Override
		public void action() {
		System.out.println("Soy el " + getName());
		//doDelete();
		ACLMessage mensaje = blockingReceive();
		System.out.println(mensaje.getContent());
		}

		
	}

}