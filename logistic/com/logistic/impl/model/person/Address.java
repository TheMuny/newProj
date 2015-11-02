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
	
	//__________________________________________________________________
	
	@Override
		public String getStreet() {		
		return street;
	}
	
	@Override
		public String getCity() {		
		return city;
	}
	
	@Override
		public String getCountry() {		
		return country;
	}
	
	@Override
	public int getCode() {		
		return code;
	}	
}
