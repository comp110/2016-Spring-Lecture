package comp110.lecture27;

import java.util.ArrayList;

/**
 * A Set is a collection of *unique* values.
 */
public class WordSet {

  ArrayList<String> _words = new ArrayList<String>();

  public WordSet() {
    _words = new ArrayList<String>();
  }

  /*
   * This method should only add word to _words iff the _words does not already
   * have the word (call hasWord method).
   */
  public void add(String word) {
    // Problem 2.
  }

  /*
   * This method should return true iff _words contains the word parameter. It
   * should return false otherwise.
   */
  public boolean hasWord(String word) {
    // Problem 1.
    return false;
  }

  /*
   * Returns the word count.
   */
  public int size() {
    return _words.size();
  }

  /* Make a String representation of the set separating words with commas. */
  public String toString() {
    String result = "";
    for (int i = 0; i < _words.size(); i++) {
      result += (i + 1) + ". " + _words.get(i) + "\n";
    }
    return result;
  }

}
