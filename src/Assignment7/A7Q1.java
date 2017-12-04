/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;
import java.util.Scanner;
/**
 *
 * @author hek6452
 */
public class A7Q1 {
 public double areaOfCircle(double radius, double pi) {
        //calculate area
        double answer = pi * (radius*radius);
//send back the answer
        return answer;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
          A7Q1 circleArea = new A7Q1();
          System.out.println("Please enter the radius of circle");
          double r=in.nextDouble();
          double pi=3.14159;
          
          double area=circleArea.areaOfCircle(r, pi);
           System.out.println("The area is "+area);
    }
}
