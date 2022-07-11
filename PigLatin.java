import java.util.Scanner;

public class PigLatin
{
    public static void main(String[] args)
    {
        String englishWord; // To hold a word in English
        String pigLatinWord; // To hold a word in Pig Latin

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get inputs from the user.
        System.out.print("Enter a word ");
        englishWord = console.next();

        // Convert the word in Pig Latin
        pigLatinWord = englishWord.substring(1)
                + englishWord.charAt(0) + "ay";

        // Display the words.
        System.out.println("English Word: " + englishWord);
        System.out.println("Pig Latin Word: " + pigLatinWord);
    }
}