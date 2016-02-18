package comp110.lecture10;

class Person {

  String _name;
  BankAccount _account;

  Person(String name) {
    _name = name;
    _account = new BankAccount();
  }

  void getsPaycheck() {
    _account.deposit(2000.00);
  }

  void goesToRamsForDinner() {
    _account.withdraw(12.0);
  }

  String getName() {
    return _name;
  }

  BankAccount getAccount() {
    return _account;
  }

}
