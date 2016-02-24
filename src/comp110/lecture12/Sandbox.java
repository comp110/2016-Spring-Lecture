package comp110.lecture12;

class Sandbox {

  // We'll sum scores here
  int arraysMotivation() {
    Player p0 = this.makeAMeeks();
    Player p1 = this.makeABrice();
    Player p2 = this.makeAJackson();
    Player p3 = this.makeAPaige();
    Player p4 = this.makeABerry();
    return 0;
  }

  // We'll sum scores here, as well, using an ArrayList
  int arraysWithArrayList() {
    return 0;
  }

  // Helper methods below which construct Players...

  Player makeABrice() {
    Player player = new Player("Brice Johnson", 11);
    player.makesFieldGoal();
    return player;
  }

  Player makeAPaige() {
    Player player = new Player("Marcus Paige", 5);
    int i = 0;
    while (i < 8) {
      player.makesThreePointer();
      i++;
    }
    return player;
  }

  Player makeAMeeks() {
    Player player = new Player("Kennedy Meeks", 3);
    player.makesFreeThrow();
    return player;
  }

  Player makeAJackson() {
    Player player = new Player("Justin Jackson", 44);
    player.makesFieldGoal();
    player.makesFieldGoal();
    player.makesFieldGoal();
    return player;
  }

  Player makeABerry() {
    Player p = new Player("Joel Berry II", 2);
    p.makesThreePointer();
    return p;
  }

}