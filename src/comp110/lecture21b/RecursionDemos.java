package comp110.lecture21b;

import comp110.Color;
import comp110.Rectangle;
import comp110.Shapes;

public class RecursionDemos {

  public void countdown(int n) {
    System.out.println("n: " + n);
    if (n > 0) {
      this.countdown(n - 1);
    }
  }

  // TODO: Factorial

  // Use recursion to draw a spiral
  public Shapes spiral(double width) {
    Shapes container = new Shapes();

    Rectangle square = new Rectangle();
    square.setWidth(width);
    square.setHeight(width);
    square.setX(50);
    square.setY(width * 10.0);
    square.setFill(new Color(0.0, 0.0, 0.0));
    container.add(square);

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
