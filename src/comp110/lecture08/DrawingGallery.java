package comp110.lecture08;

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
    _drawings = new Drawings();
    _drawings.add(new ProudTableOfSquares());
    _drawings.add(new RowOfSquares());
    _drawings.add(new LotsOfSquares());
  }

  /* Accessor Methods */
  Drawings getDrawings() {
    return _drawings;
  }

}