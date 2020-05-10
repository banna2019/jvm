package com.roocon.test8;

public class Main {
	
	public static void main(String[] args) {
		//这里限制了最大的堆内存为20M,会内存溢出
//		byte [] b1 = new byte[10 * 1024 * 1024 ];
//		byte [] b2 = new byte[10 * 1024 * 1024 ];
//		byte [] b3 = new byte[10 * 1024 * 1024 ];
//		byte [] b4 = new byte[10 * 1024 * 1024 ];
	
		byte [] b1 = new byte[2 * 1024 * 1024 ];
		byte [] b2 = new byte[2 * 1024 * 1024 ];
		byte [] b3 = new byte[2 * 1024 * 1024 ];
		byte [] b4 = new byte[4 * 1024 * 1024 ];
		
		System.gc();
	}

}
