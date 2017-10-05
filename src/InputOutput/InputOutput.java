/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.util.Scanner;

/**
 *
 * @author hek6452
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // say hello
        System.out.println("Hello World");
        System.out.print("Hello");
        System.out.print("world\n");

        //create a scanner for input
        Scanner input = new Scanner(System.in);
        //Name variables
        System.out.println("mister");
        //Get name from the user
        System.out.println("Please enter your name");
        String firstName = input.nextLine();

        //output the variable to the screen
        System.out.println("Hello " + firstName);

        //ask the person the year they were born
        System.out.println("Please enter the year you were born");
        //get the year
        int birthYear = input.nextInt();

        //basic error checking
        while (birthYear > 2017) {
            System.out.println("I don't think so time traveler!");
            birthYear = input.nextInt();
        }


        //calculate age
        int age = 2017 - birthYear;

        System.out.println("You are " + age + " years old");

        //for loop to count down from 10
        for (int count = age; count > 0; count = count - 1) {
            //output the value in the variable
            System.out.println(count);

            Thread.sleep(500);
            if (age==15)
                System.out.println("The floor is lava!");
            if(age==10)
                System.out.println("Run Jose run!");
            if(age=5)
                System.out.println("Csanits is going to eat you!");


        }

    }
}
