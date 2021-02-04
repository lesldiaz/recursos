package agentes;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

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

            ACLMessage mens = blockingReceive();
            lista.put(mens.getConversationId(), Integer.parseInt(mens.getContent()));

            if (lista.size() == 7) {
                int sumap = 0, prom = 0;
                Iterator it = lista.keySet().iterator();
                while (it.hasNext()) {
                    String key = (String) it.next();
                    sumap = sumap + lista.get(key);
                }
                prom = (int) sumap / 7;
                mensVuelta(prom);
            }

        }

        @Override
        public boolean done() {
            // TODO Auto-generated method stub
            return bandera;
        }

        
    }
private void mensVuelta(int prom) {
            Iterator it = lista.keySet().iterator();
            int[] val = new int[lista.size()];
            int i = 0;
            while (it.hasNext()) {
                String key = (String) it.next();
                switch (key) {
                    case "convA8A1":
                        if (lista.get(key) >= prom) {
                            enviarMensaje("Cumple", "Agente8", "convA8A1");
                        } else {
                            enviarMensaje("Deficiente", "Agente8", "convA8A1");
                        }
                        break;
                    case "convA7A1":
                        if (lista.get(key) >= prom) {
                            enviarMensaje("Cumple", "Agente7", "convA7A1");
                        } else {
                            enviarMensaje("Deficiente", "Agente7", "convA7A1");
                        }
                        break;
                    case "convA6A1":
                        if (lista.get(key) >= prom) {
                            enviarMensaje("Cumple", "Agente6", "convA6A1");
                        } else {
                            enviarMensaje("Deficiente", "Agente6", "convA6A1");
                        }
                        break;
                    case "convA5A1":
                        if (lista.get(key) >= prom) {
                            enviarMensaje("Cumple", "Agente5", "convA5A1");
                        } else {
                            enviarMensaje("Deficiente", "Agente5", "convA5A1");
                        }
                        break;
                    case "convA4A1":
                        if (lista.get(key) >= prom) {
                            enviarMensaje("Cumple", "Agente4", "convA4A1");
                        } else {
                            enviarMensaje("Deficiente", "Agente4", "convA4A1");
                        }
                        break;
                    case "convA3A1":
                        if (lista.get(key) >= prom) {
                            enviarMensaje("Cumple", "Agente3", "convA3A1");
                        } else {
                            enviarMensaje("Deficiente", "Agente3", "convA3A1");
                        }
                        break;
                    case "convA2A1":
                        if (lista.get(key) >= prom) {
                            enviarMensaje("Cumple", "Agente2", "convA2A1");
                        } else {
                            enviarMensaje("Deficiente", "Agente2", "convA2A1");
                        }
                        break;
                    default:
                        break;
                }

            }

        }
    private void enviarMensaje(String contenido, String receptor, String idCon) {
        AID id = new AID(); //agent id (con quien te vas a comunicar)
        id.setLocalName(receptor); //receptor
        ACLMessage acl = new ACLMessage(ACLMessage.REQUEST);
        acl.addReceiver(id);
        acl.setSender(getAID());
        acl.setContent(contenido);
        acl.setLanguage("espaniol");
        acl.setConversationId(idCon);
        send(acl);
    }
}
