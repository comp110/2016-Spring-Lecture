package comp110.lecture13;

import java.util.ArrayList;

class CDSData {

  /* Instance Variables */
  String _csvFile;
  ArrayList<Food> _foods;

  /* Constructor */
  CDSData() {
    // Load Today's Menu into _foods ArrayList
    _csvFile = "resources/lecture13/rams-02-29-16.csv";
    Menu menu = new Menu();
    _foods = menu.parseFile(_csvFile);
  }

  // Print Foods
  void print() {
    ArrayList<Food> input = _foods;
    int i = 0;
    while (i < input.size()) {
      Food food = input.get(i);

      String label = food.getName();
      label = label + " - Calories: " + food.getCalories();
      label = label + " - " + food.getSeating();
      System.out.println(label);

      i++;
    }
  }

  // Count Foods
  int count() {
    ArrayList<Food> input = _foods;
    return input.size();
  }

  // Sum Calories
  double sum() {
    ArrayList<Food> input = _foods;
    double sum = 0.0;
    int i = 0;
    while (i < input.size()) {
      // TODO
      i++;
    }
    return sum;
  }

  // Max Calorie Food
  Food max() {
    Food maxFound = new Food("No Result"); // Starts w/ 0 cal
    int i = 0;
    while (i < _foods.size()) {
      // TODO
      i++;
    }
    return maxFound;
  }

  // Filter
  ArrayList<Food> filter(ArrayList<Food> input) {
    ArrayList<Food> filtered = new ArrayList<Food>();
    int i = 0;
    while (i < input.size()) {
      // TODO
      i++;
    }
    return filtered;
  }

}