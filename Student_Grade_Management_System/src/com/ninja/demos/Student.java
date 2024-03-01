package com.ninja.demos;

public class Student {

	public String name;
	public int rollNumber;
	public double[] marks;
	public double percentage;
	public char grade;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        calculatePercentage();
        calculateGrade();
    }

	public String getName() {
		return name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public double[] getMarks() {
		return marks;
	}

	public double getPercentage() {
		return percentage;
	}

	public char getGrade() {
		return grade;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setMarks(double[] marks) {
		this.marks = marks;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void calculatePercentage() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        this.percentage = total / marks.length;
    }

    public void calculateGrade() {
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public void updateMarks(double[] marks) {
        this.marks = marks;
        calculatePercentage();
        calculateGrade();
    }
}
