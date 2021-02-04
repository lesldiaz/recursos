package agentes;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class Agente4 extends Agent {
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
            private boolean bandera = false;
		@Override
		public void action() {
                   
                    ACLMessage mensaje = blockingReceive();
                    
                    if (mensaje.getConversationId().equals("convA5A4")){
                        if (Integer.parseInt(mensaje.getContent())<30){
                            enviarMensaje(mensaje.getContent(), "Agente2", "convA4A2"); //doDelete(); para matarlo, tiene que ser un comportamiento ciclico;
                        }else {
                            enviarMensaje(mensaje.getContent(),"Agente3", "convA4A3");
                             bandera=true;
                        }
                    }else if (mensaje.getConversationId().equals("convA4A2")){
                        if(Integer.parseInt(mensaje.getContent())>30){
                            enviarMensaje(mensaje.getContent(), "Agente3", "convA4A3");
                            bandera=true;
                        }else {
                            enviarMensaje(mensaje.getContent(), "Agente5", "convA5A4");    
                        }
                    }
		}
		
		@Override
		public boolean done() {
			// TODO Auto-generated method stub
			return bandera;
		}
		private void enviarMensaje (String contenido, String receptor, String idCon){
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

