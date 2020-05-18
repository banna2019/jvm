package com.roocontest21;

public class Demo2 {
	
	public void a () {
		
		System.out.println("a");	// 1 启动另外一个线程的线程方法
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO 自动生成的方法存根
				System.out.println("b");	// 2
			}
		}).start();
		
	}

}
