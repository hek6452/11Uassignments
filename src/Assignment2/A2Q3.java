/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author hek6452
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make magic happen
        City javatown= new City();
        
        Robot karel=new Robot(javatown,63,23,Direction.EAST);
        
    }
}
