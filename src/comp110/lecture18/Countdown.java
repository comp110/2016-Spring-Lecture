package comp110.lecture18;

/* Even a simple countdown app uses a lot of components :) */
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * This is a simple GUI app that will countdown from a configurable number of
 * seconds.
 */
public class Countdown extends Application {

  /** Instance Variables: user interface */
  private Rectangle _background;
  private Label _timerLabel;
  private Button _startButton, _stopButton;
  private Scene _scene;
  private Timeline _timeline;

  /** Instance Variables: application state */
  private int _time;

  /** Where our program begins... */
  public static void main(String[] args) {
    System.out.println("This is the first line of code that runs!");
    Application.launch(); // Then we ask JavaFX to "launch" our app
    // Behind the scenes, JavaFX's launch method will construct a new instance
    // of Countdown and then call its start method.
  }

  /** Constructor */
  public Countdown() {
    _time = 3;
    _scene = this.initScene();
    _timeline = this.initTimeline();
  }

  /**
   * The final step of the launch process is when the start method gets called.
   * We are given a stage, which is just our window, which we then fill with a
   * Scene and show.
   */
  public void start(Stage stage) throws Exception {
    stage.setTitle("Countdown");
    stage.setScene(_scene);
    stage.show();
  }

  /**
   * Helper Methods
   * 
   * This is where we handle the details of constructing instances of our
   * controls.
   */
  private Scene initScene() {

    // Our scene is made up of 4 controls, initialize those first
    _background = this.initBackground();
    _timerLabel = this.initTimerLabel();
    _startButton = this.initStartButton();
    _stopButton = this.initStopButton();

    // Once we have our controls setup, we'll add them to a container
    Group container = new Group();
    container.getChildren().addAll(_background, _timerLabel, _startButton,
        _stopButton);
    Scene scene = new Scene(container);

    // TODO: Connect onKeyPressed to the keyPressed method

    return scene;
  }

  private Rectangle initBackground() {
    Rectangle background = new Rectangle(400.0, 400.0);
    background.setFill(Color.BLACK);

    // TODO: Connect onMouseClicked to the backgroundClicked method

    return background;
  }

  private Label initTimerLabel() {
    Label timerLabel = new Label(_time + "s");
    timerLabel.setFont(Font.font("Courier", 48.0));
    timerLabel.setTextFill(Color.WHITE);
    timerLabel.setLayoutX(175.0);
    timerLabel.setLayoutY(150.0);
    return timerLabel;
  }

  private Button initStartButton() {
    Button startButton = new Button("Start");
    startButton.setLayoutX(125.0);
    startButton.setLayoutY(250.0);

    // TODO: Connect onAction to the start method

    return startButton;
  }

  private Button initStopButton() {
    Button stopButton = new Button("Stop");
    stopButton.setLayoutX(250.0);
    stopButton.setLayoutY(250.0);

    // TODO: Connect onAction to the stop method

    return stopButton;
  }

  /**
   * Timelines can be used to trigger events on an interval. Ours will call our
   * program's tick method once every second.
   * 
   * Timelines are more powerful than this in that you can use them for adding
   * smooth animations to your programs. Feel encouraged to explore Oracle's
   * official Timeline documentation on your own if you're curious how!
   */
  private Timeline initTimeline() {
    Timeline timeline = new Timeline();
    timeline.setCycleCount(Timeline.INDEFINITE);

    // KeyFrame's constructor is where we must supply the event handler.
    // This will call our `tick` method each time the KeyFrame expires.
    KeyFrame interval = new KeyFrame(Duration.seconds(1), this::tick);
    timeline.getKeyFrames().add(interval);

    return timeline;
  }

  /**
   * Event Handlers
   * 
   * This is where we'll write the code that responds to user input!
   */

  private void startTimeline(ActionEvent event) {
    System.out.println(event);
  }

  private void tick(ActionEvent event) {
    System.out.println(event);
  }

  private void stopTimeline(ActionEvent event) {
    System.out.println(event);
  }

  private void keyPressed(KeyEvent key) {
    System.out.println("Key code:" + key.getCode() + " text:" + key.getText());
  }

  private void backgroundClicked(MouseEvent click) {
    System.out.println("Click (" + click.getX() + ", " + click.getY() + ")");
  }

}