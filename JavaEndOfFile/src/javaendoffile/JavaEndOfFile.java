/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaendoffile;

import java.util.Scanner;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
 */
public class JavaEndOfFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        for (int i = 1; sc.hasNext() ; i++){
            
            System.out.println(i + " " + sc.nextLine());
            
        }
        
    }
    
}
