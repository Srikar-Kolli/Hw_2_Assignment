//Srikar Kolli
//zpu3sa
//Homework 2 SDE

package org.example;

public class PritheeGame {

    // Stores the words from Shakespeare's poem.
    private final String[] words = {
            "Shall", "I", "compare", "thee", "to", "a", "summer's", "day?",
            "Thou", "art", "more", "lovely", "and", "more", "temperate:",
            "Rough", "winds", "do", "shake", "the", "darling", "buds", "of", "May,",
            "And", "summer's", "lease", "hath", "all", "too", "short", "a", "date;",
            "Sometime", "too", "hot", "the", "eye", "of", "heaven", "shines,",
            "And", "often", "is", "his", "gold", "complexion", "dimmed;",
            "And", "every", "fair", "from", "fair", "sometime", "declines,",
            "By", "chance,", "or", "nature's", "changing", "course,", "untrimmed;",
            "But", "thy", "eternal", "summer", "shall", "not", "fade,",
            "Nor", "lose", "possession", "of", "that", "fair", "thou", "ow'st;",
            "Nor", "shall", "death", "brag", "thou", "wand'rest", "in", "his", "shade,",
            "When", "in", "eternal", "lines", "to", "time", "thou", "grow'st:",
            "So", "long", "as", "men", "can", "breathe,", "or", "eyes", "can", "see,",
            "So", "long", "lives", "this,", "and", "this", "gives", "life", "to", "thee."
    };

    // Selects a random word that is different from the previous word.
    public int selectWord(int previousIndex) {
        int index = (int) (Math.random() * words.length);

        while (index == previousIndex) {
            index = (int) (Math.random() * words.length);
        }

        return index;
    }

    // Displays the sonnet up to the selected word and replaces that word with underscores.
    public void displayMissingWord(int index) {
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                System.out.print("_____");
            } else {
                System.out.print(words[i]);
            }

            System.out.print(" ");

            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    // Checks whether the player's answer matches the missing word.
    public boolean checkAnswer(int index, String answer) {
        String correctAnswer = words[index].replaceAll("[^a-zA-Z']", "");
        String userAnswer = answer.trim().replaceAll("[^a-zA-Z']", "");

        return correctAnswer.equalsIgnoreCase(userAnswer);
    }
}
