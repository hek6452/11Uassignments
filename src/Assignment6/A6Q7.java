/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author hek6452
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] n = new int[1001];
        int prime = 2;
        //fills the array with numbers starting from 2 to the end of array
        for (int i = 0; i < n.length; i++) {
            n[i] = i + 2;
        }
        
        //loops until there are no more primes
        while (prime<=1001);
        //find next prime
         for (int p2 = prime+1; p2 < n.length; p2++){
             if (prime>=1001){
                 break;
                 
             }
         }
    //marks all multiples of current primes as 0
        for (int p = 2; (p * prime) - 2 < n.length; p++) {
            n[(p * prime) - 2] = 0;
        }
        
        for (int i = 0; i < n.length; i++) {
            System.out.println("The prime numbers between 0 and 1001: "n[i]);
        }
    }
}
