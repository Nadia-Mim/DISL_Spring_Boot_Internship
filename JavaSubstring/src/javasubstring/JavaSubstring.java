/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasubstring;

import java.util.Scanner;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true
 */
public class JavaSubstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String stringLine = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(stringLine.substring(start, end));
        
    }
    
}
