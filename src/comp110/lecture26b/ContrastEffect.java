package comp110.lecture26b;

import comp110.lecture26b.Color;
import comp110.lecture26b.Effect;
import comp110.lecture26b.Image;

/* Contrast adds or removes contrast by bringing pixels in an image closer to gray or further away from gray. */
public class ContrastEffect implements Effect {

  /* Instance Variables */
  private double _amount;

  /* Constructors */
  public ContrastEffect() {
    this._amount = 0.5;
  }

  public ContrastEffect(double amount) {
    this._amount = amount;
  }

  /* Methods */
  public Image process(Image image) {

    double factor = (0.5 - _amount) * 2;

    Image copy = image.copy();
    for (int x = 0; x < copy.getWidth(); x++) {
      for (int y = 0; y < copy.getHeight(); y++) {

        Color c = copy.getPixel(x, y);

        double redDelta = factor * (c.getRed() - 0.5);
        double greenDelta = factor * (c.getGreen() - 0.5);
        double blueDelta = factor * (c.getBlue() - 0.5);

        c.setRed(c.getRed() - redDelta);
        c.setGreen(c.getGreen() - greenDelta);
        c.setBlue(c.getBlue() - blueDelta);
      }
    }

    return copy;
  }

  /* Accessor Methods */
  public double getAmount() {
    return this._amount;
  }

  public void setAmount(double amount) {
    this._amount = amount;
  }

  public String toString() {
    return "Contrast";
  }

}