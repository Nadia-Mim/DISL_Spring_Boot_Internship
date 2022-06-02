package javasingletonpattern;
import java.util.*;
/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-singleton/problem?isFullScreen=true
 */
public class JavaSingletonPattern {

    public static void main(String[] args) {
         
    }
    
}
class Singleton{
    public String str;
    static Singleton instance = new Singleton();
    private Singleton() {}
    static Singleton getSingleInstance(){
        return instance;
    }
}
