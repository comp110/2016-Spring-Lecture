package comp110.lecture08;

class LotsOfSquares extends Drawing {

  double _width;
  double _margin;
  Color _black;

  LotsOfSquares() {
    // Initialize Our Instance Variables in the Constructor
    _width = 10.0;
    _margin = 1.0;
    _black = new Color(0.0, 0.0, 0.0);
  }

  Shapes getShapes() {
    Shapes container = new Shapes();

    container.add(this.makeCell(0, 0, _black));

    return container;
  }

  Rectangle makeCell(int column, int row, Color color) {
    Rectangle square = new Rectangle();
    square.setX(column * _width);
    square.setY(row * _width);
    square.setWidth(_width - _margin);
    square.setHeight(_width - _margin);
    square.setFill(color);
    square.setStrokeWidth(0.0); // No Border
    return square;
  }

}