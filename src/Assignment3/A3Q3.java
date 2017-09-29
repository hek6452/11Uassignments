/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author hek6452
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // City
        City jt = new City();
        //robot
        Robot mac = new Robot(jt, 1, 1, Direction.EAST, 20);
        int moveCounter = 0;
        int plant=0;
        while (moveCounter < 5) {
            mac.putThing();
            mac.move();
            if(moveCounter >=4) {
                mac.turnLeft();
                mac.turnLeft();
                mac.turnLeft();
                mac.move();
            }

            moveCounter = moveCounter + 1;
        }

    }
}
