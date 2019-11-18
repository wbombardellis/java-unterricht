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
            //Maybe there are real solutions
            if (a != 0) {
                double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (b != 0) {
                double x1 = -c / b;
                System.out.println("x1 = " + x1);
            } else if (c != 0) {
                System.out.println("Keine reele Loesungen");
            } else {
                System.out.println("Endlich viele Loesungen");
            }
        } else {
            System.out.println("Keine reelle Loesung");
        }
    } 
}
