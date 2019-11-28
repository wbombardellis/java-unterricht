package brazilianeligibility;

import java.util.Scanner;

/**
 *
 * @author wbombardellis
 */
public class Brazilianeligibility {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int age = reader.nextInt();
        
        if (age < 16) {
            System.out.println("You may not vote");
        } else if (age < 18 || age > 64) {
            System.out.println("You may vote");
        } else {
            System.out.println("You must vote");
        }
    }
    
}

