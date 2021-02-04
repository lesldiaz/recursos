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
import java.util.HashMap;
import java.util.Iterator;

public class Agente1 extends Agent{
HashMap<String, Integer> lista = new HashMap<String, Integer>();

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
            int cont=0;
		@Override
		public void action() {
                   ACLMessage mens = blockingReceive();
                   lista.put(mens.getConversationId(), Integer.parseInt(mens.getContent()));

            if (lista.size() == 4) {
                int suma = 0;
                Iterator it = lista.keySet().iterator();
                while (it.hasNext()) {
                    String key = (String) it.next();
                    suma = suma + lista.get(key);
                }
                    enviarMensaje("Conf Recibido Agente 2","Agente2","convA1A2");
                    enviarMensaje("Conf Recibido Agente 3","Agente3","convA1A3");
                    enviarMensaje("Conf Recibido Agente 4","Agente4","convA1A4");
                    enviarMensaje("Conf Recibido Agente 5","Agente5","convA1A5");
                    enviarMensaje(String.valueOf(suma),"Agente6","convA1A6");
                    enviarMensaje(String.valueOf(suma),"Agente7","convA1A7");
             }
            
            if (mens.getConversationId().equals("convA1A6")) {
                        if (mens.getContent().equals("0")){
                            System.out.println("Fallido: suma menor a 10");
                            cont++;
                        }else {
                            System.out.println("Cumplido: suma mayor a 10");
                            cont++;
                        }
            } else if(mens.getConversationId().equals("convA1A7")){
                        if (mens.getContent().equals("0")){
                            System.out.println("Numero de la suma es Par");
                            cont++;
                        }else {
                            System.out.println("Numero de la suma es Impar");
                            cont++;
                        }
            }
            if (cont==2){
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
