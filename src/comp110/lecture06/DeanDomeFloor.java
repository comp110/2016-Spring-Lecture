package comp110.lecture06;

class DeanDomeFloor extends Drawing {

  /* Instance Variables */
  Shapes _shapes;

  /* Constructor */
  DeanDomeFloor() {
    _shapes = new Shapes();

    /* Construct our drawings here! */

  }

  /* Methods */
  Shapes getShapes() {
    return _shapes;
  }

}