/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author hek6452
 */
public class A7Q4 {

    public double compundInterest(double initial, double interestRate, double years) {
        //Create first portion of equation is i
        double i =initial*(1+interestRate) ;
        //take i and raise to the power of however many years is input
        double answer= Math.pow(i, years);
        return answer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A7Q4 test = new A7Q4();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the initial amount, the the interest rate, and the number of years.");
        //store the 2 values
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        //Print out future balance using method
        double interest = test.compundInterest(a, b, c);
        System.out.println("You're balance will be: "+interest);
    }
}
