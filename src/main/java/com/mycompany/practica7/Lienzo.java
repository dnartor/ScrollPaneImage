/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica7;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author danint
 */
public class Lienzo extends JPanel {
    
    private BufferedImage imagen;
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, null); 
    }
    public void setImg(File fichero) throws IOException{
        imagen= ImageIO.read(fichero); 
        this.setPreferredSize(new Dimension(imagen.getWidth(),imagen.getHeight()));
    }
    
}
