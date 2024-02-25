import java.io.*;
import java.util.Scanner;

public class StringSeparatioExample {
    public static void main(String[] args) {
        try {
            // Read input string from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            // Separate vowels and consonants
            StringBuilder vowels = new StringBuilder();
            StringBuilder consonants = new StringBuilder();

            for (char ch : inputString.toCharArray()) {
                if (isVowel(ch)) {
                    vowels.append(ch);
                } else if (Character.isLetter(ch)) {
                    consonants.append(ch);
                }
            }

            // Write vowels to VOWEL.TXT
            try (PrintWriter vowelWriter = new PrintWriter("VOWEL.TXT")) {
                vowelWriter.println(vowels.toString());
            }

            // Write consonants to CONSONANT.TXT
            try (PrintWriter consonantWriter = new PrintWriter("CONSONANT.TXT")) {
                consonantWriter.println(consonants.toString());
            }

            System.out.println("Separation and writing to files successful.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
