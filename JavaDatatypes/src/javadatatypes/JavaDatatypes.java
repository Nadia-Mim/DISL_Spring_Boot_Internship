/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadatatypes;

import java.util.Scanner;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link:
 */
public class JavaDatatypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();

        for(int i = 0; i < test; i++)
        {

            try
            {
                long data = sc.nextLong();
                System.out.println(data+" can be fitted in:");
                
                if ((data >= -128) && (data <= 127)){
                    System.out.println("* byte");
                } if ((data >= -Math.pow(2, 15)) && (data <= (Math.pow(2, 15) - 1))){
                    System.out.println("* short");
                } if ((data >= -Math.pow(2, 31)) && (data <= (Math.pow(2, 31) - 1))){
                    System.out.println("* int");
                } if ((data >= -Math.pow(2, 63)) && (data <= (Math.pow(2, 63) - 1))){
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
        
        sc.close();
    }
    
}
