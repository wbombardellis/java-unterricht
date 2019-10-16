/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalc;

import java.util.Scanner;

/**
 *
 * @author wbombardellis
 */
public class Simplecalc {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        
        System.out.println("Please provide the first number:");
        reader.reset();
        double a = reader.nextDouble();
        
        System.out.println("Please provide the operation:");
        reader.nextLine();
        char op = reader.nextLine().charAt(0);
        
        System.out.println("Please provide the second number:");
        double b = reader.nextDouble();
        
        if (op == '+') {
            double c = a + b;
            System.out.println("The result of " + a + op + b + " is " + c);
        } else if (op == '-') {
            double c = a - b;
            System.out.println("The result of " + a + op + b + " is " + c);
        } else {
            System.out.println("Operation " + op + " not supported");
        }
    }
    
}
