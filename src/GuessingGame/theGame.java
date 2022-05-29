package GuessingGame;

import java.util.Random;
import java.util.Scanner;

public class theGame {
    public static void main() {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick the maximum boundary you want");
        System.out.println("Maximum number:");
        int maxBoundary = scanner.nextInt();
        int randomNumber = rand.nextInt(maxBoundary) + 1;

        System.out.println("Enter your guess (1-"+maxBoundary+")");

        boolean hasGameEnded= false;
        int playerTries = 5;
        while (playerTries>0) {
            int playerGuess = scanner.nextInt();
            playerTries--;
            if (playerGuess == randomNumber) {
                System.out.println("Correct Number, Congrats!");
                hasGameEnded = true;
                break;
            }
            if (playerGuess > randomNumber) {
                System.out.println("The number is lower");
            } else {
                System.out.println("The number is higher");
            }
            System.out.println("You have " + playerTries + " tries left");

        }
        if(hasGameEnded == false) System.out.println("The Number was "+
                randomNumber+" ...Sorry, Good luck next time :)");
    }
}
