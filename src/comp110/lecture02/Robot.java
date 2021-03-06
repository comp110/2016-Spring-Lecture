package comp110.lecture02;

/* 
 * The code below is support code that will typically
 * be hidden in problem sets early on in the semester. 
 * It will not and should not make sense yet!
 */
class Robot {

  void turnRight() {
    _maze.rotateMeClockwise();
  }

  void moveForward(int numberOfTiles) {
    int i = 0;
    while(i < numberOfTiles) {
      _maze.moveMeForward();
      i = i + 1;
    }
  }

  // The following code is elided in class slides.

  Maze _maze;

  Robot(Maze maze) {
    _maze = maze;
  }
 
}
