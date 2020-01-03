/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author wbombardellis
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int n = reader.nextInt();
        
        if (n < 0) {
            System.out.println(n+"! not defined");
        } else if (n == 0) {
            System.out.println(n+"! = 1");
        } else {
            int fac = 1;
            
            for (int i = 1; i <= n; i++) {
                fac = fac * i;
            }
            System.out.println(n+"! = "+fac);
        }
    }
    
}
