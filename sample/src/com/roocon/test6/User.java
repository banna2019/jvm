package com.roocon.test6;

import java.sql.Date;

public class User {

	private String name;
	
	private int age;
	
	private Date birth;

	private boolean flag;
	
	public User() {
		// TODO 自动生成的构造函数存根
		System.out.println("user create success ...");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", birth=" + birth + ", flag=" + flag + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getBirth()=" + getBirth() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
