/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author hek6452
 */
public class PigLatinExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        //ask for a word to translate
        System.out.println("Please enter a word");
        String word = input.nextLine();
        word=word.toLowerCase();

        //see if words starts wit a vowel
        if (word.startsWith("a") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")) {
            //add "way" to the end of the word

            String translated = word + "way";
            //tell user to use the translation
            System.out.println(word + " in pig latin is " + translated);
        }else{
            //not a vowel, special rule time
            //find the first vowel by going through each vowel
            //REGULAR EXPRESSIONS-REGEX
            for (int i=0;i<word.length();i++){
                //look for a vowel at spot i
                if(word.charAt(i)=='a'|| word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
            //chop the word up at the vowel
                String front=word.substring(0,i);
                String ending=word.substring(i);
                //assemble translation
                String translated= ending +front+"ay";
                System.out.println(word + " in pig latin is " + translated);
                //stop looking for vowel
                break;
            }
        }
    }
        StringBuilder builder = new StringBuilder
                builder.insert(1,"ub");
}
}
