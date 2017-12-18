/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class A7Q7 {

    public void lastDigit(int number) {
        //if the leftmost digit is negative we just want to number so we multiply by
        //-1 in order to make it positive
        if (number < 0) {
            number = number * (-1);
        }
        //use modulus to retrieve the leftmost digit of the int input by the user
        while (number > 9) {
            number /= 10;
        }

        //print out leftmost number
        System.out.println(number);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        A7Q7 test = new A7Q7();
        //get the number from user
        System.out.println("Enter your number: ");
        String num = in.nextLine();
        //convert string to integer (I found this on google)
        int number = Integer.parseInt(num);
        //execute method
        test.lastDigit(number);
    }

}
