package comp110.lecture27;

import java.util.ArrayList;
import java.util.Random;

public class WordList {

  private ArrayList<String> _words;

  public WordList() {
    _words = new ArrayList<String>();
  }

  public void add(String word) {
    _words.add(word);
  }

  public String randomWord() {
    Random random = new Random();
    return _words.get(random.nextInt(_words.size()));
  }

  // This is a method that generates a word list for COMP110 terms.
  // Its use of static and native arrays will not be on the final.
  public static WordList generateLongList() {
    WordList wordList = new WordList();
    String[] words = {
        "recursion",
        "import",
        "package",
        "public",
        "methods",
        "private",
        "return type",
        "return",
        "parameters",
        "method signature",
        "return value",
        "arguments",
        "constructor",
        "expression",
        "class",
        "constructor",
        "method call",
        "instance / object",
        "instance variables",
        "assignment",
        "increment",
        "decrement",
        "local variables",
        "statements",
        "if-else",
        "else-if",
        "boolean expression",
        "looping",
        "while loop",
        "for loop",
        "algorithm",
        "selection sort",
        "insertion sort",
        "ascending",
        "descending",
        "binary search",
        "linear search",
        "array list",
        "array index",
        "find minimum",
        "find maximum",
        "sum values",
        "average values",
        "count matches",
        "primitive type",
        "int",
        "double",
        "boolean",
        "String",
        "main method",
        "PS0 - Hello World",
        "PS1 - DJ Khaled",
        "PS2 - Baemoji",
        "PS3 - Baemoji Card Generator",
        "PS4 - March Madness",
        "PS5 - Spring Cleaning",
        "PS6 - Keep Away" };
    for (String word : words) {
      wordList.add(word);
    }
    return wordList;
  }

  public static WordList generateShortList() {
    WordList wordList = new WordList();
    String[] words = {
        "methods",
        "return",
        "parameters",
        "arguments",
        "constructor",
        "class",
        "instance / object",
        "instance variables",
        "local variables",
        "assignment",
        "if-statements",
        "boolean",
        "expression",
        "loops",
        "sort / search",
        "arrays",
        "int",
        "double",
        "String" };
    for (String word : words) {
      wordList.add(word);
    }
    return wordList;
  }

}
