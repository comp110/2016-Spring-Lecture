package comp110.lecture21b;

public class Room {

  // Instance Variables
  private String _name;
  private double _cash;
  private Room _leftRoom;
  private Room _rightRoom;

  // Constructor
  public Room(String name, double cash) {
    _name = name;
    _cash = cash;
  }

  // Accessor Methods
  public boolean hasLeftDoor() {
    return _leftRoom != null;
  }

  public boolean hasRightDoor() {
    return _rightRoom != null;
  }

  public Room getLeftRoom() {
    return _leftRoom;
  }

  public Room getRightRoom() {
    return _rightRoom;
  }

  public double getCash() {
    return _cash;
  }

  public String getName() {
    return _name;
  }

  // Static Method that Constructs a Tree of Rooms
  public static Room constructMap() {
    Room a = new Room("A", 0.0);
    Room b = new Room("B", 0.0);
    Room c = new Room("C", 20.0);
    Room d = new Room("D", 50.0);
    Room e = new Room("E", 0);
    Room f = new Room("F", 1.0);
    Room g = new Room("G", 0);
    Room h = new Room("H", 0);
    Room i = new Room("I", 100.0);
    Room j = new Room("J", 0);
    Room k = new Room("K", 0);
    Room l = new Room("L", 0);
    Room m = new Room("M", 0);
    Room n = new Room("N", 100000.0);
    Room o = new Room("O", 0);

    a._leftRoom = b;
    a._rightRoom = c;

    b._leftRoom = d;
    b._rightRoom = e;

    c._leftRoom = f;
    c._rightRoom = g;

    d._leftRoom = h;
    d._rightRoom = i;

    e._leftRoom = j;
    e._rightRoom = k;

    f._leftRoom = l;
    f._rightRoom = m;

    g._leftRoom = n;
    g._rightRoom = o;

    return a;
  }

}
