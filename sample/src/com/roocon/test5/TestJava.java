package com.roocon.test5;

public class TestJava {

	public static void main(String[] args) {
		
		String s1 = "abc"; 					//这里是定义一个字符的常量,会直接进入"Stringtable-常量池中"(字节码常量)
		String s2 = "abc";
		
		System.out.println(s1 == s2);		//"=="比较内存地址(Stringtable-"常量池"会记录字符串的地址信息)
		
		String s3 = new String("abc");		//使用new来创建对象就不再考虑常量池的问题了,而是直接将对象存储在堆内存中;所以不相等
		
		System.out.println(s3);
		System.out.println(s1 == s3);
		System.out.println(s1 == s3.intern());	//这里使用"intern"后,会把创建的对象搬到"Stringtable-常量池"中去(运行时常量),所以结果是相等
	}
	
}
