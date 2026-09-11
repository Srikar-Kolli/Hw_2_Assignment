package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PritheeGameTest {

    // Tests that the game recognizes a correct answer.
    @Test
    void correctAnswer() {
        PritheeGame game = new PritheeGame();

        assertTrue(game.checkAnswer(0, "Shall"));
    }

    // Tests that the game recognizes an incorrect answer.
    @Test
    void incorrectAnswer() {
        PritheeGame game = new PritheeGame();

        assertFalse(game.checkAnswer(0, "summer"));
    }

    // Tests that a new random word is different from the previous word.
    @Test
    void randomWordIsDifferent() {
        PritheeGame game = new PritheeGame();

        int previousIndex = 10;
        int index = game.selectWord(previousIndex);

        assertNotEquals(previousIndex, index);
    }
}
