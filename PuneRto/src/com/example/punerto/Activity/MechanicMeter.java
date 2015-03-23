package com.example.punerto.Activity;

public class MechanicMeter {

	String meter;
	String distance;
	String dayFare;
	String nightFare;

	public MechanicMeter(String meter, String distance, String dayFare,
			String nightFare) {
		// TODO Auto-generated constructor stub
		this.meter = meter;
		this.distance = distance;
		this.dayFare = dayFare;
		this.nightFare = nightFare;
	}

	public String getMeter() {
		return meter;
	}

	public void setMeter(String meter) {
		this.meter = meter;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
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
