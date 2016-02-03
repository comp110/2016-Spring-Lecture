package comp110.lecture06;

class Hardwood extends Drawing {

  /* Instance Variables */
  Color _wood;
  Color _white;

  double _courtLength;
  double _courtWidth;
  double _feetToPixels;

  /* Constructor */
  Hardwood() {
    _wood = new Color();
    _wood.setRed(0.91);
    _wood.setGreen(0.78);
    _wood.setBlue(0.65);

    _white = new Color();
    _white.setRed(1.0);
    _white.setGreen(1.0);
    _white.setBlue(1.0);

    _courtLength = 94.0;
    _courtWidth = 50.0;
    _feetToPixels = 2.0;
  }

  /* Methods */
  Shapes getShapes() {
    Shapes shapes = new Shapes();

    Rectangle floor = new Rectangle();
    floor.setWidth(_courtLength * _feetToPixels);
    floor.setHeight(_courtWidth * _feetToPixels);
    floor.setFill(_wood);
    floor.setStroke(_white);
    shapes.add(floor);

    // Add our half court Path here

    return shapes;
  }

}
