package com.prshnt.springframework.model;

public class Persons {
	
	private int id;
	private String name;
	private int age;
	private String phone;
	
	public Persons() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Persons(int id, String name, int age, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Persons [id=" + id + ", name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	
	

}
