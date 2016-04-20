package comp110.lecture26a;

/* 
 * This class illustrates a naive implementation of the ArrayList class we've been using.
 * It can only store double values and it will error if you attempt to add more than 100 elements.
 * 
 * The important thing to notice is that we're using a native array underneath the hood of 
 * the class and have an index variable that keeps track of where we'll add the next element.
 */
public class OurArrayList {

  private int _index;
  private double[] _elements;

  public OurArrayList() {
    _index = 0;
    _elements = new double[100];
  }

  public void add(double value) {
    _elements[_index] = value;
    _index++;
  }

  public double get(int index) {
    return _elements[index];
  }

  public void set(int index, double replacement) {
    _elements[index] = replacement;
  }

  public int size() {
    return _index;
    // Why return index rather than _elements.length?
  }

}