package com.roocon.test18;

public class Demo1 {
	
	public void sayHello(Short a) {
		System.out.println("short");
	}
	
	public void sayHello(int a) {
		System.out.println("int");
	}

	public void sayHello(long a) {
		System.out.println("long");
	}
	
	public void sayHello(char a) {
		System.out.println("char");
	}
	
	public void sayHello(Character a) {
		System.out.println("character");
	}
	
	public void sayHello(Object a) {
		System.out.println("Object");
	}
	
	public void sayHello(char... a) {
		System.out.println("char...");
	}
	
	public static void main(String[] args) {
		new Demo1().sayHello('a');		//类型不能转换
	}
}
