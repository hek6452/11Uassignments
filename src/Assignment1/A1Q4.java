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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create City
        City javatown=new City();
        //Create robots
        Robot kevin=new Robot(javatown,0,0,Direction.SOUTH);
        Robot steve=new Robot (javatown,0,1,Direction.SOUTH);
        //Create death obstacle
        new Wall(javatown,0,1,Direction.WEST);
        new Wall(javatown,1,1,Direction.WEST);
        new Wall(javatown,1,1,Direction.SOUTH);
        //Make robots suicide
        kevin.move();
        steve.move();
        kevin.move();
        steve.turnLeft();
        kevin.turnLeft();
        kevin.move();
        steve.move();
        kevin.turnLeft();
        steve.turnLeft();
        steve.turnLeft();
        steve.turnLeft();
        kevin.turnLeft();
        steve.move();
        kevin.turnLeft();
        steve.turnLeft();
        steve.turnLeft();
        steve.turnLeft();
        kevin.turnLeft();
        steve.move();
        
        
        
        
        
        
    }
}
