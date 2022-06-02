/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastringreverse;

import java.util.Scanner;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
 */
public class JavaStringReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        if(A.equals(new StringBuilder(A).reverse().toString())){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}
