//https://www.codechef.com/practice/course/projects-java/JAPROJ06/problems/JAPROJPR48

/*
 import java.util.Random;
import java.util.Scanner;

public class Codechef {

    // Function to choose a random word from the list
    public static String chooseWord() {
        String[] words = {"codechef", "programming", "learning", "practice", "contests", "rating"};
        Random random = new Random();
        int randomIndex = random.nextInt(words.length); // Get a random index
        return words[randomIndex];
    }

    // Function to display the word with guessed characters
    public static String wordDisplay(String word, String guesses) {
        StringBuilder displayWord = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (guesses.indexOf(c) != -1) {
                displayWord.append(c).append(" ");
            } else {
                displayWord.append("_ ");
            }
        }
        return displayWord.toString();
    }

    // Function to check if the player has lost
    public static boolean hasPlayerLost(int turns, String word, String guesses) {
        String displayWord = wordDisplay(word, guesses);
        return turns == 0 && displayWord.contains("_");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + ", time to play hangman!\n");

        String word = chooseWord();
        int turns = word.length(); // Number of turns equals the length of the word
        StringBuilder guesses = new StringBuilder();

        System.out.println("Start guessing...\n");

        while (turns > 0) {
            System.out.println("You have " + turns + " guesses remaining.");
            String displayWord = wordDisplay(word, guesses.toString());
            System.out.println(displayWord);

            // Check if the player has won
            if (!displayWord.contains("_")) {
                System.out.println("\nYou won!");
                break;
            }

            System.out.print("\nGuess a character or a string: ");
            String guess = scanner.nextLine().toLowerCase();

            // Mark all characters of the input string as guessed
            for (char c : guess.toCharArray()) {
                if (guesses.indexOf(String.valueOf(c)) == -1) {
                    guesses.append(c);
                }
            }

            // If the guess does not match any character in the word, reduce turns
            boolean correctGuess = false;
            for (char c : guess.toCharArray()) {
                if (word.indexOf(c) != -1) {
                    correctGuess = true;
                    break;
                }
            }
            if (!correctGuess) {
                System.out.println("\nWrong guess, try again!");
            }
            turns--;

            // Check if the player has lost
            if (hasPlayerLost(turns, word, guesses.toString())) {
                System.out.println("\nYou Lose");
                System.out.println("The word was '" + word + "'.");
                break;
            }
        }

        scanner.close();
    }
}
 */