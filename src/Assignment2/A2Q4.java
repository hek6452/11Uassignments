/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author hek6452
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create city
        City javatown = new City();
        //Create robot
        Robot mac = new Robot(javatown, 0, 1, Direction.EAST);

        //Create king Java's Castle of monotony
        new Wall(javatown, 1, 1, Direction.NORTH);
        new Wall(javatown, 1, 1, Direction.WEST);
        new Wall(javatown, 1, 1, Direction.EAST);
        new Wall(javatown, 1, 1, Direction.SOUTH);
        new Wall(javatown, 1, 4, Direction.NORTH);
        new Wall(javatown, 1, 4, Direction.WEST);
        new Wall(javatown, 1, 4, Direction.EAST);
        new Wall(javatown, 1, 4, Direction.SOUTH);
        new Wall(javatown, 4, 1, Direction.NORTH);
        new Wall(javatown, 4, 1, Direction.WEST);
        new Wall(javatown, 4, 1, Direction.EAST);
        new Wall(javatown, 4, 1, Direction.SOUTH);
        new Wall(javatown, 4, 4, Direction.NORTH);
        new Wall(javatown, 4, 4, Direction.WEST);
        new Wall(javatown, 4, 4, Direction.EAST);
        new Wall(javatown, 4, 4, Direction.SOUTH);
        new Wall(javatown, 2, 2, Direction.NORTH);
        new Wall(javatown, 2, 2, Direction.WEST);
        new Wall(javatown, 3, 2, Direction.SOUTH);
        new Wall(javatown, 3, 2, Direction.WEST);
        new Wall(javatown, 3, 3, Direction.SOUTH);
        new Wall(javatown, 3, 3, Direction.EAST);
        new Wall(javatown, 2, 3, Direction.NORTH);
        new Wall(javatown, 2, 3, Direction.EAST);
        //Make mac skirt around

        while (true) {
            mac.turnLeft();
            mac.turnLeft();
            mac.turnLeft();
            if (mac.frontIsClear()) {
                mac.move();
            } else {
                mac.turnLeft();
            }
            if (mac.frontIsClear()) {
                mac.move();
            } else {
                mac.turnLeft();
            }
        }



    }
}
