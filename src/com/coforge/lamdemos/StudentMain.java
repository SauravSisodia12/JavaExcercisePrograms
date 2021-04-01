package com.coforge.lamdemos;

class StudDetailsImple implements StudDetails{

	@Override
	public double getAverage(int... marks) {
		int sum = 0;
		for(int num:marks)
			sum+=num;
		int avg = sum/marks.length;
		return avg;
	}
}

public class StudentMain {

	public static void main(String[] args) {

		Student stud1 = new Student();
		StudDetails details = new StudDetailsImple();
		stud1.printDetails("Rahul","Delhi",details,90,85,95);
		System.out.println();
		stud1.printDetails("Sumit","UP",details,90,85,65,95);

	}

}
