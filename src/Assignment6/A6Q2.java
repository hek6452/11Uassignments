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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //asks for the amount of students in the class

        Scanner input = new Scanner(System.in);
        System.out.println("How many people are in your class?");
        int students = input.nextInt();
        double[] classnum = new double[students];



        //Get heights then place into array
        for (int i = 0; i < classnum.length; i++) {
            System.out.println("What are your heights in centimetres?");
            classnum[i] = input.nextDouble();



        }
        //adds all marks together
        double average = 0;
        for (int i = 0; i < classnum.length; i++) {
            average = average + classnum[i]/students;

        }
        //calculating the total averages
        double averages = average;
        System.out.println("Your class average height is "+averages+" centimetres");
    }
}
