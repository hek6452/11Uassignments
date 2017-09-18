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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create city
        City javatown=new City();
        //Create robots
      Robot maria=new Robot(javatown,0,1,Direction.WEST); 
      Robot karel=new Robot(javatown,3,3,Direction.EAST);
      karel.setLabel("K");
      maria.setLabel("M");
        //Create home
      new Wall(javatown,2,3,Direction.WEST);
      new Wall (javatown,2,3,Direction.NORTH);
      new Wall (javatown,2,3,Direction.EAST);
      new Wall (javatown,3,3,Direction.EAST);
      new Wall (javatown,3,3,Direction.SOUTH);
      //Create shopping items
      Thing iphone=new Thing(javatown,0,0);
      Thing refrigerater=new Thing(javatown,1,0);
      Thing ball=new Thing(javatown,1,1);
      Thing tv=new Thing (javatown,1,2);
      Thing watch=new Thing (javatown,2,2);
      //make robots collect items
      maria.move();
      karel.turnLeft();
      karel.turnLeft();
      maria.turnLeft();
      maria.pickThing();
      karel.move();
      maria.move();
      karel.turnLeft();
      karel.turnLeft();
      karel.turnLeft();
      maria.pickThing();
      karel.move();
      maria.turnLeft();
      maria.move();
      karel.pickThing();
      karel.move();
      maria.pickThing();
      karel.pickThing();
      karel.turnLeft();
      
      
      
     
      
    }
}
