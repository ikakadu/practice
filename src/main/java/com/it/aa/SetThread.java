package com.it.aa;

public class SetThread implements Runnable{
	private Student student;
	int x=0;
	public SetThread(Student student) {
		this.student=student;
	}
	@Override
	public void run() {
		while(true) {
			if(x%2==0) {
				this.student.set("东皇太一", 20);
				
			}else {
				this.student.set("曹操",30);
			}
			x++;
			}
		}
}
