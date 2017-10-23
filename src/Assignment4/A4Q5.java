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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Input scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please write your name: ");
        String name = input.nextLine();
        System.out.println("");
        System.out.println("What was the first test out of?: ");
        double t1 = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double t1score = input.nextDouble();
        System.out.println("");
        System.out.println("What was the second test out of?: ");
        double t2 = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double t2score = input.nextDouble();
        System.out.println("");
        System.out.println("What was the third test out of?: ");
        double t3 = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double t3score = input.nextDouble();
        System.out.println("");
        System.out.println("what was the fourth test out of?: ");
        double t4 = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double t4score = input.nextDouble();
        System.out.println("");
        System.out.println("What was the fifth test out of?: ");
        double t5 = input.nextDouble();
        System.out.println("What did you get?: ");
        double t5score = input.nextDouble();
        System.out.println("");

        double t1ave = t1score / t1;
        double t2ave = t2score / t2;
        double t3ave = t3score / t3;
        double t4ave = t4score / t4;
        double t5ave = t5score / t5;

        double totalave = (t1ave + t2ave + t3ave + t4ave + t5ave) / 5;

        System.out.println("Test scores for " + name);

        System.out.println("Test1: " + t1ave);
        System.out.println("Test2: " + t2ave);
        System.out.println("Test3: " + t3ave);
        System.out.println("Test4: " + t4ave);
        System.out.println("Test5: " + t5ave);
        System.out.println("");
        System.out.println("Average: " + totalave);
    }
}
