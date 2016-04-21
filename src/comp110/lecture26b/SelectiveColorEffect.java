package comp110.lecture26b;

public class SelectiveColorEffect implements Effect {

  /* Instance Variables */
  private double _amount;

  /* Constructors */

  public SelectiveColorEffect() {
    _amount = 0.0;
  }

  public SelectiveColorEffect(double amount) {
    _amount = amount;
  }

  /* Border Algorithm */
  public Image process(Image input) {

    Image copy = input.copy();
    for (int x = 0; x < copy.getWidth(); x++) {
      for (int y = 0; y < copy.getHeight(); y++) {

        Color pixel = copy.getPixel(x, y);

        // Pull individual components
        double red, green, blue;
        red = pixel.getRed();
        green = pixel.getGreen();
        blue = pixel.getBlue();

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
    return "Selective Color";
  }

}