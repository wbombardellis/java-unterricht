/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draw;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author wbombardellis
 */
public class Draw extends JPanel{

    public void paint(Graphics g){
        ////H1\\\\
        g.drawString("H", 40, 190);
        g.drawOval(40, 40, 150, 150);
        //nucleus
        g.setColor(Color.red);
        g.fillOval(105, 105, 20, 20);
        //electron
        g.setColor(Color.blue);
        g.fillOval(110, 35, 10, 10);
        
        ////He2\\\\
        g.setColor(Color.black);
        g.drawString("He", 240, 190);
        g.drawOval(240, 40, 150, 150);
        //nucleus
        g.setColor(Color.red);
        g.fillOval(305, 105, 20, 20);
        //electrons
        g.setColor(Color.blue);
        g.fillOval(310, 35, 10, 10);
        g.fillOval(310, 185, 10, 10);
    }

    public static void main(String[] args){
        JFrame frame= new JFrame("Draw");
        frame.getContentPane().add(new Draw());
        frame.setSize(500, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    
}
