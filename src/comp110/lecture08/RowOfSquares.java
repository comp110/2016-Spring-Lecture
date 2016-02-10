package comp110.lecture08;

class RowOfSquares extends Drawing {

  double _width;
  double _margin;
  Color _black;
  Color _gray;
  Color _white;

  RowOfSquares() {
    // Initialize Our Instance Variables in the Constructor
    _width = 10.0;
    _margin = 1.0;
    _black = new Color(0.0, 0.0, 0.0);
    _gray = new Color(0.5, 0.5, 0.5);
    _white = new Color();
  }

  Shapes getShapes() {
    Shapes container = new Shapes();
    container.add(this.makeBackground());

    Color cellColor = _white;

    container.add(this.makeCell(0, 0, cellColor));

    return container;
  }

  Rectangle makeCell(int column, int row, Color color) {
    Rectangle square = new Rectangle();
    square.setX(_width + column * _width);
    square.setY(_width + row * _width);
    square.setWidth(_width - _margin);
    square.setHeight(_width - _margin);
    square.setFill(color);
    square.setStrokeWidth(0.0); // No Border
    return square;
  }

  Rectangle makeBackground() {
    Rectangle square = new Rectangle();
    square.setX(0.0);
    square.setY(0.0);
    square.setWidth(_width * 10);
    square.setHeight(_width * 3);
    square.setFill(_gray);
    square.setStrokeWidth(0.0); // No Border
    return square;
  }

}