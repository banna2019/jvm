package com.roocon.test14;

public class Main {
	
	public static void main(String[] args) {
//		System.out.println(Child.num);		//引用父类的静态变量,子类不会被初始化
		
//		Child[] c = new Child[10];		//定义数组来引用类,都不会被加载
		
		System.out.println(Child.a);	//子类和父类都没有被初始化
	}
}
