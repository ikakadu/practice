package com.it.test;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this) {
			
			try{
			  System.out.println(Thread.currentThread().getName());
			   Thread.sleep(100);
			   }catch (InterruptedException e){
				   e.printStackTrace();
			   }
		}
	}
	public static void main(String[] args) {
//		BlockingDeque<Runnable> queue = new LinkedBlockingQueue<Runnable>();
		BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>();
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 6, 1, TimeUnit.DAYS, queue);
		for (int i = 0; i < 10; i++) {
			executor.execute(new Thread(new ThreadPoolTest(),"TestThread".concat(""+i)));
			int threadSize = queue.size();
			System.out.println("线程队列大小为-->"+threadSize);
		}
		executor.shutdown();
	}
	
}
