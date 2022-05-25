/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaanagrams;

import java.util.*;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: 
 */
public class JavaAnagrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    static boolean isAnagram(String a, String b) {
        
        if(a.length() != b.length()){
            return false;
        }
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        HashMap <Character, Integer> charfrequency = new HashMap <Character, Integer> ();
        
        for (int i = 0; i<a.length() ; i++){
            char character = a.charAt(i);
            
            if(!charfrequency.containsKey(character)){
                charfrequency.put(character, 1);
            }else{
                charfrequency.put(character, charfrequency.get(character)+1);
            }
        }
        for (int j = 0; j<b.length() ; j++){
            char character = b.charAt(j);
            
            if(!charfrequency.containsKey(character)){
                return false;
                
            }else if(charfrequency.get(character) ==0){
                    return false;
                    
            }else{
                charfrequency.put(character, charfrequency.get(character)-1);
            }
        }
        return true;
        
    }
    
}
