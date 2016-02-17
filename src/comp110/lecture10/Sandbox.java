package comp110.lecture10;

class Sandbox {

  String ifExample(int input) {
    if (input > 10) {
      if (input == 10) {
        return "GO";
      } else {
        return "HEELS";
      }
    } else {
      if (input == 100) {
        return "BEAT";
      } else {
        if (input < 5) {
          return "DUKE";
        } else {
          return "TONIGHT";
        }
      }
    }
  }

  int whileExample() {
    int count = 0;
    int i = 0;
    while (i < 4) {
      count++;
      i = i + 2;
    }
    return count;
  }

}