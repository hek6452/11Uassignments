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
        Scanner input = new Scanner(System.in);
        int[] primes = new int[1001];
        int prime = 2;
        //fills the array with numbers starting from 2 to the end of array
        for (int i = 0; i < primes.length; i++) {
            primes[i] = i + 2;
        }
        
        //loops until there are no more primes
        while
        //find next prime
    //marks all multiples of current primes as 0
        for (int p = 2; (p * prime) - 2 < primes.length; p++) {
            primes[(p * prime) - 2] = 0;
        }
        
        for (int i = 0; i < primes.length; i++) {
            System.out.println(primes[i]);
        }
    }
}
