package comp110.lecture15;

class Random {

  int generate(int n) {
    double random = Math.random() * n;
    return (int) random;
  }

}