package studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        if (findStudent(student.getId()) != null)
            throw new IllegalArgumentException("Student ID already exists.");
        students.add(student);
    }

    public Student findStudent(String id) {
        for (Student s : students)
            if (s.getId().equalsIgnoreCase(id)) return s;
        return null;
    }

    public boolean deleteStudent(String id) {
        Student s = findStudent(id);
        return s != null && students.remove(s);
    }

    public List<Student> getStudents() { return students; }
}
