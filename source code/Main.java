package studentmanagement;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static StudentManager studentManager = new StudentManager();
    static CourseManager courseManager = new CourseManager();
    static ResultManager resultManager = new ResultManager();

    public static void main(String[] args) {
        seedData();
        System.out.println("==============================================");
        System.out.println("     STUDENT RESULT MANAGEMENT SYSTEM");
        System.out.println("==============================================");

        while (true) {
            System.out.println("\n1. Student Management");
            System.out.println("2. Course Management");
            System.out.println("3. Result Management");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1 -> studentModule();
                    case 2 -> courseModule();
                    case 3 -> resultModule();
                    case 4 -> {
                        System.out.println("Thank you for using the system.");
                        return;
                    }
                    default -> System.out.println("Invalid option.");
                }
            } catch (Exception e) {
                System.out.println("Input error: " + e.getMessage());
            }
        }
    }

    static void studentModule() {
        System.out.println("\n--- Student Management ---");
        System.out.println("1. Add  2. View  3. Search  4. Delete");
        System.out.print("Choose: ");
        String c = sc.nextLine();
        try {
            if (c.equals("1")) {
                System.out.print("ID: "); String id = sc.nextLine();
                System.out.print("Name: "); String name = sc.nextLine();
                System.out.print("Email: "); String email = sc.nextLine();
                studentManager.addStudent(new Student(id, name, email));
                System.out.println("Student added successfully.");
            } else if (c.equals("2")) {
                for (Student s : studentManager.getStudents()) System.out.println(s);
            } else if (c.equals("3")) {
                System.out.print("Enter ID: ");
                Student s = studentManager.findStudent(sc.nextLine());
                System.out.println(s == null ? "Student not found." : s);
            } else if (c.equals("4")) {
                System.out.print("Enter ID: ");
                System.out.println(studentManager.deleteStudent(sc.nextLine()) ? "Deleted." : "Not found.");
            }
        } catch (Exception e) { System.out.println("Error: " + e.getMessage()); }
    }

    static void courseModule() {
        System.out.println("\n--- Course Management ---");
        System.out.println("1. Add  2. View  3. Search");
        System.out.print("Choose: ");
        String c = sc.nextLine();
        try {
            if (c.equals("1")) {
                System.out.print("Code: "); String code = sc.nextLine();
                System.out.print("Name: "); String name = sc.nextLine();
                System.out.print("Credits: "); int credits = Integer.parseInt(sc.nextLine());
                courseManager.addCourse(new Course(code, name, credits));
                System.out.println("Course added successfully.");
            } else if (c.equals("2")) {
                for (Course x : courseManager.getCourses()) System.out.println(x);
            } else if (c.equals("3")) {
                System.out.print("Enter code: ");
                Course x = courseManager.findCourse(sc.nextLine());
                System.out.println(x == null ? "Course not found." : x);
            }
        } catch (Exception e) { System.out.println("Error: " + e.getMessage()); }
    }

    static void resultModule() {
        System.out.println("\n--- Result Management ---");
        System.out.println("1. Enter Result  2. View Student Result  3. Average");
        System.out.print("Choose: ");
        String c = sc.nextLine();
        try {
            if (c.equals("1")) {
                System.out.print("Student ID: "); String id = sc.nextLine();
                System.out.print("Course Code: "); String code = sc.nextLine();
                System.out.print("Marks (0-100): "); double marks = Double.parseDouble(sc.nextLine());
                resultManager.addResult(new Result(id, code, marks));
                System.out.println("Result recorded successfully.");
            } else if (c.equals("2")) {
                System.out.print("Student ID: ");
                for (Result r : resultManager.getResultsForStudent(sc.nextLine()))
                    System.out.println(r);
            } else if (c.equals("3")) {
                System.out.print("Student ID: ");
                System.out.printf("Average: %.2f%n", resultManager.calculateAverage(sc.nextLine()));
            }
        } catch (Exception e) { System.out.println("Error: " + e.getMessage()); }
    }

    static void seedData() {
        studentManager.addStudent(new Student("S101", "Aarav", "aarav@example.com"));
        studentManager.addStudent(new Student("S102", "Meera", "meera@example.com"));
        courseManager.addCourse(new Course("CS101", "Java Programming", 4));
        courseManager.addCourse(new Course("AI201", "Artificial Intelligence", 3));
        resultManager.addResult(new Result("S101", "CS101", 88));
        resultManager.addResult(new Result("S101", "AI201", 92));
        resultManager.addResult(new Result("S102", "CS101", 76));
    }
}
