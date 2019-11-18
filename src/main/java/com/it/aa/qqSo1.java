package com.it.aa;

public class qqSo1 {
	
    public static void main(String[] args) {
        try{
          int i = 100 / 0;
          System.out.print(i);
     }catch(Exception e){
          System.out.print(1);
          throw new RuntimeException();
     }finally{
          System.out.print(2);
     }
         System.out.print(3);
    }
	
	static int fun() {
		int age=15;
		try {
			age++;
			return age;
		} finally {
			age =22;
			System.out.println(age);
//			return age;
		}
	}
}
