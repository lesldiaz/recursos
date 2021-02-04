package agentes;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            private boolean bandera = false;
            ArrayList <String> listamen = new ArrayList<>();
            @Override
		public void action() {
                    enviarMensajeS("-L 0.4 -M 0.35 -N 1000 -V 0 -S 0 -E 20 -H a","Agente2", "convA1A2");
                    ACLMessage men = blockingReceive();
                    
                    if (men.getConversationId().equals("convA1A2")&& men.getContent().equals("Completado")) {
                        enviarMensajeS("-L 0.4 -M 0.35 -N 1000 -V 0 -S 0 -E 20 -H a","Agente3", "convA1A3");
                    } 
                     if (men.getConversationId().equals("convA1A3")&& men.getContent().equals("Completado")) {
                        enviarMensajeS("Iniciar Ahora","Agente4", "convA1A4");
                        bandera = true;
                    }
		}
		
		@Override
		public boolean done() {
			// TODO Auto-generated method stub
			return bandera;
		}
		private void enviarMensaje (FileReader contenido, String receptor, String idCon){
                try {
                    AID id = new AID(); //agent id (con quien te vas a comunicar)
                    id.setLocalName(receptor); //receptor
                    ACLMessage acl = new ACLMessage(ACLMessage.REQUEST);
                    acl.addReceiver(id);
                    acl.setSender(getAgent().getAID()); //-->> //sI ESTOY EN OTRA CLASE (getAgent().getAID())
                    acl.setContentObject((Serializable) contenido); //Serializado por que voy a pasar un objeto por un protocolo de comunicacion
                    acl.setLanguage("espaniol");
                    acl.setConversationId(idCon);
                    send(acl);
                } catch (IOException ex) {
                    Logger.getLogger(Agente1.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                
                private void enviarMensajeS (String contenido, String receptor, String idCon){
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

