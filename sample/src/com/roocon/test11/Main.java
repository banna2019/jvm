package com.roocon.test11;

import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		Map<Thread, StackTraceElement[]> m = Thread.getAllStackTraces();
		for(Map.Entry<Thread,StackTraceElement[]> en : m.entrySet()) {
			Thread t = en.getKey();
			StackTraceElement[] v = en.getValue();
			System.out.println("Thread name is" + t.getName());
			for(StackTraceElement s : v) {
//				System.out.println("\t" + s.toString());
				System.err.println("\t" + s.toString());
			}
		}
	}

}
