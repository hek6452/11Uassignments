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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Enter sum of dice: ");
         Scanner input = new Scanner(System.in);
         int dice = input.nextInt();
         System.out.println("You are now on square "+dice);
         int result= dice+1;
         int dicesum=result+dice;
         
    }
}
