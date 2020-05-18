package com.roocon.test20;

import java.util.function.Function;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Demo {
	
	public static void main(String[] args) throws Exception {
		
		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine se = sem.getEngineByName("JavaScript");
		
		Object obj = se.eval("function add(a,b){return a + b;} add(2,3);");
		
		System.out.println(obj);
	}

}
