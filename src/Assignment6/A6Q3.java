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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create array for numbers
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[2];
   

        //create array for numbers input
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("What are your numbers?");
            numbers[i] = input.nextDouble();
        }
            //sort numbers
            double temp=0;
            if (numbers[0]>numbers[1]){
                temp=numbers[0];
                numbers[0]=numbers[1];
                numbers[1]=temp;

            }
            System.out.println("Your numbers in order are "+numbers[0] + ", " + numbers[1]);

        }
    }

