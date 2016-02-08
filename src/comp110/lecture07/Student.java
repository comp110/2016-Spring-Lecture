package comp110.lecture07;

class Student {

  /* Instance Variables */
  String _name;
  int _age;
  double _gpa;

  /* Constructors */
  Student() {
    _name = "";
    _age = 0;
    _gpa = 0.0;
  }

  Student(String name, int age, double gpa) {
    _name = name;
    _age = age;
    _gpa = gpa;
  }

  /* Mutator Methods */
  void setName(String name) {
    _name = name;
  }

  void setAge(int age) {
    _age = age;
  }

  void setGPA(double gpa) {
    _gpa = gpa;
  }

  /* Accessor Methods */
  String getName() {
    return _name;
  }

  int getAge() {
    return _age;
  }

  double getGPA() {
    return _gpa;
  }

}