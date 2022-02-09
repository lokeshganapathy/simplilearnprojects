package com.flyaway.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fid;
	private String fsource;
	private String fdestination;
	private int noofpersons;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFsource() {
		return fsource;
	}
	public void setFsource(String fsource) {
		this.fsource = fsource;
	}
	public String getFdestination() {
		return fdestination;
	}
	public void setFdestination(String fdestination) {
		this.fdestination = fdestination;
	}
	public int getNoofpersons() {
		return noofpersons;
	}
	public void setNoofpersons(int noofpersons) {
		this.noofpersons = noofpersons;
	}
	@Override
	public String toString() {
		return "Flight [fid=" + fid + ", fsource=" + fsource + ", fdestination=" + fdestination + ", noofpersons="
				+ noofpersons + "]";
	}
	
	
	
	
	

}
