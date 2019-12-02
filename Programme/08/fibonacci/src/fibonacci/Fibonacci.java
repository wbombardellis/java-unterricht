/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author wbombardellis
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int prev;
        int num = 0;
        int next = 1;
        
        while (num <= 1000) {
            System.out.println(num);
            
            prev = num;
            num = next;
            next = prev + num;
        }
        
        
                
    }
    
}
