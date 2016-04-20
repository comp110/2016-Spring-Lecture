package comp110.lecture26b;

import comp110.lecture26b.Color;
import comp110.lecture26b.Effect;
import comp110.lecture26b.Image;

public class BorderEffect implements Effect {

  /* Instance Variables */
  private double _amount;
  private Color _borderColor;

  /* Constructors */

  public BorderEffect(Color color) {
    _amount = 0.0;
    _borderColor = color;
  }

  public BorderEffect(double amount, Color color) {
    _amount = amount;
    _borderColor = color;
  }

  /* Border Algorithm */
  public Image process(Image input) {

    double thickness = input.getWidth() / 2.0 * _amount;

    Image copy = input.copy();
    for (int x = 0; x < copy.getWidth(); x++) {
      for (int y = 0; y < copy.getHeight(); y++) {

        // copy.setPixel(x, y, _borderColor);

      }
    }

    return copy;
  }

  /* Accessor Methods */

  public double getAmount() {
    return _amount;
  }

  public void setAmount(double amount) {
    _amount = amount;
  }

  public Color getColor() {
    return _borderColor;
  }

  public void setColor(Color color) {
    _borderColor = color;
  }

  public String toString() {
    return "Border";
  }

}