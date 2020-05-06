package com.roocon.test2;

import java.util.ArrayList;
import java.util.List;


public class JConsoleTest {
	
	//public byte []b1 = new byte[128 * 1024];	//这里是全局变量,运行过程中占用内存空间不容易被回收
	
	public JConsoleTest() {
		byte []b1 = new byte[128 * 1024];  		//这里定义的是局部变量,运行过程中局部变量过期后内存区会被回收;推荐使用
	}
	
	public static void main(String[] args) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("start ......");
		
		fill(1000);
	}
	
	private static void fill(int n) {
		
		List<JConsoleTest> jlist = new ArrayList<JConsoleTest>();
		for(int i = 0;i<n;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			jlist.add(new JConsoleTest());
		}
		
	}

}
