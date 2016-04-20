package comp110.lecture26b;

import comp110.lecture26b.Color;
import comp110.lecture26b.Image;

/**
 * An Image is a 2-D array of Color pixels.
 */
public class Image {

  /* Instance variables */
  private Color[][] _pixels; // This is our 2D Color array

  /* Constructor */
  public Image(int width, int height) {
    _pixels = new Color[width][height];
    // Initialize all pixels to White
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        _pixels[x][y] = new Color();
      }
    }
  }

  /* Methods */

  /*
   * Each time we try a different setting of a filter we are going to need to
   * apply it to a copy rather than the original.
   */
  public Image copy() {
    Image copy = new Image(this.getWidth(), this.getHeight());
    for (int x = 0; x < _pixels.length; x++) {
      for (int y = 0; y < _pixels[0].length; y++) {
        copy.setPixel(x, y, _pixels[x][y].copy());
      }
    }
    return copy;
  }

  /* Accessor Methods */

  public int getWidth() {
    return _pixels.length;
  }

  public int getHeight() {
    return _pixels[0].length;
  }

  public Color getPixel(int x, int y) {
    return _pixels[x][y];
  }

  public void setPixel(int x, int y, Color color) {
    _pixels[x][y] = color;
  }

  public String toString() {
    return "Image(" + this.getWidth() + "," + this.getHeight() + ")";
  }

}