package tictactoe;

import java.util.Random;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Juego {

    private String tablero[][];

    public Juego(int filas, int columnas) {
        super();
        tablero = new String[filas][columnas];
    }

    public Juego(String[][] tablero) {
        super();
        this.tablero = tablero;
    }

    public void setTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = " ";
            }
        }
    }

    public boolean empezar(int i) {
        return (i == 1 || i == 2);
    }

    public void movidaJugador() {

        boolean correcto = false;
        while (correcto == false) {
            String linea = JOptionPane.showInputDialog("Ingrese las cordenadas de su movimiento separado por , :\n(ejemplo posicion 1 es cordenadas 1,1)");
            StringTokenizer token = new StringTokenizer(linea, ",");
            int fila = Integer.parseInt(token.nextToken());
            int columna = Integer.parseInt(token.nextToken());
            if (vacio(fila, columna)) {
                tablero[fila - 1][columna - 1] = "X";
                correcto = true;
            } else {
                System.out.println("Esta posicion esta ocupada");
            }
        }
    }

    public void movidaComputadora() {
        boolean movida = false;
        boolean correcto = false;

        for (int i = 0; i < 3; i++) {
            if (tablero[i][0].equals(tablero[i][2]) && tablero[i][0].equals("X")) {
                if (vacio(i + 1, 1 + 1)) {
                    tablero[i][1] = "O";
                    correcto = true;
                    movida = true;
                    return;
                }
            }
            if (tablero[i][0].equals(tablero[i][1]) && tablero[i][0].equals("X")) {
                if (vacio(i + 1, 2 + 1)) {
                    tablero[i][2] = "O";
                    correcto = true;
                    movida = true;
                    return;
                }
            }
            if (tablero[i][1].equals(tablero[i][2]) && tablero[i][1].equals("X")) {
                if (vacio(i + 1, 0 + 1)) {
                    tablero[i][0] = "O";
                    correcto = true;
                    movida = true;
                    return;
                }
            }
            //verificar ganar fila
            if (tablero[i][0].equals(tablero[i][2]) && tablero[i][0].equals("O")) {
                if (vacio(i + 1, 1 + 1)) {
                    tablero[i][1] = "O";
                    correcto = true;
                    movida = true;
                    return;
                }
            }
            if (tablero[i][0].equals(tablero[i][1]) && tablero[i][0].equals("O")) {
                if (vacio(i + 1, 2 + 1)) {
                    tablero[i][2] = "O";
                    correcto = true;
                    movida = true;
                    return;
                }
            }
            if (tablero[i][1].equals(tablero[i][2]) && tablero[i][1].equals("O")) {
                if (vacio(i + 1, 0 + 1)) {
                    tablero[i][0] = "O";
                    correcto = true;
                    movida = true;
                    return;
                }
            }
        }
        //verificar columna
        for (int i = 0; i < 3; i++) {
            if (tablero[0][i].equals(tablero[2][i]) && tablero[0][i].equals("X")) {
                if (vacio(1 + 1, i + 1)) {
                    tablero[1][i] = "O";
                    correcto = true;
                    movida = true;
                    return;
                }
            }
            if (tablero[0][i].equals(tablero[1][i]) && tablero[0][i].equals("X")) {
                if (vacio(2 + 1, i + 1)) {
                    tablero[2][i] = "O";
                    correcto = true;
                    movida = true;
                    return;
                }
            }
            if (tablero[1][i].equals(tablero[2][i]) && tablero[1][i].equals("X")) {
                if (vacio(0 + 1, i + 1)) {
                    tablero[0][i] = "O";
                    correcto = true;
                    movida = true;
                    return;
                }
            }
            //verificar ganar columna
            if (tablero[0][i].equals(tablero[2][i]) && tablero[0][i].equals("O")) {
                if (vacio(1 + 1, i + 1)) {
                    tablero[1][i] = "O";
                    correcto = true;
                    movida = true;
                    return;
                }
            }
            if (tablero[0][i].equals(tablero[1][i]) && tablero[0][i].equals("O")) {
                if (vacio(2 + 1, i + 1)) {
                    tablero[2][i] = "O";
                    correcto = true;
                    movida = true;
                    return;
                }
            }
            if (tablero[1][i].equals(tablero[2][i]) && tablero[1][i].equals("O")) {
                if (vacio(0 + 1, i + 1)) {
                    tablero[0][i] = "O";
                    correcto = true;
                    movida = true;
                    return;
                }
            }
        }
        // verificar diagonal 1
        if (tablero[1][1].equals(tablero[0][0]) && tablero[0][0].equals("X")) {
            if (vacio(3, 3)) {
                tablero[2][2] = "O";
                correcto = true;
                movida = true;
                return;
            }
        } else if (tablero[1][1].equals(tablero[0][0]) && tablero[0][0].equals("O")) {
            if (vacio(3, 3)) {
                tablero[2][2] = "O";
                correcto = true;
                movida = true;
                return;
            }
        }
        if (tablero[0][0].equals(tablero[2][2]) && tablero[0][0].equals("X")) {
            if (vacio(2, 2)) {
                tablero[1][1] = "O";
                correcto = true;
                movida = true;
                return;
            }
        } else if (tablero[0][0].equals(tablero[2][2]) && tablero[0][0].equals("O")) {
            if (vacio(2, 2)) {
                tablero[1][1] = "O";
                correcto = true;
                movida = true;
                return;
            }
        }
        if (tablero[1][1].equals(tablero[2][2]) && tablero[1][1].equals("X")) {
            if (vacio(1, 1)) {
                tablero[0][0] = "O";
                correcto = true;
                movida = true;
                return;
            }
        } else if (tablero[1][1].equals(tablero[2][2]) && tablero[1][1].equals("O")) {
            if (vacio(1, 1)) {
                tablero[0][0] = "O";
                correcto = true;
                movida = true;
                return;
            }
        }
        //Verificar Diagonal 2
        if (tablero[2][0].equals(tablero[1][1]) && tablero[2][0].equals("X")) {
            if (vacio(1, 3)) {
                tablero[0][2] = "O";
                correcto = true;
                movida = true;
                return;
            }
        } else if (tablero[2][0].equals(tablero[1][1]) && tablero[2][0].equals("O")) {
            if (vacio(1, 3)) {
                tablero[0][2] = "O";
                correcto = true;
                movida = true;
                return;
            }
        }
        if (tablero[2][0].equals(tablero[0][2]) && tablero[2][0].equals("X")) {
            if (vacio(2, 2)) {
                tablero[1][1] = "O";
                correcto = true;
                movida = true;
                return;
            }
        } else if (tablero[2][0].equals(tablero[0][2]) && tablero[2][0].equals("O")) {
            if (vacio(2, 2)) {
                tablero[1][1] = "O";
                correcto = true;
                movida = true;
                return;
            }
        }
        if (tablero[0][2].equals(tablero[1][1]) && tablero[1][1].equals("X")) {
            if (vacio(3, 1)) {
                tablero[2][0] = "O";
                correcto = true;
                movida = true;
                return;
            }
        } else if (tablero[0][2].equals(tablero[1][1]) && tablero[1][1].equals("O")) {
            if (vacio(3, 1)) {
                tablero[2][0] = "O";
                correcto = true;
                movida = true;
                return;
            }
        }
        while (correcto == false) {
            Random rand1 = new Random();
            Random rand2 = new Random();
            int f = rand1.nextInt(2);
            int c = rand2.nextInt(2);
            while (movida == false) {
                if (tablero[f][c] != "X" && tablero[f][c] != "O") {

                    tablero[f][c] = "O";
                    correcto = true;
                    movida = true;
                    return;
                }
                while (correcto == false) {
                    for (int i = 0; i < 3; i++) {
                        if (tablero[i][0] == "X" && tablero[i][1] == "O" && tablero[i][2] == " " || tablero[i][0] == "O" && tablero[i][1] == "X" && tablero[i][2] == " ") {
                            if (vacio(f + 1, c + 1)) {
                                tablero[f][c] = "O";
                                correcto = true;
                                movida = true;
                                return;
                            }
                        }
                        for (int j = 0; j < 3; j++) {
                            if (tablero[0][j] == "0" && tablero[1][j] == "X" && tablero[2][j] == " " || tablero[0][j] == "X" && tablero[1][j] == "O" && tablero[2][j] == " ") {
                                if (vacio(f + 1, c + 1)) {
                                    tablero[f][c] = "O";
                                    correcto = true;
                                    movida = true;
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private boolean vacio(int f, int c) {
        return (tablero[f - 1][c - 1] == " ");
    }

    public boolean ganaste() {
        //horizontal 
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0].equals(tablero[i][1]) && tablero[i][1].equals(tablero[i][2]) && tablero[i][1] != (" ")) {
                return true;
            }
        }
        //vertical
        for (int i = 0; i < 3; i++) {
            if (tablero[0][i].equals(tablero[1][i]) && tablero[1][i].equals(tablero[2][i]) && tablero[1][i] != (" ")) {
                return true;
            }
        }
        //diagonal
        if (tablero[0][0].equals(tablero[1][1]) && tablero[1][1].equals(tablero[2][2]) && tablero[1][1] != (" ") || tablero[2][0].equals(tablero[1][1]) && tablero[1][1].equals(tablero[0][2]) && tablero[1][1] != (" ")) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String salida = "\nTablero\n";
        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero.length; j++) {
                salida += " " + tablero[i][j] + " ";
                if (j < 2) {
                    salida += "|";
                }
            }
            if (i < 2) {
                salida += "\n------------\n";
            }
        }
        return salida;
    }

}
