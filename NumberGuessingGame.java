import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int max_attempts = 10; 
        int total_rounds = 0;
        int total_attempts = 0;
        float score;
        String playAgain = "yes"; 

        while (playAgain.equalsIgnoreCase("yes")) {
            int temp = random.nextInt(1,101); 
            int number = 0;
            int guesses = 0;

            System.out.println("\n-----The Number Guessing Game-----");
            System.out.println("\nGuess a number between 1 and 100. : ");

            while (number != temp && guesses < max_attempts) {
                System.out.print("\nEnter a number : ");
                number = scanner.nextInt();
                guesses++;

                if (number > temp) {
                    System.out.println("\nIt's a high guess!!");
                } 
                else if (number < temp) {
                    System.out.println("\nIt's a low guess!!");
                } 
                else {
                    System.out.println("\nIt's a perfect guess!!");
                }
            }

            System.out.println("\nNumber to guess : " + temp);
            System.out.println("\nTotal number of guesses : " + guesses);

            total_rounds++;
            total_attempts = total_attempts + guesses;

            System.out.print("\nDo you want to play again? (yes/no) : ");
            playAgain = scanner.next(); 

        }
        score = (float) total_attempts / total_rounds;
        
        System.out.println("\nThanks for playing!");
        System.out.println("\nTotal rounds played : " + total_rounds);
        System.out.println("\nTotal attempts : " + total_attempts);
        System.out.println("\nScore : " + score);

        scanner.close();
    }
}
