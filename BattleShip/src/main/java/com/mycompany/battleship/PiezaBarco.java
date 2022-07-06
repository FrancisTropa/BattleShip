/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.battleship;

/**
 *
 * @author L1kir
 */
public class PiezaBarco {
    private Barco barco;
    private boolean dañado;

    public PiezaBarco() {
    }

    public boolean isDañado() {
        return dañado;
    }

    public void setDañado(boolean dañado) {
        this.dañado = dañado;
    }
    
    
}
