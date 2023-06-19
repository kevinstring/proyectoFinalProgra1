/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.border.Border;

class RoundBorder implements Border {
    private int radio;

    public RoundBorder(int radio) {
        this.radio = radio;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics g2 = g.create();

        g2.setColor(Color.BLACK);
        g2.drawRoundRect(x, y, width - 1, height - 1, radio, radio);

        g2.dispose();
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(radio / 2, radio / 2, radio / 2, radio / 2);
    }

    public boolean isBorderOpaque() {
        return true;
    }

    public Shape getInteriorShape(Component c, int x, int y, int width, int height) {
        return new RoundRectangle2D.Double(x, y, width - 1, height - 1, radio, radio);
    }
}

