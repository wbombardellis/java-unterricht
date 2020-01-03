/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author wbombardellis
 */
public class Simulation extends JPanel{

    static int height = 10;
    static int outValvuePos = 120;
    
    public void paint(Graphics g){
        //// Tank \\\\
        g.drawRect(40, 40, 150, 150);
        
        //// Water \\\\
        g.setColor(Color.blue);
        g.fillRect(41, 190-height, 149, height);
        
        //// Influx valve \\\\
        g.setColor(Color.black);
        g.drawRect(20, 182, 19, 6);
        g.setColor(Color.blue);
        g.fillRect(20, 183, 20, 5);
        
        //// outflux valve \\\\
        g.setColor(Color.black);
        g.drawRect(190, 74, 19, 6);
        
        if (height >= outValvuePos - 10){
            g.setColor(Color.blue);
            g.fillRect(190, 75, 20, 5);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        JFrame frame= new JFrame("Draw");
        frame.getContentPane().add(new Simulation());
        frame.setSize(500, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        
        int influxRate = 1;
        
        //TODO: Read the number of desired iterations from the user
        
        for (int it = 0; it < 200; it++) {
            
            height = height + influxRate;
            
            //TODO: Implement outflux
            
            frame.repaint();
            Thread.sleep(100);
        }
        
        //TODO: Print simulation result: Final height
        
        //TODO: Simulate again with increased influx rate
        
    }
    
}
