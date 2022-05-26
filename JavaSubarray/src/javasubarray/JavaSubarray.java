/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasubarray;

import java.util.Scanner;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true
 */
public class JavaSubarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int length = sc.nextInt();
        int [] arr = new int [length];
        
        for(int i = 0; i < arr.length; i++){
            arr [i] = sc.nextInt();
        }
        
        int negSub = 0;
        
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum = arr[j] + sum;
                
                if(sum < 0){
                    negSub ++;
                }
            }
        }
        
        System.out.println(negSub);
    }
    
}
