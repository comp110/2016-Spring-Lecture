package comp110.lecture26b;

/*
 * Setup for Instagram Filter Demo
 * 
 * We're using some classes hidden in support code from the Fall's final problem set because we used
 * an older Swing library last year instead of JavaFX. If you'd like to see this code, thouh, just let
 * me know.
 */
public class InstagramUI {

  /* Constants */
  private static Color CAROLINA_BLUE = new Color(0.482, 0.686, 0.831);

  /* main Method - Where our Program Begins */
  public static void main(String[] args) {
    InstagramUI ui = new InstagramUI();
    ui.start();
  }

  /* Initialize our app, load a photo, and run the GUI */
  public void start() {
    AppModel app = this.initApp();

    Image image = new Image(512, 512);
    ImageUtils.loadPhoto(image, "data/old-well.jpg");
    app.setInput(image);

    AppGUI.run(app);
  }

  private AppModel initApp() {
    AppModel app = new AppModel();

    // Here's where we setup our Effects array. Feel free to add your own.
    Effect[] effects = {
        new BorderEffect(CAROLINA_BLUE),
        new BrightnessEffect(),
        new ColorizeEffect(CAROLINA_BLUE),
        new SaturationEffect(),
        new ContrastEffect() };
    app.setEffects(effects);

    Filter[] filters = {
        this.vintageCarolinaFilter() };
    app.setFilters(filters);

    return app;
  }

  /*
   * This is an example of making a new Filter by combining a bunch of effects.
   */
  private Filter vintageCarolinaFilter() {
    Filter hotness = new Filter("Vintage Carolina");

    hotness.addEffect(new SaturationEffect(0.05));
    hotness.addEffect(new ColorizeEffect(0.45, CAROLINA_BLUE));
    hotness.addEffect(new ContrastEffect(0.4));
    hotness.addEffect(new BrightnessEffect(0.65));

    Color classyWhite = new Color(0.96, 0.96, 0.96);
    hotness.addEffect(new BorderEffect(0.07, classyWhite));

    return hotness;
  }

}
