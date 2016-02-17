package comp110.lecture10;

class Player {

  /* Instance Variables */
  String _name;
  int _number;
  int _points;

  /* Constructor */
  Player(String name, int number) {
    _name = name;
    _number = number;
    _points = 0;
  }

  /* Mutator Methods */
  void makesFreeThrow() {
    _points++;
  }

  void makesFieldGoal() {
    _points = _points + 2;
  }

  void makesThreePointer() {
    _points = _points + 3;
  }

  void dunksOnFloppingGraysonAllen() {
    _points = _points + 3;
  }

  /* Accessor Methods */
  int getPoints() {
    return _points;
  }

  String getName() {
    return _name;
  }

  int getNumber() {
    return _number;
  }

}
