/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaifelse;

import java.util.Scanner;

/**
 *
 * @author Nadia Mim
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
 */
public class JavaIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();

        if (number % 2 != 0){
            System.out.println("Weird");
        }else if((number >= 2) && (number <= 5)){
            System.out.println("Not Weird");
        }else if((number >= 6) && (number <= 20)){
            System.out.println("Weird");
        }else if(number > 20){
            System.out.println("Not Weird");
        }
        
        scanner.close();
    }
    
}
