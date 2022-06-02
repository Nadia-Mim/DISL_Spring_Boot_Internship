/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastack;
import java.util.*;
/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=true
 */
public class JavaStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
		
        while (sc.hasNext()) {
            String input=sc.next();
            boolean result = parentheses(input);
            System.out.println(result);
        }
    }
    public static boolean parentheses(String input){
        Stack <Character> stack = new Stack <Character> ();
        for(int i = 0; i < input.length(); i++){
                char c = input.charAt(i);
                
                if ((!stack.empty()) && ((((c == ')') && (stack.peek() == '(')) || ((c == '}') && (stack.peek() == '{'))) || ((c == ']') && (stack.peek() == '[')))) {
                    stack.pop();
                    
                }else{
                    stack.push(c);
                }
            }
           
        return stack.empty();
    }
    
}
