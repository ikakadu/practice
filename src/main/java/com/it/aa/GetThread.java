package com.it.aa;

public class GetThread implements Runnable{
	private Student student;
	public GetThread(Student student) {
		this.student=student;
	}
	@Override
	public void run() {
		while(true) {
			this.student.get();
		}
	}
}
