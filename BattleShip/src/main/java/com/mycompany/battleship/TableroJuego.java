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
 * @author Francisco Tropa y Jorge Cid
 */
public class TableroJuego extends JFrame {

    private int piezasDibujables = 20;
    private ComprobadorTablero comprobador = new ComprobadorTablero();

    public TableroJuego() {
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
        setLocationRelativeTo(null);//posiciona la ventana al centro de la pantalla
    }

    private void initComponents() {

        TableroPosicion panelTableroPos = new TableroPosicion();
        a1 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        a5 = new javax.swing.JButton();
        a6 = new javax.swing.JButton();
        //formas en las que intente que cada boton fuera una celda
        //a7 = new Celda();
        //Celda a7 = new Celda();
        a7 = new javax.swing.JButton();
        a8 = new javax.swing.JButton();
        a9 = new javax.swing.JButton();
        a10 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        c1 = new javax.swing.JButton();
        c2 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        c4 = new javax.swing.JButton();
        c5 = new javax.swing.JButton();
        c6 = new javax.swing.JButton();
        c7 = new javax.swing.JButton();
        c8 = new javax.swing.JButton();
        c9 = new javax.swing.JButton();
        c10 = new javax.swing.JButton();
        d1 = new javax.swing.JButton();
        d2 = new javax.swing.JButton();
        d3 = new javax.swing.JButton();
        d4 = new javax.swing.JButton();
        d5 = new javax.swing.JButton();
        d6 = new javax.swing.JButton();
        d7 = new javax.swing.JButton();
        d8 = new javax.swing.JButton();
        d9 = new javax.swing.JButton();
        d10 = new javax.swing.JButton();
        e1 = new javax.swing.JButton();
        e2 = new javax.swing.JButton();
        e3 = new javax.swing.JButton();
        e4 = new javax.swing.JButton();
        e5 = new javax.swing.JButton();
        e6 = new javax.swing.JButton();
        e7 = new javax.swing.JButton();
        e8 = new javax.swing.JButton();
        e9 = new javax.swing.JButton();
        e10 = new javax.swing.JButton();
        f1 = new javax.swing.JButton();
        f2 = new javax.swing.JButton();
        f3 = new javax.swing.JButton();
        f4 = new javax.swing.JButton();
        f5 = new javax.swing.JButton();
        f6 = new javax.swing.JButton();
        f7 = new javax.swing.JButton();
        f8 = new javax.swing.JButton();
        f9 = new javax.swing.JButton();
        f10 = new javax.swing.JButton();
        g1 = new javax.swing.JButton();
        g2 = new javax.swing.JButton();
        g3 = new javax.swing.JButton();
        g4 = new javax.swing.JButton();
        g5 = new javax.swing.JButton();
        g6 = new javax.swing.JButton();
        g7 = new javax.swing.JButton();
        g8 = new javax.swing.JButton();
        g9 = new javax.swing.JButton();
        g10 = new javax.swing.JButton();
        h1 = new javax.swing.JButton();
        h2 = new javax.swing.JButton();
        h3 = new javax.swing.JButton();
        h4 = new javax.swing.JButton();
        h5 = new javax.swing.JButton();
        h6 = new javax.swing.JButton();
        h7 = new javax.swing.JButton();
        h8 = new javax.swing.JButton();
        h9 = new javax.swing.JButton();
        h10 = new javax.swing.JButton();
        j1 = new javax.swing.JButton();
        j2 = new javax.swing.JButton();
        j3 = new javax.swing.JButton();
        j4 = new javax.swing.JButton();
        j5 = new javax.swing.JButton();
        j6 = new javax.swing.JButton();
        j7 = new javax.swing.JButton();
        j8 = new javax.swing.JButton();
        j9 = new javax.swing.JButton();
        j10 = new javax.swing.JButton();
        i1 = new javax.swing.JButton();
        i2 = new javax.swing.JButton();
        i3 = new javax.swing.JButton();
        i4 = new javax.swing.JButton();
        i5 = new javax.swing.JButton();
        i6 = new javax.swing.JButton();
        i7 = new javax.swing.JButton();
        i8 = new javax.swing.JButton();
        i9 = new javax.swing.JButton();
        i10 = new javax.swing.JButton();

        tituloTableroPos = new javax.swing.JLabel();
        tituloTableroAtaq = new javax.swing.JLabel();
        TableroAtaque panelTableroAtaq = new TableroAtaque();
        k1 = new javax.swing.JButton();
        k2 = new javax.swing.JButton();
        k3 = new javax.swing.JButton();
        k4 = new javax.swing.JButton();
        k5 = new javax.swing.JButton();
        k6 = new javax.swing.JButton();
        k7 = new javax.swing.JButton();
        k8 = new javax.swing.JButton();
        k9 = new javax.swing.JButton();
        k10 = new javax.swing.JButton();
        l1 = new javax.swing.JButton();
        l2 = new javax.swing.JButton();
        l3 = new javax.swing.JButton();
        l4 = new javax.swing.JButton();
        l5 = new javax.swing.JButton();
        l6 = new javax.swing.JButton();
        l7 = new javax.swing.JButton();
        l8 = new javax.swing.JButton();
        l9 = new javax.swing.JButton();
        l10 = new javax.swing.JButton();
        m1 = new javax.swing.JButton();
        m2 = new javax.swing.JButton();
        m3 = new javax.swing.JButton();
        m4 = new javax.swing.JButton();
        m5 = new javax.swing.JButton();
        m6 = new javax.swing.JButton();
        m7 = new javax.swing.JButton();
        m8 = new javax.swing.JButton();
        m9 = new javax.swing.JButton();
        m10 = new javax.swing.JButton();
        n1 = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        n9 = new javax.swing.JButton();
        n10 = new javax.swing.JButton();
        o1 = new javax.swing.JButton();
        o2 = new javax.swing.JButton();
        o3 = new javax.swing.JButton();
        o4 = new javax.swing.JButton();
        o5 = new javax.swing.JButton();
        o6 = new javax.swing.JButton();
        o7 = new javax.swing.JButton();
        o8 = new javax.swing.JButton();
        o9 = new javax.swing.JButton();
        o10 = new javax.swing.JButton();
        p1 = new javax.swing.JButton();
        p2 = new javax.swing.JButton();
        p3 = new javax.swing.JButton();
        p4 = new javax.swing.JButton();
        p5 = new javax.swing.JButton();
        p6 = new javax.swing.JButton();
        p7 = new javax.swing.JButton();
        p8 = new javax.swing.JButton();
        p9 = new javax.swing.JButton();
        p10 = new javax.swing.JButton();
        q1 = new javax.swing.JButton();
        q2 = new javax.swing.JButton();
        q3 = new javax.swing.JButton();
        q4 = new javax.swing.JButton();
        q5 = new javax.swing.JButton();
        q6 = new javax.swing.JButton();
        q7 = new javax.swing.JButton();
        q8 = new javax.swing.JButton();
        q9 = new javax.swing.JButton();
        q10 = new javax.swing.JButton();
        r1 = new javax.swing.JButton();
        r2 = new javax.swing.JButton();
        r3 = new javax.swing.JButton();
        r4 = new javax.swing.JButton();
        r5 = new javax.swing.JButton();
        r6 = new javax.swing.JButton();
        r7 = new javax.swing.JButton();
        r8 = new javax.swing.JButton();
        r9 = new javax.swing.JButton();
        r10 = new javax.swing.JButton();
        s1 = new javax.swing.JButton();
        s2 = new javax.swing.JButton();
        s3 = new javax.swing.JButton();
        s4 = new javax.swing.JButton();
        s5 = new javax.swing.JButton();
        s6 = new javax.swing.JButton();
        s7 = new javax.swing.JButton();
        s8 = new javax.swing.JButton();
        s9 = new javax.swing.JButton();
        s10 = new javax.swing.JButton();
        t1 = new javax.swing.JButton();
        t2 = new javax.swing.JButton();
        t3 = new javax.swing.JButton();
        t4 = new javax.swing.JButton();
        t5 = new javax.swing.JButton();
        t6 = new javax.swing.JButton();
        t7 = new javax.swing.JButton();
        t8 = new javax.swing.JButton();
        t9 = new javax.swing.JButton();
        t10 = new javax.swing.JButton();
        filaPos1 = new javax.swing.JLabel();
        filaPos2 = new javax.swing.JLabel();
        filaPos3 = new javax.swing.JLabel();
        filaPos4 = new javax.swing.JLabel();
        filaPos5 = new javax.swing.JLabel();
        filaPos6 = new javax.swing.JLabel();
        filaPos7 = new javax.swing.JLabel();
        filaPos8 = new javax.swing.JLabel();
        filaPos9 = new javax.swing.JLabel();
        filaPos10 = new javax.swing.JLabel();
        filaAtaq1 = new javax.swing.JLabel();
        filaAtaq2 = new javax.swing.JLabel();
        filaAtaq3 = new javax.swing.JLabel();
        filaAtaq4 = new javax.swing.JLabel();
        filaAtaq5 = new javax.swing.JLabel();
        filaAtaq6 = new javax.swing.JLabel();
        filaAtaq7 = new javax.swing.JLabel();
        filaAtaq8 = new javax.swing.JLabel();
        filaAtaq9 = new javax.swing.JLabel();
        filaAtaq10 = new javax.swing.JLabel();
        columnaA = new javax.swing.JLabel();
        columnaB = new javax.swing.JLabel();
        columnaC = new javax.swing.JLabel();
        columnaD = new javax.swing.JLabel();
        columnaE = new javax.swing.JLabel();
        columnaF = new javax.swing.JLabel();
        columnaG = new javax.swing.JLabel();
        columnaH = new javax.swing.JLabel();
        columnaI = new javax.swing.JLabel();
        columnaJ = new javax.swing.JLabel();
        columnaK = new javax.swing.JLabel();
        columnaL = new javax.swing.JLabel();
        columnaM = new javax.swing.JLabel();
        coumnaN = new javax.swing.JLabel();
        columnaO = new javax.swing.JLabel();
        columnaP = new javax.swing.JLabel();
        columnaQ = new javax.swing.JLabel();
        columnaR = new javax.swing.JLabel();
        columnaS = new javax.swing.JLabel();
        columnaT = new javax.swing.JLabel();
        MostrarPiezasBarco = new javax.swing.JLabel();
        MostrarPiezasBarco.setText(String.valueOf(piezasDibujables));
        TituloPiezas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTableroPos.setBackground();
        panelTableroPos.setForeground();
        panelTableroPos.setPreferredSize();

        a1.setBackground(new java.awt.Color(51, 92, 255));
        a1.setPreferredSize(new java.awt.Dimension(40, 40));
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        a2.setBackground(new java.awt.Color(51, 92, 255));
        a2.setPreferredSize(new java.awt.Dimension(40, 40));
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        a3.setBackground(new java.awt.Color(51, 92, 255));
        a3.setPreferredSize(new java.awt.Dimension(40, 40));
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        a4.setBackground(new java.awt.Color(51, 92, 255));
        a4.setPreferredSize(new java.awt.Dimension(40, 40));
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });

        a5.setBackground(new java.awt.Color(51, 92, 255));
        a5.setPreferredSize(new java.awt.Dimension(40, 40));
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });

        a6.setBackground(new java.awt.Color(51, 92, 255));
        a6.setPreferredSize(new java.awt.Dimension(40, 40));
        a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ActionPerformed(evt);
            }
        });

        a7.setBackground(new java.awt.Color(51, 92, 255));
        a7.setPreferredSize(new java.awt.Dimension(40, 40));
        a7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a7ActionPerformed(evt);
            }
        });

        a8.setBackground(new java.awt.Color(51, 92, 255));
        a8.setPreferredSize(new java.awt.Dimension(40, 40));
        a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ActionPerformed(evt);
            }
        });

        a9.setBackground(new java.awt.Color(51, 92, 255));
        a9.setPreferredSize(new java.awt.Dimension(40, 40));
        a9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a9ActionPerformed(evt);
            }
        });

        a10.setBackground(new java.awt.Color(51, 92, 255));
        a10.setPreferredSize(new java.awt.Dimension(40, 40));
        a10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a10ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(51, 92, 255));
        b1.setPreferredSize(new java.awt.Dimension(40, 40));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        c1.setBackground(new java.awt.Color(51, 92, 255));
        c1.setPreferredSize(new java.awt.Dimension(40, 40));

        d1.setBackground(new java.awt.Color(51, 92, 255));
        d1.setPreferredSize(new java.awt.Dimension(40, 40));

        e1.setBackground(new java.awt.Color(51, 92, 255));
        e1.setPreferredSize(new java.awt.Dimension(40, 40));

        g1.setBackground(new java.awt.Color(51, 92, 255));
        g1.setPreferredSize(new java.awt.Dimension(40, 40));

        f1.setBackground(new java.awt.Color(51, 92, 255));
        f1.setPreferredSize(new java.awt.Dimension(40, 40));

        h1.setBackground(new java.awt.Color(51, 92, 255));
        h1.setPreferredSize(new java.awt.Dimension(40, 40));

        i1.setBackground(new java.awt.Color(51, 92, 255));
        i1.setPreferredSize(new java.awt.Dimension(40, 40));

        j1.setBackground(new java.awt.Color(51, 92, 255));
        j1.setPreferredSize(new java.awt.Dimension(40, 40));

        b3.setBackground(new java.awt.Color(51, 92, 255));
        b3.setPreferredSize(new java.awt.Dimension(40, 40));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(51, 92, 255));
        b2.setPreferredSize(new java.awt.Dimension(40, 40));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(51, 92, 255));
        b4.setPreferredSize(new java.awt.Dimension(40, 40));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(51, 92, 255));
        b5.setPreferredSize(new java.awt.Dimension(40, 40));

        b6.setBackground(new java.awt.Color(51, 92, 255));
        b6.setPreferredSize(new java.awt.Dimension(40, 40));

        b7.setBackground(new java.awt.Color(51, 92, 255));
        b7.setPreferredSize(new java.awt.Dimension(40, 40));

        b8.setBackground(new java.awt.Color(51, 92, 255));
        b8.setPreferredSize(new java.awt.Dimension(40, 40));

        b9.setBackground(new java.awt.Color(51, 92, 255));
        b9.setPreferredSize(new java.awt.Dimension(40, 40));

        b10.setBackground(new java.awt.Color(51, 92, 255));
        b10.setPreferredSize(new java.awt.Dimension(40, 40));

        c2.setBackground(new java.awt.Color(51, 92, 255));
        c2.setPreferredSize(new java.awt.Dimension(40, 40));

        d2.setBackground(new java.awt.Color(51, 92, 255));
        d2.setPreferredSize(new java.awt.Dimension(40, 40));

        e2.setBackground(new java.awt.Color(51, 92, 255));
        e2.setPreferredSize(new java.awt.Dimension(40, 40));

        f2.setBackground(new java.awt.Color(51, 92, 255));
        f2.setPreferredSize(new java.awt.Dimension(40, 40));

        g2.setBackground(new java.awt.Color(51, 92, 255));
        g2.setPreferredSize(new java.awt.Dimension(40, 40));

        h2.setBackground(new java.awt.Color(51, 92, 255));
        h2.setPreferredSize(new java.awt.Dimension(40, 40));

        i2.setBackground(new java.awt.Color(51, 92, 255));
        i2.setPreferredSize(new java.awt.Dimension(40, 40));

        j2.setBackground(new java.awt.Color(51, 92, 255));
        j2.setPreferredSize(new java.awt.Dimension(40, 40));

        c3.setBackground(new java.awt.Color(51, 92, 255));
        c3.setPreferredSize(new java.awt.Dimension(40, 40));

        c4.setBackground(new java.awt.Color(51, 92, 255));
        c4.setPreferredSize(new java.awt.Dimension(40, 40));

        c5.setBackground(new java.awt.Color(51, 92, 255));
        c5.setPreferredSize(new java.awt.Dimension(40, 40));

        c6.setBackground(new java.awt.Color(51, 92, 255));
        c6.setPreferredSize(new java.awt.Dimension(40, 40));

        c7.setBackground(new java.awt.Color(51, 92, 255));
        c7.setPreferredSize(new java.awt.Dimension(40, 40));

        c8.setBackground(new java.awt.Color(51, 92, 255));
        c8.setPreferredSize(new java.awt.Dimension(40, 40));

        c9.setBackground(new java.awt.Color(51, 92, 255));
        c9.setPreferredSize(new java.awt.Dimension(40, 40));

        c10.setBackground(new java.awt.Color(51, 92, 255));
        c10.setPreferredSize(new java.awt.Dimension(40, 40));

        d3.setBackground(new java.awt.Color(51, 92, 255));
        d3.setPreferredSize(new java.awt.Dimension(40, 40));

        d4.setBackground(new java.awt.Color(51, 92, 255));
        d4.setPreferredSize(new java.awt.Dimension(40, 40));

        d5.setBackground(new java.awt.Color(51, 92, 255));
        d5.setPreferredSize(new java.awt.Dimension(40, 40));

        d6.setBackground(new java.awt.Color(51, 92, 255));
        d6.setPreferredSize(new java.awt.Dimension(40, 40));

        d7.setBackground(new java.awt.Color(51, 92, 255));
        d7.setPreferredSize(new java.awt.Dimension(40, 40));

        d8.setBackground(new java.awt.Color(51, 92, 255));
        d8.setPreferredSize(new java.awt.Dimension(40, 40));

        d9.setBackground(new java.awt.Color(51, 92, 255));
        d9.setPreferredSize(new java.awt.Dimension(40, 40));

        d10.setBackground(new java.awt.Color(51, 92, 255));
        d10.setPreferredSize(new java.awt.Dimension(40, 40));

        e3.setBackground(new java.awt.Color(51, 92, 255));
        e3.setPreferredSize(new java.awt.Dimension(40, 40));

        e4.setBackground(new java.awt.Color(51, 92, 255));
        e4.setPreferredSize(new java.awt.Dimension(40, 40));

        e5.setBackground(new java.awt.Color(51, 92, 255));
        e5.setPreferredSize(new java.awt.Dimension(40, 40));

        e6.setBackground(new java.awt.Color(51, 92, 255));
        e6.setPreferredSize(new java.awt.Dimension(40, 40));

        e7.setBackground(new java.awt.Color(51, 92, 255));
        e7.setPreferredSize(new java.awt.Dimension(40, 40));

        e8.setBackground(new java.awt.Color(51, 92, 255));
        e8.setPreferredSize(new java.awt.Dimension(40, 40));

        e9.setBackground(new java.awt.Color(51, 92, 255));
        e9.setPreferredSize(new java.awt.Dimension(40, 40));

        e10.setBackground(new java.awt.Color(51, 92, 255));
        e10.setPreferredSize(new java.awt.Dimension(40, 40));

        f3.setBackground(new java.awt.Color(51, 92, 255));
        f3.setPreferredSize(new java.awt.Dimension(40, 40));

        f4.setBackground(new java.awt.Color(51, 92, 255));
        f4.setPreferredSize(new java.awt.Dimension(40, 40));

        f5.setBackground(new java.awt.Color(51, 92, 255));
        f5.setPreferredSize(new java.awt.Dimension(40, 40));

        f6.setBackground(new java.awt.Color(51, 92, 255));
        f6.setPreferredSize(new java.awt.Dimension(40, 40));

        f7.setBackground(new java.awt.Color(51, 92, 255));
        f7.setPreferredSize(new java.awt.Dimension(40, 40));

        f8.setBackground(new java.awt.Color(51, 92, 255));
        f8.setPreferredSize(new java.awt.Dimension(40, 40));

        f9.setBackground(new java.awt.Color(51, 92, 255));
        f9.setPreferredSize(new java.awt.Dimension(40, 40));

        f10.setBackground(new java.awt.Color(51, 92, 255));
        f10.setPreferredSize(new java.awt.Dimension(40, 40));

        g3.setBackground(new java.awt.Color(51, 92, 255));
        g3.setPreferredSize(new java.awt.Dimension(40, 40));

        g4.setBackground(new java.awt.Color(51, 92, 255));
        g4.setPreferredSize(new java.awt.Dimension(40, 40));

        g5.setBackground(new java.awt.Color(51, 92, 255));
        g5.setPreferredSize(new java.awt.Dimension(40, 40));

        g6.setBackground(new java.awt.Color(51, 92, 255));
        g6.setPreferredSize(new java.awt.Dimension(40, 40));

        g7.setBackground(new java.awt.Color(51, 92, 255));
        g7.setPreferredSize(new java.awt.Dimension(40, 40));

        g8.setBackground(new java.awt.Color(51, 92, 255));
        g8.setPreferredSize(new java.awt.Dimension(40, 40));

        g9.setBackground(new java.awt.Color(51, 92, 255));
        g9.setPreferredSize(new java.awt.Dimension(40, 40));

        g10.setBackground(new java.awt.Color(51, 92, 255));
        g10.setPreferredSize(new java.awt.Dimension(40, 40));

        h3.setBackground(new java.awt.Color(51, 92, 255));
        h3.setPreferredSize(new java.awt.Dimension(40, 40));

        h4.setBackground(new java.awt.Color(51, 92, 255));
        h4.setPreferredSize(new java.awt.Dimension(40, 40));

        h5.setBackground(new java.awt.Color(51, 92, 255));
        h5.setPreferredSize(new java.awt.Dimension(40, 40));

        h6.setBackground(new java.awt.Color(51, 92, 255));
        h6.setPreferredSize(new java.awt.Dimension(40, 40));

        h7.setBackground(new java.awt.Color(51, 92, 255));
        h7.setPreferredSize(new java.awt.Dimension(40, 40));

        h8.setBackground(new java.awt.Color(51, 92, 255));
        h8.setPreferredSize(new java.awt.Dimension(40, 40));

        h9.setBackground(new java.awt.Color(51, 92, 255));
        h9.setPreferredSize(new java.awt.Dimension(40, 40));

        h10.setBackground(new java.awt.Color(51, 92, 255));
        h10.setPreferredSize(new java.awt.Dimension(40, 40));

        i3.setBackground(new java.awt.Color(51, 92, 255));
        i3.setPreferredSize(new java.awt.Dimension(40, 40));

        i4.setBackground(new java.awt.Color(51, 92, 255));
        i4.setPreferredSize(new java.awt.Dimension(40, 40));

        i5.setBackground(new java.awt.Color(51, 92, 255));
        i5.setPreferredSize(new java.awt.Dimension(40, 40));

        i6.setBackground(new java.awt.Color(51, 92, 255));
        i6.setPreferredSize(new java.awt.Dimension(40, 40));

        i7.setBackground(new java.awt.Color(51, 92, 255));
        i7.setPreferredSize(new java.awt.Dimension(40, 40));

        i8.setBackground(new java.awt.Color(51, 92, 255));
        i8.setPreferredSize(new java.awt.Dimension(40, 40));

        i9.setBackground(new java.awt.Color(51, 92, 255));
        i9.setPreferredSize(new java.awt.Dimension(40, 40));

        i10.setBackground(new java.awt.Color(51, 92, 255));
        i10.setPreferredSize(new java.awt.Dimension(40, 40));

        j3.setBackground(new java.awt.Color(51, 92, 255));
        j3.setPreferredSize(new java.awt.Dimension(40, 40));

        j4.setBackground(new java.awt.Color(51, 92, 255));
        j4.setPreferredSize(new java.awt.Dimension(40, 40));

        j5.setBackground(new java.awt.Color(51, 92, 255));
        j5.setPreferredSize(new java.awt.Dimension(40, 40));

        j6.setBackground(new java.awt.Color(51, 92, 255));
        j6.setPreferredSize(new java.awt.Dimension(40, 40));

        j7.setBackground(new java.awt.Color(51, 92, 255));
        j7.setPreferredSize(new java.awt.Dimension(40, 40));

        j8.setBackground(new java.awt.Color(51, 92, 255));
        j8.setPreferredSize(new java.awt.Dimension(40, 40));

        j9.setBackground(new java.awt.Color(51, 92, 255));
        j9.setPreferredSize(new java.awt.Dimension(40, 40));

        j10.setBackground(new java.awt.Color(51, 92, 255));
        j10.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout panelTableroPosLayout = new javax.swing.GroupLayout(panelTableroPos);
        panelTableroPos.setLayout(panelTableroPosLayout);
        panelTableroPosLayout.setHorizontalGroup(
                panelTableroPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTableroPosLayout.createSequentialGroup()
                                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTableroPosLayout.createSequentialGroup()
                                .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(g5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(h5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTableroPosLayout.createSequentialGroup()
                                .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(g6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(h6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTableroPosLayout.createSequentialGroup()
                                .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(g7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(h7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTableroPosLayout.createSequentialGroup()
                                .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(g8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(h8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTableroPosLayout.createSequentialGroup()
                                .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(g9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(h9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTableroPosLayout.createSequentialGroup()
                                .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(g10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(h10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTableroPosLayout.createSequentialGroup()
                                .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(h2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTableroPosLayout.createSequentialGroup()
                                .addGroup(panelTableroPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelTableroPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelTableroPosLayout.createSequentialGroup()
                                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(h3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(i3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelTableroPosLayout.createSequentialGroup()
                                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(e4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(g4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(h4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(i4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelTableroPosLayout.setVerticalGroup(
                panelTableroPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTableroPosLayout.createSequentialGroup()
                                .addGroup(panelTableroPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelTableroPosLayout.createSequentialGroup()
                                                .addGroup(panelTableroPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(i1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelTableroPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(h2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(i2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelTableroPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(h3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(i3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelTableroPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(e4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(g4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(h4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(i4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelTableroPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(d5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(e5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(g5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(h5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(i5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelTableroPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(d6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(e6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(g6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(h6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(i6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelTableroPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(d7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(e7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(f7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(g7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(h7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(i7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelTableroPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(panelTableroPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(c8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(d8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(e8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(f8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(g8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(h8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(i8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelTableroPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(d9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(e9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(f9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(g9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(h9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(i9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(j9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelTableroPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(d10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(e10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(f10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(g10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(h10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(i10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(j10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        a1.getAccessibleContext().setAccessibleName("a1");

        tituloTableroPos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tituloTableroPos.setForeground(new java.awt.Color(245, 235, 181));
        tituloTableroPos.setText("Tablero de Posicionamiento");

        tituloTableroAtaq.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tituloTableroAtaq.setForeground(new java.awt.Color(245, 235, 181));
        tituloTableroAtaq.setText("Tablero de Ataque");

        panelTableroAtaq.setBackground();
        panelTableroAtaq.setForeground();
        panelTableroAtaq.setPreferredSize();

        k1.setBackground(new java.awt.Color(51, 92, 255));
        k1.setPreferredSize(new java.awt.Dimension(40, 40));
        k1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k1ActionPerformed(evt);
            }
        });

        k2.setBackground(new java.awt.Color(51, 92, 255));
        k2.setPreferredSize(new java.awt.Dimension(40, 40));

        k3.setBackground(new java.awt.Color(51, 92, 255));
        k3.setPreferredSize(new java.awt.Dimension(40, 40));

        k4.setBackground(new java.awt.Color(51, 92, 255));
        k4.setPreferredSize(new java.awt.Dimension(40, 40));

        k5.setBackground(new java.awt.Color(51, 92, 255));
        k5.setPreferredSize(new java.awt.Dimension(40, 40));

        k6.setBackground(new java.awt.Color(51, 92, 255));
        k6.setPreferredSize(new java.awt.Dimension(40, 40));

        k7.setBackground(new java.awt.Color(51, 92, 255));
        k7.setPreferredSize(new java.awt.Dimension(40, 40));

        k8.setBackground(new java.awt.Color(51, 92, 255));
        k8.setPreferredSize(new java.awt.Dimension(40, 40));

        k9.setBackground(new java.awt.Color(51, 92, 255));
        k9.setPreferredSize(new java.awt.Dimension(40, 40));

        k10.setBackground(new java.awt.Color(51, 92, 255));
        k10.setPreferredSize(new java.awt.Dimension(40, 40));

        l1.setBackground(new java.awt.Color(51, 92, 255));
        l1.setPreferredSize(new java.awt.Dimension(40, 40));

        m1.setBackground(new java.awt.Color(51, 92, 255));
        m1.setPreferredSize(new java.awt.Dimension(40, 40));

        n1.setBackground(new java.awt.Color(51, 92, 255));
        n1.setPreferredSize(new java.awt.Dimension(40, 40));

        o1.setBackground(new java.awt.Color(51, 92, 255));
        o1.setPreferredSize(new java.awt.Dimension(40, 40));

        q1.setBackground(new java.awt.Color(51, 92, 255));
        q1.setPreferredSize(new java.awt.Dimension(40, 40));

        p1.setBackground(new java.awt.Color(51, 92, 255));
        p1.setPreferredSize(new java.awt.Dimension(40, 40));

        r1.setBackground(new java.awt.Color(51, 92, 255));
        r1.setPreferredSize(new java.awt.Dimension(40, 40));

        s1.setBackground(new java.awt.Color(51, 92, 255));
        s1.setPreferredSize(new java.awt.Dimension(40, 40));

        t1.setBackground(new java.awt.Color(51, 92, 255));
        t1.setPreferredSize(new java.awt.Dimension(40, 40));

        l3.setBackground(new java.awt.Color(51, 92, 255));
        l3.setPreferredSize(new java.awt.Dimension(40, 40));

        l2.setBackground(new java.awt.Color(51, 92, 255));
        l2.setPreferredSize(new java.awt.Dimension(40, 40));

        l4.setBackground(new java.awt.Color(51, 92, 255));
        l4.setPreferredSize(new java.awt.Dimension(40, 40));

        l5.setBackground(new java.awt.Color(51, 92, 255));
        l5.setPreferredSize(new java.awt.Dimension(40, 40));

        l6.setBackground(new java.awt.Color(51, 92, 255));
        l6.setPreferredSize(new java.awt.Dimension(40, 40));

        l7.setBackground(new java.awt.Color(51, 92, 255));
        l7.setPreferredSize(new java.awt.Dimension(40, 40));

        l8.setBackground(new java.awt.Color(51, 92, 255));
        l8.setPreferredSize(new java.awt.Dimension(40, 40));

        l9.setBackground(new java.awt.Color(51, 92, 255));
        l9.setPreferredSize(new java.awt.Dimension(40, 40));

        l10.setBackground(new java.awt.Color(51, 92, 255));
        l10.setPreferredSize(new java.awt.Dimension(40, 40));

        m2.setBackground(new java.awt.Color(51, 92, 255));
        m2.setPreferredSize(new java.awt.Dimension(40, 40));

        n2.setBackground(new java.awt.Color(51, 92, 255));
        n2.setPreferredSize(new java.awt.Dimension(40, 40));

        o2.setBackground(new java.awt.Color(51, 92, 255));
        o2.setPreferredSize(new java.awt.Dimension(40, 40));

        p2.setBackground(new java.awt.Color(51, 92, 255));
        p2.setPreferredSize(new java.awt.Dimension(40, 40));

        q2.setBackground(new java.awt.Color(51, 92, 255));
        q2.setPreferredSize(new java.awt.Dimension(40, 40));

        r2.setBackground(new java.awt.Color(51, 92, 255));
        r2.setPreferredSize(new java.awt.Dimension(40, 40));

        s2.setBackground(new java.awt.Color(51, 92, 255));
        s2.setPreferredSize(new java.awt.Dimension(40, 40));

        t2.setBackground(new java.awt.Color(51, 92, 255));
        t2.setPreferredSize(new java.awt.Dimension(40, 40));

        m3.setBackground(new java.awt.Color(51, 92, 255));
        m3.setPreferredSize(new java.awt.Dimension(40, 40));

        m4.setBackground(new java.awt.Color(51, 92, 255));
        m4.setPreferredSize(new java.awt.Dimension(40, 40));

        m5.setBackground(new java.awt.Color(51, 92, 255));
        m5.setPreferredSize(new java.awt.Dimension(40, 40));

        m6.setBackground(new java.awt.Color(51, 92, 255));
        m6.setPreferredSize(new java.awt.Dimension(40, 40));

        m7.setBackground(new java.awt.Color(51, 92, 255));
        m7.setPreferredSize(new java.awt.Dimension(40, 40));

        m8.setBackground(new java.awt.Color(51, 92, 255));
        m8.setPreferredSize(new java.awt.Dimension(40, 40));

        m9.setBackground(new java.awt.Color(51, 92, 255));
        m9.setPreferredSize(new java.awt.Dimension(40, 40));

        m10.setBackground(new java.awt.Color(51, 92, 255));
        m10.setPreferredSize(new java.awt.Dimension(40, 40));

        n3.setBackground(new java.awt.Color(51, 92, 255));
        n3.setPreferredSize(new java.awt.Dimension(40, 40));

        n4.setBackground(new java.awt.Color(51, 92, 255));
        n4.setPreferredSize(new java.awt.Dimension(40, 40));

        n5.setBackground(new java.awt.Color(51, 92, 255));
        n5.setPreferredSize(new java.awt.Dimension(40, 40));

        n6.setBackground(new java.awt.Color(51, 92, 255));
        n6.setPreferredSize(new java.awt.Dimension(40, 40));

        n7.setBackground(new java.awt.Color(51, 92, 255));
        n7.setPreferredSize(new java.awt.Dimension(40, 40));

        n8.setBackground(new java.awt.Color(51, 92, 255));
        n8.setPreferredSize(new java.awt.Dimension(40, 40));

        n9.setBackground(new java.awt.Color(51, 92, 255));
        n9.setPreferredSize(new java.awt.Dimension(40, 40));

        n10.setBackground(new java.awt.Color(51, 92, 255));
        n10.setPreferredSize(new java.awt.Dimension(40, 40));

        o3.setBackground(new java.awt.Color(51, 92, 255));
        o3.setPreferredSize(new java.awt.Dimension(40, 40));

        o4.setBackground(new java.awt.Color(51, 92, 255));
        o4.setPreferredSize(new java.awt.Dimension(40, 40));

        o5.setBackground(new java.awt.Color(51, 92, 255));
        o5.setPreferredSize(new java.awt.Dimension(40, 40));

        o6.setBackground(new java.awt.Color(51, 92, 255));
        o6.setPreferredSize(new java.awt.Dimension(40, 40));

        o7.setBackground(new java.awt.Color(51, 92, 255));
        o7.setPreferredSize(new java.awt.Dimension(40, 40));

        o8.setBackground(new java.awt.Color(51, 92, 255));
        o8.setPreferredSize(new java.awt.Dimension(40, 40));

        o9.setBackground(new java.awt.Color(51, 92, 255));
        o9.setPreferredSize(new java.awt.Dimension(40, 40));

        o10.setBackground(new java.awt.Color(51, 92, 255));
        o10.setPreferredSize(new java.awt.Dimension(40, 40));

        p3.setBackground(new java.awt.Color(51, 92, 255));
        p3.setPreferredSize(new java.awt.Dimension(40, 40));

        p4.setBackground(new java.awt.Color(51, 92, 255));
        p4.setPreferredSize(new java.awt.Dimension(40, 40));

        p5.setBackground(new java.awt.Color(51, 92, 255));
        p5.setPreferredSize(new java.awt.Dimension(40, 40));

        p6.setBackground(new java.awt.Color(51, 92, 255));
        p6.setPreferredSize(new java.awt.Dimension(40, 40));

        p7.setBackground(new java.awt.Color(51, 92, 255));
        p7.setPreferredSize(new java.awt.Dimension(40, 40));

        p8.setBackground(new java.awt.Color(51, 92, 255));
        p8.setPreferredSize(new java.awt.Dimension(40, 40));

        p9.setBackground(new java.awt.Color(51, 92, 255));
        p9.setPreferredSize(new java.awt.Dimension(40, 40));

        p10.setBackground(new java.awt.Color(51, 92, 255));
        p10.setPreferredSize(new java.awt.Dimension(40, 40));

        q3.setBackground(new java.awt.Color(51, 92, 255));
        q3.setPreferredSize(new java.awt.Dimension(40, 40));

        q4.setBackground(new java.awt.Color(51, 92, 255));
        q4.setPreferredSize(new java.awt.Dimension(40, 40));

        q5.setBackground(new java.awt.Color(51, 92, 255));
        q5.setPreferredSize(new java.awt.Dimension(40, 40));

        q6.setBackground(new java.awt.Color(51, 92, 255));
        q6.setPreferredSize(new java.awt.Dimension(40, 40));

        q7.setBackground(new java.awt.Color(51, 92, 255));
        q7.setPreferredSize(new java.awt.Dimension(40, 40));

        q8.setBackground(new java.awt.Color(51, 92, 255));
        q8.setPreferredSize(new java.awt.Dimension(40, 40));

        q9.setBackground(new java.awt.Color(51, 92, 255));
        q9.setPreferredSize(new java.awt.Dimension(40, 40));

        q10.setBackground(new java.awt.Color(51, 92, 255));
        q10.setPreferredSize(new java.awt.Dimension(40, 40));

        r3.setBackground(new java.awt.Color(51, 92, 255));
        r3.setPreferredSize(new java.awt.Dimension(40, 40));

        r4.setBackground(new java.awt.Color(51, 92, 255));
        r4.setPreferredSize(new java.awt.Dimension(40, 40));

        r5.setBackground(new java.awt.Color(51, 92, 255));
        r5.setPreferredSize(new java.awt.Dimension(40, 40));

        r6.setBackground(new java.awt.Color(51, 92, 255));
        r6.setPreferredSize(new java.awt.Dimension(40, 40));

        r7.setBackground(new java.awt.Color(51, 92, 255));
        r7.setPreferredSize(new java.awt.Dimension(40, 40));

        r8.setBackground(new java.awt.Color(51, 92, 255));
        r8.setPreferredSize(new java.awt.Dimension(40, 40));

        r9.setBackground(new java.awt.Color(51, 92, 255));
        r9.setPreferredSize(new java.awt.Dimension(40, 40));

        r10.setBackground(new java.awt.Color(51, 92, 255));
        r10.setPreferredSize(new java.awt.Dimension(40, 40));

        s3.setBackground(new java.awt.Color(51, 92, 255));
        s3.setPreferredSize(new java.awt.Dimension(40, 40));

        s4.setBackground(new java.awt.Color(51, 92, 255));
        s4.setPreferredSize(new java.awt.Dimension(40, 40));

        s5.setBackground(new java.awt.Color(51, 92, 255));
        s5.setPreferredSize(new java.awt.Dimension(40, 40));

        s6.setBackground(new java.awt.Color(51, 92, 255));
        s6.setPreferredSize(new java.awt.Dimension(40, 40));

        s7.setBackground(new java.awt.Color(51, 92, 255));
        s7.setPreferredSize(new java.awt.Dimension(40, 40));

        s8.setBackground(new java.awt.Color(51, 92, 255));
        s8.setPreferredSize(new java.awt.Dimension(40, 40));

        s9.setBackground(new java.awt.Color(51, 92, 255));
        s9.setPreferredSize(new java.awt.Dimension(40, 40));

        s10.setBackground(new java.awt.Color(51, 92, 255));
        s10.setPreferredSize(new java.awt.Dimension(40, 40));

        t3.setBackground(new java.awt.Color(51, 92, 255));
        t3.setPreferredSize(new java.awt.Dimension(40, 40));

        t4.setBackground(new java.awt.Color(51, 92, 255));
        t4.setPreferredSize(new java.awt.Dimension(40, 40));

        t5.setBackground(new java.awt.Color(51, 92, 255));
        t5.setPreferredSize(new java.awt.Dimension(40, 40));

        t6.setBackground(new java.awt.Color(51, 92, 255));
        t6.setPreferredSize(new java.awt.Dimension(40, 40));

        t7.setBackground(new java.awt.Color(51, 92, 255));
        t7.setPreferredSize(new java.awt.Dimension(40, 40));

        t8.setBackground(new java.awt.Color(51, 92, 255));
        t8.setPreferredSize(new java.awt.Dimension(40, 40));

        t9.setBackground(new java.awt.Color(51, 92, 255));
        t9.setPreferredSize(new java.awt.Dimension(40, 40));

        t10.setBackground(new java.awt.Color(51, 92, 255));
        t10.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout panelTableroAtaqLayout = new javax.swing.GroupLayout(panelTableroAtaq);
        panelTableroAtaq.setLayout(panelTableroAtaqLayout);
        panelTableroAtaqLayout.setHorizontalGroup(
                panelTableroAtaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTableroAtaqLayout.createSequentialGroup()
                                .addComponent(k1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTableroAtaqLayout.createSequentialGroup()
                                .addComponent(k5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTableroAtaqLayout.createSequentialGroup()
                                .addComponent(k6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTableroAtaqLayout.createSequentialGroup()
                                .addComponent(k7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTableroAtaqLayout.createSequentialGroup()
                                .addComponent(k8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTableroAtaqLayout.createSequentialGroup()
                                .addComponent(k9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTableroAtaqLayout.createSequentialGroup()
                                .addComponent(k10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTableroAtaqLayout.createSequentialGroup()
                                .addComponent(k2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTableroAtaqLayout.createSequentialGroup()
                                .addGroup(panelTableroAtaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(k3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(k4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelTableroAtaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelTableroAtaqLayout.createSequentialGroup()
                                                .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(o3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelTableroAtaqLayout.createSequentialGroup()
                                                .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(o4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelTableroAtaqLayout.setVerticalGroup(
                panelTableroAtaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTableroAtaqLayout.createSequentialGroup()
                                .addGroup(panelTableroAtaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelTableroAtaqLayout.createSequentialGroup()
                                                .addGroup(panelTableroAtaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(k1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(o1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelTableroAtaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(k2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(o2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelTableroAtaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(k3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(o3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelTableroAtaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(k4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(o4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelTableroAtaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(k5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(o5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelTableroAtaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(k6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(o6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(r6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelTableroAtaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(k7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(o7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(r7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(s7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelTableroAtaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(panelTableroAtaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(k8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(m8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(o8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(q8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(r8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(s8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelTableroAtaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(k9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(m9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(o9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(q9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(r9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(s9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelTableroAtaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(k10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(m10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(n10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(o10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(q10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(r10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(s10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        filaPos1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaPos1.setForeground(new java.awt.Color(255, 255, 255));
        filaPos1.setText("1");

        filaPos2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaPos2.setForeground(new java.awt.Color(255, 255, 255));
        filaPos2.setText("2");

        filaPos3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaPos3.setForeground(new java.awt.Color(255, 255, 255));
        filaPos3.setText("3");

        filaPos4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaPos4.setForeground(new java.awt.Color(255, 255, 255));
        filaPos4.setText("4");

        filaPos5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaPos5.setForeground(new java.awt.Color(255, 255, 255));
        filaPos5.setText("5");

        filaPos6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaPos6.setForeground(new java.awt.Color(255, 255, 255));
        filaPos6.setText("6");

        filaPos7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaPos7.setForeground(new java.awt.Color(255, 255, 255));
        filaPos7.setText("7");

        filaPos8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaPos8.setForeground(new java.awt.Color(255, 255, 255));
        filaPos8.setText("8");

        filaPos9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaPos9.setForeground(new java.awt.Color(255, 255, 255));
        filaPos9.setText("9");

        filaPos10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaPos10.setForeground(new java.awt.Color(255, 255, 255));
        filaPos10.setText("10");

        filaAtaq1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaAtaq1.setForeground(new java.awt.Color(255, 255, 255));
        filaAtaq1.setText("1");

        filaAtaq2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaAtaq2.setForeground(new java.awt.Color(255, 255, 255));
        filaAtaq2.setText("2");

        filaAtaq3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaAtaq3.setForeground(new java.awt.Color(255, 255, 255));
        filaAtaq3.setText("3");

        filaAtaq4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaAtaq4.setForeground(new java.awt.Color(255, 255, 255));
        filaAtaq4.setText("4");

        filaAtaq5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaAtaq5.setForeground(new java.awt.Color(255, 255, 255));
        filaAtaq5.setText("5");

        filaAtaq6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaAtaq6.setForeground(new java.awt.Color(255, 255, 255));
        filaAtaq6.setText("6");

        filaAtaq7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaAtaq7.setForeground(new java.awt.Color(255, 255, 255));
        filaAtaq7.setText("7");

        filaAtaq8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaAtaq8.setForeground(new java.awt.Color(255, 255, 255));
        filaAtaq8.setText("8");

        filaAtaq9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaAtaq9.setForeground(new java.awt.Color(255, 255, 255));
        filaAtaq9.setText("9");

        filaAtaq10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        filaAtaq10.setForeground(new java.awt.Color(255, 255, 255));
        filaAtaq10.setText("10");

        columnaA.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        columnaA.setForeground(new java.awt.Color(255, 255, 255));
        columnaA.setText("A");

        columnaB.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        columnaB.setForeground(new java.awt.Color(255, 255, 255));
        columnaB.setText("B");

        columnaC.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        columnaC.setForeground(new java.awt.Color(255, 255, 255));
        columnaC.setText("C");

        columnaD.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        columnaD.setForeground(new java.awt.Color(255, 255, 255));
        columnaD.setText("D");

        columnaE.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        columnaE.setForeground(new java.awt.Color(255, 255, 255));
        columnaE.setText("E");

        columnaF.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        columnaF.setForeground(new java.awt.Color(255, 255, 255));
        columnaF.setText("F");

        columnaG.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        columnaG.setForeground(new java.awt.Color(255, 255, 255));
        columnaG.setText("G");

        columnaH.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        columnaH.setForeground(new java.awt.Color(255, 255, 255));
        columnaH.setText("H");

        columnaI.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        columnaI.setForeground(new java.awt.Color(255, 255, 255));
        columnaI.setText("I");

        columnaJ.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        columnaJ.setForeground(new java.awt.Color(255, 255, 255));
        columnaJ.setText("J");

        columnaK.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        columnaK.setForeground(new java.awt.Color(255, 255, 255));
        columnaK.setText("K");

        columnaL.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        columnaL.setForeground(new java.awt.Color(255, 255, 255));
        columnaL.setText("L");

        columnaM.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        columnaM.setForeground(new java.awt.Color(255, 255, 255));
        columnaM.setText("M");

        coumnaN.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        coumnaN.setForeground(new java.awt.Color(255, 255, 255));
        coumnaN.setText("N");

        columnaO.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        columnaO.setForeground(new java.awt.Color(255, 255, 255));
        columnaO.setText("O");

        columnaP.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        columnaP.setForeground(new java.awt.Color(255, 255, 255));
        columnaP.setText("P");

        columnaQ.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        columnaQ.setForeground(new java.awt.Color(255, 255, 255));
        columnaQ.setText("Q");

        columnaR.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        columnaR.setForeground(new java.awt.Color(255, 255, 255));
        columnaR.setText("R");

        columnaS.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        columnaS.setForeground(new java.awt.Color(255, 255, 255));
        columnaS.setText("S");

        columnaT.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        columnaT.setForeground(new java.awt.Color(255, 255, 255));
        columnaT.setText("T");

        MostrarPiezasBarco.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MostrarPiezasBarco.setForeground(new java.awt.Color(255, 153, 102));

        TituloPiezas.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        TituloPiezas.setForeground(new java.awt.Color(245, 235, 181));
        TituloPiezas.setText("Barcos Disponibles:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(tituloTableroPos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tituloTableroAtaq)
                                .addGap(227, 227, 227))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(filaPos1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(filaPos8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(filaPos7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(filaPos2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(filaPos3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(filaPos4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(filaPos6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(filaPos5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(filaPos9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(filaPos10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(columnaA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(columnaB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(columnaC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(columnaD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(columnaE, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(columnaF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(columnaG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(columnaH, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(columnaI, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(columnaJ, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(columnaK, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(columnaL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(columnaM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(coumnaN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(columnaO, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)
                                                .addComponent(columnaP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)
                                                .addComponent(columnaQ, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(columnaR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)
                                                .addComponent(columnaS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(columnaT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(panelTableroPos, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(TituloPiezas, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                                                .addGap(18, 18, 18))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(MostrarPiezasBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(43, 43, 43)))
                                                .addComponent(panelTableroAtaq, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(filaAtaq1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(filaAtaq2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(filaAtaq3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(filaAtaq4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(filaAtaq5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(filaAtaq7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(filaAtaq6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(filaAtaq8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(filaAtaq9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(filaAtaq10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tituloTableroAtaq, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tituloTableroPos))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(panelTableroAtaq, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                                                        .addComponent(panelTableroPos, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(filaPos1)
                                                .addGap(28, 28, 28)
                                                .addComponent(filaPos2)
                                                .addGap(36, 36, 36)
                                                .addComponent(filaPos3)
                                                .addGap(32, 32, 32)
                                                .addComponent(filaPos4)
                                                .addGap(34, 34, 34)
                                                .addComponent(filaPos5)
                                                .addGap(33, 33, 33)
                                                .addComponent(filaPos6)
                                                .addGap(34, 34, 34)
                                                .addComponent(filaPos7)
                                                .addGap(28, 28, 28)
                                                .addComponent(filaPos8)
                                                .addGap(29, 29, 29)
                                                .addComponent(filaPos9)
                                                .addGap(27, 27, 27)
                                                .addComponent(filaPos10))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(filaAtaq1)
                                                .addGap(30, 30, 30)
                                                .addComponent(filaAtaq2)
                                                .addGap(31, 31, 31)
                                                .addComponent(filaAtaq3)
                                                .addGap(34, 34, 34)
                                                .addComponent(filaAtaq4)
                                                .addGap(30, 30, 30)
                                                .addComponent(filaAtaq5)
                                                .addGap(33, 33, 33)
                                                .addComponent(filaAtaq6)
                                                .addGap(33, 33, 33)
                                                .addComponent(filaAtaq7)
                                                .addGap(32, 32, 32)
                                                .addComponent(filaAtaq8)
                                                .addGap(34, 34, 34)
                                                .addComponent(filaAtaq9)
                                                .addGap(27, 27, 27)
                                                .addComponent(filaAtaq10))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(151, 151, 151)
                                                .addComponent(TituloPiezas)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(MostrarPiezasBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(columnaA)
                                        .addComponent(columnaB)
                                        .addComponent(columnaC)
                                        .addComponent(columnaD)
                                        .addComponent(columnaE)
                                        .addComponent(columnaF)
                                        .addComponent(columnaG)
                                        .addComponent(columnaH)
                                        .addComponent(columnaI)
                                        .addComponent(columnaJ)
                                        .addComponent(columnaK)
                                        .addComponent(columnaL)
                                        .addComponent(columnaM)
                                        .addComponent(coumnaN)
                                        .addComponent(columnaO)
                                        .addComponent(columnaP)
                                        .addComponent(columnaQ)
                                        .addComponent(columnaR)
                                        .addComponent(columnaS)
                                        .addComponent(columnaT))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tituloTableroPos.getAccessibleContext().setAccessibleName("tituloPos");

        pack();
    }

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "a0".split("");
        generarCoordenada(coordenada);
        a1.setBackground(Color.GRAY);
        a1.setEnabled(false);
        if (piezasDibujables <= 0) {
            a1.setEnabled(false);
        }
    }

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "a1".split("");
        generarCoordenada(coordenada);
        a2.setBackground(Color.GRAY);
        a2.setEnabled(false);
        if (piezasDibujables <= 0) {
            a2.setEnabled(false);
        }
    }

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "a2".split("");
        generarCoordenada(coordenada);
        a3.setBackground(Color.GRAY);
        a3.setEnabled(false);
        if (piezasDibujables <= 0) {
            a3.setEnabled(false);
        }
    }

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "a3".split("");
        generarCoordenada(coordenada);
        a4.setBackground(Color.GRAY);
        a4.setEnabled(false);
        if (piezasDibujables <= 0) {
            a4.setEnabled(false);
        }
    }

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "a4".split("");
        generarCoordenada(coordenada);
        a5.setBackground(Color.GRAY);
        a5.setEnabled(false);
        if (piezasDibujables <= 0) {
            a5.setEnabled(false);
        }
    }

    private void a6ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "a5".split("");
        generarCoordenada(coordenada);
        a6.setBackground(Color.GRAY);
        a6.setEnabled(false);
        if (piezasDibujables <= 0) {
            a6.setEnabled(false);
        }
    }

    private void a7ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "a6".split("");
        generarCoordenada(coordenada);
        a7.setBackground(Color.GRAY);
        a7.setEnabled(false);
        if (piezasDibujables <= 0) {
            a7.setEnabled(false);
        }
    }

    private void a8ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "a7".split("");
        generarCoordenada(coordenada);
        a8.setBackground(Color.GRAY);
        a8.setEnabled(false);
        if (piezasDibujables <= 0) {
            a8.setEnabled(false);
        }
    }

    private void a9ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "a8".split("");
        generarCoordenada(coordenada);
        a9.setBackground(Color.GRAY);
        a9.setEnabled(false);
        if (piezasDibujables <= 0) {
            a9.setEnabled(false);
        }
    }

    private void a10ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "a9".split("");
        generarCoordenada(coordenada);
        a10.setBackground(Color.GRAY);
        a10.setEnabled(false);
        if (piezasDibujables <= 0) {
            a10.setEnabled(false);
        }
    }

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "b0".split("");
        generarCoordenada(coordenada);
        b1.setBackground(Color.GRAY);
        b1.setEnabled(false);
        if (piezasDibujables <= 0) {
            b1.setEnabled(false);
        }

    }

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "b1".split("");
        generarCoordenada(coordenada);
        b2.setBackground(Color.GRAY);
        b2.setEnabled(false);
        if (piezasDibujables <= 0) {
            b2.setEnabled(false);
        }
    }

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "b2".split("");
        generarCoordenada(coordenada);
        b3.setBackground(Color.GRAY);
        b3.setEnabled(false);
        if (piezasDibujables <= 0) {
            b3.setEnabled(false);
        }
    }

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "b3".split("");
        generarCoordenada(coordenada);
        b4.setBackground(Color.GRAY);
        b4.setEnabled(false);
        if (piezasDibujables <= 0) {
            b4.setEnabled(false);
        }
    }

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "b4".split("");
        generarCoordenada(coordenada);
        b5.setBackground(Color.GRAY);
        b5.setEnabled(false);
        if (piezasDibujables <= 0) {
            b5.setEnabled(false);
        }
    }

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "b5".split("");
        generarCoordenada(coordenada);
        b6.setBackground(Color.GRAY);
        b6.setEnabled(false);
        if (piezasDibujables <= 0) {
            b6.setEnabled(false);
        }
    }

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "b6".split("");
        generarCoordenada(coordenada);
        b7.setBackground(Color.GRAY);
        b7.setEnabled(false);
        if (piezasDibujables <= 0) {
            b7.setEnabled(false);
        }
    }

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "b7".split("");
        generarCoordenada(coordenada);
        b8.setBackground(Color.GRAY);
        b8.setEnabled(false);
        if (piezasDibujables <= 0) {
            b8.setEnabled(false);
        }
    }

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "b8".split("");
        generarCoordenada(coordenada);
        b9.setBackground(Color.GRAY);
        b9.setEnabled(false);
        if (piezasDibujables <= 0) {
            b9.setEnabled(false);
        }
    }

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {
        piezasDibujables = piezasDibujables - 1;
        String[] coordenada = "b9".split("");
        generarCoordenada(coordenada);
        b10.setBackground(Color.GRAY);
        b10.setEnabled(false);
        if (piezasDibujables <= 0) {
            b10.setEnabled(false);
        }
    }
    
    private void k1ActionPerformed(java.awt.event.ActionEvent evt) {
        String[] coordenada = "k1".split("");
        generarCoordenada(coordenada);
        b10.setBackground(Color.red);
        b10.setEnabled(false);
        
    }

    private void generarCoordenada(String[] coordenada) {
        int y;
        int x = Integer.parseInt(coordenada[1]);//obtiene la coordenada x dependiendo de la coordenada de los numeros en la interfaz, esta en el nombre del boton
        //dependiendo de la letra de la columna el valor de la coordenada y sera alguna de las opciones
        if (coordenada[0].equalsIgnoreCase("a")||coordenada[0].equalsIgnoreCase("k")) {
            y = 0;
        } else if (coordenada[0].equalsIgnoreCase("b")) {
            y = 1;
        } else if (coordenada[0].equalsIgnoreCase("c")) {
            y = 2;
        } else if (coordenada[0].equalsIgnoreCase("d")) {
            y = 3;
        } else if (coordenada[0].equalsIgnoreCase("e")) {
            y = 4;
        } else if (coordenada[0].equalsIgnoreCase("f")) {
            y = 5;
        } else if (coordenada[0].equalsIgnoreCase("g")) {
            y = 6;
        } else if (coordenada[0].equalsIgnoreCase("h")) {
            y = 7;
        } else if (coordenada[0].equalsIgnoreCase("i")) {
            y = 8;
        } else {
            y = 9;
        }
        crearCelda(x, y);
        
        if (piezasDibujables<=0) {
            crearCeldaAtaque(x,y);
        }
    }

    public void crearCelda(int x, int y) {
        //crea la celda donde se coloca el barco con sus coordenadas
        Celda celda = new Celda(new PiezaBarco(false), x, y);
        comprobador.agregarCelda(celda);
        MostrarPiezasBarco.setText(String.valueOf(piezasDibujables));
    }
    
    public void crearCeldaAtaque(int x, int y) {
        //crea la celda donde se coloca el barco con sus coordenadas
        Celda celda = new Celda(new PiezaBarco(false), x, y);
        comprobador.setCeldaAtacada(celda);
        if (celda.getPieza().isDañado()) {
            k1.setBackground(Color.red);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableroJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableroJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableroJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                TableroJuego tablero = new TableroJuego();
                tablero.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton botonBarcoLargo3;
    private javax.swing.JButton botonBarcoLargo4;
    private javax.swing.JButton botonBarcoLargo5;
    private javax.swing.JButton botonCambioDireccion;
    private javax.swing.JButton botonLargo2;
    private javax.swing.JLabel columnaA;
    private javax.swing.JLabel columnaB;
    private javax.swing.JLabel columnaC;
    private javax.swing.JLabel columnaD;
    private javax.swing.JLabel columnaE;
    private javax.swing.JLabel columnaF;
    private javax.swing.JLabel columnaG;
    private javax.swing.JLabel columnaH;
    private javax.swing.JLabel columnaI;
    private javax.swing.JLabel columnaJ;
    private javax.swing.JLabel columnaK;
    private javax.swing.JLabel columnaL;
    private javax.swing.JLabel columnaM;
    private javax.swing.JLabel columnaO;
    private javax.swing.JLabel columnaP;
    private javax.swing.JLabel columnaQ;
    private javax.swing.JLabel columnaR;
    private javax.swing.JLabel columnaS;
    private javax.swing.JLabel columnaT;
    private javax.swing.JLabel coumnaN;
    private javax.swing.JLabel filaAtaq1;
    private javax.swing.JLabel filaAtaq10;
    private javax.swing.JLabel filaAtaq2;
    private javax.swing.JLabel filaAtaq3;
    private javax.swing.JLabel filaAtaq4;
    private javax.swing.JLabel filaAtaq5;
    private javax.swing.JLabel filaAtaq6;
    private javax.swing.JLabel filaAtaq7;
    private javax.swing.JLabel filaAtaq8;
    private javax.swing.JLabel filaAtaq9;
    private javax.swing.JLabel filaPos1;
    private javax.swing.JLabel filaPos10;
    private javax.swing.JLabel filaPos2;
    private javax.swing.JLabel filaPos3;
    private javax.swing.JLabel filaPos4;
    private javax.swing.JLabel filaPos5;
    private javax.swing.JLabel filaPos6;
    private javax.swing.JLabel filaPos7;
    private javax.swing.JLabel filaPos8;
    private javax.swing.JLabel filaPos9;
    private javax.swing.JButton k1;
    private javax.swing.JButton k10;
    private javax.swing.JButton k2;
    private javax.swing.JButton k3;
    private javax.swing.JButton k4;
    private javax.swing.JButton k5;
    private javax.swing.JButton k6;
    private javax.swing.JButton k7;
    private javax.swing.JButton k8;
    private javax.swing.JButton k9;
    private javax.swing.JButton l1;
    private javax.swing.JButton l10;
    private javax.swing.JButton l2;
    private javax.swing.JButton l3;
    private javax.swing.JButton l4;
    private javax.swing.JButton l5;
    private javax.swing.JButton l6;
    private javax.swing.JButton l7;
    private javax.swing.JButton l8;
    private javax.swing.JButton l9;
    private javax.swing.JButton m1;
    private javax.swing.JButton m10;
    private javax.swing.JButton m2;
    private javax.swing.JButton m3;
    private javax.swing.JButton m4;
    private javax.swing.JButton m5;
    private javax.swing.JButton m6;
    private javax.swing.JButton m7;
    private javax.swing.JButton m8;
    private javax.swing.JButton m9;
    private javax.swing.JButton n1;
    private javax.swing.JButton n10;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton n9;
    private javax.swing.JButton o1;
    private javax.swing.JButton o10;
    private javax.swing.JButton o2;
    private javax.swing.JButton o3;
    private javax.swing.JButton o4;
    private javax.swing.JButton o5;
    private javax.swing.JButton o6;
    private javax.swing.JButton o7;
    private javax.swing.JButton o8;
    private javax.swing.JButton o9;
    private javax.swing.JButton p1;
    private javax.swing.JButton p10;
    private javax.swing.JButton p2;
    private javax.swing.JButton p3;
    private javax.swing.JButton p4;
    private javax.swing.JButton p5;
    private javax.swing.JButton p6;
    private javax.swing.JButton p7;
    private javax.swing.JButton p8;
    private javax.swing.JButton p9;
    private javax.swing.JButton q1;
    private javax.swing.JButton q10;
    private javax.swing.JButton q2;
    private javax.swing.JButton q3;
    private javax.swing.JButton q4;
    private javax.swing.JButton q5;
    private javax.swing.JButton q6;
    private javax.swing.JButton q7;
    private javax.swing.JButton q8;
    private javax.swing.JButton q9;
    private javax.swing.JButton r1;
    private javax.swing.JButton r10;
    private javax.swing.JButton r2;
    private javax.swing.JButton r3;
    private javax.swing.JButton r4;
    private javax.swing.JButton r5;
    private javax.swing.JButton r6;
    private javax.swing.JButton r7;
    private javax.swing.JButton r8;
    private javax.swing.JButton r9;
    private javax.swing.JButton s1;
    private javax.swing.JButton s10;
    private javax.swing.JButton s2;
    private javax.swing.JButton s3;
    private javax.swing.JButton s4;
    private javax.swing.JButton s5;
    private javax.swing.JButton s6;
    private javax.swing.JButton s7;
    private javax.swing.JButton s8;
    private javax.swing.JButton s9;
    private javax.swing.JButton t1;
    private javax.swing.JButton t10;
    private javax.swing.JButton t2;
    private javax.swing.JButton t3;
    private javax.swing.JButton t4;
    private javax.swing.JButton t5;
    private javax.swing.JButton t6;
    private javax.swing.JButton t7;
    private javax.swing.JButton t8;
    private javax.swing.JButton t9;
    private javax.swing.JPanel panelBotonesLargos;
    private javax.swing.JPanel panelTableroPos;
    private javax.swing.JPanel panelTableroAtaq;
    private javax.swing.JLabel tituloBotonCambioDireccion;
    private javax.swing.JLabel tituloSeleccionLargo;
    private javax.swing.JLabel tituloTableroAtaq;
    private javax.swing.JLabel tituloTableroPos;
    private javax.swing.JLabel MostrarPiezasBarco;
    private javax.swing.JLabel TituloPiezas;
    private javax.swing.JButton a1;
    private javax.swing.JButton a10;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JButton a5;
    private javax.swing.JButton a6;
    private javax.swing.JButton a7;
    private javax.swing.JButton a8;
    private javax.swing.JButton a9;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton c1;
    private javax.swing.JButton c10;
    private javax.swing.JButton c2;
    private javax.swing.JButton c3;
    private javax.swing.JButton c4;
    private javax.swing.JButton c5;
    private javax.swing.JButton c6;
    private javax.swing.JButton c7;
    private javax.swing.JButton c8;
    private javax.swing.JButton c9;
    private javax.swing.JButton d1;
    private javax.swing.JButton d10;
    private javax.swing.JButton d2;
    private javax.swing.JButton d3;
    private javax.swing.JButton d4;
    private javax.swing.JButton d5;
    private javax.swing.JButton d6;
    private javax.swing.JButton d7;
    private javax.swing.JButton d8;
    private javax.swing.JButton d9;
    private javax.swing.JButton e1;
    private javax.swing.JButton e10;
    private javax.swing.JButton e2;
    private javax.swing.JButton e3;
    private javax.swing.JButton e4;
    private javax.swing.JButton e5;
    private javax.swing.JButton e6;
    private javax.swing.JButton e7;
    private javax.swing.JButton e8;
    private javax.swing.JButton e9;
    private javax.swing.JButton f1;
    private javax.swing.JButton f10;
    private javax.swing.JButton f2;
    private javax.swing.JButton f3;
    private javax.swing.JButton f4;
    private javax.swing.JButton f5;
    private javax.swing.JButton f6;
    private javax.swing.JButton f7;
    private javax.swing.JButton f8;
    private javax.swing.JButton f9;
    private javax.swing.JButton g1;
    private javax.swing.JButton g10;
    private javax.swing.JButton g2;
    private javax.swing.JButton g3;
    private javax.swing.JButton g4;
    private javax.swing.JButton g5;
    private javax.swing.JButton g6;
    private javax.swing.JButton g7;
    private javax.swing.JButton g8;
    private javax.swing.JButton g9;
    private javax.swing.JButton h1;
    private javax.swing.JButton h10;
    private javax.swing.JButton h2;
    private javax.swing.JButton h3;
    private javax.swing.JButton h4;
    private javax.swing.JButton h5;
    private javax.swing.JButton h6;
    private javax.swing.JButton h7;
    private javax.swing.JButton h8;
    private javax.swing.JButton h9;
    private javax.swing.JButton i1;
    private javax.swing.JButton i10;
    private javax.swing.JButton i2;
    private javax.swing.JButton i3;
    private javax.swing.JButton i4;
    private javax.swing.JButton i5;
    private javax.swing.JButton i6;
    private javax.swing.JButton i7;
    private javax.swing.JButton i8;
    private javax.swing.JButton i9;
    private javax.swing.JButton j1;
    private javax.swing.JButton j10;
    private javax.swing.JButton j2;
    private javax.swing.JButton j3;
    private javax.swing.JButton j4;
    private javax.swing.JButton j5;
    private javax.swing.JButton j6;
    private javax.swing.JButton j7;
    private javax.swing.JButton j8;
    private javax.swing.JButton j9;
}
