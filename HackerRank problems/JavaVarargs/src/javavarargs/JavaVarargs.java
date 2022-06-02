package javavarargs;

import java.io.*;
import java.lang.reflect.Method;
import java.util.*;
/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/simple-addition-varargs/problem?isFullScreen=true
 */
public class JavaVarargs {

    public static void main(String[] args) {
        
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            Add ob=new Add();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5);	
            ob.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Add.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            
            for(int i=0;i<methods.length;i++){
                    if(set.contains(methods[i].getName())){
                            overload=true;
                            break;
                    }
                    set.add(methods[i].getName());

            }
            if(overload){
                    throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e){
                e.printStackTrace();
        }
    }
}

class Add {

    void add(int ... values) {
        int sum = 0;
        String series = "";
        
        for(int i: values){
            sum += i;
            series += i + "+";
        }
        System.out.println((series.substring(0, series.length()-1)) + "=" + sum);
    }
}