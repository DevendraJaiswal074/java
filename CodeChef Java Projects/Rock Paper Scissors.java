//https://www.codechef.com/practice/course/projects-java/JAPROJ05/problems/JAPROJPR37?folder=%2Fhome%2Fchef%2Fworkspace

/*
import java.util.Scanner;
import java.util.Random;

public class Codechef {

    public static int youScore = 0;
    public static int computerScore = 0;

    // Function to convert a string to lowercase
    public static String toLower(String str) {
        return str.toLowerCase();
    }

    // Function to get the user's choice (rock, paper, or scissors)
    public static String getUserChoice(String userChoice) {
        userChoice = toLower(userChoice);
        if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {
            return userChoice;
        }
        return "Invalid choice! Please enter 'rock', 'paper', or 'scissors'.\n";
    }

    // Function to generate a random choice (rock, paper, or scissors)
    public static String randomChoice(int randNum) {
        if (randNum == 0) {
            return "rock";
        } else if (randNum == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    // Function to generate the computer's choice (rock, paper, or scissors)
    public static String getComputerChoice() {
        Random random = new Random();
        int randNum = random.nextInt(3);
        return randomChoice(randNum);
    }

    // Function to determine the winner of the round and return the result as a string
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            youScore++;
            return "Congratulations! You win this round!";
        } else {
            computerScore++;
            return "Computer wins this round!";
        }
    }

    // Function to compare the scores and return the overall result as a string
    public static String compareScores() {
        if (youScore < computerScore) {
            return "Computer won the overall match";
        } else if (youScore > computerScore) {
            return "You won the overall match";
        } else {
            return "The match is tied";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("This game is the best of 3!");
        System.out.println();

		System.out.print("How many rounds do you want to play? ");
        int totalRounds;

		// update the code 

        int n = 0;
        while (n < 3) {
            System.out.println("Round: " + (n + 1));

            while (true) {
                System.out.print("Enter your choice (rock, paper, or scissors): ");
                String input = scanner.nextLine();

                String userChoice = getUserChoice(input);

                if (userChoice.equals("Invalid choice! Please enter 'rock', 'paper', or 'scissors'.\n")) {
                    System.out.print(userChoice);
                } else {
                    String computerChoice = getComputerChoice();
                    System.out.println("You chose: " + userChoice);
                    System.out.println("Computer chose: " + computerChoice);

                    // Get the winner result as a string
                    String result = determineWinner(userChoice, computerChoice);
                    System.out.println(result);

                    n++;
                    break;
                }
            }
        }

        // Compare scores and output the overall result
        String finalResult = compareScores();
		System.out.println();
        System.out.println(finalResult);

        scanner.close();
    }
}
*/