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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Input scanner

        System.out.println("Enter the speed limit: ");
        Scanner input = new Scanner(System.in);
        int lmt = input.nextInt();
        System.out.println("Enter the recorded speed of the car: ");
        int spd = input.nextInt();

        int speeding = spd - lmt;

        if (speeding <= 0) {
            System.out.println("Congratulations, you are within the speed limit!");

        }
        if (speeding >= 1 && speeding < 20) {
            System.out.println("You are speeding and your fine is $100.");
        }
        if (speeding >= 21 && speeding < 30) {
            System.out.println("You are speeding and your fine is $270");
        }
        if (speeding >= 31) {
            System.out.println("You are speeding and your fine is $500.");
        }
    }

}
