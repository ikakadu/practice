package com.it.test.base;

public class Derivaed extends Base {
	private String name = "derivaed";
	
	
	public Derivaed() {
		System.out.println("子类无参构造方法");
		tellName();
		printName();
		otherMethod();
	}
	 void otherMethod() {
		System.out.println("子类other方法");
		
	}
	
	@Override
	public void tellName() {
		// TODO Auto-generated method stub
		System.out.println("Derivaed tell name:"+ name);
	}
	public void printName() {
		System.out.println("Derivaed print name:"+ name);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Derivaed();
	}
}

abstract class Base{
	protected String name = "base";
	public Base() {
		System.out.println("父类无参构造方法");
		tellName();
		printName();
		otherMethod();
	}
	
	 void otherMethod() {
		System.out.println("父类other方法");
		
	}
	public abstract void tellName();
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("Base print name:" + name);
	}
}