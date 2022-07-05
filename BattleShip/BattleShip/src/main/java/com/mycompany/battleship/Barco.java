/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.battleship;

import java.util.Arrays;

/**
 *
 * @author L1kir
 */
public class Barco {

    private PiezaBarco[] piezas;
    private boolean BarcoHundido;

    public Barco() {
    }
    
    

    public void verificarEstado() {
        Arrays.asList(piezas).forEach(p -> {
            if (p.isDañado() == false) {
                this.BarcoHundido = false;
            }else{
                this.BarcoHundido = true;
            }
            ;});
    }
}
