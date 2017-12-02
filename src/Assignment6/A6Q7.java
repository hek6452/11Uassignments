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
        int m = 1000;// amount of total number
        int[] n = new int[m + 1];
        int[] primes = new int[m + 1];

        // fill the array with natural number
        for (int i = 0; i < n.length - 2; i++) {
            n[i] = i + 2;
        }

        // j is the amount of primes
        int j = 0;

        // marking the non-primes
        for (int i = 0; i < m; i++) {
            if (n[i] != -1) {
                for (j = 2 * n[i] - 2; j < m; j = j + n[i]) {
                    n[j] = -1;
                }
            }
        }

        // fill the prime array
        j = 0;
        for (int i = 0; i < m && j < primes.length; i++) {
            if (n[i] != -1) {
                primes[j++] = n[i];
            }
        }

        // ** print the prime
        for (int i = 0; i < j; i++) {
            System.out.println(primes[i]);
        }
    }
}
