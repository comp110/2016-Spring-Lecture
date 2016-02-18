package comp110.lecture10;

class BankAccount {

  double _balance;

  BankAccount() {
    _balance = 0.0;
  }

  double checkBalance() {
    return _balance;
  }

  void deposit(double dollars) {
    _balance = _balance + dollars;
  }

  void withdraw(double dollars) {
    _balance = _balance - dollars;
  }

}
