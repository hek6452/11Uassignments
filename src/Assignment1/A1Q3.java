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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City javatown = new City();
        //create robot
        Robot kevin= new Robot(javatown,5,0,Direction.EAST);
        //create mountain
        new Wall (javatown,5,2,Direction.WEST);
        new Wall (javatown,5,2,Direction.NORTH);
        new Wall(javatown,4,3,Direction.WEST);
        new Wall (javatown,3,3,Direction.WEST);
        new Wall (javatown,3,3,Direction.NORTH);
        new Wall (javatown,3,3,Direction.EAST);
        new Wall (javatown,4,4,Direction.NORTH);
        new Wall(javatown,4,4,Direction.EAST);
        new Wall (javatown,5,4,Direction.EAST);
        //Create flag
        Thing flag = new Thing(javatown,5,1);
        //Make robot climb mountain
        kevin.move();
        kevin.pickThing();
        kevin.turnLeft();
        kevin.move();
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.move();
        kevin.turnLeft();
        kevin.move();
        kevin.move();
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.move();
        kevin.putThing();
        kevin.move();
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.move();
        kevin.turnLeft();
        kevin.move();
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.move();
        kevin.move();
        kevin.turnLeft();
        
        
        
        
    }
}
