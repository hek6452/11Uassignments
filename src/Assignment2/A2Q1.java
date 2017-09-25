/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author hek6452
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City javatown = new City();
        //Create robot
        Robot karel = new Robot(javatown, 1, 1, Direction.EAST);
        //make things
        new Thing(javatown, 1, 11);
        new Thing(javatown, 1, 2);
        new Thing(javatown, 1, 3);
        new Thing(javatown, 1, 4);
        new Thing(javatown, 1, 5);
        new Thing(javatown, 1, 6);
        new Thing(javatown, 1, 7);
        new Thing(javatown, 1, 8);
        new Thing(javatown, 1, 9);
        new Thing(javatown, 1, 10);
        //make robot pick 7 items up from row

        while (karel.frontIsClear()
                && (karel.countThingsInBackpack() < 7)) {
            if (karel.countThingsInBackpack() <= 7) {
                karel.move();
                //pick up item
                karel.pickThing();
            }

        }

        karel.move();
        karel.move();
        karel.move();
        karel.move();


    }
}
