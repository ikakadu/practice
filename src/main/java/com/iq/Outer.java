package com.iq;

import java.util.HashSet;
import com.iq.Outer.Inner;
import org.junit.jupiter.api.Test;

public class Outer {
	private String outS1 = "oosss1";
	   class Inner{
//		Outer.Inner in = new Outer().new Inner();
//		Inner in = new Outer.Inner();//静态内部类
		public static  final int s = 3;
		 void method() {
			 System.out.println("------");
		 }
		
		 public void funout() {
			   System.out.println(Outer.this.toString());
		 }
		 public void funin() {
			 System.out.println(Inner.this.toString());
		 }
		 
	}
	   
	
	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();
		in.funout();
		in.funin();
	}
	@Test
	 public void test() {
		 Outer.Inner in = new Outer().new Inner();
		 System.out.println();
		 System.out.println(in.s);
	 }
	
}
