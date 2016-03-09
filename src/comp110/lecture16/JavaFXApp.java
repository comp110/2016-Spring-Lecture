package comp110.lecture16;

/*
 * As we start working with code outside of COMP110 support code, we'll see
 * we're importing a long list of classes in each of our apps!
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXApp extends Application {

  /* Instance Variables */
  private VBox _pane; // Vertical Box stacks its controls downward.

  /* Application Entry Point */
  public static void main(String[] args) {
    Application.launch(); // static method call! (Kicks off JavaFX Magic!)
  }

  /*
   * In a JavaFX Application, the start method is akin to the app's constructor.
   * Even when writing a true, real JavaFX application there's a little bit of
   * "bootstrap magic" that takes place to get us here after calling launch() in
   * the main method above and then entering start here. This is not COMP110
   * magic, though, this is real world Java magic.
   * 
   * The Stage parameter refers to the initial window our app can work with.
   */
  public void start(Stage stage) {
    this.initialize(stage);
    // Set the Title Bar of the Window (Change this!)
    stage.setTitle("JavaFXApp");

    Label label = new Label("Think of your question...");
    _pane.getChildren().add(label);

    // TODO:

    // Make the Window Appear
    stage.show();
  }

  /* Event Handler Methods */

  // We'll add a "Shake" button and hook it up so that when it is clicked the
  // following method will be called.
  public void shakePressed(ActionEvent e) {
    System.out.println("The shakePressed method was called");
  }

  // We'll add a "Reveal" button and hook it up so that when it is clicked the
  // following method will be called.
  public void revealPressed(ActionEvent e) {
    String answer = "¯\\_(ツ)_/¯";
    Alert alert = new Alert(AlertType.INFORMATION, answer);
    alert.show();
  }

  /* Helper Methods */

  /*
   * The initialize method sets up our JavaFX Stage (read: window). It also sets
   * up our _pane instance variable for use. Once initialize runs, we can begin
   * adding controls to our _pane.
   */
  private void initialize(Stage stage) {

    // We'll space our controls out by 32.0 pixels.
    double padding = 32.0;

    /*
     * The pane we'll use in this app simply stacks controls vertically down the
     * window. Hence the name VBox. If we made this an HBox instead, our
     * controls would follow one another horizontally.
     */
    _pane = new VBox(padding);

    /*
     * This is a visual tweak. We're adding "padding" to our VBox so that there
     * is a little bit of space between the controls in it and the edge of the
     * window. Feel free to comment out if you want to tinker.
     */
    _pane.setPadding(new Insets(padding));

    /*
     * A "Scene" in JavaFX is short for Scene Graph. Practically, it's what will
     * "fill" our app's window (called a Stage in JavaFX).
     * 
     * This is a fancy word for a collection of controls, shapes, images, etc.
     * that can nest within each other. You could think of our Baemoji face as a
     * Scene Graph. Just like how you could add shapes to your nose, and then
     * add your nose to your face, in JavaFX this is how we'll build more
     * complex graphical user interfaces.
     */
    Scene scene = new Scene(_pane);

    /*
     * Finally, we tell the Stage (window) what its Scene will be.
     */
    stage.setScene(scene);
  }

}