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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Input scanner
       
         System.out.println("Enter the speed limit: ");
           Scanner limit = new Scanner(System.in);
         int lmt=limit.nextInt();
         System.out.println("Enter the recorded speed of the car: ");
          Scanner speed = new Scanner(System.in);
         int spd=speed.nextInt();
         
         int speeding=spd-lmt;
         
        while(true){
        if (spd<=lmt){
        System.out.println("Congratulations, you are within the speed limit!");
        
        }
        if (speeding>1&&speeding<20);
        System.out.println("");
    }
         
    }
}
