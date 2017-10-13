/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author hek6452
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create city
        City jt = new City();
        //ROBOT
        Robot mac = new Robot(jt, 1, 1, Direction.EAST);
        //create pile
        new Thing(jt, 1, 1);
        new Thing(jt, 1, 1);
        new Thing(jt, 1, 1);
        new Thing(jt, 1, 1);
        new Thing(jt, 1, 1);
        new Thing(jt, 1, 1);
        new Thing(jt, 1, 1);
        new Thing(jt, 1, 1);
        new Thing(jt, 1, 1);
        new Thing(jt, 1, 1);

        int moveCounter = 0;
        jt.showThingCounts(true);
        //after each time the robot transports a Thing, it adds a counter to keep count how many
        //items it has moved
        while (moveCounter < 10) {
            mac.pickThing();
            mac.move();
            mac.putThing();
            mac.turnLeft();
            mac.turnLeft();
            mac.move();
            mac.turnLeft();
            mac.turnLeft();
            moveCounter = moveCounter + 1;
        }
        mac.move();


    }
}
