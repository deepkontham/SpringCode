package com.ciq.pojo;

public class Address {
	private String city;
	private String State;
	private double pincode;
	public Address() {
			}
	public Address(String city, String state, double pincode) {
		super();
		this.city = city;
		State = state;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public double getPincode() {
		return pincode;
	}
	public void setPincode(double pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + ", pincode=" + pincode + "]";
	}


	

}
