package com.logistic.impl.model.person;

public class Address implements com.logistic.api.model.person.Address {

	private String country;
	private String city;
	private String street;
	private int code;
	
	
	public void setCountry(String country) {
		this.country = country;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	@Override
		public String getStreet() {
		// TODO Auto-generated method stub
		return street;
	}
	
	@Override
		public String getCity() {
		// TODO Auto-generated method stub
		return city;
	}
	
	@Override
		public String getCountry() {
		// TODO Auto-generated method stub
		return country;
	}
	
	@Override
	public int getCode() {
		// TODO Auto-generated method stub
		return code;
	}	
}
