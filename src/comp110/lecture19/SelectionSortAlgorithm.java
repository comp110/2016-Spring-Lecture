package comp110.lecture19;

import java.util.ArrayList;

import comp110.Color;
import comp110.Rectangle;
import comp110.Shapes;

/*
 * In this class we'll learn about selection sort and implement it.
 * 
 * For illustrative purposes, we'll be sorting an array of rectangles by their heights.
 */
public class SelectionSortAlgorithm {

  private ArrayList<Rectangle> _shapes;

  public SelectionSortAlgorithm() {
    // Let's just start out with 5 shapes.
    // When we get to working on sort, we can bump up to 64+
    this.generate(5);
  }

  /*
   * After the swap method runs the Shape in _shapes at indices i and j should
   * be swapped.
   * 
   * Example: Given shapes A, B, C, D, E at indices 0, 1, 2, 3, 4 respectively.
   * 
   * i.e. After calling the following method, the order of the shapes in the
   * array would be as follows:
   * 
   * this.swap(0, 2) -> C, B, A, D, E
   */
  public void swap(int i, int j) {

  }

  /*
   * Given the _shapes array and a starting index of the `start` parameter,
   * return the index of the shape with the minimum height looking only from
   * `start` to the end of the array.
   */
  public int smallestFrom(int start) {
    int minIndex = start;
    double minHeight = _shapes.get(start).getHeight();

    // TODO: find the index of the shape with the smallest height

    return minIndex;
  }

  /*
   * Selection sort is a fundamental first algorithm for learning sorting. We
   * move item by item through the array, find the smallest item after the
   * current item, and then swap them.
   */
  public void sortAscending() {

    // TODO: sort the _shapes array by height, ascending

  }

  /*
   * The following are utility methods for the demo.
   */

  /*
   * TODO: Replace this with your one sentence description.
   */
  public void generate(int count) {
    _shapes = new ArrayList<Rectangle>();
    for (int i = 0; i < count; i++) {
      double random = Math.random(); // Random value between 0.0 and 0.99..
      Rectangle rectangle = new Rectangle();
      rectangle.setHeight(random * 100.0);
      rectangle.setWidth(200.0 / count);
      rectangle.setFill(new Color(1 - random, 1 - random, 1 - random));
      _shapes.add(rectangle);
    }
  }

  /*
   * TODO: Replace this with your one sentence description.
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
