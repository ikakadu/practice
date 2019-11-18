package com.it.aa;

public abstract class FanLi {
	public abstract void nouse();//取消发表
	
	public static void main(String[] args) {
		FanLi.fun();
	}
	
	public static void fun() {
		System.out.println("我是反例");
	}
}