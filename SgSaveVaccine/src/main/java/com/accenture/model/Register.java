package com.accenture.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Register {
	@Id
	@GeneratedValue	
	private int clinicid;
	private String clinicname;
	private String address;
	private String area;
	private String username;
	private String password;
	private int phoneno;
	
	
	
	public Register() {
		
	}
	public Register(int clinicid, String clinicname, String address, String area, String username, String password,
			int phoneno) {
		super();
		this.clinicid = clinicid;
		this.clinicname = clinicname;
		this.address = address;
		this.area = area;
		this.username = username;
		this.password = password;
		this.phoneno = phoneno;
	}
	public int getClinicid() {
		return clinicid;
	}
	public void setClinicid(int clinicid) {
		this.clinicid = clinicid;
	}
	public String getClinicname() {
		return clinicname;
	}
	public void setClinicname(String clinicname) {
		this.clinicname = clinicname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Register [clinicid=" + clinicid + ", clinicname=" + clinicname + ", address=" + address + ", area="
				+ area + ", username=" + username + ", password=" + password + ", phoneno=" + phoneno + "]";
	}
	
}
