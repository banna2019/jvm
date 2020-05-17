package com.roocon.test17;

//public class GCDemo {
//	
//	public static void main(String[] args) {
//		
//		byte[] buff = new byte[60 * 1024 * 1024];		//这里内存区域没有进行回收
//		
//		System.gc();
//		
//	}
//
//}


public class GCDemo {
	
	public static void main(String[] args) {
		
		{
		
			byte[] buff = new byte[60 * 1024 * 1024];
		}
		
		int a = 10;	//这里是进行回收了
		System.gc();
		
	}

}