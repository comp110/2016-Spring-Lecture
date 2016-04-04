package comp110.lecture21;

import comp110.LineTo;
import comp110.Path;
import comp110.Shapes;
import comp110.StartingPoint;

public class RecursionDemos {

  public void halve(int n) {
    System.out.println("n: " + n);
    if (n > 2) {
      this.halve(n / 2); // Recursion
    }
  }

  // TODO: Factorial

  // This is called a constant variable
  private static final double WIDTH = 30.0;

  // Use recursion to draw a tree
  public Shapes branch(int level, double height) {
    Shapes container = new Shapes();

    // Draw a line straight across.
    Path path = new Path();
    StartingPoint sp = new StartingPoint();
    path.add(sp);
    LineTo branch = new LineTo();
    branch.setX(WIDTH);
    path.setStrokeWidth(2.0);
    path.add(branch);

    if (level > 0) {
      // This is our recursive case.
      // Draw a line down.
      LineTo bottom = new LineTo();
      bottom.setX(WIDTH);
      bottom.setY(height);
      path.add(bottom);

      Shapes topBranch = this.branch(level - 1, height);
      container.add(topBranch);

      Shapes bottomBranch = this.branch(level - 1, height);
      container.add(bottomBranch);
    }

    container.add(path);

    return container;
  }

  // Below is where we'll find the cash

  public double searchForCash() {
    Room startingRoom = Room.constructMap();
    double cashFound = this.search(startingRoom);
    System.out.println("You win $" + cashFound + "!!!");
    return cashFound;
  }

  public double search(Room room) {
    System.out
        .println("Enter " + room.getName() + ". Found $" + room.getCash());

    double cashFound = room.getCash();

    // TODO: Search Strategy

    System.out.println("Leave " + room.getName() + ".");
    return cashFound;
  }

}
