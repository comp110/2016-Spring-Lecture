package comp110.lecture24;

import java.util.ArrayList;

public class ExceptionExample {

  public static void main(String[] args) {

    if (examWasHard()) {
      System.out.println("curve pls");
    } else {
      System.out.println("y u lyin");
    }

  }

  private static boolean examWasHard() {
    ArrayList<String> strings = new ArrayList<String>();

    System.out.println("Yea, but, what could go wrong?");
    System.out.println(strings.get(0));
    System.out.println("Nothing. Absolutely nothing.");

    return true;
  }

}