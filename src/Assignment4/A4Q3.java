/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author hek6452
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scan
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter in 4 numbers on separate lines:");
        //recieve input
        double numberone = input.nextInt();
        double numbertwo=input.nextInt();
        double numberthree=input.nextInt();
        double numberfour=input.nextInt();
        
        System.out.println("Your numbers were"+numberone+","+numbertwo+","+numberthree+", and"+numberfour);
    }
}
