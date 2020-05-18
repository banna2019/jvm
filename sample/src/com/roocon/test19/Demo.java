package com.roocon.test19;

public class Demo {
	
	static class Parent {
		
		public void sayHello () {
			
			System.out.println("parent");
			
		}
		
	}
	
	static class child1 extends Parent{
		
		@Override
		public void sayHello() {

			System.out.println("child1");
			
		}
		
	}

	
	static class child11 extends child1 {
		@Override
		public void sayHello() {
			System.out.println("child11");
		}
		
	}
	
	static class child2 extends Parent {
		
		@Override
		public void sayHello() {
			
			System.out.println("child2");
			
		}
		
	}
	
	public static void main(String[] args) {
//		Parent p1 = new child1();
		Parent p1 = new child11();
		Parent p2 = new child2();
		
		p1.sayHello();
		p2.sayHello();
		
		
	}
	
}
