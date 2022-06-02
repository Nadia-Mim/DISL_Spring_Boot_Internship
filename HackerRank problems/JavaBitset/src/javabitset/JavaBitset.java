/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabitset;

import java.util.*;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-bitset/problem?isFullScreen=true
 */
public class JavaBitset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        BitSet [] bits = new BitSet [3];
        
        bits [1] = b1;
        bits [2] = b2;
        
        while(0 < m--){
            String operation = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            switch(operation){
                case "AND":
                    bits[x].and(bits[y]);
                    break;
                case "OR":
                    bits[x].or(bits[y]);
                    break;
                case "XOR":
                    bits[x].xor(bits[y]);
                    break;
                case "FLIP":
                    bits[x].flip(y);
                    break;
                case "SET":
                    bits[x].set(y);
                    break;
            }
            System.out.printf("%d %d%n", b1.cardinality(),b2.cardinality());
        }
        
    }
    
}
