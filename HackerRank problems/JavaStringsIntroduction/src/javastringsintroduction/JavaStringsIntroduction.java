/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastringsintroduction;

import java.util.Scanner;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
 */
public class JavaStringsIntroduction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length()+B.length());
        int compareValue = A.compareTo(B);
        
        if(compareValue>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        A = A.substring(0, 1).toUpperCase()+ A.substring(1);
        B = B.substring(0, 1).toUpperCase()+ B.substring(1);
        System.out.println(A+ " " + B);
    }
    
}
