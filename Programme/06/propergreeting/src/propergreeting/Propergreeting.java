/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propergreeting;

import java.util.Date;

/**
 *
 * @author wbombardellis
 */
public class Propergreeting {

    public static void main(String[] args) {
        Date now = new Date();
        
        int hourNow = now.getHours();
        
        if (hourNow < 12) {
            System.out.println("Good Morning");
        } else if (hourNow <= 15){
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }
    }
    
}
