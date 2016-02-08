package comp110.lecture07;

class ConditionalExamples {

  /* Example Methods */
  boolean e01BooleanReturnType() {
    return true;
  }

  boolean e02BooleanLocalVariable() {
    boolean isRaining = false;
    return isRaining;
  }

  boolean e03Equality(int a, int b) {
    return a == b;
  }

  // Try experimenting with less than, less than or equal to,
  // greater than, and greater than or equal to.
  boolean e04Inequalities(int a, int b) {
    return a != b;
  }

  // Try changing the value of the aTestCondition local variable
  void e05ConditionallyPrinting() {
    System.out.println("Start of Example 7");

    boolean aTestCondition = false;
    if (aTestCondition) {
      System.out.println("Conditionals are AWESOME");
    }

    System.out.println("End of Example 7");
  }

  int e06IfElseExample(boolean aBoolean) {
    int anInt;
    if (aBoolean) {
      anInt = 1;
    } else {
      anInt = 0;
    }
    return anInt;
  }

  boolean e07BooleanAndExample(boolean a, boolean b) {
    return a && b;
  }

  boolean e08BooleanOrExample(boolean a, boolean b) {
    return a || b;
  }

}