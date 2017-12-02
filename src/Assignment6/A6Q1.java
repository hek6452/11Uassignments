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



        // create array to store name of marks
        Scanner input = new Scanner(System.in);
        System.out.println("How many people are in your class?");
        int students = input.nextInt();
        double[] classnum = new double[students];


        for (int i = 0; i < classnum.length; i++) {
            System.out.println("What are your averages?");
            classnum[i] = input.nextDouble();

        }
        //Taking all marks and adding together
        double average = 0;
        for (int i = 0; i < classnum.length; i++) {
            average = average + classnum[i] / students;
     
        }
     
        //print put average
        System.out.println("The class average is " + average);

    }
}
