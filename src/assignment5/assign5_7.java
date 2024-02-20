import java.util.Arrays;
import java.util.regex.Pattern;

public class assign5_7 {
    //move the first consonant or consonant
    //cluster to the end of the word. Second, add “ay” to the end of the word. For
    //example, the word “banana” would become “ananabay.”


        public static void main(String[] args) {
            String input = "bbanana";
            System.out.println("Original word: " + input);

            int i = 0;
            while (i < input.length() && !isVowel(input.charAt(i))) {
                i++;
            }

            String pigLatin = input.substring(i) + input.substring(0, i) + "ay";
            System.out.println("Pig Latin word: " + pigLatin);
        }

        private static boolean isVowel(char c) {
            c = Character.toLowerCase(c);
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }
    }











