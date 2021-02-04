package agentes;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

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
	
	class Comportamiento extends Behaviour{

		@Override
		public void action() {
			//System.out.println("Soy el agente:" + getName());
			//doDelete(); //matar al agente que utiliza el comportamiento
			//Comunicaci�n
			AID id = new AID(); //agent id (con quien te vas a comunicar)
			id.setLocalName("Agente2"); //receptor
			ACLMessage acl = new ACLMessage(ACLMessage.INFORM);
			acl.addReceiver(id);
			acl.setSender(getAID()); //-->> //sI ESTOY EN OTRA CLASE (getAgent().getAID())
			acl.setContent("Hola"); //Serializado por que voy a pasar un objeto por un protocolo de comunicacion
			acl.setLanguage("espaniol");
			acl.setConversationId("001");
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
