package comp110.lecture26b;

import comp110.lecture26b.Color;
import comp110.lecture26b.Effect;
import comp110.lecture26b.Image;

public class SaturationEffect implements Effect {

  /* Instance Variables */
  private double _amount;

  /* Constructors */
  public SaturationEffect() {
    _amount = 0.5;
  }

  public SaturationEffect(double amount) {
    _amount = amount;
  }

  /* Methods */
  public Image process(Image image) {
    double factor = (0.5 - _amount) * 2;

    Image copy = image.copy();
    for (int x = 0; x < copy.getWidth(); x++) {
      for (int y = 0; y < copy.getHeight(); y++) {

        // Grayscale:
        // - Start with averaging
        // - Find an average of each component and set this
        // as each component's value
        Color c = copy.getPixel(x, y);
        double grayscale = (c.getRed() + c.getGreen() + c.getBlue()) / 3.0;

        // - Now we want to make it based on a percentage amount
        // - You can think about this as "starting from our original"...
        // "how do we write an equation that will bring this component
        // some % closer to this value"? We'll have to do this for each
        // component individually...

        double redDelta = factor * (c.getRed() - grayscale);
        double greenDelta = factor * (c.getGreen() - grayscale);
        double blueDelta = factor * (c.getBlue() - grayscale);

        c.setRed(c.getRed() - redDelta);
        c.setGreen(c.getGreen() - greenDelta);
        c.setBlue(c.getBlue() - blueDelta);

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
    return "Saturation";
  }

}