/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author Kevin
 */
public class Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City jt=new City();
        //robot
        Robot mac=new Robot(jt,1,1,Direction.EAST);
        // obstacle
        new Wall (jt,1,1,Direction.WEST);
        new Wall (jt,3,1,Direction.WEST);
        new Wall (jt,3,1,Direction.WEST);
        new Wall (jt,3,1,Direction.WEST);
        new Wall (jt,3,1,Direction.WEST);
        new Wall (jt,3,1,Direction.WEST);
        
    }
    
}
