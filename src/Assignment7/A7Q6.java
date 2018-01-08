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
public class A7Q6 {

    public void lastDigit(int number) {
        //use modulus to retrieve the rightmost digit of the int input by the user
        //by dividing number by 10, and the remainder is our rightmost digit
        int lstdgt = number % 10;
        //if the rightmost digit is negative we just want to number so we multiply by
        //-1 in order to make it positive
        if (lstdgt < 0) {
            lstdgt = lstdgt * (-1);
        }
        //print out rightmost number
        System.out.println(lstdgt);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        A7Q6 test = new A7Q6();
        //get the number from user
        System.out.println("Enter your number: ");
        String num = in.nextLine();
        //convert string to integer (I found this on google)
        int number = Integer.parseInt(num);
        //execute method
        test.lastDigit(number);
    }

}
