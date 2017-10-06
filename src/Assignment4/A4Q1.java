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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scan input text
        Scanner input = new Scanner(System.in);
        //ask to input name
        System.out.println("Hey guy");
        System.out.println("Please enter your name");
        String firstName = input.nextLine();
        //display name
        System.out.println("Hello " + firstName + ". How are you today?");

    }
}
