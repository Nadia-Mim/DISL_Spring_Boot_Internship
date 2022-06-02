package javareflection;

import java.lang.reflect.Method;
import java.util.*;
/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-reflection-attributes/problem?isFullScreen=true
 */
public class JavaReflection {

    public static void main(String[] args) {
        Student student = new Student();
        Method[] methods = Student.class.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(int i =0; i < methods.length; i++){
            methodList.add(methods[i].getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
    
}
class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}