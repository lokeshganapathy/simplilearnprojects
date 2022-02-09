package com.flyaway.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PaymentDetail {
	
	@Id			
	@GeneratedValue(strategy=GenerationType.IDENTITY)			
	private	int	pid	;
	private	String	name	;
	private	String	cardnumber	;
	private	String	expiry	;
	private	String	cvv	;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "PaymentDetail [pid=" + pid + ", name=" + name + ", cardnumber=" + cardnumber + ", expiry=" + expiry
				+ ", cvv=" + cvv + "]";
	}
	
	


}
