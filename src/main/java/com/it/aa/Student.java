package com.it.aa;

public class Student {
	private boolean flag=false;
	private String name;
	private int age;

	public Student() {}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student{" +
				"flag=" + flag +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public synchronized void set(String name, int age) {
		if(this.flag) {
			try {
				this.wait();//当前--
				System.out.println("****");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
//		else { 
//			this.name=name; 
//			this.age=age; 
//			this.flag=true; 
//			this.notify(); 
//		 } 
		this.name=name; 
		this.age=age; 
		this.flag=true; 
		this.notify(); 
	}
	public synchronized void get() {
		if(!this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else { 
		  System.out.println(this.name+"<======>"+this.age); 
		  this.flag=false;
		  this.notify(); 
		  }
	}
}
