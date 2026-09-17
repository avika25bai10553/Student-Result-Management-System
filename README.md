# Student Result Management System

## Overview

Student Result Management System is a Java-based console application designed to manage student details, course information, and academic results in an organized way.

The project demonstrates core Java programming concepts such as Object-Oriented Programming, classes and objects, ArrayList, methods, exception handling, validation, and file handling.

## Features

### 1. Student Management
- Add new student
- View all students
- Search student by ID
- Delete student

### 2. Course Management
- Add new course
- View all courses
- Search course by code

### 3. Result Management
- Enter marks for a student
- View student results
- Calculate average marks
- Automatically calculate grades

### 4. Validation and Error Handling
- Validates student and course information
- Checks marks range
- Handles invalid input
- Prevents duplicate student IDs and course codes

## Technologies Used

- Java
- Object-Oriented Programming
- ArrayList
- File Handling
- Exception Handling
- Git & GitHub

## Project Structure

```text
Student_Result_Management_System/
│
├── src/
│   └── studentmanagement/
│       ├── Student.java
│       ├── Course.java
│       ├── Result.java
│       ├── StudentManager.java
│       ├── CourseManager.java
│       ├── ResultManager.java
│       ├── FileManager.java
│       └── Main.java
│
├── data/
│   └── results.csv
│
├── README.md
├── statement.md
└── .gitignore
## How to Run

### Requirements

- Java JDK installed on the system
- Any Java-supported IDE or terminal
- GitHub for project source code management

### Steps to Run the Project

1. Download or clone the project repository from GitHub.
2. Open the project folder in a Java-supported IDE or terminal.
3. Open the terminal inside the project folder.
4. Compile the Java source files using:

```bash
javac -d out src/studentmanagement/*.java
java -cp out studentmanagement.Main
Working Flow

The application follows this workflow:

Start the application.
Select an option from the main menu.
Manage student information.
Manage course information.
Enter student marks.
View student results.
Calculate average marks and grades.
Exit the application.
Testing

The following functionalities were tested:

Adding a student
Viewing students
Searching a student by ID
Deleting a student
Adding a course
Viewing courses
Searching a course by code
Entering student marks
Viewing student results
Calculating average marks
Grade calculation
Invalid input handling
Duplicate student ID validation
Duplicate course code validation
Non-Functional Requirements
Usability

The system provides a simple menu-based interface that is easy to understand and operate.

Reliability

Input validation and exception handling are used to reduce errors during execution.

Maintainability

The project is divided into multiple Java classes, with each class responsible for a specific functionality.

Performance

The system uses ArrayList for efficient in-memory management of student, course, and result information for the intended project scale.

Future Enhancements
Develop a graphical user interface (GUI)
Add database connectivity
Add user login and authentication
Generate downloadable result reports
Add attendance management
Add advanced result analytics
Add export options for student results
Project Outcome

The project demonstrates how Java programming concepts can be used to develop a practical Student Result Management System. It combines Object-Oriented Programming, collections, file handling, validation, and exception handling into a single application.

Author

Java Programming Project
VIT Bhopal University
