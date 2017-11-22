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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        System.out.println("The class average is " + average);
        //Sort averages for 
        for (int i = 0; i < classnum.length - 1; i++) {
            for (int j = i + 1; j < classnum.length; j++) {
                //compare two numbers
                if (classnum[i] > classnum[j]) {
                    double temp = 0;
                    temp = classnum[i];
                    classnum[i] = classnum[j];
                    classnum[j] = temp;
                }

            }
        }
        System.out.println("Your marks in order are:");
        for (int i = 0; i < classnum.length; i++) {
            System.out.println(classnum[i]);
        }
    }
}
