# Prithee

## Description

Prithee is a word-guessing game based on the Sonnet 18 by Shakespeare. The program randomly selects a word from the sonnet and replaces it with underscores. The player must guess the missing word.

The game continues until the player gets three words correct or three words incorrect.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Open Main.java.
3. Run the Main class.
4. Enter a word when prompted.

## How to Test

1. Open PritheeGameTest.java.
2. Run the test class.
3. The project contains three JUnit tests that check:
   - Correct answers
   - Incorrect answers
   - Selecting a different word from the previous word

## Design

The program uses two classes:

- Main handles the game loop, user input, and game results.
- PritheeGame stores the sonnet and handles selecting a random word, displaying the missing word, and checking answers.

Gradle is used for dependency management, and JUnit is used for testing.