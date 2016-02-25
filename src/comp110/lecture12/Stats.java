package comp110.lecture12;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

class Stats {

  Stats() {
  }

  ArrayList<Player> topUncScorers() {
    ArrayList<Player> players = new ArrayList<Player>();
    File data = new File("resources/lecture12/points.csv");
    try {
      Scanner scanner = new Scanner(data);
      while (scanner.hasNextLine()) {
        Scanner line = new Scanner(scanner.nextLine());
        line.useDelimiter(",");
        int number = line.nextInt();
        String name = line.next();
        int points = line.nextInt();
        Player p = new Player(name, number);
        p._points = points; // Cover your eyes. This is bad practice!
        players.add(p);
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.err.println("Could not find CSV data file");
      System.exit(1);
    }
    return players;
  }

}