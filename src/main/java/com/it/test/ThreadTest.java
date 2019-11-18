package com.it.test;

public class ThreadTest extends Thread  {

	public static void main(String[] args) {
		ThreadTest t1=new ThreadTest();
		ThreadTest t2=new ThreadTest();
//		t1.start();
		t2.start();
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("1111111");
		}
	}

}
