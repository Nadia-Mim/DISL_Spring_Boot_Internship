/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaloops1;

import java.util.Scanner;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
 */
public class JavaLoops1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        
        for (int i = 1; i <= 10; i++){
            int result = number * i;
            
            System.out.printf("%d x %d = %d%n", number, i, result);
        }
        
        sc.close(); 
    }
    
}
