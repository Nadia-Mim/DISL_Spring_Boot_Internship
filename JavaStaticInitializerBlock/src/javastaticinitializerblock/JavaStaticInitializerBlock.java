/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastaticinitializerblock;

import java.util.Scanner;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
 */
public class JavaStaticInitializerBlock {
    
    static Scanner sc = new Scanner (System.in);
    
    static boolean flag;
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    
    static{
        if((B <= 0) || (H <=0)){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            flag =true;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(flag){
            int area=B*H;
            System.out.println(area);
        }
    }
    
}
