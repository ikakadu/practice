package com.it.test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test{
	static int[] arr = {1,2};
    public static void main(String [] args) throws Exception{
    	//
    	List<String> list = new ArrayList<String>();
    	
    	list.add("1");
    	list.add("2");
    	list.add("21");
    	Iterator<String> iterator = list.listIterator();
    	for(;iterator.hasNext();) {
    		String next = iterator.next();
    		if("1".equals(next)) {
    			iterator.remove();
    			
    		}
    	}
    	
    	System.out.println(list);
    }
	public static int fun2() {
		try {
			System.out.println(1);
			int a = 1/0;
			return -1;
		}catch(Exception e){
			System.out.println(2);;
			return -2;
		}
		finally {
			System. out.println(3);
			return -3;
		}
//		System.out.println(4);
//		return 0;
	}
    public static void exchange(Integer a,Integer b) throws Exception {
    	int temp = a;
    	Class clazz = a.getClass();
    	Field declaredField = clazz.getDeclaredField("value");
    	declaredField.setAccessible(true);
    	declaredField.setInt(a, b);
    	declaredField.setInt(b, new Integer(temp));
    	
    }
}
