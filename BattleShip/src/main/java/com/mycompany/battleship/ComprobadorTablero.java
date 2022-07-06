/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.battleship;

import java.util.ArrayList;

/**
 *
 * @author L1kir
 */
public class ComprobadorTablero {
    private ArrayList<Celda> celdas = new ArrayList<>();
    private boolean existenPiezasActivas;//si este boolean llega a ser false acaba el juego y pierde aquel que ya no tenga piezas
    public ComprobadorTablero() {
    }
    
    public void agregarCelda(Celda c){
        celdas.add(c);
    }
    //mientras una casilla posea una pieza de barco no dañada existenPiezasActivas sera verdadero, en caso contrario sera falso
    public void comprobarExistenciaBarco(){
        if ((celdas.stream().anyMatch(c->c.getPieza().isDañado()==false))) {
            existenPiezasActivas = true;
        }else{
            existenPiezasActivas = false;
        }
        
    }
    
}
