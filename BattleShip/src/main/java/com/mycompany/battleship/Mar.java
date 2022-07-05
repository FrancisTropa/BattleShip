/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.battleship;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author L1kir
 */
public class Mar extends JPanel{
    private Image imagen;
    
    @Override
    public void paint(Graphics grafico){
        imagen = new ImageIcon(getClass().getResource("mar.png")).getImage();
        grafico.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(grafico);
    }
}
