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
public class A7Q2 {
 public String examGrade(int grade) {
        System.out.println("Your grade is: " + grade);
       String answer="";
        if (grade<50){
            answer= "F";        
        }
        if (grade>=50 && grade<= 59){
            answer="D";
        }
        if (grade>=60 && grade<= 69){
           answer="C";       
        }
        if (grade>=70 && grade<= 79){
            answer="B";
        }
        if (grade>=80){
            answer="A";
        }
        
return answer;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A7Q2 exam = new A7Q2();
                
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your grade:");
         int grade = in.nextInt();
     exam.examGrade();
         
         
    }
}
