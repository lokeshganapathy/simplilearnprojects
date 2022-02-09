package com.flyaway.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoginUserDetail {
	
	@Id			
	@GeneratedValue(strategy=GenerationType.IDENTITY)			
	private	int	pid	;
	private	String	uname	;
	private	String	pass	;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "LoginUserDetail [pid=" + pid + ", uname=" + uname + ", pass=" + pass + "]";
	}

	

}
