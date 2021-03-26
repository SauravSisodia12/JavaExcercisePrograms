package com.coforge.oops;

import java.util.Scanner;

public class StudentGrades {

	String name;
	int studentId;

	public StudentGrades(String name, int studentId, int[] marks) {
		this.name = name;
		this.studentId = studentId;
	}

	void getDetails() {
		System.out.println("Student Name : " + name);
		System.out.println("Student Id : " + studentId);
	}

	void getGrades(int[] marks) {
		int sum = 0;
		String grade;
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		int avg = sum / marks.length;
		if (sum > 450 && sum <= 500)
			grade = "A";
		else if (sum > 400 && sum <= 450)
			grade = "B";
		else if (sum > 300 && sum <= 400)
			grade = "C";
		else
			grade = "D";

		System.out.println("Total = " + sum + "/500  Average Marks = " + avg + "  Grade = " + grade);
	}

	public static void main(String[] args) {
		String name;
		int studentId;
		int[] marks = new int[5];
		
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {

			System.out.print("Enter Student Name = ");
			name = input.next();
			System.out.print("Enter Student Id = ");
			studentId = input.nextInt();

			System.out.print("Enter marks = ");
			for (int j = 0; j < 5; j++) {
				marks[j] = input.nextInt();
			}

			StudentGrades student = new StudentGrades(name, studentId, marks);

			student.getDetails();
			student.getGrades(marks);
			System.out.println();
			System.out.println();
		}

		input.close();
	}

}
