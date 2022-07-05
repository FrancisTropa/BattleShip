/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.battleship;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author L1kir
 */
public class TableroPrueba extends JFrame{

    public TableroPrueba() {
        iniciarComponentes();
        getContentPane().setBackground(Color.DARK_GRAY);
        setLocationRelativeTo(null);
        
    }
    
    private void iniciarComponentes() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        TableroPosicion panelTableroPos = new TableroPosicion();
        panelTableroPos.setBackground();
        panelTableroPos.setForeground();
        panelTableroPos.setPreferredSize();
        add(panelTableroPos);
    }
    
    public static void main(String[] args) {
        TableroPrueba tablero = new TableroPrueba();
        tablero.setVisible(true);
    }

    
    
}
