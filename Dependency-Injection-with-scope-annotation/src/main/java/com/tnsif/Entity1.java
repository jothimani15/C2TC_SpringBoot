package com.tnsif;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Entity1 {
	
	private int id;
	private String name;
	private long number;
	private String gender;
	
	@Autowired
	Entity2 e2;
	@Autowired
	Entity3 e3;
	
	
	public Entity1() {
		System.out.println("Entity 1 constructor");
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
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void show() {
		System.out.println("Entity 1 object created");
		e2.show();
		e3.show();
	}

}
