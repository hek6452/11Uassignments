/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author hek6452
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create city
        City jt = new City();
        //Make robot
        Robot mac = new Robot(jt, 1, 1, Direction.EAST);
        //Create mine
        new Wall(jt, 1, 1, Direction.WEST);
        new Wall(jt, 1, 3, Direction.NORTH);
        new Wall(jt, 1, 3, Direction.SOUTH);
        new Wall(jt, 1, 4, Direction.NORTH);
        new Wall(jt, 1, 4, Direction.SOUTH);
        new Wall(jt, 1, 5, Direction.NORTH);
        new Wall(jt, 1, 5, Direction.SOUTH);
        new Wall(jt, 1, 5, Direction.EAST);
        //Create ore
        new Thing(jt, 1, 3);
        new Thing(jt, 1, 4);
        new Thing(jt, 1, 5);


        int run = 0;

        while (true) {
            while (mac.canPickThing() == false) {
                while (run < 3) {
                    mac.move();
                    if (mac.frontIsClear() == false && mac.countThingsInBackpack() == 1) {
                        mac.putThing();
                        mac.turnLeft();
                        mac.turnLeft();
                        mac.move();
                        run = run + 1;
                    }

                    while (mac.canPickThing()) {
                        mac.pickThing();
                        mac.turnLeft();
                        mac.turnLeft();
                        mac.move();
                    }
                }
                mac.turnLeft();
                mac.turnLeft();
                mac.move();
                mac.turnLeft();
                mac.turnLeft();
            }

        }
    }
}
