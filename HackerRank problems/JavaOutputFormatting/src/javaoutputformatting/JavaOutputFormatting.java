/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoutputformatting;

import java.util.Scanner;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
 */
public class JavaOutputFormatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        System.out.println("================================");
        
        for (int i = 0; i < 3; i++) {
            String string = sc.next();
            int digits = sc.nextInt();
            
            System.out.printf( "%-15s%03d%n", string, digits);
        }
        
        System.out.println("================================");
    }
}
    

