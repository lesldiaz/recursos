/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author No Name
 */
public class Juego {
    JFrame ventana;
    //panel inicio
    JPanel panelInicio;
    JLabel fondo;
    JTextField jugador1,jugador2;
    JButton botonInicio;
    //panel del juego
    JPanel panelJuego;
    JLabel nombre1,nombre2;
    JLabel matriz[][] = new JLabel[3][3];
    int mat[][]= new int[3][3];
    int turno =1;
    JLabel labelTurno;
    int bandera=0;
    
    public Juego() {
        prepararVentana();
        prepararPanelI();
        prepararPanelJuego();
        botonInicio.addMouseListener(new MouseAdapter(){
        public void  mouseClicked(MouseEvent e){
            if(jugador1.getText().compareTo("Ingrese jugador 1")!=0&&jugador2.getText().compareTo("Ingrese jugador 2")!=0
               &&jugador1.getText().compareTo("")!=0&&jugador2.getText().compareTo("")!=0){
                panelInicio.setVisible(false);
               //nuevo fondo
                fondo.setIcon(new ImageIcon("src/imagenes/fondo2.jpg"));
                panelJuego.add(fondo);
                // Pongo los  nombres
                nombre1.setText("Jugador 1:   "+jugador1.getText());
                nombre2.setText("Jugador 2:   "+jugador2.getText());
                //cargamos la matriz
                inicializarMatrizJuego();
                labelTurno.setText("Es turno de "+jugador1.getText());
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length; j++) {
                       matriz[i][j].addMouseListener(new MouseAdapter() {
                           public void mouseClicked(MouseEvent e){
                               for (int k = 0; k < matriz.length; k++) {
                                   for (int l = 0; l < matriz.length; l++) {
                                       if(e.getSource()==matriz[k][l]){
                                           
                                           if(mat[k][l]==0){
                                               if(turno==1){
                                                    mat[k][l]=1;
                                                    matriz[k][l].setIcon(new ImageIcon("src/imagenes/"+mat[k][l]+".png"));
                                                    ganador(turno, jugador1.getText());
                                                    labelTurno.setText("Es turno de "+jugador2.getText());
                                                    turno=2;
                                               }else if(turno==2){
                                                    mat[k][l]=2;
                                                    matriz[k][l].setIcon(new ImageIcon("src/imagenes/"+mat[k][l]+".png"));
                                                    ganador(turno, jugador2.getText());
                                                    labelTurno.setText("Es turno de "+jugador1.getText());
                                                    turno=1;
                                               }
                                              matrizLlena();
                                           }
                                       }
                                   }    
                               }// fin k
                           }
                       });
                    }
                }
                ventana.add(panelJuego);
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese los nombres");
            }
        }});  
        ventana.add(panelInicio);
        ventana.setVisible(true);
    }
    private void prepararVentana(){
        ventana= new JFrame("Juego Tres En Raya");
        ventana.setSize(550,550);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
    }
    private void prepararPanelI(){
        panelInicio = new JPanel();
        panelInicio.setSize(ventana.getWidth(),ventana.getHeight());
        panelInicio.setLayout(null);
        panelInicio.setVisible(true);
        //fondo
        fondo= new JLabel();
        fondo.setIcon(new ImageIcon("src/imagenes/fondo.jpg"));
        fondo.setSize(ventana.getWidth(),ventana.getHeight());
        fondo.setVisible(true);
        panelInicio.add(fondo,0);
        //texto 1
        jugador1= new JTextField("Ingrese jugador 1");
        jugador1.setBounds(325,250 , 175, 30);
        jugador1.setVisible(true);
        panelInicio.add(jugador1,0);
        //texto 2
        jugador2= new JTextField("Ingrese jugador 2");
        jugador2.setBounds(325,290 , 175, 30);
        jugador2.setVisible(true);
        panelInicio.add(jugador2,0);
        //boton 
        botonInicio=new JButton("Comenzar");
        botonInicio.setBounds(400,350 , 100, 30);
        botonInicio.setVisible(true);
        botonInicio.setBackground(Color.white);
        panelInicio.add(botonInicio,0);
    }
    private void prepararPanelJuego(){
        panelJuego= new JPanel();
        panelJuego.setSize(ventana.getWidth(),ventana.getHeight());
        panelJuego.setLayout(null);
        panelJuego.setVisible(true);
        nombre1 = new JLabel();
        nombre1.setSize(300,30);
        nombre1.setLocation(10,20);
        panelJuego.add(nombre1,0);
        nombre2 = new JLabel();
        nombre2.setSize(300,30);
        nombre2.setLocation(10,50);
        panelJuego.add(nombre2,0);
        //Label turno
        labelTurno = new JLabel();
        labelTurno.setSize(350,30);
        labelTurno.setLocation(10,125);
        panelJuego.add(labelTurno,0);
        
    }
    private void inicializarMatrizJuego(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                mat[i][j]=0;
                matriz[i][j]= new JLabel();
                matriz[i][j].setIcon(new ImageIcon("src/imagenes/"+mat[i][j]+".png"));
                matriz[i][j].setBounds(125+102*i, 150+102*j, 100, 100);
                matriz[i][j].setVisible(true);
                panelJuego.add(matriz[i][j],0);
            }
        }    
    }
    private void ganador(int jugador,String nombre){
         if(mat[0][0]==jugador&&mat[1][1]==jugador&&mat[2][2]==jugador){//diagonal principal
             bandera=1;
        }else if(mat[2][0]==jugador&&mat[1][1]==jugador&&mat[0][2]==jugador){// diagonal secundaria
             bandera=1;
        }else if(mat[0][0]==jugador&&mat[0][1]==jugador&&mat[0][2]==jugador){
             bandera=1;
        }else if(mat[1][0]==jugador&&mat[1][1]==jugador&&mat[1][2]==jugador){
             bandera=1;
        }else if(mat[2][0]==jugador&&mat[2][1]==jugador&&mat[2][2]==jugador){
             bandera=1;
        }else if(mat[0][0]==jugador&&mat[1][0]==jugador&&mat[2][0]==jugador){
             bandera=1;
        }else if(mat[0][1]==jugador&&mat[1][1]==jugador&&mat[2][1]==jugador){
             bandera=1;
        }else if(mat[0][2]==jugador&&mat[1][2]==jugador&&mat[2][2]==jugador){
             bandera=1;
        }
        if(bandera==1){
            JOptionPane.showMessageDialog(ventana, "Gano el jugador: "+nombre);
            reinicio();
        } 
    }
    private void reinicio(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                mat[i][j]=0;
                matriz[i][j].setIcon(new ImageIcon("src/imagenes/0.png"));
                bandera=0;
            }
                
        }
    }
    private void matrizLlena(){
        int acumulador=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(mat[i][j]!=0)
                    acumulador++;
            }
        }
        if(acumulador==9)
            reinicio();
    }
}

