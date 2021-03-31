package com.coforge.threads;

class Student implements Runnable{
	
	String name,question;
	Trainer trainer;

	public Student(String name, String question, Trainer trainer) {
		super();
		System.out.println(name +" "+ question);
		this.name = name;
		this.question = question;
		this.trainer = trainer;
		Thread t = new Thread(this,name);
		t.start();
	}


	@Override
	public void run() {
		System.out.println("in run");
		Trainer trainer = new Trainer();
		trainer.answerQuery(name,question);
			}	
}

public class QueryRun {

	public static void main(String[] args) {
		System.out.println("Hello");
		Trainer trainer = new Trainer();
		Student Student1 = new Student("Ram", "How are you", trainer);
		Student Student2 = new Student("Raju","How are you", trainer);
		Student Student3 = new Student("Rohan", "How are you", trainer);

	}
}
