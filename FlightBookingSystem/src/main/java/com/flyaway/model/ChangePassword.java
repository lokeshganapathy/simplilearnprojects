package com.flyaway.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChangePassword {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cpid;
	private String username;
	private String password;
	public int getCpid() {
		return cpid;
	}
	public void setCpid(int cpid) {
		this.cpid = cpid;
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
	@Override
	public String toString() {
		return "ChangePassword [cpid=" + cpid + ", username=" + username + ", password=" + password + "]";
	}
	
	

}
