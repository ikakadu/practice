package com.iq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
	    // 使用ImmutableList初始化一个List
//		List<String> userNames = Arrays.asList("Hollis", "hollis", "HollisChuang", "H");
		
	    List<String> list = new ArrayList<String>();
	    list.add("qqqqqq");
	    list.add("WWWWWWWWW");
	    list.add("Hollis");
	    list.add("asasf");
//	    for (int i = 0; i < list.size(); i++) {
//	        System.out.println(list.get(i));
//	        list.remove(i);
//	    }
//	    for (String str : list) {
//			System.out.println(str);
//			list.remove(str);
//		}
	    
	    Iterator<String> iterator = list.iterator();
//	    do
//	    {
//	        if(!iterator.hasNext())
//	            break;
//	        String userName = (String)iterator.next();
//	        if(userName.equals("Hollis"))
//	        	list.remove(userName)
//	        	;
//	    } while(true);
//	    System.out.println(list);
	    while(iterator.hasNext()) {
	    	String next = iterator.next();
	    	iterator.remove();
	    	System.out.println(next);
	    }
	    
	    
	    
	    
	    
		
//		  System.out.println("使用for循环遍历List"); 
//		  for (int i = 0; i < userNames.size(); i++){
//			  System.out.println(userNames.get(i)); 
//			  userNames.remove(i); 
//		  }
//		  
//		  System.out.println("使用foreach遍历List"); 
//		  for (String userName : userNames) {
//			  System.out.println(userName); 
//			  userNames.add("weqwr");
//			  userNames.remove("Hollis"); 
//		  }
		 
	}
}
