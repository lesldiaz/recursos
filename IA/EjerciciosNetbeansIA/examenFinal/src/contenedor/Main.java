package contenedor;

public class Main {
    /*
    Los agentes 1 y 2 generan un numero aleatorio del 1 al 10 y lo mandan al agente 3.
    El agente 3 suma y multiplica (dependiendo del emisor) 3 al valor que se recibe siempre y cuando
    los dos mensajes se hayan recibido y luego envia mensajes con los valores generado para 4 y 5.
    Los agentes 4 y 5 generan un numero aletorio, lo multiplican o suman al numero recibido 
    y lo envian al agente 6.
    El agente 6 comprueba si la suma de los numero recibidos es mayor o menor a 100 e imprime un mensaje 
    consola con el valor E(éxito) o F(fracaso).
    */
	public static void main (String[] argv){
			new Contenedor().contenedor();
			
	}
}
