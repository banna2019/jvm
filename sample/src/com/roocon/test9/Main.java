package com.roocon.test9;

public class Main {
	
	private static final int M = 1024 *1024;
	
	public static void main(String[] args) {
		
//		byte [] b1 = new byte[7 * M];		//没有进老年代
		byte [] b1 = new byte[7 * M];		//通过设置定参数"-XX:PretenureSizeThreshold=6M",制定大对象的阈值
//		byte [] b1 = new byte[8 * M];		
		
	}

}
