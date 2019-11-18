package com.iq;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test6 {
	boolean b0   ;
	public static void main(String[] args) {
//		removeListIndex();
		System.out.println(Test6.fun2());
		
	}
	
	public void fun3() {
		boolean b1  ;
		System.out.println(b0);
//		System.out.println(b1);
//		PrintStream out = System.out;
		
	}
	
	public static int fun2() {
		int r = 0;
		try {
			int i = 2/0;
			return r;
		} catch (Exception e) {
			r=-1;
			return r;
		} finally {
			r=99;
			return r;
		}
//		r=-2;
//		return r;
		
	}

	public static void removeListIndex() {
		List<String> list = new ArrayList<String>();
		List<Integer> index = new ArrayList<Integer>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		index.add(2);
		index.add(5);
		index.add(4);
		
		Collections.sort(index);
		System.out.println(index);
		for (int i = index.size()-1; i >= 0; i--) {
			list.remove(index.get(i).intValue());
		}
		
		
//		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext()) {
//			String next = iterator.next();
//			if(next.equals("b")) {
//				iterator.remove();
//			}
//			for (int i = 0; i < index.size(); i++) {
//				if(next.equals(list.get(index.get(i)))) {
//					
//				}
//			}
//		}
		
		
		System.out.println(list);
	}
	
	public static  void listSort (List<Integer> index) {
		Collections.sort(index);
	}
//	public static  void fun (int i) {
//		System.out.println(i);
//	}

}

enum AccountType
{
    SAVING, FIXED, CURRENT,other;
    private AccountType()
    {
        System.out.println("It is a account type");
    }
}
