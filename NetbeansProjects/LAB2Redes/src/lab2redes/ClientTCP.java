
package lab2redes;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ClientTCP {
    private static int SERVER_PORT = 9090;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String serverAddress = JOptionPane.showInputDialog("Enter IP Adress of a machine that is runing the date service on port\n"+ SERVER_PORT );
        Socket clientSocket = new Socket(serverAddress, SERVER_PORT);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        DataOutputStream salida = new DataOutputStream(clientSocket.getOutputStream());
        
       
       try {
            System.out.println("Ingrese los numeros separados por un espacio");
            salida.writeBytes(sc.nextLine());
            String respuesta = entrada.readLine();
            System.out.println(""+ respuesta); 
            salida.close();
            entrada.close();
            clientSocket.close();
            System.exit(0);

        }catch (IOException excepcion) {
            System.err.println("Error de entrada/salida");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        
    }
    
}
