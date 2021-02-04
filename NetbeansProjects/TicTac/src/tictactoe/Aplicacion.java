package tictactoe;

import javax.swing.JOptionPane;

public class Aplicacion {

    public static void main(String[] args) {
        Juego tablero = new Juego(3, 3);

        int opccion;

        do {
            tablero.setTablero();
            System.out.println(tablero);
            int primero = Integer.parseInt(JOptionPane.showInputDialog("Quien va primero? 1 para Jugador o 2 para Computador"));
            if (tablero.empezar(primero)) {
                switch (primero) {
                    case 1:
                        System.out.println("Empiezas tu");
                        tablero.movidaJugador();
                        System.out.println(tablero);
                        for (int mov = 1; mov < 9; mov++) {
                            if (mov % 2 == 0) {
                                if (tablero.ganaste()) {
                                    System.out.println("Gane");
                                    break;
                                } else if (mov > 7) {
                                    System.out.println("Empate");
                                    break;
                                } else {
                                    tablero.movidaJugador();
                                    System.out.println(tablero);
                                }
                            } else {
                                if (tablero.ganaste()) {
                                    System.out.println("Ganaste");
                                    break;
                                } else if (mov > 7) {
                                    System.out.println("Empate");
                                    break;
                                } else {
                                    tablero.movidaComputadora();
                                    System.out.println(tablero);
                                }
                            }

                        }
                        break;
                    case 2:
                        System.out.println("Empiezas yo");
                        tablero.movidaComputadora();
                        System.out.println(tablero);
                        for (int mov = 1; mov < 9; mov++) {
                            if (mov % 2 == 0) {
                                if (tablero.ganaste()) {
                                    System.out.println("Ganaste");
                                    break;
                                } else if (mov > 7) {
                                    System.out.println("Empate");
                                    break;
                                } else {
                                    tablero.movidaComputadora();
                                    System.out.println(tablero);
                                }
                            } else {
                                if (tablero.ganaste()) {
                                    System.out.println("Gane");
                                    break;
                                } else if (mov > 7) {
                                    System.out.println("Empate");
                                    break;
                                } else {
                                    tablero.movidaJugador();
                                    System.out.println(tablero);

                                }
                            }
                        }
                }
            }

            opccion = JOptionPane.showConfirmDialog(null, "Jugar de nuevo", "Ingreso de datos", JOptionPane.YES_NO_OPTION);
        } while (opccion == JOptionPane.YES_OPTION);
    }

char pantalla[][];
int puestos[][];
double [][]matriz;

    
pantalla = new char[80][24]; // matriz con 80 filas y 24 columnas
puestos = new int[10][5]; // matriz de 10 filas por 5 columnas
final int N = 4;
matriz = new double[N][N]; // matriz cuadrada de N*N elementos

}