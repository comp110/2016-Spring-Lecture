package comp110.lecture20;

import comp110.ClassGalleryApp;

public class Runner extends ClassGalleryApp {

  public static void main(String[] args) {
    _instance = new InsertionSortAlgorithm();
    // _instance = new BinarySearchAlgorithm();
    ClassGalleryApp.launch();
  }

}
