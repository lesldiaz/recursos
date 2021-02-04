package agentes;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import redes.RedNeuronal;

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
    class Comportamiento extends Behaviour {

        private boolean bandera = false;

        @Override
        public void action() {

            ACLMessage mensaje = blockingReceive();
            if (mensaje.getConversationId().equals("convA3A4") && mensaje.getContent().equals("IniciaPred")) {
                double []v = new RedNeuronal().prediccionModelo();
                String res ="";
                if (v[0]==0.0){
                    res=res+"SYNFLOOD,";
                }else if (v[0]==1.0){
                    res=res+"NORMAL,";
                }else if (v[0]==2.0){
                    res=res+"SLOWLORISHTTPDOS,";
                }
                if (v[1]==0.0){
                    res=res+"SYNFLOOD,";
                }else if (v[1]==1.0){
                    res=res+"NORMAL,";
                }else if (v[1]==2.0){
                    res=res+"SLOWLORISHTTPDOS,";
                }
                if (v[2]==0.0){
                    res=res+"SYNFLOOD,";
                }else if (v[2]==1.0){
                    res=res+"NORMAL,";
                }else if (v[2]==2.0){
                    res=res+"SLOWLORISHTTPDOS";
                }
                enviarMensaje(res, "Agente6", "convA4A6");
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
