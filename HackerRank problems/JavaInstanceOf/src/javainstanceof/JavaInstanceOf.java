
package javainstanceof;

import java.util.*;
/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-instanceof-keyword/problem?isFullScreen=true
 */
public class JavaInstanceOf {
    
    public static void main(String[] args) {
        
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++){
           String s=sc.next();
           if(s.equals("Student"))mylist.add(new Student());
           if(s.equals("Rockstar"))mylist.add(new Rockstar());
           if(s.equals("Hacker"))mylist.add(new Hacker());
        }
        System.out.println(count(mylist));
    }
    static String count(ArrayList mylist){
        int studentInstanceCount = 0;
        int rockstarInstanceCount = 0;
        int hackerInstanceCount = 0;

        for(int i = 0; i < mylist.size(); i++){
            Object element=mylist.get(i);
            
            if(element instanceof Student){
                studentInstanceCount++;
            }  
            if(element instanceof Rockstar){
                rockstarInstanceCount++;
            }
            if(element instanceof Hacker){
                hackerInstanceCount++;
            }
        }
      String ret = Integer.toString(studentInstanceCount)+" "+ Integer.toString(rockstarInstanceCount)+" "+ Integer.toString(hackerInstanceCount);
      return ret;
   }
}
class Student{}

class Rockstar{}

class Hacker{}