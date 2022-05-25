/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacurrencyformatter;

import java.text.NumberFormat;
import java.util.*;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true
 */
public class JavaCurrencyFormatter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();
        
        NumberFormat usCurr = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaCurr = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        NumberFormat chinaCurr = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceCurr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String us = usCurr.format(payment);
        String india = indiaCurr.format(payment);
        String china = chinaCurr.format(payment);
        String france = franceCurr.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
    
}
