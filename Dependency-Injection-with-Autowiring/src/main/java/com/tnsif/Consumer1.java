package com.tnsif;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Consumer1 {
	
	private int id;
	private String name;
	private long number;
	private String gender;
	
	@Autowired
	Consumer2 c2;
	@Autowired
	Consumer3 c3;
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
		System.out.println("Consumer 1 object created");
		c2.show();
		c3.show();
	}

}
