/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1darrayp2;

import java.util.*;
/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-1d-array/problem?isFullScreen=true
 */
public class Java1dArrayP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game, 0)) ? "YES" : "NO" );
        }
        scan.close();
    }
    
    public static boolean canWin(int leap, int[] game, int i) {
        
        if(( i < 0) || (game[i] == 1)){
            return false;
        }else if((i == game.length-1) || (i + leap >= game.length)){
            return true;
        }
        
        game[i] = 1;
        
        return (canWin(leap, game, i+1) || canWin(leap, game, i-1) || canWin(leap, game, i+leap));
    }
    
}
