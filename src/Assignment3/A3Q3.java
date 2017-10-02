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
        int pc = 0;
        int row = 0;
        int rev = 0;
        while (row < 4) {
            while (pc < 5) {
                mac.putThing();
                mac.move();
                pc = pc + 1;
            }
            row = row + 1;
            mac.turnLeft();
            mac.turnLeft();

            while (rev < 6) {
                mac.move();
                rev = rev + 1;
            }
            mac.turnLeft();
            mac.move();
            mac.turnLeft();
            mac.move();
            rev = 0;
            pc = 0;

        }
    }
}
