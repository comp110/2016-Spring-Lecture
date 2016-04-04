package comp110.lecture21;

public class CallStackError {

  public static void main(String[] args) {
    CallStackError example = new CallStackError();
    example.stack();
  }

  // What happens here?
  public void stack() {
    System.out.println("Stacking...");
    this.stack();
  }

}