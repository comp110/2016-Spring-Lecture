package comp110.lecture24;

import java.util.ArrayList;

public class CourseSchedule {

  private ArrayList<Course> _courses;

  public CourseSchedule() {
    _courses = new ArrayList<Course>();
  }

  public double load() {
    double load = 0.0;

    // TODO: Improve our load algorithm
    for (Course course : _courses) {
      load += course.getHours();
    }

    return load;
  }

  public void add(Course course) {
    _courses.add(course);
  }

}
