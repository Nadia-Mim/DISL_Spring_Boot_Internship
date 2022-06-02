/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericpractice;

/**
 *
 * @author Nadia Mim
 */
public class Printer <T> {
    T print;
    public Printer(T print){
        this.print = print;           
    }
    public void print(){
        System.out.println(print);
    }
}
