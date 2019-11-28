package quadrant;

import java.util.Scanner;

/**
 *
 * @author wbombardellis
 */
public class Quadrant {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        double x = reader.nextDouble();
        double y = reader.nextDouble();
        
        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x == 0 && y == 0){
            System.out.println("Origin");
        } else if (y == 0) {
            System.out.println("x-axis");
        } else if (x == 0) {
            System.out.println("y-axis");
        } else {
            System.out.println("impossible");
        }
    }
    
}
