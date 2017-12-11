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

    public void factors(int num) {
        if (num % 2 == 0) {
            System.out.println("Your factors for you number are: ");
            System.out.println(2 + "");
            num /= 2;
        }
        if(num%3==0){
            System.out.println(3+"");
            num/=3;
        }





        /**
         * @param args the command line arguments
         */
    }

    public static void main(String[] args) {
        A7Q3 test = new A7Q3();
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your integer");
        int a = in.nextInt();
        test.factors(a);
    }
}
