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
        //create doubles for the lowest average and highest average
        double first = classnum[0];
        double last = classnum[students - 1];
        //list out marks in order from smallest to largest
        System.out.println("Your marks in order are:");
        for (int i = 0; i < classnum.length; i++) {
            System.out.println(classnum[i]);

        }
        //tell user average, lowest and highest marks in a "nice way"
        System.out.println("The class average is " + average + "!");
        System.out.println("Your lowest mark is " + first + ", you always have room to improve :).");
        System.out.println("Your highest mark is " + last + "! Hey, grab a cookie!");
    }
}
