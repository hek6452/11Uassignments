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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //ask for how many people in class, this question will be for 10
        System.out.println("How many people are in your class?");
        int students = input.nextInt();
        double[] classnum = new double[students];
        //Ask for the marks
        for (int i = 0; i < classnum.length; i++) {
            System.out.println("What are your averages?");
            classnum[i] = input.nextDouble();
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
        //print out marks in order
        System.out.println("Your marks in order are:");
        for (int i = 0; i < classnum.length; i++) {
            System.out.println(classnum[i]);

        }
        System.out.println("");
        //if remainder is one set as integer mid
        if (classnum.length % 2 == 1) {
            int mid = classnum.length / 2;
            System.out.println(classnum[mid]);
        }else
        //otherwise, second middle number is mid minus 1, remainder taken away
        {
            int mid = classnum.length / 2;
            int mid2 = mid - 1;
            //print out median of numbers given
            System.out.println((classnum[mid]+classnum[mid2])/2.0);
            
            
        }




    }
}
