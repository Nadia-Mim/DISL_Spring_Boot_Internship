/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2darray;

import java.util.Scanner;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true
 */
public class Java2DArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int [][] array = new int [6][6];
        
        for(int row = 0; row < array.length; row ++){
            for(int column = 0; column < array.length; column ++){
                array[row][column] = sc.nextInt();
            }
        }
        
        int maxSum = Integer.MIN_VALUE;
        for(int r = 0; r < array.length-2; r ++){
            for(int c = 0; c < array.length-2; c ++){
                
                int sum = array[r][c] + array[r][c+1] + array[r][c+2]
                          + array[r+1][c+1]
                          + array[r+2][c] + array[r+2][c+1] + array[r+2][c+2];
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }
    
}
