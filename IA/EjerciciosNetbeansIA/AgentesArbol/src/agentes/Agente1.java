package agentes;

import Modelo.ArbodeExpresiones;
import Modelo.Nodo;
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
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListModel;
import vistas.Ventana;
import vistas.panelgen;

public class Agente1 extends Agent {

    HashMap<String, ArrayList<Nodo>> total = new HashMap<>();

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

        @Override
        public void action() {
            try {
                ArbodeExpresiones ar = new ArbodeExpresiones();
                String expresion = "(a+b*(c-2)/5%7)";
                Nodo raiz = ar.construirArbol(expresion);

                enviarMensaje(raiz, "Agente2", "convA1A2");
                enviarMensaje(raiz, "Agente3", "convA1A3");
                enviarMensaje(raiz, "Agente4", "convA1A4");

                ACLMessage men = blockingReceive();
                ArrayList<Nodo> listanodosr = (ArrayList<Nodo>) men.getContentObject();
                total.put(men.getConversationId(), listanodosr);
                panelgen p = null,q=null,r=null;
                if (total.size() == 3) {
                    Iterator it = total.keySet().iterator();
                    while (it.hasNext()) {
                        String key = (String) it.next();
                        ArrayList<Nodo> li = total.get(key);
                        if (key.equals("convA1A2")) {
                            p = genPanel(li,"prof");
                        } else if (key.equals("convA1A3")) {
                            q = genPanel(li, "ancho");
                        } else if (key.equals("convA1A4")) {
                            r = genPanel(li, "heuris");
                        }
                    }
                    Ventana ven = new Ventana(q, r, p);
                    ven.setVisible(true);
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

    private void enviarMensaje(Nodo contenido, String receptor, String idCon) {
        try {
            AID id = new AID(); //agent id (con quien te vas a comunicar)
            id.setLocalName(receptor); //receptor
            ACLMessage acl = new ACLMessage(ACLMessage.REQUEST);
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

    public panelgen genPanel(ArrayList<Nodo> lisno, String oper) {
        DefaultListModel lista = new DefaultListModel();
        for (int i = 0; i < lisno.size(); i++) {
            lista.addElement(lisno.get(i));
        }
        panelgen p = new panelgen();
        JList li = new JList(lista);
        switch (oper) {
            case "heuris":
                p.getNumnodos().setText(String.valueOf(lisno.size()));
                p.scPanel(li);
                break;
            case "ancho":
                p.getNumnodos().setText(String.valueOf(lisno.size()));
                p.scPanel(li);
                break;
            case "prof":
                p.getNumnodos().setText(String.valueOf(lisno.size()));
                p.scPanel(li);
                break;
            default:
                break;
        }
        return p;
    }
}
