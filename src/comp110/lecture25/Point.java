package comp110.lecture25;

public class Point {

  private int _x;
  private int _y;

  public Point(int x, int y) {
    System.out.println("A. Point(" + x + "," + y + ") constructed");
    _x = x;
    _y = y;
  }

  public void flip() {
    _x = _y;
    _y = _x;
  }

  public int getX() {
    System.out.println("B. Entering " + this + ".getX()");
    return _x;
  }

  public int getY() {
    return _y;
  }

  /*
   * Find the distance between this point and another.
   */
  public double distance(Point to) {
    System.out.println("C. Entering " + this + ".distance( " + to + " )");

    // Square the differences of x and y
    double dx2 = this.square(_x - to.getX());
    double dy2 = this.square(_y - to.getY());

    // Square root their sum.
    return Math.sqrt(dx2 + dy2);

  }

  private double square(int n) {
    System.out.println("D. Entering square(" + n + ")");
    return n * n;
  }

  public String toString() {
    return "(" + _x + ", " + _y + ")";
  }

}