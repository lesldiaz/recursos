package agentes;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import java.util.Random;
import vistas.VentanaA2;

public class Agente7 extends Agent {

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
            llamarVentana();
            ACLMessage men = blockingReceive();
                if (men.getContent().equals("Cumple")) {
                System.out.println("Agente 7 ha cumplido"); 
            }else if (men.getContent().equals("Deficiente")) {
                System.out.println("Agente 7 no ha cumplido");
            } 
            bandera=true;
        }

        @Override
        public boolean done() {
            // TODO Auto-generated method stub
            return bandera;
        }
  private void llamarVentana(){
             VentanaA2 ven = new VentanaA2();
             
              ven.setTitle("Agente 7");
             ven.getjLabel1().setText(ven.getjLabel1().getText() + " del Agente 7");
             ven.setVisible(true);
             while (ven.getTexto().equals("")){
                block();
            }
            if (ven.getTexto()!= ""){
               String val =ven.getTexto();
               if (isNumeric(val)== true){
                    ven.dispose();
                    enviarMensaje(val, "Agente1", "convA7A1");
                    bandera = true;
               }
                
             }
            
             
        }
      private boolean isNumeric(String cadena) {
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
return resultado;
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
