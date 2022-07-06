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
 * @author Francisco Tropa y Jorge Cid
 */
public class Celda{
    private PiezaBarco pieza;
    private int x;
    private int y;

    public Celda() {
    }

    public Celda(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Celda(PiezaBarco pieza, int x, int y) {
        this.pieza = pieza;
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPieza(PiezaBarco pieza) {
        this.pieza = pieza;
    }

    public PiezaBarco getPieza() {
        return pieza;
    }

//    public void setBackground() {
//        super.setBackground(new java.awt.Color(102, 204, 255)); 
//    }
//
//    public void setPreferredSize() {
//        super.setPreferredSize(new java.awt.Dimension(40,40));
//    }
//    
//    
//    //colorea la pieza que el jugador coloque en su tablero
//    public void colorearPiezaColocada(){
//        if (!pieza.equals(null)) {
//            setBackground(new java.awt.Color(41, 213, 30));
//        }
//    }
//    
//    public void colorearDañado(){
//        if (pieza.isDañado()) {
//            super.setBackground(Color.red);
//        }
//    }
    //metodo comentado por no encontrale utilidad por el momento
//    public void colorearPieza(){
//        if(!pieza.isDañado()){
//            super.setBackground(Color.LIGHT_GRAY);
//        }
//    }
    
}
