package com.it.dd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class test {

	public static void main(String[] args) {
		
//      paixu();
//		Student s = new Student();
//		s.setAge(23);
//		s.setName("张三");
//		test.fun(s, 3);
//		System.out.println(s);
//		int num = [] {1,2};
//		short a =128;
//				byte b =(byte) a;
//				System.out.println(a );
//				System.out.println(b);
	int	i=4;
		System.out.println((i++)+(i++)+(++i));;
	}
	public static int fun1() {
		
			  int ret=0;
			  try{
			    //ArithmeticException 分母为0
			    int a=5/0;
			    return a;
		} 
			    /*
			 * catch(Exception e){ System.out.println(e); }
			 */
			  finally{
				  System.out.println("----------");
//			    return 2;
			  }
			
	}
	
	public static void fun(Student s,int i) {
		s.setAge(25);
		Student s1 = new Student();
		s1.setName("lisi");
		s=s1;
	}

	public static void paixu() {
		List<person> list = Arrays.asList(new person("22","333"),new person("22","333"),new person("33","444") );
//        list.add(e);
        Collector<Object, ?, List<Object>> collector = Collectors.toList();
        List<person> list2 = list.stream().distinct().collect(Collectors.toList());       
        System.out.println(list2);
	}

}
