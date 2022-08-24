package com.streams;

public class Address {
	String streetString;
	String landmarkString;
	String stateString;
	int pincode;
	public Address(String streetString, String landmarkString, String stateString, int pincode) {
		super();
		this.streetString = streetString;
		this.landmarkString = landmarkString;
		this.stateString = stateString;
		this.pincode = pincode;
	}
	public String getStreetString() {
		return streetString;
	}
	public void setStreetString(String streetString) {
		this.streetString = streetString;
	}
	public String getLandmarkString() {
		return landmarkString;
	}
	public void setLandmarkString(String landmarkString) {
		this.landmarkString = landmarkString;
	}
	public String getStateString() {
		return stateString;
	}
	public void setStateString(String stateString) {
		this.stateString = stateString;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
