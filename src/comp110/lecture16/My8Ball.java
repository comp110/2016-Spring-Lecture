package comp110.lecture16;

import java.util.ArrayList;
import java.util.Random;

public class My8Ball {

  /* Instance Variables */
  private ArrayList<String> _answers;
  private int _answerIndex;

  /* Constructor */
  public My8Ball() {
    _answers = new ArrayList<String>();
    _answers.add("It is certain");
    _answers.add("Without a doubt");
    _answers.add("Reply hazy try again");
    _answers.add("Cannot predict now");
    _answers.add("Don't count on it");
    _answers.add("V doubtful");
    _answerIndex = 3;
  }

  /* Methods */
  public void askQuestion(String question) {
    // ... an 8 ball works in mysterious ways ...
  }

  public void desperatelyShake() {
    Random random = new Random();
    _answerIndex = random.nextInt(_answers.size());
  }

  public String getAnswer() {
    return _answers.get(_answerIndex);
  }

  /* Helper Methods */
  private int getAnswerIndex() {
    return _answerIndex;
  }

  private void setAnswerIndex(int answerIndex) {
    _answerIndex = answerIndex;
  }

}