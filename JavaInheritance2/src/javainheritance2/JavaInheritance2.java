/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainheritance2;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-inheritance-2/problem?isFullScreen=true
 */
public class JavaInheritance2 {

    public static void main(String[] args) {
        
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
    
}
class Arithmetic{
    int add(int a, int b){
        int sum = a + b;
        return sum;
    }
}
class Adder extends Arithmetic{
    
}