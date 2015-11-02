package com.logistic.impl.model.person;

public class FullName implements com.logistic.api.model.person.FullName{

	private String FirstName;
	private String LastName;
	private String MiddleName;
	
	
	
	
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}


	
	//______________________________________________________________________
	
	
	@Override
	public String getFirstName() {		
		return FirstName;
	}

	
	@Override
	public String getLastName() {
		return LastName;
	}

	
	@Override
	public String getMiddleName() {		
		return MiddleName;
	}

}
