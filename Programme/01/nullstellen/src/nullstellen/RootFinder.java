/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullstellen;

import java.util.Scanner;

/**
 *
 * @author wbombardellis
 */
public class RootFinder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("P(x) = ax² + bx + c");
        
        System.out.print("a = ");
        double a = reader.nextDouble();
        
        System.out.print("b = ");
        double b = reader.nextDouble();
        
        System.out.print("c = ");
        double c = reader.nextDouble();
        
        double delta = b*b - 4 * a * c;
        
        if (delta >= 0) {
            //There are real solutions
            double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("Keine reelle Loesung");
        }
    } 
}
