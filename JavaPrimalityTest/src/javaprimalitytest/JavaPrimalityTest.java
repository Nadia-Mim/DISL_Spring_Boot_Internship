/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprimalitytest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true
 */
public class JavaPrimalityTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        bufferedReader.close();
        BigInteger number = new BigInteger (n);
        boolean prime = number.isProbablePrime(1);
        
        if(prime){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
    
}
