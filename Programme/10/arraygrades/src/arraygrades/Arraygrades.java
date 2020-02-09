/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraygrades;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author wbombardellis
 */
public class Arraygrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        double[] grades = new double[5];
        
        for (int i = 0; i < 5; i++) {
            grades[i] = reader.nextDouble();
        }
        
        double sum = 0;
        int passed = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + grades[i];
            
            if (grades[i] >= 7) {
                passed++;
            }
        }
        double avg = sum / 5;
        
        System.out.println("Avg: " + avg);
        System.out.println("Passed: " + passed);
    }
    
}
