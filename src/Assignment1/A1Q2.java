/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author hek6452
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create city
        City javatown=new City();
        //Create tobot
        Robot kevin=new Robot(javatown,5,7,Direction.WEST);
        // Create building
          new Wall (javatown,6,6,Direction.SOUTH);
     new Wall (javatown,5,7,Direction.SOUTH);
     new Wall (javatown,5,7,Direction.NORTH);
     new Wall (javatown,5,6,Direction.NORTH);
     new Wall (javatown,6,6,Direction.WEST);
     new Wall(javatown,5,6,Direction.WEST);
     new Wall (javatown,5,7,Direction.EAST);
     //Newspaper arrival
     Thing newspaper = new Thing(javatown,6,7);
     //Make robot retrieve newspaper
     kevin.move();
     kevin.turnLeft();
     kevin.move();
     kevin.turnLeft();
     kevin.move();
     kevin.pickThing();
     kevin.turnLeft();
     kevin.turnLeft();
     kevin.move();
     kevin.turnLeft();
     kevin.turnLeft();
     kevin.turnLeft();
     kevin.move();
     kevin.turnLeft();
     kevin.turnLeft();
     kevin.turnLeft();
     kevin.move();
    }
}
