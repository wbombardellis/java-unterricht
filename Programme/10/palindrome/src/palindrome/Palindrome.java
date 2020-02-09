/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author wbombardellis
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String word = reader.nextLine();
        
        char[] letterArray = word.toCharArray();
        
        boolean palindrome = true;
        for(int i = 0, j = letterArray.length - 1; i < (letterArray.length / 2); i++, j--) {
            
            if (letterArray[i] != letterArray[j]) {
                palindrome = false;
            }
        }
        
        System.out.println(palindrome);
    }
    
}
