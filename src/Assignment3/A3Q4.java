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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create City
        City jt = new City();
        //create robot
        Robot mac = new Robot(jt, 3, 3, Direction.SOUTH);
        //create blocks
        new Wall(jt, 1, 1, Direction.NORTH);
        new Wall(jt, 1, 1, Direction.WEST);
        new Wall(jt, 1, 2, Direction.NORTH);
        new Wall(jt, 1, 2, Direction.EAST);
        new Wall(jt, 2, 1, Direction.SOUTH);
        new Wall(jt, 2, 1, Direction.WEST);
        new Wall(jt, 2, 2, Direction.SOUTH);
        new Wall(jt, 2, 2, Direction.EAST);

        new Wall(jt, 1, 4, Direction.NORTH);
        new Wall(jt, 1, 4, Direction.WEST);
        new Wall(jt, 1, 5, Direction.NORTH);
        new Wall(jt, 1, 5, Direction.EAST);
        new Wall(jt, 2, 4, Direction.SOUTH);
        new Wall(jt, 2, 4, Direction.WEST);
        new Wall(jt, 2, 5, Direction.SOUTH);
        new Wall(jt, 2, 5, Direction.EAST);

        new Wall(jt, 4, 1, Direction.NORTH);
        new Wall(jt, 4, 1, Direction.WEST);
        new Wall(jt, 4, 2, Direction.NORTH);
        new Wall(jt, 4, 2, Direction.EAST);
        new Wall(jt, 5, 1, Direction.SOUTH);
        new Wall(jt, 5, 1, Direction.WEST);
        new Wall(jt, 5, 2, Direction.SOUTH);
        new Wall(jt, 5, 2, Direction.EAST);

        new Wall(jt, 4, 4, Direction.NORTH);
        new Wall(jt, 4, 4, Direction.WEST);
        new Wall(jt, 4, 5, Direction.NORTH);
        new Wall(jt, 4, 5, Direction.EAST);
        new Wall(jt, 5, 4, Direction.SOUTH);
        new Wall(jt, 5, 4, Direction.WEST);
        new Wall(jt, 5, 5, Direction.SOUTH);
        new Wall(jt, 5, 5, Direction.EAST);

        int block = 0;
        int side = 0;
        int step = 0;
        //make robot  circle blocks
//nest the indivual steps and sides within the blocks that were travelled
        while (block < 4) {
            while (side < 4) {
                //this allows the robot mo move only the the end of the street
                while (step < 3) {
                    mac.move();
                    step = step + 1;

                }
                //robot will turn left onto next street, then add 1 to the step count 
                mac.turnLeft();
                side = side + 1;
                step = 0;
            }
            //robot turns onto and completes final side of block, then resets 
            mac.turnLeft();
            block = block + 1;
            side = 0;
        }

    }
}
