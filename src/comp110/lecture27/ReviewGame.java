package comp110.lecture27;

import java.util.Scanner;

public class ReviewGame {

  public static void main(String[] args) {
    ReviewGame.printIntro();

    WordList list = WordList.generateShortList();
    // If you want a larger word set for more challenge...
    // use this one instead.
    // WordList list = WordList.generateLongList();

    // We'll use a Scanner to read lines from System's input.
    Scanner keyboard = new Scanner(System.in);

    boolean isPlaying = true;
    while (isPlaying) {
      System.out.println("How many degrees of COMP110?\n");
      int input = Integer.parseInt(keyboard.nextLine());

      // Problem 4. Enforce bounds of 2-5 degrees and 0 to quit
      ReviewGame.generateWordSet(list, input);
    }

    System.out.println("\nThanks for playing! Kick ass on the final.");
  }

  private static void generateWordSet(WordList list, int n) {
    WordSet set = new WordSet();

    // Problem 3. Add words to set until # of degrees is reached
    for (int i = 0; i < n; i++) {
      set.add(list.randomWord());
    }

    System.out.println("\nRelate these concepts together:\n" + set + "\n");
  }

  private static void printIntro() {
    System.out.println("Welcome to n-Degrees of COMP110 Review Game");
    System.out.println("===========================================");
    System.out.println(" 1. I'll ask you \"How many 'degrees' of COMP110?\"");
    System.out.println(" 2. You'll type in a number between 2 and 5");
    System.out.println(" 3. I'll give that # of words and you'll relate them");
    System.out.println("===========================================");
    System.out.println(" Press 0 to Quit");
    System.out.println("===========================================\n");
  }

}