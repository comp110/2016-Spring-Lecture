package comp110.lecture24;

public class Course {

  private String _name;
  private double _hours;
  private int _difficulty;

  public Course(String name, double hours, int difficulty) {
    _name = name;
    _hours = hours;
    _difficulty = difficulty;
  }

  public String getName() {
    return _name;
  }

  public void setName(String name) {
    _name = name;
  }

  public double getHours() {
    return _hours;
  }

  public void setHours(double hours) {
    _hours = hours;
  }

  public int getDifficulty() {
    return _difficulty;
  }

  public void setDifficulty(int difficulty) {
    _difficulty = difficulty;
  }

}
