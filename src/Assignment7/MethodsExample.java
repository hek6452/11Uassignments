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
public class MethodsExample {

    //void method - perform an action
    // does not return an answer
    // sometimes called a procedure
    //inside round bracket extra procedure needed to run
    public void sayHello(String name) {
        System.out.println("Hello " + name);

    }
// A double return type - needs to send a double as an answer
    //sometimes called a function

    public double areaOfRect(double length, double width) {
        //calculate area
        double answer = length * width;
//send back the answer
        return answer;
    }

    public int addFive(int a) {
        a = a + 5;
        return a;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create an object to run my methods
        MethodsExample test = new MethodsExample();

        //create a scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your name");
        //Store their name
        String name = in.nextLine();
        //Say hello to the user
        test.sayHello(name);
        System.out.println("Hello " + name);
        test.sayHello("Hello Jimmy");
        
        
        System.out.println("Please enter the length and the width of a rectangle");
        //store the 2 values
        double a = in.nextDouble();
        double b = in.nextDouble();

        //calculate the area
        double area = test.areaOfRect(a, b);
        //let user know the answer
        System.out.println("The area is " + area);

        int num = 10;
        num = test.addFive(num);
        System.out.println("Num is " + num);
    }
}
