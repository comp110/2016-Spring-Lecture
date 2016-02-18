package comp110.lecture10;

class BankingDemo {

  Person makePerson(String name) {
    Person somebody = new Person(name);
    // Start a somebody out with a little cash...
    BankAccount account = somebody.getAccount();
    account.deposit(20.0);
    return somebody;
  }

}
