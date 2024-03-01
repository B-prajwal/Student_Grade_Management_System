package com.ninja.demos;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeManagementSystem gradeManagementSystem = new GradeManagementSystem();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Update Student Marks");
            System.out.println("3. Delete Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    System.out.print("Enter number of subjects: ");
                    int numSubjects = scanner.nextInt();
                    double[] marks = new double[numSubjects];
                    for (int i = 0; i < numSubjects; i++) {
                        System.out.print("Enter marks for subject " + (i + 1) + ": ");
                        marks[i] = scanner.nextDouble();
                    }
                    Student newStudent = new Student(name, rollNumber, marks);
                    gradeManagementSystem.addStudent(newStudent);
                    break;
                case 2:
                    System.out.print("Enter roll number of student whose marks you want to update: ");
                    int rollToUpdate = scanner.nextInt();
                    System.out.print("Enter number of subjects: ");
                    int numSubToUpdate = scanner.nextInt();
                    double[] updatedMarks = new double[numSubToUpdate];
                    for (int i = 0; i < numSubToUpdate; i++) {
                        System.out.print("Enter updated marks for subject " + (i + 1) + ": ");
                        updatedMarks[i] = scanner.nextDouble();
                    }
                    gradeManagementSystem.updateStudentMarks(rollToUpdate, updatedMarks);
                    break;
                case 3:
                    System.out.print("Enter roll number of student to delete: ");
                    int rollToDelete = scanner.nextInt();
                    gradeManagementSystem.deleteStudent(rollToDelete);
                    break;
                case 4:
                    gradeManagementSystem.displayStudentDetails();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
