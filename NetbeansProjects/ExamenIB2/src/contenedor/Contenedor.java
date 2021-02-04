/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedor;
import agentes.*;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.StaleProxyException;

public class Contenedor {
AgentContainer mainContainer;
    private void iniAgentes(){
		 try {
			mainContainer.createNewAgent("Agente1",Agente1.class.getName(), null).start();
			mainContainer.createNewAgent("Agente2",Agente2.class.getName(), null).start();
                        mainContainer.createNewAgent("Agente3",Agente3.class.getName(), null).start();
                        mainContainer.createNewAgent("Agente4",Agente4.class.getName(), null).start();
			mainContainer.createNewAgent("Agente5",Agente5.class.getName(), null).start(); 
                        mainContainer.createNewAgent("Agente6",Agente6.class.getName(), null).start();
                        mainContainer.createNewAgent("Agente7",Agente7.class.getName(), null).start();
                 } catch (StaleProxyException e) { 
			e.printStackTrace();
		 } 
    }

    public void contenedor() {
		jade.core.Runtime runtime = jade.core.Runtime.instance(); 
		runtime.setCloseVM(true); 
		Profile profile = new ProfileImpl(null, 1099, null);
		mainContainer = runtime.createMainContainer(profile);
		iniAgentes();
	}

}
