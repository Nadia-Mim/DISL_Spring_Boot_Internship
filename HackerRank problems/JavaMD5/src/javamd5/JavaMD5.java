package javamd5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-md5/problem?isFullScreen=true
 */
public class JavaMD5 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner (System.in);
        String msg = sc.nextLine();
        MessageDigest md = MessageDigest.getInstance("MD5");
        //return byte array of the message digest string input
        byte [] messageDigest = md.digest(msg.getBytes());
        
        for (byte b: messageDigest){
            System.out.printf ( "%02x", b);
        }
    }
    
}
