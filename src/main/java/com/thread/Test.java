package com.thread;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Set;

import com.iq.Person;

public class Test {



	public Test() {
		System.out.println("无参构造方法");
	}
	public void Test() {
		System.out.println("Test方法");
	}

	   public static void main(String[] args) {
//		   Test test = new Test();
//		   test.Test();
		   float f1 = 0.1f;
		   float f2 = 0.2f;
		   System.out.println(f1+f2);
		   double d1 = 0.1;
		   double d2 = 0.2;
		   System.out.println(d1+d2);
		   String s = "16602102355";
		   System.out.println(MessageFormat.format("mcht:verification:code:{0}", "+8616602102355"));
	    }
	
	
	 
}
