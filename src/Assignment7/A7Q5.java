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
public class A7Q5 {

    public void chaotic(String ast) {
         
        int num = (int) (Math.random() * (10 - 5 + 1)) + 5;
      

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        A7Q5 test = new A7Q5();
        System.out.println("Enter how many lines of asterisks you would like: ");
        String ast = in.nextLine();
        test.chaotic(ast);
    }
}
