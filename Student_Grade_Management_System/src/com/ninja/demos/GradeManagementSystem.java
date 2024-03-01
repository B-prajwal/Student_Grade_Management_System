package com.ninja.demos;

import java.util.ArrayList;

public class GradeManagementSystem {
    public ArrayList<Student> students;

    public GradeManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudentMarks(int rollNumber, double[] marks) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                student.updateMarks(marks);
                break;
            }
        }
    }

    public void deleteStudent(int rollNumber) {
        students.removeIf(student -> student.getRollNumber() == rollNumber);
    }

    public void displayStudentDetails() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Roll Number: " + student.getRollNumber());
            System.out.println("Marks: ");
            for (int i = 0; i < student.getMarks().length; i++) {
                System.out.println("Subject " + (i + 1) + ": " + student.getMarks()[i]);
            }
            System.out.println("Percentage: " + student.getPercentage());
            System.out.println("Grade: " + student.getGrade());
            System.out.println();
        }
    }
}
