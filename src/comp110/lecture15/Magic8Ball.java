package comp110.lecture15;

import java.util.ArrayList;

class Magic8Ball {

  /* Instance Variables */
  ArrayList<String> _answers;
  int _answerIndex;

  /* Constructor */
  Magic8Ball() {
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
  void askQuestion(String question) {
    // ... an 8 ball works in mysterious ways ...
  }

  void desperatelyShake() {
    // TODO
  }

  String getAnswer() {
    return _answers.get(_answerIndex);
  }

  /* Helper Methods */
  int getAnswerIndex() {
    return _answerIndex;
  }

  void setAnswerIndex(int answerIndex) {
    _answerIndex = answerIndex;
  }

}