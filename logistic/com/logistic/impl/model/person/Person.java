package com.logistic.impl.model.person;

import com.logistic.api.model.person.Address;
import com.logistic.api.model.person.FullName;

public class Person implements com.logistic.api.model.person.Person{

	/**
	 * @param args
	 */
	
	 private Address Location;
	 private FullName Data;

	@Override
	public Address getAddress() {		
		return Location;
	}

	@Override
	public FullName getFullName() {	
		return Data;
	}

}
