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
public class JavaExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //create a city
        City javatown=new City();
        
        //Put robot in the city
        Robot kevin=new Robot(javatown,2,1,Direction.EAST);
        //put a wall up
        new Wall(javatown,2,5,Direction.EAST);
        new Thing(javatown,2,4);
        //check if front is clear
        if (kevin.frontIsClear())
        {
            //move forward
            kevin.move();
        }
         else{
            //if front is blocked
            kevin.turnLeft();
        
        }
        
        //move until the wall
            while(kevin.frontIsClear()) {
                //If there is somethingto pick up
                if(kevin.canPickThing()){
                    //Pick it up
                    kevin.pickThing();
                }
            
                //move forwards
                kevin.move();
               
        }
            //turn robot away from the wall
            kevin.turnLeft();
            
            //Asking if robot is on street
            if (kevin.getStreet()==3
            && kevin.getAvenue()==2)
            kevin.move();
            //Asking if wall in front or not
            if(!kevin.frontIsClear()){
            //make row of things
            }
                    
                    
                }
    
}
//PRIMITIVES:
//Integer-> (Short)int(long)-positive ex: negative whole numbers
//Variable-> double(flat)-positive ex: negative real numbers or 3.14,-2.0
//Character-> char-A single letter ex: "C" , "f", "2"
//True/False->boolean- True or False ex: true, false
// Strings->String-words or sentences ex: "Hello World"

//City/Thing/Robot/Wall= Objects

//int: yearBorn
//Start with lowercase letter
//Name that explains it's function