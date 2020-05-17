package com.roocon.test16;

import java.io.InputStream;

public class ClassLoadDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		ClassLoader mycl = new ClassLoader() {
			
			@Override
			public Class<?> loadClass(String name) throws ClassNotFoundException {
				// TODO 自动生成的方法存根
				
				//com.roocon.test16.ClassLoadDemo
				String  fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
				
				InputStream ins = getClass().getResourceAsStream(fileName);
				if(ins ==  null) {
					return super.loadClass(name);
				}
				
				try {
					byte [] buff = new byte[ins.available()];
					ins.read(buff);
					
					return defineClass(name, buff, 0, buff.length);
				} catch (Exception e) {
					// TODO: handle exception
					throw new ClassNotFoundException();
				}
				
			}
			
		};
		
		Object c = mycl.loadClass("com.roocon.test16.ClassLoadDemo").newInstance();
		
		System.out.println(c.getClass());
		
		System.out.println(c instanceof ClassLoadDemo); 	//想看下这个c instanceof是不是这个类的实例(不是同一个类加载器加载的,所以是false)
	}
}
