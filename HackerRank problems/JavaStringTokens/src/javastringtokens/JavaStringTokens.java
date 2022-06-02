/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastringtokens;

import java.util.*;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
 */
public class JavaStringTokens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        String string = sc.nextLine().trim();
        if (string.length()>0){
            String [] tokenList = string.split("[ !,?._'@]+");
            System.out.println(tokenList.length);
            sc.close();
            for(String s : tokenList){
                System.out.println(s);
            }
        }else{
            System.out.println(0);
        }
    }
    
}
