package com.example.punerto.Activity;

public class TaxiFare {

	String meter;
	String dayFare;
	String nightFare;

	public TaxiFare(String meter, String dayFare, String nightFare) {
		this.meter = meter;
		this.dayFare = dayFare;
		this.nightFare = nightFare;

		// TODO Auto-generated constructor stub
	}

	public String getMeter() {
		return meter;
	}

	public void setMeter(String meter) {
		this.meter = meter;
	}

	public String getDayFare() {
		return dayFare;
	}

	public void setDayFare(String dayFare) {
		this.dayFare = dayFare;
	}

	public String getNightFare() {
		return nightFare;
	}

	public void setNightFare(String nightFare) {
		this.nightFare = nightFare;
	}

}
