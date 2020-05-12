package com.eastall.work.springTest.constructor;

public class User {

	private String uid;

	private String name;
	private Integer age;
	
	public User(String uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
	}
	
	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
