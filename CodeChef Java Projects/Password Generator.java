//https://www.codechef.com/practice/course/projects-java/JAPROJ04/problems/JAPROJPR27


/*
import java.util.Random;
import java.util.Scanner;

public class Codechef {

    // Global strings to be used to randomly generate password components
    private static final String STRING_CHAR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String STRING_NUM = "0123456789";
    private static final String STRING_SPECIAL = "~!@#$%^&*()";

    // Function to convert input to lowercase
    private static String toLower(String input) {
        return input.trim().toLowerCase();
    }

    // Function to get user input
    private static void userInput(Scanner scanner, int[] length, boolean[] useSpecialChars, boolean[] useNumbers) {
        System.out.print("Enter the length of the password: ");
        length[0] = scanner.nextInt();

        scanner.nextLine(); // Consume the leftover newline character

        System.out.print("Include special characters? (yes/no): ");
        String specialCharInput = scanner.nextLine();
        useSpecialChars[0] = toLower(specialCharInput).equals("yes");

        System.out.print("Include numbers? (yes/no): ");
        String numbersInput = scanner.nextLine();
        useNumbers[0] = toLower(numbersInput).equals("yes");
    }

    // Function to generate the password
    public static String generatePassword(int length, boolean useSpecialChars, boolean useNumbers) {
        if (length < 3) {
            throw new IllegalArgumentException("Password length must be at least 3.");
        }

        StringBuilder password = new StringBuilder();

        // Random number generator
        Random random = new Random();

        // Step 1: First character must be an alphabet
        password.append(STRING_CHAR.charAt(random.nextInt(STRING_CHAR.length())));

        // Step 2: Generate the remaining characters up to length - 2
        for (int i = 1; i < length - 2; i++) {
            password.append(STRING_CHAR.charAt(random.nextInt(STRING_CHAR.length())));
        }

        // Step 3: Add a number or alphabet based on 'useNumbers'
        if (useNumbers) {
            password.append(STRING_NUM.charAt(random.nextInt(STRING_NUM.length())));
        } else {
            password.append(STRING_CHAR.charAt(random.nextInt(STRING_CHAR.length())));
        }

        // Step 4: Add a special character or alphabet based on 'useSpecialChars'
        if (useSpecialChars) {
            password.append(STRING_SPECIAL.charAt(random.nextInt(STRING_SPECIAL.length())));
        } else {
            password.append(STRING_CHAR.charAt(random.nextInt(STRING_CHAR.length())));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] length = new int[1];
        boolean[] useSpecialChars = new boolean[1];
        boolean[] useNumbers = new boolean[1];

        // Get user input
        userInput(scanner, length, useSpecialChars, useNumbers);

        // Generate password
        String generatedPassword = generatePassword(length[0], useSpecialChars[0], useNumbers[0]);

        // Output the generated password
        System.out.println("\nGenerated Password: " + generatedPassword);

        scanner.close();
    }
}
*/