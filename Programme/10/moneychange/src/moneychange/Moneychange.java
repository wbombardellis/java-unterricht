/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneychange;

import java.util.Scanner;

/**
 *
 * @author wbombardellis
 */
public class Moneychange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Price: $");
        int price = reader.nextInt();
        
        System.out.println("Received: $");
        int received = reader.nextInt();
        
        if (received >= price) {
            int change = received - price;
            int rest = change;
            
            int[] changeBills = new int[7];
            
            while(rest > 0) {
                if (rest >= 100) {
                    changeBills[6]++;
                    rest -= 100;
                } else if (rest >= 50) {
                    changeBills[5]++;
                    rest -= 50;
                } else if (rest >= 20) {
                    changeBills[4]++;
                    rest -= 20;
                } else if (rest >= 10) {
                    changeBills[3]++;
                    rest -= 10;
                } else if (rest >= 5) {
                    changeBills[2]++;
                    rest -= 5;
                } else if (rest >= 2) {
                    changeBills[1]++;
                    rest -= 2;
                } else if (rest >= 1) {
                    changeBills[0]++;
                    rest -= 1;
                } 
            }
        
            System.out.println("Change: $" + change);
            System.out.println("Change Bills: ");
            System.out.println(changeBills[6] + " bills of $100");
            System.out.println(changeBills[5] + " bills of $50");
            System.out.println(changeBills[4] + " bills of $20");
            System.out.println(changeBills[3] + " bills of $10");
            System.out.println(changeBills[2] + " bills of $5");
            System.out.println(changeBills[1] + " bills of $2");
            System.out.println(changeBills[0] + " bills of $1");
        } else {
            System.out.println("Received less than the price.");
        }
    }
    
}
