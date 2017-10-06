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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // recieve input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the measurement in inches you wish to convert ");
        double measurement=input.nextDouble();
        
        double answer= measurement *2.54;
        System.out.println(measurement+" Inches is the same as "+answer+" cm");
        
    }
}
