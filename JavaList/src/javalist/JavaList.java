/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalist;

import java.util.*;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
 */
public class JavaList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        List <Integer> L = new ArrayList <Integer> ();
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            L.add(sc.nextInt());
        }
        int q = sc.nextInt();
        
        for(int j = 0; j < q; j++){
            String query = sc.next();
            if(query.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                L.add(x, y);
            }
            if(query.equals("Delete")){
                int x = sc.nextInt();
                L.remove(x);
            }
        }
        for(Integer s: L){
            System.out.print(s + " ");
        }  
    }
    
}
