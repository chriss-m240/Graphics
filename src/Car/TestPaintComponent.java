/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

import testinggraphics.*;
import javax.swing.JFrame;

/**
 *
 * @author Estudiante
 */
public class TestPaintComponent extends JFrame {
    
    public TestPaintComponent(){
        add(new NewPanel());
    }
    
    public static void main(String[] args) {
        TestPaintComponent frame = new TestPaintComponent();
        frame.setTitle("TestPaintComponent");
        frame.setSize(1024,512);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

