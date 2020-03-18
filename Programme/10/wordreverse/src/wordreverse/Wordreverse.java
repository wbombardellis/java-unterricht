/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordreverse;

import java.util.Scanner;

/**
 *
 * @author wbombardellis
 */
public class Wordreverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //Input
        String word = reader.nextLine();
        
        //Convert to array
        char[] charArray = word.toCharArray();
        int wordSize = charArray.length;
        
        //New array to keep reversed word
        char[] reversedArray = new char[wordSize];
        
        //Reverse
        for (int i = 0; i < wordSize; i++) {
            reversedArray[i] = charArray[wordSize - i - 1];
        }
        
        //Output
        for (int i = 0; i < wordSize; i++) {
            System.out.print(reversedArray[i]);
        }
        System.out.println();
    }
    
}
