
package lab2redes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

public class ServerTCP {

  private static int PORT = 9090;
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Server listening on port "+ PORT);
        String instruccion;
        BufferedReader entrada;
        PrintStream salida;
        int a=0;
        int b=0;
        int c=0;
        try{
            while(true){
                Socket socket = serverSocket.accept();
                entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                salida = new PrintStream(socket.getOutputStream());
                instruccion = entrada.readLine();
                System.out.println(instruccion);
                String linea[] = instruccion.split(" ");
                System.out.println(linea[1]);
                System.out.println(linea[0]);
                a = Integer.valueOf(linea[0]);
                b = Integer.valueOf(linea[1]);
                c=a+b;
                try{
                    salida.println("Message from Server: Resultado = " + c);
                    salida.close();
                    entrada.close();
                    
                } finally {
                    salida.close();
                    entrada.close();
                    socket.close();
                  
                }
            }
        } finally{
            serverSocket.close();
        }
    }
    
}
