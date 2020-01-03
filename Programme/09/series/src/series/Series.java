/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series;

import java.util.Scanner;

/**
 *
 * @author wbombardellis
 */
public class Series {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("N = ");
        int N = reader.nextInt();
        
        System.out.print("z = ");
        double z = reader.nextDouble();
        
        double gSum = 0;
        for (int n = 1; n <= N; n++) {
            gSum += Math.pow(z, n);
        }
        
        double hSum = 0;
        for (int n = 1; n <= N; n++) {
            hSum += Math.pow(-1, n-1) / n;
        }
        
        System.out.println("Geometric series: " + gSum);
        System.out.println("Alternating harmonic series: " + hSum);
        System.out.println("ln(2): " + Math.log(2));
    }
    
}
