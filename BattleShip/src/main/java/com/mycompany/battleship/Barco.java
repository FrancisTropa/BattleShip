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

    public boolean isBarcoHundido() {//entrega si el barco esta hundido o no
        return BarcoHundido;
    }
    
    
    public void verificarEstado() {//verifica si el barco tien piezas funcionando, si no cambia su estado de hundido
        Arrays.asList(piezas).forEach(p -> {
            if (p.isDañado() == false) {
                this.BarcoHundido = false;
            }else{
                this.BarcoHundido = true;
            }
            ;});
    }
}
