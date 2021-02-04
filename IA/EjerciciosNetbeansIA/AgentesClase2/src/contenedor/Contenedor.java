package contenedor;

import agentes.*;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.StaleProxyException;

public class Contenedor {
	
AgentContainer mainContainer;


    
	private void iniAgentes(){
		//obtengo el nombre de la clase: Agente1.class.getName()
		 try {
			mainContainer.createNewAgent("Agente1",Agente1.class.getName(), null).start();//parametros: alias,nombre de la clase del agente,
			mainContainer.createNewAgent("Agente2",Agente2.class.getName(), null).start();
                        mainContainer.createNewAgent("Agente3",Agente3.class.getName(), null).start();
                        mainContainer.createNewAgent("Agente4",Agente4.class.getName(), null).start();
			mainContainer.createNewAgent("Agente5",Agente5.class.getName(), null).start(); 
                        mainContainer.createNewAgent("Agente6",Agente6.class.getName(), null).start();
                        mainContainer.createNewAgent("Agente7",Agente7.class.getName(), null).start();
                        mainContainer.createNewAgent("Agente8",Agente8.class.getName(), null).start();
//arreglo de objetos
			
		} catch (StaleProxyException e) { //Repeticion del Alias, mal el nombre de la clase -->> Errores posibles
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public void contenedor() {
		// TODO Auto-generated method stub
		jade.core.Runtime runtime = jade.core.Runtime.instance(); 
		runtime.setCloseVM(true); //habilitar la maquina virtual que tiene java
		//profile
		Profile profile = new ProfileImpl(null, 1099, null); //ip.puerto.nombre 
		mainContainer = runtime.createMainContainer(profile);
		iniAgentes();
		
	}

    
	
	
}
