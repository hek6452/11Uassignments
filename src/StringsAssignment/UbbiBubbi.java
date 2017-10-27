/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsAssignment;

import java.util.Scanner;

/**
 *
 * @author hek6452
 */
public class UbbiBubbi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter word to be translated: ");
        String word = input.nextLine();


        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' 
                    || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                String front = word.substring(0, i);
                String ending = word.substring(i);

                String translated = ending + front + "ub";
                System.out.println(word + " in Ubbi Dubbi is: " + translated);
            }
        }

    }
}
