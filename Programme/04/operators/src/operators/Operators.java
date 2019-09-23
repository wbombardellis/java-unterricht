/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

import java.util.Scanner;

/**
 *
 * @author wbombardellis
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        double a = reader.nextDouble();
        double b = reader.nextDouble();
        
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        
        //Due to the floating point arithmetics, round-off errors may occur
        //when operating float or double values. Specially with values 
        //too close or too distant
        //See https://en.wikipedia.org/wiki/Round-off_error
        //See https://en.wikipedia.org/wiki/Floating-point_arithmetic 
        
        //Moreover, some numbers are represented with errors in binary, e.g. 0.1
        //cannot be converted into a finite binary representation without errors
        //These errors are carried out in operations, so that for example
        // 0.1 + 0.2 = 0.30000000000000004 or
        // 0.1 + 0.4 = 0.5 even though 0.5 - 0.4 = 0.09999999999999998
        //See https://stackoverflow.com/questions/1089018/why-cant-decimal-numbers-be-represented-exactly-in-binary
    }
    
}
