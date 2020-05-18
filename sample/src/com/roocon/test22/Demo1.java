package com.roocon.test22;

public class Demo1 {
	
	private int a;
	private boolean flag;
	
	public void writer() {
		// 这两个数据之间没有依赖性,因此处理器会对这两行代码进行指令重排序
		a = 1;
		flag = true;
		
	}

	public void reader() {
//		while(flag) {
//		int b = a + 1;
		if(flag) {
			int b = a + 1;
			System.out.println(b);
		}
	}
}
