package com.accenture.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;


@Entity
public class Clinic {
	@Id
	@GeneratedValue	(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private int phno;
	private int dosecount;
	private String type;
	private String region;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public int getDosecount() {
		return dosecount;
	}
	public void setDosecount(int dosecount) {
		this.dosecount = dosecount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@Override
	public String toString() {
		return "Clinic [id=" + id + ", name=" + name + ", address=" + address + ", phno=" + phno + ", dosecount="
				+ dosecount + ", type=" + type + ", region=" + region + "]";
	}
	public Clinic(int id, String name, String address, int phno, int dosecount, String type, String region) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phno = phno;
		this.dosecount = dosecount;
		this.type = type;
		this.region = region;
	}
	public Clinic() {
		
	}
	
	
	

}
