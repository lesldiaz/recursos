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
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Agente1 extends Agent {

    HashMap<String, ArrayList<Nodo>> lista = new HashMap<String, ArrayList<Nodo>>();

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

    class Comportamiento extends Behaviour {

        private boolean bandera = false;
        int cont = 0;

        @Override
        public void action() {
            try {
                Reinas re = new Reinas();
                re.ejec();
                enviarMensaje(re.getRaiz(), "Agente2", "convA1A2");
                enviarMensaje(re.getRaiz(), "Agente3", "convA1A3");
                enviarMensaje(re.getRaiz(), "Agente4", "convA1A4");
                enviarMensaje(re.getRaiz(), "Agente5", "convA1A5");

                ACLMessage mens = blockingReceive();
                ArrayList<Nodo> listanodosr = (ArrayList<Nodo>) mens.getContentObject();
                lista.put(mens.getConversationId(), listanodosr);
                if (lista.size() == 4) {
                    int[] nu = new int[4];
                    Iterator it = lista.keySet().iterator();
                    while (it.hasNext()) {
                        String key = (String) it.next();
                        if (key.equals("convA1A2")) { //heuri
                            nu[0] = lista.get(key).size();
                        } else if (key.equals("convA1A3")) { //anchura
                            nu[1] = lista.get(key).size();
                        } else if (key.equals("convA1A4")) {  //prof
                            nu[2] = lista.get(key).size();
                        } else if (key.equals("convA1A5")) { //aleat
                            nu[3] = lista.get(key).size();
                        }

                    }
                    int []sol = comMaxMin(nu);
                    switch (sol[0]) { //for min mejor
                        case 0:
                            enviarMensaje1(lista.get("convA1A2"),"Agente6","convA1A6");
                            break;
                        case 1:
                            enviarMensaje1(lista.get("convA1A3"),"Agente6","convA1A6");
                            break;
                        case 2:
                            enviarMensaje1(lista.get("convA1A4"),"Agente6","convA1A6");
                            break;
                        case 3:
                            enviarMensaje1(lista.get("convA1A5"),"Agente6","convA1A6");
                            break;
                        default:
                            break;
                    }
                    switch (sol[1]) { //for max peor
                        case 0:
                            enviarMensaje1(lista.get("convA1A2"),"Agente7","convA1A7");
                            break;
                        case 1:
                            enviarMensaje1(lista.get("convA1A3"),"Agente7","convA1A7");
                            break;
                        case 2:
                            enviarMensaje1(lista.get("convA1A4"),"Agente7","convA1A7");
                            break;
                        case 3:
                            enviarMensaje1(lista.get("convA1A5"),"Agente7","convA1A7");
                            break;
                        default:
                            break;
                    }
                    Nodo nodonew = new Nodo(null, null, "Recibido");
                    enviarMensaje(nodonew,"Agente2","convA1A2");
                    enviarMensaje(nodonew,"Agente3","convA1A3");
                    enviarMensaje(nodonew,"Agente4","convA1A4");
                    enviarMensaje(nodonew,"Agente5","convA1A5");
              }

                if (mens.getConversationId().equals("convA1A6")) {
                    cont++;
                } else if (mens.getConversationId().equals("convA1A7")) {
                    cont++;
                }
                if (cont == 2) {
                    bandera = true;
                }
            } catch (UnreadableException ex) {
                Logger.getLogger(Agente1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public boolean done() {
            return bandera;
        }

        private void enviarMensaje(Nodo conteni, String receptor, String idCon) {
            try {
                AID id = new AID(); //agent id (con quien te vas a comunicar)
                id.setLocalName(receptor); //receptor
                ACLMessage acl = new ACLMessage(ACLMessage.REQUEST);
                acl.addReceiver(id);
                acl.setSender(getAgent().getAID()); //-->> //sI ESTOY EN OTRA CLASE (getAgent().getAID())
                acl.setContentObject(conteni); //Serializado por que voy a pasar un objeto por un protocolo de comunicacion
                acl.setLanguage("espaniol");
                acl.setConversationId(idCon);
                send(acl);
            } catch (IOException ex) {
                Logger.getLogger(Agente1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        private int[] comMaxMin(int[] myList) {
            int i, max,posmax=0,posmin=0, min;
            int[]sol = new int[2];
            min = max = myList[0];
            for (i = 0; i < myList.length; i++) {
                if (min > myList[i]) {
                        //min = myList[i];
                        posmin=i;
                }
                if (max < myList[i]) {
                       // max = myList[i];
                        posmax=i;
                }
            }
            sol[0]=posmin;
            sol[1]=posmax;
            
            
            return sol;
        }
     private void enviarMensaje1(ArrayList<Nodo> contenido, String receptor, String idCon) {
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
                Logger.getLogger(Agente2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
