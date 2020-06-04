/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celestialblink.ui;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author FKADAGIO
 */
public class m_imagen extends JPanel{
    private Image imagen=null;
    private Icon icono=null;
    private int h=400,w=700;
    private String  ruta_fondo="/com/celestialblink/imagenes/wallhaven-qdgwor.jpg";
    public m_imagen(){
        super();
        preInit();
    }
    public m_imagen(String ruta){
        this.ruta_fondo=ruta;
    }
    
    public void preInit(){
        try {
            imagen=new ImageIcon(getClass().getResource(ruta_fondo)).getImage();
            repaint();
        } catch (Exception e) {
            System.out.println("error -> "+e.getMessage());
        }
        
    }

    public void setRuta_fondo(String ruta_fondo) {
        this.ruta_fondo = ruta_fondo;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setW(int w) {
        this.w = w;
    }
    
    public Icon m_icono(String ruta){
        ImageIcon imagen=new ImageIcon(getClass().getResource(ruta));
        return icono=new ImageIcon(imagen.getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT));
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(imagen, 0, 0, this.getWidth(),this.getHeight(),this);
       setOpaque(true);
    }
    
    
    
}
