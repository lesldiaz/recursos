/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import javax.swing.JOptionPane;

public class Agente5 extends Agent{

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
                    
                        
                        int numero= (int) (Math.random() * 10) + 1;
                        System.out.println("Numero Agente 5: " + numero);
                        enviarMensaje(String.valueOf(numero), "Agente1", "convA1A5");
                        ACLMessage mensaje = blockingReceive();
                        if (mensaje.getConversationId().equals("Conf Recibido Agente 5")){
                            bandera=true;
                        }
                   
		}
		
		@Override
		public boolean done() {
			return bandera;
		}
		private void enviarMensaje (String contenido, String receptor, String idCon){
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
