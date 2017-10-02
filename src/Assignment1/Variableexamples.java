/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author hek6452
 */
public class Variableexamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create city
        City javatown = new City();
        //Create robot
        Robot mac = new Robot(javatown, 1, 1, Direction.EAST);
        // create a move counting variable
        int moveCounter = 0;
        //continue when counter is less than 10
        while (moveCounter < 10) {
            //move forward
            mac.move();
            // add 1 to move counter
            moveCounter = moveCounter + 1;
        }
        mac.turnLeft();
        mac.turnLeft();
        //Counted for loop
        for (int count=0;count<10;count=count+1) {
            mac.move();
            
        }
    }
}
