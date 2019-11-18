package com.it.aa;

public abstract class Animal {
	
	public  static void eat() {
		System.out.println("Animal eats");
	}
	public static  void jj(Animal c) {
		c.eat();
	}
	public static void main(String[] args) {
		Animal dog=new dog();
		Animal cat=new cat();
		jj(dog);
		jj(cat);
	}
}
class dog extends Animal{
	public dog() {
		System.out.println("dog");
	}
	public static void eat() {
		System.out.println("dog eats");
	}
}

class cat extends Animal{
	public cat() {
		System.out.println("cat");
	}
	public static void eat() {
		System.out.println("cat eats");
	}
}