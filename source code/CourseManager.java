package studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private final List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        if (findCourse(course.getCode()) != null)
            throw new IllegalArgumentException("Course code already exists.");
        courses.add(course);
    }

    public Course findCourse(String code) {
        for (Course c : courses)
            if (c.getCode().equalsIgnoreCase(code)) return c;
        return null;
    }

    public List<Course> getCourses() { return courses; }
}
