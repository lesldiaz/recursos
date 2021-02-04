package agentes;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class Agente2 extends Agent {
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
	
	class Comportamiento extends Behaviour{

		@Override
		public void action() {
                    System.out.println("Soy el agente:" + getName());
                    ACLMessage mensaje = blockingReceive();
                    System.out.println(mensaje.getContent());
                   
		}
		
		@Override
		public boolean done() {
			// TODO Auto-generated method stub
			return false;
		}
		
	}
	

}

