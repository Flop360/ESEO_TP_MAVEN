package com.bean;

public class CoordonneesGPS {
	
	private String latitude;
	private String longitude;
	
	public CoordonneesGPS(String latitude, String longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public CoordonneesGPS() {
	}

	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "CoordonneesGPS [latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
}
