package comp110.lecture06;

class DrawingGallery {

  /* Instance Variables */
  Drawings _drawings;

  /**
   * Constructor - Here we're setting up our _drawings instance variable by
   * adding a new instance of each of our drawing classes to it.
   * 
   * In order to see your work on your own drawings, be sure to add instances of
   * them to the gallery like the stencil code provided below.
   */
  DrawingGallery() {
    // The drawings instance variable is a container we'll hold our drawings in
    _drawings = new Drawings();

    // Add our drawings
    _drawings.add(new BasicShapes());

    // When we get to Hardwood, uncomment the following line
    // _drawings.add(new Hardwood());

    // When we get to the Key, uncomment the following line
    // _drawings.add(new Key());

    // When we get to the DeanDomeFloor, uncomment the following line
    // _drawings.add(new DeanDomeFloor());
  }

  /* Accessor Methods */
  Drawings getDrawings() {
    return _drawings;
  }

}