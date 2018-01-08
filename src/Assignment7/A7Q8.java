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
public class A7Q8 {

    public void allDigitOdd(int number) {
        boolean result = Boolean.TRUE;
        while (number > 0) {
            //retrieve the last digit of number
            int lstdgt0 = number % 10;
            //System.out.println(lstdgt0);

            //if the last digit with modulus 2 is equal to 0 then it automatically becomes false b/c that means
            //that there is an even number in the integer.
            if (lstdgt0 % 2 == 0) {
                result = false;
            }
            //remainder of number without it's last digit
            number = number / 10;
        }
        System.out.println(result);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        A7Q8 test = new A7Q8();
        //get the number from user
        System.out.println("Enter your number: ");
        String num = in.nextLine();
        //convert string to integer (I found this on google)
        int number = Integer.parseInt(num);
        //execute method
        test.allDigitOdd(number);
    }
}
