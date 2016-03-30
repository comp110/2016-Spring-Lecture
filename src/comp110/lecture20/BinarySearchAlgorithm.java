package comp110.lecture20;

import java.util.ArrayList;

import comp110.Color;
import comp110.Rectangle;
import comp110.Shapes;

/*
 * In this class we'll learn about insertion sort and implement it.
 * 
 * For illustrative purposes, we'll be sorting an array of rectangles by their heights.
 */
public class BinarySearchAlgorithm {

  private ArrayList<Rectangle> _shapes;
  private Color _green;
  private Color _red;
  private Color _gray;

  public BinarySearchAlgorithm() {
    // Let's just start out with 5 shapes.
    // When we get to working on sort, we can bump up to 64+
    _green = new Color(0, 0.9, 0);
    _red = new Color(0.9, 0, 0);
    _gray = new Color(0.2, 0.2, 0.2);
    this.generate(256);
  }

  /*
   * Search the (sorted!) _shapes array to find whether or not a shape of a
   * given height exists.
   */
  public boolean search(double query) {
    this.resetColor();

    int low = 0;
    int high = _shapes.size() - 1;

    while (low <= high) {

      int middle = low + (high - low) / 2;
      System.out
          .println("Low: " + low + " - High: " + high + " - Guess: " + middle);

      Rectangle middleRect = _shapes.get(middle);
      double middleHeight = middleRect.getHeight();
      middleRect.setFill(_red);

      // TODO - Implement Binary Search
      return false;

    }

    System.out.println("No rectangle with height " + query + " found.");
    return false;

  }

  /*
   * The following are utility methods for the demo.
   */

  /*
   * Reset all rectangles to gray.
   */
  public void resetColor() {
    for (Rectangle rectangle : _shapes) {
      rectangle.setFill(_gray);
    }
  }

  /*
   * Generate rectangles of random heights.
   */
  public void generate(int count) {
    _shapes = new ArrayList<Rectangle>();
    double random = 0.0;
    for (int i = 0; i < count; i++) {
      random = random + Math.random() * (512.0 / count);
      Rectangle rectangle = new Rectangle();
      rectangle.setHeight(Math.round(random));
      rectangle.setWidth(1.0);
      rectangle.setFill(_gray);
      rectangle.setStrokeWidth(0.0);
      _shapes.add(rectangle);
    }
  }

  /*
   * Draw the rectangles side-by-side in the order of their array index.
   */
  public Shapes draw() {
    Shapes container = new Shapes();
    for (int i = 0; i < _shapes.size(); i++) {
      Rectangle rectangle = _shapes.get(i);
      rectangle.setX(rectangle.getWidth() * i);
      container.add(rectangle);
    }
    return container;
  }

}
