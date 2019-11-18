package com.it.aa;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ww {
	
	
	public static void main(String[] args) {
		
//		exchange();
//		int fun1 = fun1();
		System.out.println(fun1());
	}

	public static int fun1() {
		int count =0;
//		for (int i = 0; i < 10; i++) {
//			count=count++;
//		}
		count++;
		System.out.println(count);
		return count;
	}

	public static void exchange() {
		int a = 1;
		int b = 1;
		
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a="+a +",b="+b);
	}

}
