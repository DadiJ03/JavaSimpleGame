import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
        String[] words = {
                "APPLE",
                "STRAWBERRY",
                "DRAGONFRUIT",
                "WATERMELON",
                "KIWI",
                "STARFRUIT",
                "PEACH",
                "ORANGE",
                "GRAPE",
                "MANGO"
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Guess the Word!");
        System.out.println("Try to guess the fruit name before you run out of attempts.");

        boolean playAgain = true;
        while (playAgain) {
            String secretWord = words[random.nextInt(words.length)];
            int maxAttempts = 6;
            int attemptsLeft = maxAttempts;
            boolean[] guessedLetters = new boolean[secretWord.length()];

            System.out.println("\nThe secret word has " + secretWord.length() + " letters.");

            while (attemptsLeft > 0) {
                System.out.println("\nAttempts remaining: " + attemptsLeft);

                boolean wordComplete = true;
                for (int i = 0; i < secretWord.length(); i++) {
                    if (guessedLetters[i]) {
                        System.out.print(secretWord.charAt(i) + " ");
                    } else {
                        System.out.print("* ");
                        wordComplete = false;
                    }
                }
                System.out.println();

                if (wordComplete) {
                    System.out.println("\nCongratulations! You guessed the word: " + secretWord);
                    break;
                }

                System.out.print("Guess a letter: ");
                String input = scanner.next().trim().toUpperCase();

                if (input.isEmpty()) {
                    continue;
                }

                char guess = input.charAt(0);
                if (!Character.isLetter(guess)) {
                    System.out.println("Please enter a valid letter.");
                    continue;
                }

                boolean foundMatch = false;
                for (int i = 0; i < secretWord.length(); i++) {
                    if (secretWord.charAt(i) == guess && !guessedLetters[i]) {
                        guessedLetters[i] = true;
                        foundMatch = true;
                    }
                }

                if (!foundMatch) {
                    System.out.println("Incorrect guess!");
                    attemptsLeft--;
                } else {
                    System.out.println("Good job! You found a letter.");
                }
            }

            if (attemptsLeft == 0) {
                System.out.println("\nGame over! The word was: " + secretWord);
            }

            System.out.print("Do you want to play again? (y/n): ");
            String response = scanner.next().trim().toLowerCase();
            playAgain = response.equals("y") || response.equals("yes");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
