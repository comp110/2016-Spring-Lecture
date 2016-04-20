package comp110.lecture26b;

import comp110.lecture26b.Color;
import comp110.lecture26b.Effect;
import comp110.lecture26b.Image;

public class BrightnessEffect implements Effect {

  /* Instance Variables */
  private double _amount;

  /* Constructors */
  public BrightnessEffect() {
    _amount = 0.5;
  }

  public BrightnessEffect(double amount) {
    _amount = amount;
  }

  /* Where the Magic Lies */
  public Image process(Image input) {
    double factor = (_amount - 0.5) * 2;

    Image copy = input.copy();
    for (int x = 0; x < copy.getWidth(); x++) {
      for (int y = 0; y < copy.getHeight(); y++) {

        Color c = copy.getPixel(x, y);

        double red, green, blue;
        red = c.getRed();
        green = c.getGreen();
        blue = c.getBlue();

        // c.setRed(red + factor * red);
        // c.setGreen(green + factor * green);
        // c.setBlue(blue + factor * blue);

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

  public String toString() {
    return "Brightness";
  }

}