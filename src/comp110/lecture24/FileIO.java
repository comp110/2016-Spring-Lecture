package comp110.lecture24;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * In this sample code we'll read a CSV file of course data into our program.
 * We'll write a simple algorithm to calculate how challenging the semester will be.
 * Finally we'll write this analysis back out to a plain text file.
 */
public class FileIO {

  public static void main(String[] args) {

    try {

      // 1. Setup our variables

      // As we read courses in from our file, we'll add them
      // to this schedule.
      CourseSchedule schedule = new CourseSchedule();

      // Construct a new File Reference
      File inputFile = new File("data/classes.csv");

      // Construct a new Scanner to read the File Reference
      Scanner rows = new Scanner(inputFile);

      // 2. Read Data In

      // 3. Output analysis
      System.out.println("Your course load is: " + schedule.load());

      /*
       * TODO: File Output
       */
      File outputFile = new File("data/output.txt");
      FileWriter outputWriter = new FileWriter(outputFile);
      outputWriter.close();

    } catch (IOException e) {
      System.out.println("Something failed with File I/O: " + e.getMessage());
    }

  }

}