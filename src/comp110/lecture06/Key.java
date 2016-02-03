package comp110.lecture06;

public class Key extends Drawing {

  Color _paintColor;
  Color _trimColor;

  Key() {
    _paintColor = new Color(0.0, 0.0, 0.0);
    _trimColor = new Color(0.0, 0.0, 0.0);
  }

  Shapes getShapes() {
    Shapes shapes = new Shapes();

    // We'll construct and add new shapes here

    return shapes;
  }

  /* Accessor Methods */

  void setPaintColor(Color paintColor) {
    _paintColor = paintColor;
  }

  Color getPaintColor() {
    return _paintColor;
  }

  void setTrimColor(Color trimColor) {
    _trimColor = trimColor;
  }

  Color getTrimColor() {
    return _trimColor;
  }

}