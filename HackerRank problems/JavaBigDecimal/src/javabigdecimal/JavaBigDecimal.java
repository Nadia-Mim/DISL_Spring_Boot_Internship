/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabigdecimal;

import java.math.BigDecimal;
import java.util.*;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true
 */
public class JavaBigDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                BigDecimal a = new BigDecimal(s[j]);
                BigDecimal b = new BigDecimal(s[j+1]);
                
                if(b.compareTo(a)== 1){
                    String temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
    
}
