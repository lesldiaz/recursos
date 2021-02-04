package lab2redes;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;

public class MainCliente {

    public static void main(String[] args) {

//socket para conectarnos con el servidor
        Socket cliente = null;

//Clases para recibir y mandar informacion con el servidor
        BufferedReader entrada = null;
        DataOutputStream salida = null;

// nos conectamos al localhost a traves de esta dirección IP (localhost)
        String ipServidor = "localhost";

        try {
// conectamos con el servidor con la ip y el puerto definidos
            cliente = new Socket(ipServidor,9090);
//conexion para recepcion de datos
            entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
//conexion para envio de datos
            salida = new DataOutputStream(cliente.getOutputStream());

        } catch (UnknownHostException excepcion) {
            System.err.println("El servidor no está levantado");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }

//envio de la orden
        try {
//linea que vamos a recibir del servidor con el resultado
            String linea_recibida;

            /**
             * ************* ESCRIBIR AQUI LA ORDEN AL SERVIDOR ********************
             */
            String inst = JOptionPane.showInputDialog("Ingrese la Instruccion ejem suma 1 3");
            System.out.println(inst);
            salida.writeBytes(""+inst);
            /*
* ORDENES:
* suma num1 num2 --> ej: suma 2 5
* resta num1 num2
* multiplica num1 num2
* divide num1 num2
* sqrt num --> Raiz cuadrada, ej: sqrt 25
* apagate --> apagar el servidor remotamente
*
* */

//recibimos el resultado de la operacion
            linea_recibida = entrada.readLine();
// lo mostramos por consola
            System.out.println("MENSAJE DEL SERVIDOR: " + linea_recibida);

// cerramos los sockets y los buffers de conexion
            salida.close();
            entrada.close();
            cliente.close();

        } catch (UnknownHostException excepcion) {
            System.err.println("No se puede encontrar el servidor, en la dirección" + ipServidor);
        } catch (IOException excepcion) {
            System.err.println("Error de entrada/salida");
        } catch (Exception e) {
            System.err.println("Error: " + e);

        }

    }

}
