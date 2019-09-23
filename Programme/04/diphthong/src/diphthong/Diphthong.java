/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diphthong;

import java.util.Scanner;

/**
 *
 * @author wbombardellis
 */
public class Diphthong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String a = reader.nextLine();
        
        boolean diphthong = 
                //una es cerrada (/i u/) no acentuada y la otra es abierta (/a e o/)
                a.contains("ia") || a.contains("ie") || a.contains("io")
                || a.contains("ai") || a.contains("ei") || a.contains("oi")
                || a.contains("ua") || a.contains("ue") || a.contains("uo")
                || a.contains("au") || a.contains("eu") || a.contains("ou")
                
                ||a.contains("iá") || a.contains("ié") || a.contains("ió")
                || a.contains("ái") || a.contains("éi") || a.contains("ói")
                || a.contains("uá") || a.contains("ué") || a.contains("uó")
                || a.contains("áu") || a.contains("éu") || a.contains("óu")
                //ambas son cerradas, excepto si son iguales
                || a.contains("iu") || a.contains("ui");
        
        boolean triphthong = 
                //cerrada - abierta - cerrada
                a.contains("iai") || a.contains("iei") || a.contains("ioi")
                || a.contains("iau") || a.contains("ieu") || a.contains("iou")
                || a.contains("uai") || a.contains("uei") || a.contains("uoi")
                || a.contains("uau") || a.contains("ueu") || a.contains("uou")
                
                || a.contains("iái") || a.contains("iéi") || a.contains("iói")
                || a.contains("iáu") || a.contains("iéu") || a.contains("ióu")
                || a.contains("uái") || a.contains("uéi") || a.contains("uói")
                || a.contains("uáu") || a.contains("uéu") || a.contains("uóu");
        
        //FIXME: Consider 'y' as vocal cerrada
        
        System.out.println(diphthong && !triphthong);
        
        /////Tests\\\\\
        //Diptongos\\
        //ciudad = true
        //terapeuta = true
        //paisaje = true
        //tierra = true
        
        //hiatos\\
        //aereo = false
        //mía = false
        //leer = false
        
        //hiato+diptongo\\
        //rompíais = true
        
        //triptongo\\
        //riais = false
        //amortiguáis = false
    }
    
}
