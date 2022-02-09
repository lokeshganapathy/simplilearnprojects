package com.flyaway.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flights {

	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int fid;
		private String sourceflight;
		private String destinationflight;
		private String airlines;
		private int prices;
		public int getFid() {
			return fid;
		}
		public void setFid(int fid) {
			this.fid = fid;
		}
		public String getSourceflight() {
			return sourceflight;
		}
		public void setSourceflight(String sourceflight) {
			this.sourceflight = sourceflight;
		}
		public String getDestinationflight() {
			return destinationflight;
		}
		public void setDestinationflight(String destinationflight) {
			this.destinationflight = destinationflight;
		}
		public String getAirlines() {
			return airlines;
		}
		public void setAirlines(String airlines) {
			this.airlines = airlines;
		}
		
		public int getPrices() {
			return prices;
		}
		public void setPrices(int prices) {
			this.prices = prices;
		}
		@Override
		public String toString() {
			return "Flights [fid=" + fid + ", sourceflight=" + sourceflight + ", destinationflight=" + destinationflight
					+ ", airlines=" + airlines + ", prices=" + prices + "]";
		}
		
		
		
}
