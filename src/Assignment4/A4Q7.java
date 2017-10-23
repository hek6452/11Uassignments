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
        //creates integer for initial position
        int place = 1;
        //loops runs if the position is under 99
        while (place < 99) {
            System.out.println("Enter sum of dice: ");

            Scanner roll = new Scanner(System.in);

            int dice = roll.nextInt();
            //adds the dice sum to the overall position
            place = place + dice;

            //sets ladders and snakes in place 
            if (place == 54) {
                place = 19;
                System.out.println("Oh no!Slippery snake!");
            }
            if (place == 90) {
                place = 48;
                System.out.println("Oh no!Slippery snake!");
            }
            if (place == 99) {
                place = 77;
                System.out.println("Oh no!Slippery snake!");
            }
            if (place == 9) {
                place = 34;
                System.out.println("Found a ladder!");
            }
            if (place == 40) {
                place = 64;
                System.out.println("Found a ladder!");
            }
            if (place == 67) {
                place = 86;
                System.out.println("Found a ladder!");
            }
            //does not allow for position to be higher than 100
            if (place >= 100) {
                place = 100;
                System.out.println("You are now on square 100");
                System.out.println("Congradulations, YOU WIN!");
                break;
            }
            //displays position after dice roll
            System.out.println("You are now on square " + place);
        }
    }
}
