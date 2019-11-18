package com.iq;

public class Test8 {
	
	    private static String str = "";

	    public static void main(String[] args) {
//	        strTest1();
//	    	intTest();
	    	
//	    	arrTest();
	    	
	    	personTest();
//	    	plusplusTest();
	    	
	    }

		public static void plusplusTest() {
			int count = 0;
	    	int num = 0;
	    	for (int i = 0; i <= 100; i++) {
	    		num = num+i;
				count=count++;
			}
	    	
	    	System.out.println(num*count);
	    	
	    	int a =0;
	    	a=a++;
	    	System.out.println(a);
		}
		
		public static void arrTest() {
			int[] arr = {1,2,3,4};
	    	changeArray(arr);
	    	for (int i = 0; i < arr.length; i++) {
				
	    		System.out.println(arr[i]);
			}
		}
		public static void changeArray(int[] i){
			i[0] = 5;
		}
		public static void intTest() {
			int a = 2;
	    	changeInt(a);
	    	
	    	System.out.println(a);
		}
		public static void strTest1() {
			str = "hello";
	        changeStr(str);
	        System.out.println(str);
		}
	    public static void changeStr(String str){
	        str = "welcome";
	    }
		public static void changeInt(int i){
			i = 10;
		}
		
		public static void personTest() {
			Person p1 = new Person("zhangsan", 23);
	    	changePerson(p1);
	    	System.out.println(p1);
		}
		public static Person changePerson(Person p){
			p.setName("lisi");
			return p;
		}
	
}
