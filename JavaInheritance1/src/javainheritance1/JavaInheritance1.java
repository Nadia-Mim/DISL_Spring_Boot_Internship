/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainheritance1;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-inheritance-1/problem?isFullScreen=true
 */
public class JavaInheritance1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
     
}
class Animal{
    void walk()
    {
            System.out.println("I am walking");
    }
}
class Bird extends Animal
{
    void fly()
    {
            System.out.println("I am flying");
    }
    void sing()
    {
            System.out.println("I am singing");
    }
}
