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

        //Storing marks
        System.out.println("How many students in the class?");
        int students = input.nextInt();
        for (int i = 0; i < marks.length; i++) {

            System.out.println("What was " + marks[i] + " ?");
            average[i] = input.nextDouble();

        }
        //Taking all marks and adding together
        double overall = 0;
        for (int i = 0; i < average.length; i++) {
            //adds all marks to total mark pool juice
            overall = overall + average[i];
        }
        //calculate total average
        double overallave = (int) Math.ceil(overall / students);

        System.out.println("The class average is " + overallave);

    }
}
