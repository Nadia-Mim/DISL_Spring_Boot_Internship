package patternsyntaxchecker;

import java.util.Scanner;
import java.util.regex.*;
/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true
 */
public class PatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        for(int i =0; i < testCases; i++){
            String pattern = in.nextLine();
            
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
    }
    
}
