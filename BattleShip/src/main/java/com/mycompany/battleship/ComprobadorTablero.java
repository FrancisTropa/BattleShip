/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.battleship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author Francisco Tropa y Jorge Cid
 */
public class ComprobadorTablero {
    
    private ArrayList<Celda> celdas = new ArrayList<>();
    private boolean existenPiezasActivas;//si este boolean llega a ser false acaba el juego y pierde aquel que ya no tenga piezas

    public ComprobadorTablero() {
    }
    
    public void agregarCelda(Celda c) {
        celdas.add(c);
    }

    //mientras una casilla posea una pieza de barco no dañada existenPiezasActivas sera verdadero, en caso contrario sera falso
    public void comprobarExistenciaBarco() {
        if ((celdas.stream().allMatch(c -> c.getPieza().isDañado() == true))) {
            existenPiezasActivas = false;
        } else {
            existenPiezasActivas = true;
        }
        
    }
    
    public ArrayList<Celda> getCeldas() {
        return celdas;
    }
    
    public void setCeldas(ArrayList<Celda> celdas) {
        this.celdas = celdas;
    }

    //al comparar piezas de el ArrayList propio contra el del contrincante devuelve el ArrayList cambiando el estado de la pieza si coinciden los del otro tablero
    public void compararPiezas(ArrayList<Celda> celdasEnemigas) {
        celdasEnemigas = celdasEnemigas.stream().peek(x -> {
            if (celdas.contains(x)) {
                x.getPieza().setDañado(true);
            };
        }).collect(Collectors.toList());
    }
    
}
