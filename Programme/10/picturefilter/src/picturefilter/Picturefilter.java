/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picturefilter;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author wbombardellis
 */
public class Picturefilter extends JPanel{

    static BufferedImage imgshow;
    static BufferedImage origimgshow;
    
    public void paint(Graphics g) {
        g.drawImage(origimgshow, 0, 0, null);
        g.drawImage(imgshow, 513, 0, null);
    }
    
    public static void main(String[] args) throws InterruptedException {
        BufferedImage img;
        try {
            img = ImageIO.read(new File("lenna.png"));
            imgshow = img;
            origimgshow = img;
        } catch (IOException e) {
            return;
        }
        
        JFrame frame= new JFrame("Draw");
        frame.getContentPane().add(new Picturefilter());
        frame.setSize(1024, 512);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        /// Start Processing \\\
        
        BufferedImage bwimg = new BufferedImage(512, 512, BufferedImage.TYPE_BYTE_GRAY);
        BufferedImage rimg = new BufferedImage(512, 512, BufferedImage.TYPE_INT_RGB);
        BufferedImage gimg = new BufferedImage(512, 512, BufferedImage.TYPE_INT_RGB);
        BufferedImage bimg = new BufferedImage(512, 512, BufferedImage.TYPE_INT_RGB);
        
        for (int i = 0; i < 512; i++) {
            for (int j = 0; j < 512; j++) {
                
                int pixel = img.getRGB(i, j);
                int r = (pixel & 0x00FF0000) >> 16;
                int g = (pixel & 0x0000FF00) >> 8;
                int b = (pixel & 0x000000FF);
                
                rimg.setRGB(i, j, r << 16);
                gimg.setRGB(i, j, g << 8);
                bimg.setRGB(i, j, b);
                
                
                int bw = (int) (0.2126 * r + 0.7152 * g + 0.0722 * b);
                
                bwimg.setRGB(i, j, bw << 16 | bw << 8 | bw);
            }
        }
        
        Scanner reader = new Scanner(System.in);
        
        reader.nextLine();
        imgshow = rimg;
        frame.repaint();
        
        reader.nextLine();
        
        imgshow = gimg;
        frame.repaint();
        
        reader.nextLine();
        imgshow = bimg;
        frame.repaint();
        
        reader.nextLine();
        imgshow = bwimg;
        frame.repaint();
        
        
        BufferedImage blurimg = new BufferedImage(512, 512, BufferedImage.TYPE_BYTE_GRAY);
        for (int i = 1; i < 511; i++) {
            for (int j = 1; j < 511; j++) {
                
                int[][] window = {{(bwimg.getRGB(i-1, j-1) & 0x000000FF) / 9, (bwimg.getRGB(i-1, j) & 0x000000FF) / 9, (bwimg.getRGB(i-1, j+1) & 0x000000FF) / 9},
                                {(bwimg.getRGB(i, j-1) & 0x000000FF) / 9, (bwimg.getRGB(i, j) & 0x000000FF) / 9, (bwimg.getRGB(i, j+1) & 0x000000FF) / 9},
                                {(bwimg.getRGB(i+1, j-1) & 0x000000FF) / 9, (bwimg.getRGB(i+1, j) & 0x000000FF) / 9, (bwimg.getRGB(i+1, j+1) & 0x000000FF) / 9}};
                
                int newpixel = window[0][0] + window[0][1] + window[0][2] + 
                                window[1][0] + window[1][1] + window[1][2] + 
                                window[2][0] + window[2][1] + window[2][2];
                
                blurimg.setRGB(i, j, newpixel << 16 | newpixel << 8 | newpixel);
            }
        }
        
        BufferedImage sharpimg = new BufferedImage(512, 512, BufferedImage.TYPE_BYTE_GRAY);
        for (int i = 1; i < 511; i++) {
            for (int j = 1; j < 511; j++) {
                
                int[][] window = {{0, -(bwimg.getRGB(i-1, j) & 0x000000FF), 0},
                                {-(bwimg.getRGB(i, j-1) & 0x000000FF), 5*(bwimg.getRGB(i, j) & 0x000000FF), -(bwimg.getRGB(i, j+1) & 0x000000FF)},
                                {0, -(bwimg.getRGB(i+1, j) & 0x000000FF), 0}};
                
                int newpixel = window[0][0] + window[0][1] + window[0][2] + 
                                window[1][0] + window[1][1] + window[1][2] + 
                                window[2][0] + window[2][1] + window[2][2];
                
                sharpimg.setRGB(i, j, newpixel << 16 | newpixel << 8 | newpixel);
            }
        }
        
        
        reader.nextLine();
        imgshow = blurimg;
        frame.repaint();
        
        reader.nextLine();
        imgshow = sharpimg;
        frame.repaint();
    }
    
}
