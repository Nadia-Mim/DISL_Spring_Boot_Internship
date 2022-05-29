/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadequeue;


import java.util.*;
/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-dequeue/problem?isFullScreen=true
 */
public class JavaDequeue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        Deque <Integer> deque = new ArrayDeque <> ();
        HashSet <Integer> set = new HashSet <> ();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            
            if(deque.size() == m && set.size() > max){
                max = set.size();
                int element = deque.remove();
                if (!deque.contains(element)){
                    set.remove(element);
                }
                
            }

        }
        System.out.println(max);
    }
    
}
