/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinggraphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.PopupMenu;
import javax.swing.JPanel;

/**
 *
 * @author Estudiante
 */
class NewPanel extends JPanel {

   protected void paintComponent(Graphics g) {
       super.paintComponent(g);
       Color Up = new Color(88,183,225);
       Color Chasis = new Color(86,226,255);
       Polygon polygon = new Polygon();
       g.drawRect(50, 150, 100, 150);
       g.drawRect(650, 150, 100, 150);
       g.drawRect(350, 100, 100, 150);
       g.drawRect(375, 125, 100, 150);
      
       g.setColor(Color.CYAN);
       g.fillRoundRect(300, 500, 100, 100, 50, 50);
       g.fillOval(325, 450, 50, 50);
       int x[] = {550,600,650,700};
       int y[] = {450,400,400,450};
       g.setColor(Up);
       g.fillPolygon(x, y, x.length);
       g.setColor(Chasis);
       g.fillRect(525, 450, 200, 50);
       g.setColor(Color.BLACK);
       g.fillOval(550, 499, 50, 50);
       g.fillOval(650, 499, 50, 50);
   }
}
