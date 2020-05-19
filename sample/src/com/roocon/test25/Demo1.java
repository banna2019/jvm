package com.roocon.test25;

import com.roocontest21.Demo2;
import com.sun.media.jfxmedia.events.NewFrameEvent;

public class Demo1 {
	
	private final Object obj;

	public Demo1() {
		obj = new Object();
//		obj.a = 10;
	}
	
	private Demo1 demo;
	
	public void w() {
		demo = new Demo1();
	}
	
	public void r() {
		Demo1 d = demo;
//		if(d != null) {
//			d.a;
//		}
	}
}
