package comp110.lecture09;

class Card {

  /* Instance Variables */
  String _suit;
  int _rank;

  /* Constructor */
  Card(int rank, String suit) {
    _suit = suit;
    _rank = rank;
  }

  /* Methods */
  boolean isAce() {
    return _rank == 1;
  }

  boolean is10Card() {
    return _rank == 10;
  }

  String getString() {

    String result = "";

    if (_rank == 1) {
      result = result + "A";
    } else {
      if (_rank <= 10) {
        result = result + _rank;
      } else {
        if (_rank == 11) {
          result = result + "J";
        } else {
          if (_rank == 12) {
            result = result + "Q";
          } else {
            result = result + "K";
          }
        }
      }
    }

    result = result + _suit;

    return result;
  }

}