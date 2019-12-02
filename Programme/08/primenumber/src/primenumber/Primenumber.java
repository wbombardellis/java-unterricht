/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

import java.util.Scanner;

/**
 *
 * @author wbombardellis
 */
public class Primenumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int n = reader.nextInt();
        
        if (n > 1) {
            
            boolean prime = true;
            int m = n - 1;
            while (m > 1) {
                if (n % m == 0) {
                    prime = false;
                }
                m--;
            }
            
            if (prime == true) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
            
        } else {
            System.out.println("not prime");
        }
    }
    
}
