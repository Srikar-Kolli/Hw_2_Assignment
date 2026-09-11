//Srikar Kolli
//zpu3sa
//Homework 2 SDE

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PritheeGame game = new PritheeGame();
        Scanner scanner = new Scanner(System.in);

        // Keep track of the number of correct and incorrect guesses.
        int correctWords = 0;
        int incorrectWords = 0;

        // -1 means there is no previous word because this is the first round.
        int previousIndex = -1;

        while (correctWords < 3 && incorrectWords < 3) {

            // Select a random word that is different from the previous word.
            int index = game.selectWord(previousIndex);
            previousIndex = index;

            // Display the sonnet up to the missing word.
            game.displayMissingWord(index);

            System.out.print("What is the missing word? ");
            String answer = scanner.nextLine();

            // Check whether the player's answer is correct.
            if (game.checkAnswer(index, answer)) {
                System.out.println("Correct!");
                correctWords++;
            } else {
                System.out.println("Error!");
                incorrectWords++;
            }
        }

        // Display the final game results.
        System.out.println("Game over!");
        System.out.println("Correct words: " + correctWords);
        System.out.println("Incorrect words: " + incorrectWords);

        scanner.close();
    }
}