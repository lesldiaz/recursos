package agentes;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Persona;

public class Agente1 extends Agent {
HashMap<String, Integer> lista = new HashMap<String, Integer>();
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

    class Comportamiento extends Behaviour {

        private boolean bandera = false;
        

        @Override
        public void action() {
            
            try {
                Persona per = new Persona("Leslie", "Díaz", "1725116336");
                enviarMensaje(per, "Agente2", "convA1A2");
                ACLMessage men = blockingReceive();
                Persona persona = (Persona) men.getContentObject();
                System.out.println(persona);
                if (persona.getNombre().equals("Traecy")){
                    System.out.println("OK");
                    bandera = true;
                }
            } catch (UnreadableException ex) {
                Logger.getLogger(Agente1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public boolean done() {
            // TODO Auto-generated method stub
            return bandera;
        }

        
    }

    private void enviarMensaje(Persona contenido, String receptor, String idCon) {
    try {
        AID id = new AID(); //agent id (con quien te vas a comunicar)
        id.setLocalName(receptor); //receptor
        ACLMessage acl = new ACLMessage(ACLMessage.INFORM);
        acl.addReceiver(id);
        acl.setSender(getAID());
        //acl.setContent(contenido);
        acl.setContentObject(contenido);
        acl.setLanguage("espaniol");
        acl.setConversationId(idCon);
        send(acl);
    } catch (IOException ex) {
       // Logger.getLogger(Agente1.class.getName()).log(Level.SEVERE, null, ex);
        System.err.println("El objeto debe estar serializado");
    }
    }
}
