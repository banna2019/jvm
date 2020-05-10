package com.roocon.test12;

import java.util.Scanner;

import com.sun.media.jfxmedia.events.NewFrameEvent;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.next();
		
		//同步进行的
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO 自动生成的方法存根
				//这里空的while true对cpu占用率是比较高的
				while(true) {
					
				}
				
			}
		},"while true").start();
		sc.next();
		testWait(new Object());		//创建一个方法,这里是不抢占CPU资源的;CPU的使用率比较低
		
	}

	private static void testWait(Object obj) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO 自动生成的方法存根
				synchronized (obj) {
					
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					
				}	
			}
		},"wait").start();
		
	}

}
