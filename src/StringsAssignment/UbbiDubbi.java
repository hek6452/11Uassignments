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
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter word to be translated: ");
            String word = input.nextLine();
            word=word.toLowerCase();
            String exit = "EXIT";
            if (word.equals(exit)) {
                System.out.println("See you in Narnia lightning Macqueen");
                break;
            }


            String translate = "";
            Boolean foundvowel = false;


            for (int i = 0; i < word.length(); i++) {
                if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                        || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundvowel == false) {

                    translate = translate + "ub";
                    translate = translate + word.charAt(i);

                    foundvowel = true;
                } else {
                    if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                            || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundvowel == false) {

                        translate = translate + word.charAt(i);
                    } else {
                        translate = translate + word.charAt(i);
                        foundvowel = false;
                    }

                }

            }
            System.out.println(translate);
            p = p + 1;
        }

    }
}
