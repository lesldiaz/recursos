/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;
import Modelo.Nodo;
import Modelo.Reinas;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Agente7 extends Agent{

    @Override
    protected void setup() {
        addBehaviour(new Comportamiento());
	super.setup();
    }

    @Override
    protected void takeDown() {
        System.out.println(getName() + " ha muerto ......");
	super.takeDown();
    }
    
    class Comportamiento extends Behaviour{
            private boolean bandera = false;
		@Override
		public void action() {
                   try {
                    ACLMessage mensaje = blockingReceive();
                    ArrayList<Nodo> lis = (ArrayList<Nodo>) mensaje.getContentObject();
                    if (mensaje.getConversationId().equals("convA1A7")){
                        Reinas re = new Reinas();
                        System.out.println("Peor Caso: ");
                        for (int i = 0; i < lis.size(); i++) {
                            re.imprimir(lis.get(i));
                        }
                        ArrayList<Nodo> lis1 = new  ArrayList<>();
                        enviarMensaje(lis1,"Agente1","convA1A7");
                        
                    }
                } catch (UnreadableException ex) {
                    Logger.getLogger(Agente6.class.getName()).log(Level.SEVERE, null, ex);
                }
		}
		
		@Override
		public boolean done() {
			return bandera;
		}
		private void enviarMensaje (ArrayList<Nodo> contenido, String receptor, String idCon){
                try {
                    AID id = new AID(); //agent id (con quien te vas a comunicar)
                    id.setLocalName(receptor); //receptor
                    ACLMessage acl = new ACLMessage(ACLMessage.REQUEST);
                    acl.addReceiver(id);
                    acl.setSender(getAgent().getAID()); //-->> //sI ESTOY EN OTRA CLASE (getAgent().getAID())
                    acl.setContentObject(contenido); //Serializado por que voy a pasar un objeto por un protocolo de comunicacion
                    acl.setLanguage("espaniol");
                    acl.setConversationId(idCon);
                    send(acl);
                } catch (IOException ex) {
                    Logger.getLogger(Agente7.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
	}
    
    
}
