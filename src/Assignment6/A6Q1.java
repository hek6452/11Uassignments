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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // create scanner for input
        Scanner input = new Scanner(System.in);

        double[] average = new double[3];

        // create array to store name of expenses
        String[] marks = new String[3];
        marks[0] = "Mark 1";
        marks[1] = "Mark 2";
        marks[2] = "Mark 3";

        for (int i = 0; i < marks.length; i++) {
            System.out.println("How many students in the class?");
            int students = input.nextInt();
            System.out.println("What was " + marks[i] + " ?");
            average[i] = input.nextDouble();
            
        }


    }
}
