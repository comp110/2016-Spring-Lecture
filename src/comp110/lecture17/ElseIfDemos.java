package comp110.lecture17;

public class ElseIfDemos {

  public String goldilocks(int temperature) {
    if (temperature > 120) {
      return "Too Hot";
    } else {
      if (temperature < 80) {
        return "Too Cold";
      } else {
        return "Just Right";
      }
    }
  }

  public String lastName(String firstName) {
    String lastName;
    if (firstName.equals("Brice")) {
      lastName = "Johnson";
    } else if (firstName.equals("Marcus")) {
      lastName = "Paige";
    } else if (firstName.equals("Nate")) {
      lastName = "Britt";
    } else if (firstName.equals("Kennedy")) {
      lastName = "Meeks";
    } else if (firstName.equals("Justin")) {
      lastName = "Jackson";
    } else {
      lastName = "???";
    }
    return firstName + " " + lastName;
  }

}
