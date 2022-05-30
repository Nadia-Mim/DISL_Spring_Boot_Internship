package canyouaccess;

import java.io.*;
import java.util.*;
/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: 
 */
public class CanYouAccess {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().trim());
        Inner.Private p = new Inner().new Private();
        System.out.println(num + " is " + (p.powerof2(num)));
        System.out.println("An instance of class: " + p.getClass().getCanonicalName() + " has been created");

    }
    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
        }
    }  
}
