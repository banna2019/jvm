package com.roocon.test17;

public class VDemo {
	
	private int a;
	
	private int b;
	
	public int add() {
		
		return a+b;
	}

	public int add2() {
		//不用未赋值的局部变量,是不会报错的;但要是使用局部变量一定要先赋值
		int a = 0;
		int b = 0;
		
		return a+b;
//		System.out.println();
		
	}
}
