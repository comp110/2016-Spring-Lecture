package comp110.lecture08;

class ProudTableOfSquares extends Drawing {

  double _width;
  double _margin;
  Color _black;

  ProudTableOfSquares() {
    // Initialize Our Instance Variables in the Constructor
    _width = 10.0;
    _margin = 1.0;
    _black = new Color(0.0, 0.0, 0.0);
  }

  Shapes getShapes() {
    Shapes container = new Shapes();
    container.add(this.makeBackground());

    Color cellColor = new Color();

    int column = 0;
    while (column < 11) {

      container.add(this.makeCell(column, 0, cellColor));

      column = column + 1;
    }

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
    square.setWidth(_width * 13);
    square.setHeight(_width * 13);
    square.setFill(_black);
    square.setStrokeWidth(0.0); // No Border
    return square;
  }

}