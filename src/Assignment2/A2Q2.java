/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author hek6452
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create city
        City javatown = new City();
        //Create robot
        Robot karel = new Robot(javatown, 3, 0, Direction.EAST);
        //Create track and hurdles
        new Wall(javatown, 3, 0, Direction.SOUTH);
        new Wall(javatown, 3, 1, Direction.SOUTH);
        new Wall(javatown, 3, 2, Direction.SOUTH);
        new Wall(javatown, 3, 3, Direction.SOUTH);
        new Wall(javatown, 3, 4, Direction.SOUTH);
        new Wall(javatown, 3, 5, Direction.SOUTH);
        new Wall(javatown, 3, 6, Direction.SOUTH);
        new Wall(javatown, 3, 7, Direction.SOUTH);
        new Wall(javatown, 3, 8, Direction.SOUTH);
        new Wall(javatown, 3, 0, Direction.EAST);
        new Wall(javatown, 3, 1, Direction.EAST);
        new Wall(javatown, 3, 3, Direction.EAST);
        new Wall(javatown, 3, 6, Direction.EAST);
        //Create chicken Dinner\
        new Thing(javatown, 3, 8);
        //Get robot to win chicken dinner

        while (karel.canPickThing() == false) {
            if (karel.countThingsInBackpack() < 1
                    && karel.frontIsClear()) {
                karel.move();
            } else {
                karel.turnLeft();
            

            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            if (karel.canPickThing() == true) {
                karel.pickThing();
                }
            }
        }
    }
}