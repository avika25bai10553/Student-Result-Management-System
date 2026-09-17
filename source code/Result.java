package studentmanagement;

public class Result {
    private String studentId;
    private String courseCode;
    private double marks;

    public Result(String studentId, String courseCode, double marks) {
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.marks = marks;
    }

    public String getStudentId() { return studentId; }
    public String getCourseCode() { return courseCode; }
    public double getMarks() { return marks; }

    public String getGrade() {
        if (marks >= 90) return "A+";
        if (marks >= 80) return "A";
        if (marks >= 70) return "B";
        if (marks >= 60) return "C";
        if (marks >= 50) return "D";
        return "F";
    }

    @Override
    public String toString() {
        return studentId + " | " + courseCode + " | Marks: " + marks + " | Grade: " + getGrade();
    }
}
