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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);
        //ask for espenses for items during prom
        System.out.println("Please enter cost for Food");
        int food=input.nextInt();
        System.out.println("Please enter cost for DJ");
        int dj=input.nextInt();
        System.out.println("Please enter cost for rent of the hall");
        int hall=input.nextInt();
        System.out.println("Please enter the cost of decorations");
        int decor=input.nextInt();
        System.out.println("Please enter the cost for staff");
        int staff=input.nextInt();
        System.out.println("Please enter the miscellaneous cost");
        int misc=input.nextInt();
        //Calculate total cost of all expenses
        int total= food+dj+hall+decor+staff+misc ;
        //Find the amount of tickets needed to break even by dividing by ticket cost and adding 1 to break even
        int answer= total /35+1;
        //Display results
        System.out.println("The total cost is "+total+". You will need "+answer+" tickets to break even.");
        
        
    }
}
