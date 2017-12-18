/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author hek6452
 */
public class A7Q5 {

    public void chaotic(int nast) {
//however many lines of asterisks the user input
        for (int i = 0; i < nast; i++) {
            //produce a random number of asterisks to output
            int num = (int) (Math.random() * (5 - 1 + 1)) + 1;
            //print out the random asterisks
            for (int n = 0; n < num; n++) {
                //prints out one asterisk
                System.out.print("*");
            }
            //every time it prints out a random number of asterisks it will change the line,
            System.out.println("");
        }
        //until it prints out the amount of lines that the user had input

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        A7Q5 test = new A7Q5();
        //get the number of lines of asterisks that user wants
        System.out.println("Enter how many lines of asterisks you would like: ");
        String ast = in.nextLine();
        //convert string to integer (I found this on google)
        int nast = Integer.parseInt(ast);
        //execute method
        test.chaotic(nast);
    }
}
