/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author hek6452
 */
public class A1Q1 {
    private static Direction SOUTH;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create city
        City javatown = new City ();
        //Create robot
        Robot kevin = new Robot (javatown, 7,6, Direction.EAST);
        //Create Building
     new Wall (javatown,6,6,Direction.SOUTH);
     new Wall (javatown,6,7,Direction.SOUTH);
     new Wall (javatown,5,7,Direction.EAST);
     new Wall (javatown,6,7,Direction.EAST);
     new Wall (javatown,5,7,Direction.NORTH);
     new Wall (javatown,5,6,Direction.NORTH);
     new Wall (javatown,6,6,Direction.WEST);
     new Wall(javatown,5,6,Direction.WEST);
     //Have robot loop around bulding
     kevin.move();
     kevin.move();
     kevin.turnLeft();
     kevin.move();
     kevin.move();
     kevin.move();
     kevin.turnLeft();
     kevin.move();
     kevin.move();
     kevin.move();
     kevin.turnLeft();
     kevin.move();
     kevin.move();
     kevin.move();
     kevin.turnLeft();
     kevin.move();
            
            
     
    }
}
