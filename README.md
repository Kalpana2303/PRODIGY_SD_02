# PRODIGY_SD_02

# Number Guessing Game - Java GUI

This is a simple Number Guessing Game built using Java Swing. The application generates a random number between 1 and 100 and allows the user to guess the number through a graphical interface.

## Features

- Random number is generated each time the game starts or resets.
- User inputs their guess through a text field.
- The game provides feedback:
  - "Too low!" if the guess is smaller than the number.
  - "Too high!" if the guess is larger than the number.
  - "Correct!" when the number is guessed right.
- Tracks the number of attempts.
- Reset button to restart the game with a new number.

## How to Use

1. Run the program.
2. Enter a number between 1 and 100 in the input field.
3. Click the "Guess" button to submit your guess.
4. Read the feedback message displayed.
5. Continue guessing until you find the correct number.
6. Click the "Reset" button to start a new game.

## How It Works

- A random number between 1 and 100 is generated at the start.
- Each guess is compared to the random number.
- The program gives hints until the user guesses the number correctly.
- The total number of attempts is displayed when the correct number is guessed.
