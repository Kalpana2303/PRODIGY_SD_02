/*
 * Number Guessing Game - GUI Application
 * Generates a random number and asks the user to guess it.
 * Provides feedback and shows number of attempts.
 */

package prodigy_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GameUI().createAndShowGUI());
    }

    static class GameUI {
        private int numberToGuess;
        private int attempts;

        void createAndShowGUI() {
           
            resetGame();

            JFrame frame = new JFrame("Number Guessing Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new FlowLayout());

            JLabel instructionLabel = new JLabel("Guess a number between 1 and 100:");
            JTextField guessField = new JTextField(10);
            JButton guessButton = new JButton("Guess");
            JButton resetButton = new JButton("Reset");
            JTextArea resultArea = new JTextArea(6, 30);
            resultArea.setEditable(false);
            resultArea.setLineWrap(true);
            resultArea.setWrapStyleWord(true);
            JScrollPane scrollPane = new JScrollPane(resultArea);

            guessButton.addActionListener(e -> {
                String input = guessField.getText().trim();
                try {
                    int guess = Integer.parseInt(input);
                    attempts++;

                    if (guess < numberToGuess) {
                        resultArea.setText("Too low! Try again.");
                    } else if (guess > numberToGuess) {
                        resultArea.setText("Too high! Try again.");
                    } else {
                        resultArea.setText("Correct! You guessed the number in " + attempts + " attempts.");
                    }

                } catch (NumberFormatException ex) {
                    resultArea.setText("Please enter a valid whole number.");
                }
            });

            resetButton.addActionListener(e -> {
                resetGame();
                guessField.setText("");
                resultArea.setText("Game reset. Guess a new number!");
            });

            frame.add(instructionLabel);
            frame.add(guessField);
            frame.add(guessButton);
            frame.add(resetButton);
            frame.add(scrollPane);

            frame.setVisible(true);
        }

        private void resetGame() {
            numberToGuess = new Random().nextInt(100) + 1;
            attempts = 0;
        }
    }
}
