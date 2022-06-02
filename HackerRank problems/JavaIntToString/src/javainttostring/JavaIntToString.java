/*
 * To change this license header, choose License Headers sc Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template sc the editor.
 */
package javainttostring;

import java.util.Scanner;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-int-to-string/problem?isFullScreen=true
 */
public class JavaIntToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int number = sc .nextInt();
        String string = String.valueOf(number);
        
        if (number == Integer.parseInt(string)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
        
        sc.close();
    }
    
}
