package comp110.lecture13;

class Food {

  /* Instance Variables */
  String _seating;
  String _name;
  double _calories;
  double _protein;
  double _fat;
  double _carbohydrates;
  boolean _isOranic;
  boolean _isVegetarian;
  boolean _isGlutenFree;
  boolean _isVegan;

  /* Constructor */
  Food(String name) {
    _name = name;
    _seating = "";
    _calories = 0.0;
    _protein = 0.0;
    _fat = 0.0;
    _carbohydrates = 0.0;
    _isOranic = false;
    _isVegetarian = false;
    _isGlutenFree = false;
    _isVegan = false;
  }

  /* Getters and Setters */
  String getSeating() {
    return _seating;
  }

  void setSeating(String seating) {
    _seating = seating;
  }

  String getName() {
    return _name;
  }

  void setName(String name) {
    _name = name;
  }

  double getCalories() {
    return _calories;
  }

  void setCalories(double calories) {
    _calories = calories;
  }

  double getProtein() {
    return _protein;
  }

  void setProtein(double protein) {
    _protein = protein;
  }

  double getFat() {
    return _fat;
  }

  void setFat(double fat) {
    _fat = fat;
  }

  double getCarbohydrates() {
    return _carbohydrates;
  }

  void setCarbohydrates(double carbohydrates) {
    _carbohydrates = carbohydrates;
  }

  boolean isOranic() {
    return _isOranic;
  }

  void setOranic(boolean isOranic) {
    _isOranic = isOranic;
  }

  boolean isVegetarian() {
    return _isVegetarian;
  }

  void setVegetarian(boolean isVegetarian) {
    _isVegetarian = isVegetarian;
  }

  boolean isGlutenFree() {
    return _isGlutenFree;
  }

  void setGlutenFree(boolean isGlutenFree) {
    _isGlutenFree = isGlutenFree;
  }

  boolean isVegan() {
    return _isVegan;
  }

  void setVegan(boolean isVegan) {
    _isVegan = isVegan;
  }

}