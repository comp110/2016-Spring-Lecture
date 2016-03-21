package comp110.lecture17;

import java.util.ArrayList;

import comp110.ncaa.Player;
import comp110.ncaa.Team;
import comp110.ncaa.TeamReader;

public class ForEachDemos {

  private Team _unc;

  public ForEachDemos() {
    _unc = TeamReader.getTarHeels();
  }

  public void printPlayers() {
    ArrayList<Player> players = _unc.getRoster();

    for (int i = 0; i < players.size(); i++) {
      Player player = players.get(i);
      System.out.println("#" + player.getJersey() + " " + player.getFullName());
    }

  }

  public String tallestPlayer() {
    ArrayList<Player> players = _unc.getRoster();
    Player tallest = players.get(0); // Set tallest to first player

    for (int i = 0; i < players.size(); i++) {
      Player player = players.get(i);
      if (player.getHeight() > tallest.getHeight()) {
        tallest = player;
      }
    }

    return tallest.getFullName() + " at " + tallest.getHeight() + " inches";
  }

}
