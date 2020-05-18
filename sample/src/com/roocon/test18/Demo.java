package com.roocon.test18;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Demo {
	
	static class Parent {
		
	}
	
	static class Child1 extends Parent {}
	
	static class Child2 extends Parent {}
	
	public void sayHello (Child1 c) {
		
		System.out.println("c1 is call");
		
	}

	public void sayHello (Child2 c) {
		
		System.out.println("c2 is call");
		
	}
	
	
	public void sayHello (Parent p) {
		
		System.out.println("p is call");
		
	}
	
	
	public static void main(String[] args) {
		
		Parent p1 = new Child1();
		Parent p2 = new Child2();
		
		Demo d = new Demo();
		
		d.sayHello(p1);
		d.sayHello(p2);
		
		//实际类型发生改变
		Parent p = new Child1();
		p = new Child2();
		
		//静态类型发生变化
		d.sayHello((Child2)p);
	}
}
