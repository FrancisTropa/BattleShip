/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.battleship;

import java.awt.Color;
import java.util.Locale;
import javax.swing.JButton;

/**
 *
 * @author L1kir
 */
public class Celda extends JButton{
    private PiezaBarco pieza;

    public Celda() {
    }

    public PiezaBarco getPieza() {
        return pieza;
    }

    public void setBackground() {
        super.setBackground(new java.awt.Color(102, 204, 255)); 
    }
    
    public void piezaColocada(Celda c){
        if (!c.getPieza().equals(null)) {
            setBackground(new java.awt.Color(41, 213, 30));
        }
    }
}
