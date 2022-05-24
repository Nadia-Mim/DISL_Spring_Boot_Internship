/*
 * To change this license header, choose License Headers sc Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template sc the editor.
 */
package javaloops2;

import java.util.Scanner;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link:https://www.hackerrank.com/challenges/java-loops?isFullScreen=true
 */
public class JavaLoops2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int q = sc.nextInt();
        
        for(int i = 0; i < q; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int series = a;
            
            for (int j = 0; j < n; j++){
                series += (int)(Math.pow (2, j) * b);
                System.out.printf("%d ", series);  
            }
            
            System.out.println();
        }
        
        sc.close();
    }
    
}
