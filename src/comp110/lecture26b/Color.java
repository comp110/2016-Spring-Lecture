package comp110.lecture26b;

import comp110.lecture26b.Color;

/* The Color class represents a single RGB color / pixel. */
public class Color {

  /* Instance Variables */
  private double _red, _green, _blue;

  /* Constructors */
  public Color() {
    _red = 1.0;
    _green = 1.0;
    _blue = 1.0;
  }

  public Color(double red, double green, double blue) {
    this.setRed(red);
    this.setGreen(green);
    this.setBlue(blue);
  }

  /* Methods */

  /*
   * The copy Method returns a replica of the original Color so that we can
   * modify a color without losing data from the original.
   */
  public Color copy() {
    return new Color(_red, _green, _blue);
  }

  /* Accessor Methods */
  public double getRed() {
    return _red;
  }

  public void setRed(double red) {
    _red = this.enforceBounds(red);
  }

  public double getGreen() {
    return _green;
  }

  public void setGreen(double green) {
    _green = this.enforceBounds(green);
  }

  public double getBlue() {
    return _blue;
  }

  public void setBlue(double blue) {
    _blue = this.enforceBounds(blue);
  }

  /* Helper method ensures a value is between 0.0 and 1.0 */
  private double enforceBounds(double value) {
    if (value < 0.0) {
      value = 0;
    } else if (value > 1.0) {
      value = 1.0;
    }
    return value;
  }

  public String toString() {
    return "Color(" + _red + "," + _green + "," + _blue + ")";
  }

}