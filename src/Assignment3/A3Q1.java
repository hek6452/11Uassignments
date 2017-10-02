/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author hek6452
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City jt = new City();
        //Create robot
        Robot mac = new Robot(jt, 0, 2, Direction.WEST);
        //make wall thing
        new Wall(jt, 1, 1, Direction.NORTH);
        new Wall(jt, 1, 1, Direction.WEST);
        new Wall(jt, 1, 2, Direction.NORTH);
        new Wall(jt, 1, 2, Direction.EAST);
        new Wall(jt, 2, 1, Direction.WEST);
        new Wall(jt, 2, 1, Direction.SOUTH);
        new Wall(jt, 2, 2, Direction.SOUTH);
        new Wall(jt, 2, 2, Direction.EAST);
        //make robot orbit twice
        int moveCounter = 0;
        
        while (moveCounter < 8) {
            
            mac.move();
            mac.move();
            mac.turnLeft();
            mac.move();
            moveCounter = moveCounter + 1;
            
        }
    }
}
