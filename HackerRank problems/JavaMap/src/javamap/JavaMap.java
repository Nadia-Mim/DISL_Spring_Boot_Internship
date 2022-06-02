/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamap;

import java.util.*;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true
 */
public class JavaMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        Map <String, Integer> map = new HashMap <String, Integer> ();
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n; i++){
            String name = sc.nextLine();
            int phone = sc.nextInt();
            map.put(name, phone);
            sc.nextLine();
        }
        
        while(sc.hasNext()){
            String name = sc.nextLine();
            
            if(map.containsKey(name)){
                System.out.println(name+ "=" + map.get(name));
            } else {
                System.out.println("Not found");
            }
        }
        sc.close();
    }
    
}
