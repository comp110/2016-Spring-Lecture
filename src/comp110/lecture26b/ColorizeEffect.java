package comp110.lecture26b;

import comp110.lecture26b.Color;
import comp110.lecture26b.Effect;
import comp110.lecture26b.Image;

/* This effect brings all pixels an an image "closer" to some color. */
public class ColorizeEffect implements Effect {

  /* Instance Variables */
  private double _amount;
  private Color _color;

  /* Constructors */
  public ColorizeEffect(Color color) {
    this._amount = 0.0;
    this._color = color;
  }

  public ColorizeEffect(double amount, Color color) {
    this._amount = amount;
    this._color = color;
  }

  /* Methods */
  public Image process(Image image) {
    Image output = image.copy();

    for (int x = 0; x < output.getWidth(); x++) {
      for (int y = 0; y < output.getHeight(); y++) {

        Color pixel = output.getPixel(x, y);

        double red, green, blue;
        red = pixel.getRed();
        green = pixel.getGreen();
        blue = pixel.getBlue();

        double redDelta = (red - this._color.getRed()) * this._amount;
        double greenDelta = (green - this._color.getGreen()) * this._amount;
        double blueDelta = (blue - this._color.getBlue()) * this._amount;

        pixel.setRed(red - redDelta);
        pixel.setGreen(green - greenDelta);
        pixel.setBlue(blue - blueDelta);
      }
    }

    return output;
  }

  /* Accessor Methods */
  public double getAmount() {
    return this._amount;
  }

  public void setAmount(double amount) {
    this._amount = amount;
  }

  public Color getColor() {
    return this._color;
  }

  public void setColor(Color color) {
    this._color = color;
  }

  public String toString() {
    return "Colorize";
  }

}