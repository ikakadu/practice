package com.it.aa;

public class StudentDemo {
	public static void main(String[] args) {
		Student student = new Student();
		SetThread setThread = new SetThread(student);
		GetThread getThread = new GetThread(student);
		Thread t1 = new Thread(setThread);
		Thread t2 = new Thread(getThread);
		t1.start();
		t2.start();
	}
}
