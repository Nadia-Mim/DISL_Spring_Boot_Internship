/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1darray;

import java.util.Scanner;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true
 */
public class Java1DArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    
}
