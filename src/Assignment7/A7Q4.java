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
        double answer = ;
        return answer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A7Q3 test = new A7Q3();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the length and the width of a rectangle");
        //store the 2 values
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        
        double interest = test.compundInterest(a, b, c);
        System.out.println("");
    }
}
