# Guess the Word Game

This project is a simple Java word-guessing game where the player tries to reveal a hidden fruit name by guessing letters.

## Game Logic

The program works like this:

1. A random fruit word is selected from a list of words.
2. The word is displayed as hidden letters using asterisks, such as:
   - `* * * * *`
3. The player enters one letter at a time.
4. If the letter appears in the word, it is revealed in its correct position.
5. If the letter is not in the word, the player loses one attempt.
6. The game continues until:
   - the player correctly reveals all letters, or
   - the player runs out of attempts.
7. After each round, the player can choose to play again.

## Example Words

The game includes words such as:

- Apple
- Strawberry
- Dragonfruit
- Watermelon
- Kiwi
- Starfruit
- Peach
- Orange
- Grape
- Mango

## How to Run

1. Open a terminal or command prompt.
2. Go to the project folder:

   ```bash
   cd "C:\Users\jorijuela\OneDrive - DXC Production\Desktop\JavaGame\SimpleGame"
   ```

3. Compile the Java file:

   ```bash
   javac src\GuessTheWord.java
   ```

4. Run the game:

   ```bash
   java -cp src GuessTheWord
   ```

## Notes

- This is a beginner-friendly Java project.
- The game uses a single Java class named `GuessTheWord`.
- You can add more words by editing the `words` array in the source file.
