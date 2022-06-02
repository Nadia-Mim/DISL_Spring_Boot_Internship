/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasubstringcomparison;

import java.util.*;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
 */
public class JavaSubstringComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        String line = sc.next();
        int length = sc.nextInt();
        sc.close();
        
        System.out.println(getSmallestAndLargest(line,length));
        
    }
    
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        TreeSet <String> stringSet = new TreeSet<>();
        
        for(int i = 0; i < (s.length()-k+1); i++){
            stringSet.add(s.substring(i, i+k));
        }
        
        smallest = stringSet.first();
        largest = stringSet.last();
        
        return smallest + "\n" + largest;
    }
    
}
