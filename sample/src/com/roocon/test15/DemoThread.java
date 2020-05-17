package com.roocon.test15;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoThread {
	
	static class Hello {
		
		static {
			
			System.out.println(Thread.currentThread().getName() + "init");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(20);
		
		int i = 10;
		while(i++<20) {
			threadPool.execute(new Runnable() {
				
				@Override
				public void run() {
					// TODO 自动生成的方法存根
					System.out.println(Thread.currentThread().getName() + "start ...");
					Hello h = new Hello();
					System.out.println(Thread.currentThread().getName() + "end ...");
				}
			});
		}
	}
}