package com.roocontest13;

public class DeadLock implements Runnable {
	
	private Object obj1;
	private Object obj2;
	
	public DeadLock(Object obj1,Object obj2) {
		// TODO 自动生成的构造函数存根
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		synchronized (obj1) { //t1 obj1  t2 obj2
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			synchronized (obj2) { //t1 t2 分别等待
				System.out.println("Hello");
				
			}
			
		}
		
	}

}
