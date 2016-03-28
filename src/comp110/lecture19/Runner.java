package comp110.lecture19;

import comp110.ClassGalleryApp;

public class Runner extends ClassGalleryApp {

  public static void main(String[] args) {
    _instance = new SelectionSortAlgorithm();
    ClassGalleryApp.launch();
  }

}
