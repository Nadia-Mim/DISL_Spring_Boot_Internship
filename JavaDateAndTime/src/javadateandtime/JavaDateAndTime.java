/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadateandtime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
 */
public class JavaDateAndTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
     
        sc.close();
        
        String res = Result.findDay(month, day, year);
        System.out.println(res);
        
    }
    
}

class Result{
    
    public static String findDay(int month, int day, int year){
        
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek w = date.getDayOfWeek();
        
        return w.name();
    }
}
