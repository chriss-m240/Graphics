/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

import testinggraphics.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.PopupMenu;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Estudiante
 */
class NewPanel extends JPanel implements ActionListener, MouseListener{
    
   private Timer timer;
   private Thread t = new Thread();
   private int i = 0;
   private int j = 0;
   private int xCar = 0;
   private int yCar = 0;
   int xSpeed = 5;
   int ySpeed = 5;
   int secuencia = 0;
   boolean changeX = false;
   boolean changeY = false;

   public NewPanel()  {
       setBackground(Color.WHITE);
       timer = new Timer(25,this);
       timer.start();
       this.addMouseListener(this);
   }
   
   protected void paintComponent(Graphics g) {
       
       super.paintComponent(g);
       Color Up = new Color(88,183,225);
       Color Chasis = new Color(86,226,255);
       Image fondo = loadImage("fondo.png");
       Image cat = loadImage("cats.GIF");
       g.drawImage(fondo,0,0,null);
       g.drawImage(cat, xCar, 50, xCar+132,50+80,132*secuencia+132,0,secuencia+132,80,null);
       
       
       
       /*
       for (int i = 0; i < 1000; i+=20) {
               */
           g.setColor(Color.BLACK);
            
            xCar = 50+i;
            yCar = 400+j;
            
            if (xCar >= 700 || xCar <=0) {
                changeX = true;
                xSpeed*= (-1);
            }
           
            
          
          
            
            int x[] = {75+i,125+i,175+i,225+i};
            int y[] = {350,300,300,350};
            g.setColor(Up);
            g.fillPolygon(x, y, x.length);
            g.setColor(Chasis);
            g.fillRect(50+i, 350, 200, 50);
            g.setColor(Color.BLACK);
            g.fillOval(75+i, 399, 50, 50);
            g.fillOval(175+i, 399, 50, 50);     
    
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        secuencia +=1%6;
     if (changeX) {
            i += xSpeed;
        } else {
            i+= xSpeed;
        }
        if (changeY) {
            j-=ySpeed;
        } else {
            j+=ySpeed;
        }
        this.checkCollisions();
        repaint(); 
    }
    
    public Rectangle getBounds() {
        return new Rectangle(50+i,300,200,150);
    }
    
    public void checkCollisions() {
        Rectangle tree = new Rectangle(768,221, 930-768, 406-221);
        
        if ( tree.intersects(this.getBounds())){
            timer.stop();
        }
    }
    
    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image Image = ii.getImage();
        return Image;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Point mp = e.getPoint();
        if(getBounds().contains(mp)) {
            timer.stop();
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
