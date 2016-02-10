package comp110.lecture08;

class WhileLoopExamples {

  void e01WhileTrue() {
    int i = 0;
    while (true) {
      System.out.println("OMG! I <3 YOU!!!!!!!! LOVE, CPU");
      i = i + 1;
      System.out.println(i);
    }
  }

  void e02AnotherOne() {
    int i = 0;
    while (i < 3) {
      System.out.println("i:" + i);
      i = i + 1;
    }
    System.out.println("Done!");
  }

}