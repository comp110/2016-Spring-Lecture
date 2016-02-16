package comp110.lecture09;

public class InstancePlaygroundRunner extends ClassGalleryApp {
  public static void main(String[] args) {

    // The only line we'll change in this file is the one following
    // these comments. You can make it any instance you'd like.
    _instance = new Deck();

    launch(args);
  }
}
