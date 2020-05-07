package com.roocon.test4;

public class StackTest {
	
	private void tes() {
		System.out.println("方法执行......");
		tes();
		
	}
	
	public static void main(String[] args){
		new StackTest().tes();
	}
}
