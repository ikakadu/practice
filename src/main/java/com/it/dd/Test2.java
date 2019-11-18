package com.it.dd;

public class Test2  {

	public static void main(String[] args) throws InterruptedException {
//		Test2 t = new Test2();
//		Test2 t1 = new Test2();
//		
//		System.out.println(t.fun1("on"));;
//		System.out.println(t1.fun1("weqwe"));;
		
		String str = "5Y";
		int temp=0;
		if(str.contains("D")) {
			temp = Integer.valueOf(str.substring(0, str.length()-1)) ;
		}
		if(str.contains("M")) {
			temp = Integer.valueOf(str.substring(0, str.length()-1))*30 ;
		}
		if(str.contains("Y")) {
			temp = Integer.valueOf(str.substring(0, str.length()-1))*365 ;
		}
		System.out.println(temp);
		
	}
	
	public String fun1(String sleep) throws InterruptedException {
		System.out.println("方法开始");
	       if (sleep.equals("on")) {
	           Thread.currentThread().sleep(4000);
	            return "sleep on";
	        } else {
	            return sleep;
	       }
	}
}
class Y extends Thread{

	@Override
	public void run() {
	      
		System.out.println("方法开始");
	           try {
				Thread.currentThread().sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   		System.out.println("方法结束");

		
	}
	
}
