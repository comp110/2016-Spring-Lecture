package comp110.lecture06;

/* Jumpman gimme... support code. */

public class CenterCourt extends Drawing {

  Shapes _shapes;

  CenterCourt() {
    _shapes = new Shapes();

    Image state = new Image();
    state.setFile("north-carolina.png");
    double stateScale = 0.55;
    state.setScaleX(stateScale);
    state.setScaleY(stateScale);
    state.setTranslateX(-2.0);
    state.setTranslateY(3.0);
    _shapes.add(state);

    Circle outerCircle = new Circle();
    outerCircle.setRadius(6.0 * 2.0);
    outerCircle.setCenterX(50.0);
    outerCircle.setCenterY(50.0);
    outerCircle.setStroke(new Color(1.0, 1.0, 1.0));
    _shapes.add(outerCircle);

    Circle innerCircle = new Circle();
    innerCircle.setRadius(5.0);
    innerCircle.setCenterX(50.0);
    innerCircle.setCenterY(50.0);
    innerCircle.setFill(new Color(1.0, 1.0, 1.0));
    innerCircle.setStroke(new Color(1.0, 1.0, 1.0));
    _shapes.add(innerCircle);

    Image logo = new Image();
    logo.setFile("unc-logo.png");
    double logoScale = 0.10;
    logo.setScaleX(logoScale);
    logo.setScaleY(logoScale);
    logo.setTranslateX(0.0);
    logo.setTranslateY(10.0);
    _shapes.add(logo);
  }

  Shapes getShapes() {
    return _shapes;
  }

}
