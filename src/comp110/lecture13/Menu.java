package comp110.lecture13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Menu {

  ArrayList<Food> parseFile(String csvFilePath) {
    Scanner lineReader, lineCounter;
    File csv = new File(csvFilePath);
    try {
      lineReader = new Scanner(csv);
    } catch (FileNotFoundException e) {
      // If the CSV file does not exist, we'll exit the program
      System.out.println(e.getMessage());
      System.exit(1);
      return null;
    }

    ArrayList<Food> menu = new ArrayList<Food>();
    int index = 0;
    while (lineReader.hasNextLine()) {
      String nextLine = lineReader.nextLine();
      Scanner columnReader = new Scanner(nextLine);
      columnReader.useDelimiter(","); // Since we're scanning a CSV
      String seating = columnReader.next();
      Food food = new Food(columnReader.next());
      food.setSeating(seating);
      food.setCalories(columnReader.nextDouble());
      food.setProtein(columnReader.nextDouble());
      food.setFat(columnReader.nextDouble());
      food.setCarbohydrates(columnReader.nextDouble());
      food.setOranic(columnReader.nextBoolean());
      food.setVegetarian(columnReader.nextBoolean());
      food.setGlutenFree(columnReader.nextBoolean());
      food.setVegan(columnReader.nextBoolean());
      menu.add(food);
    }
    lineReader.close();

    return menu;
  }
}