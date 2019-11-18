package com.iq;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Test4 {

	public static void main(String [] args){   

		HashSet collection = new HashSet();   

		Person person1 = new Person("zhangsan",23);   

		Person person2 = new Person("lisi",24);   

		Person person3 = new Person("王五",25);  
		
		
		 collection.add(person1);   

		collection.add(person2);   

		collection.add(person3);   
		 
		person3.setAge(26);
		

		collection.remove(person3);

		  System.out.println(collection.size());
		  System.out.println(collection);

	}
	
	 public static int getArrayListCapacityMy(ArrayList<?> arrayList) {
		 try {
			Field field = ArrayList.class.getDeclaredField("elementData");
			field.setAccessible(true);
			Object[] object = (Object[])field.get(arrayList);
			return object.length;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		
	 }
	 
	 class a{
		 private String name;
		 
		 class b{
			 private String name;
		 }
		 
	 }
	 
	 
	
}
