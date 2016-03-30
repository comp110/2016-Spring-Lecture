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
public class InsertionSortAlgorithm {

  private ArrayList<Rectangle> _shapes;

  public InsertionSortAlgorithm() {
    // Let's just start out with 5 shapes.
    // When we get to working on sort, we can bump up to 64+
    this.generate(100);
  }

  /*
   * After the swap method runs the Shape in _shapes at indices i and j should
   * be swapped.
   */
  public void swap(int i, int j) {
    Rectangle temp = _shapes.get(i);
    _shapes.set(i, _shapes.get(j));
    _shapes.set(j, temp);
  }

  /*
   * Given an index i, this method should swap the Rectangle at index i with the
   * Rectangle at i-1.
   */
  public void moveBack(int i) {

  }

  /*
   * Given an index i, this method should return true if the rectangle at index
   * i's height is less than the rectangle at i-1's height. Return false
   * otherwise.
   */
  public boolean shouldMoveBack(int i) {
    return false;
  }

  /*
   * Insertion sort is a fundamental sorting algorithm like selection sort.
   * 
   * Insertion sort works element-by-element through an array and moves elements
   * backward until they are in the correct position.
   */
  public void sort() {
  }

  /*
   * Insertion sort without any abstractions. Shield your eyes!
   */
  public void uglySort() {
    for (int i = 0; i < _shapes.size(); i++) {
      int j = i;
      while (j > 0
          && _shapes.get(j).getHeight() < _shapes.get(j - 1).getHeight()) {
        Rectangle temp = _shapes.get(j);
        _shapes.set(j, _shapes.get(j - 1));
        _shapes.set(j - 1, temp);
        j--;
      }
    }
  }

  /*
   * The following are utility methods for the demo.
   */

  /*
   * Generate rectangles of random heights.
   */
  public void generate(int count) {
    _shapes = new ArrayList<Rectangle>();
    for (int i = 0; i < count; i++) {
      double random = Math.random(); // Random value between 0.0 and 0.99..
      Rectangle rectangle = new Rectangle();
      rectangle.setHeight(random * 100.0);
      rectangle.setWidth(200.0 / count);
      rectangle.setFill(new Color(1 - random, 1 - random, 1 - random));
      rectangle.setStrokeWidth(0.1);
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
