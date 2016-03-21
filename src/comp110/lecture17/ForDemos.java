package comp110.lecture17;

import comp110.Color;
import comp110.Rectangle;
import comp110.Shapes;

public class ForDemos {

  public Shapes rowOfSquares(int count, double size) {
    Shapes container = new Shapes();

    int i = 0;
    while (i < count) {
      Rectangle square = this.makeASquare(size, this.grayscale(i, count));
      square.setX(i * (size + 4.0));
      container.add(square);
      i++;
    }

    return container;
  }

  public Shapes tablesquareOfSquares(int count, double size) {
    Shapes container = new Shapes();

    int i = 0;
    while (i < count) {
      int j = 0;
      while (j < count) {
        Rectangle square = this.makeASquare(size, this.rainbow(i, j, count));
        square.setX(i * size);
        square.setY(j * size);
        container.add(square);
        j++;
      }
      i++;
    }

    return container;
  }

  /** Helper Methods */

  private Rectangle makeASquare(double size, Color color) {
    Rectangle square = new Rectangle();
    square.setWidth(size);
    square.setHeight(size);
    square.setFill(color);
    square.setStroke(color);
    return square;
  }

  private Color grayscale(int numerator, int denomenator) {
    double intensity = 1.0 - (double) numerator / denomenator;
    return new Color(intensity, intensity, intensity);
  }

  private Color rainbow(int row, int column, int count) {
    Color color = new Color();
    color.setRed(1 - (double) row / count);
    color.setGreen((double) column / count);
    color.setBlue((double) row / count);
    return color;
  }

}