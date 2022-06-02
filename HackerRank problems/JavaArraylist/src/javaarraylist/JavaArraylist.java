/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarraylist;

import java.util.*;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
 */
public class JavaArraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        ArrayList <ArrayList <Integer>> arList = new ArrayList <ArrayList <Integer>> ();
        
        for(int i = 0; i < n; i++){
            int d = sc.nextInt();
            ArrayList <Integer> aList = new ArrayList <Integer> ();
            
            for(int j = 0; j < d; j++){
                aList.add(sc.nextInt());
            }
            arList.add(aList);
        }
        
        int q = sc.nextInt();
        
        for(int k = 0; k < q; k++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            try {
               System.out.println(arList.get(x-1).get(y-1)); 
            } catch(Exception e) {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
    
}
