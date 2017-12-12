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
public class A7Q3 {
//sets 1 as factor for every number
//if the number being divided by the factor is not a whole number then it does not display the number
//then repeats until it reaches the input number
    public void factors(int num) {
        if (num % 1 == 0) {
            num /= 1;
            for (int i = 1; i <= num; i++) {


                {
                    //print out the factors of the input number
                    if (num % i == 0) {
                        System.out.println("Your factors are: " + i);
                    }
                }
            }
        }




        /**
         * @param args the command line arguments
         */
    }

    public static void main(String[] args) {
        A7Q3 test = new A7Q3();
        Scanner in = new Scanner(System.in);
        //Asks for integer to be factored
        System.out.println("Please enter your number");
        int a = in.nextInt();
        //prints out using factors method
        test.factors(a);
    }
}
