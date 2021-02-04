package agentes;

//Agente 3 realiza el testtrain
import calidadpizza.Prediccion;
import calidadpizza.RedNeuronal;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import java.io.File;

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
        RedNeuronal rn = new RedNeuronal();
        //int err = 0;
        @Override
        public void action() {
            ACLMessage mensaje = blockingReceive();
            if (mensaje.getConversationId().equals("convA1A4") && mensaje.getContent().equals("Iniciar Ahora")) {
                    Prediccion p = new Prediccion();
                    p.setVisible(true);
                    if (!p.getClase().getText().equals("")){
                        bandera =true;
                    }
            }
               

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
        //SNIFER: MONITOREAR LA CMUNICACION DE AGENTES EN UN CONTENEDOR

        @Override
        public boolean done() {
            // TODO Auto-generated method stub
            return bandera;
        }

    }

}
