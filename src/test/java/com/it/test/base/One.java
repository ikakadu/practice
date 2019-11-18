package com.it.test.base;
abstract class Father{
	protected int i =1;
	public Father() {
		System.out.println("父类无参构造方法");
	}
}
class Son extends Father{
	public int i = 2;
	public Son() {
		System.out.println("子类无参构造方法");
	}
}
public class One {
	public static void main(String[] args) {
		Son son = new Son();
		System.out.println(son.i);
	}
}
