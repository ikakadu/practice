package com.iq;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
	Object o = new Object();
	synchronized static void method1()  {
		int i=0;
	}
	synchronized  void method3()  {
		int i=0;
	}
	
	void method2()  {
		synchronized (o) {
			System.out.println("123");
		}
	}
	
	
	
	  public static void main(String[] args) {
		  List<String> list = new ArrayList<String>();
		  List<IllegalArgumentException> list1 = new ArrayList<IllegalArgumentException>();
		  try {
			
			  System.out.println("1111");
			  throw new IllegalArgumentException("非法参数");
		} catch (IllegalArgumentException e) {
			list.add(e.getMessage());
		} catch (Exception e) {
			list1.add((IllegalArgumentException) e);
		}
		  System.out.println(list);
	}
	    public static int fun(int n){
	    	if (n<1) return -1;
	    	if (n==1||n==2) return 1;
	    	return fun(n-1)+fun(n-2);
	    	
	    }
}
