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
public class UbbiDubbi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int p = 0;
        while (p < 1) {
            //Get word from user
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter word to be translated: ");
            String word = input.nextLine();
            //Allows word to start with both lowercase and uppercase
            word=word.toLowerCase();
            //if word is "EXIT", prints out farewell and terminates program
            String exit = "EXIT";
            if (word.equals(exit)) {
                System.out.println("See you in Narnia lightning Macqueen");
                break;
            }

           //blank string translate and foundvowel boolean=false
            String translate = "";
            Boolean foundvowel = false;

            //replaces the vowel at it's specific location
            for (int i = 0; i < word.length(); i++) {
                //if letter is a vowel and the found vowel is false then translate
                if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                        || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundvowel == false) {
            
                    translate = translate + "ub";
                    translate = translate + word.charAt(i);
                    //sets foundvowel to true
                    foundvowel = true;
                } else {
                    //if the letter is a vowel and  foundvowel is true then a vowel will be added to translate
                    if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                            || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundvowel == false) {

                        translate = translate + word.charAt(i);
                    } else {
                        //then letter vowel is added to the translate and foundvowel=false
                        translate = translate + word.charAt(i);
                        foundvowel = false;
                    }

                }

            }
            //output answer
            System.out.println(translate);
            p = p + 1;
        }

    }
}
