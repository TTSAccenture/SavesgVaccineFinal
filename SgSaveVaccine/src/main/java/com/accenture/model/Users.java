package com.accenture.model;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clinicid;

	private String username;
//	@Column(length = 150)  This is required for Bcrypt passwords (length)
	private String password;
	
	private String clinicname;
	private String address;
	private String area;
	private String phoneno;
	
	public int getClinicid() {
		return clinicid;
	}
	public void setClinicid(int clinicid) {
		this.clinicid = clinicid;
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
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Users [clinicid=" + clinicid + ", username=" + username + ", password=" + password + ", clinicname="
				+ clinicname + ", address=" + address + ", area=" + area + ", phoneno=" + phoneno + "]";
	}
	public Users(int clinicid, String username, String password, String clinicname, String address, String area,
			String phoneno) {
		super();
		this.clinicid = clinicid;
		this.username = username;
		this.password = password;
		this.clinicname = clinicname;
		this.address = address;
		this.area = area;
		this.phoneno = phoneno;
	}
	public Users() {
	
	}
	
	
	
	
	
	
	/*
	 * @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	 * 
	 * @JoinTable( name = "user_roles", joinColumns = @JoinColumn(name = "user_id"),
	 * inverseJoinColumns = @JoinColumn(name = "role_id") )
	 */
	
	
	
	/*private Set<UserRole> userRoles = new HashSet<>(); 


	public Set<UserRole> getRoles() {
		return userRoles;
	}

	public void setRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}	*/
}
