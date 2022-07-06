/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.battleship;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Locale;
import javax.swing.JButton;

/**
 *
 * @author L1kir
 */
public class Celda extends JButton{
    private PiezaBarco pieza;
    private int x;
    private int y;

    public Celda() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void coordenarPieza(){
        String [] nombres = this.getClass().getSimpleName().split("");
        x = Integer.parseInt(nombres[1])-1;//obtiene la coordenada x dependiendo de la coordenada de los numeros en la interfaz, esta en el nombre del boton
        //dependiendo de la letra de la columna el valor de la coordenada y sera alguna de las opciones
        if (nombres[0].equalsIgnoreCase("a")) {
            y = 0;
        }else if (nombres[0].equalsIgnoreCase("b")) {
            y = 1;
        }else if (nombres[0].equalsIgnoreCase("c")) {
            y = 2;
        }else if (nombres[0].equalsIgnoreCase("d")) {
            y = 3;
        }else if (nombres[0].equalsIgnoreCase("e")) {
            y = 4;
        }else if (nombres[0].equalsIgnoreCase("f")) {
            y = 5;
        }else if (nombres[0].equalsIgnoreCase("g")) {
            y = 6;
        }else if (nombres[0].equalsIgnoreCase("h")) {
            y = 7;
        }else if (nombres[0].equalsIgnoreCase("i")) {
            y = 8;
        }else{
            y = 9;
        }
    }

    public void setPieza(PiezaBarco pieza) {
        this.pieza = pieza;
        colorearPiezaColocada();
    }

    public PiezaBarco getPieza() {
        return pieza;
    }

    public void setBackground() {
        super.setBackground(new java.awt.Color(102, 204, 255)); 
    }

    public void setPreferredSize() {
        super.setPreferredSize(new java.awt.Dimension(40,40));
    }
    
    
    //colorea la pieza que el jugador coloque en su tablero
    public void colorearPiezaColocada(){
        if (!pieza.equals(null)) {
            setBackground(new java.awt.Color(41, 213, 30));
        }
    }
    
    public void colorearDañado(){
        if (pieza.isDañado()) {
            super.setBackground(Color.red);
        }
    }
    //metodo comentado por no encontrale utilidad por el momento
//    public void colorearPieza(){
//        if(!pieza.isDañado()){
//            super.setBackground(Color.LIGHT_GRAY);
//        }
//    }
    
}
