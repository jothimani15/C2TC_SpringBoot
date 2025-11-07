package com.tnsif;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Consumer {
	
	private int cid;
	private String cname;
	private String gender;
	private long cnum;
	
	
	@Autowired
	// Qualifier selects the required implementations for the underlying methods
	@Qualifier("book")
	private Ordering order;
	
	
	public void order(){
		order.order();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getCnum() {
		return cnum;
	}
	public void setCnum(long cnum) {
		this.cnum = cnum;
	}

}
