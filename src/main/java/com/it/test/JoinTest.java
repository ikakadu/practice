package com.it.test;

public class JoinTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadJoinTest t1 = new ThreadJoinTest("t1");
		ThreadJoinTest t2 = new ThreadJoinTest("t2");
		ThreadJoinTest t3 = new ThreadJoinTest("t3");
		t3.start();
		t2.start();
		t1.start();
		t3.join();
		t2.join();
		t1.join();
	}
}



class ThreadJoinTest extends Thread{
	public ThreadJoinTest(String name) {
		super(name);
	}

	@Override
	public void run() {
		 for(int i=0;i<10;i++){
	            System.out.print(this.getName() + ":" + i+"  ");
	        }
		 System.out.println();
	}
	
}