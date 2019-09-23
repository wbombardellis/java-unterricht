/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglearea;

import java.util.Scanner;

/**
 *
 * @author wbombardellis
 */
public class Trianglearea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        
        double s = (a + b + c) / 2.0;
        double A = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        
        System.out.println(A);
    }
    
}
