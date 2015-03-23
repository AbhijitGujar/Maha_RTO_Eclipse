package com.example.punerto.Activity;

public class ElectricMeter {
	String distance;
	String fareShown;
	String farePayable;
	String dayFare;
	String NightFare;

	public ElectricMeter(String distance, String fareShown, String farePayable,
			String dayFare, String NightFare) {
		// TODO Auto-generated constructor stub
		this.distance = distance;
		this.fareShown = fareShown;
		this.farePayable = farePayable;
		this.NightFare = NightFare;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getFareShown() {
		return fareShown;
	}

	public void setFareShown(String fareShown) {
		this.fareShown = fareShown;
	}

	public String getFarePayable() {
		return farePayable;
	}

	public void setFarePayable(String farePayable) {
		this.farePayable = farePayable;
	}

	public String getDayFare() {
		return dayFare;
	}

	public void setDayFare(String dayFare) {
		this.dayFare = dayFare;
	}

	public String getNightFare() {
		return NightFare;
	}

	public void setNightFare(String nightFare) {
		NightFare = nightFare;
	}
}
