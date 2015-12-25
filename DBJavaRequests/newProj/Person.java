package newProj;

import java.util.Date;

public class Person {
	
	private String firstName;
	private String lastName;
	private String middleName;
	private Date birthday;
	private String passportData;
	private Date dateOfGettingPassport;
	private String adress;
	private Integer driverLicense;
	private String category;
	private String  violation;
	private Integer primaryId;
	
	
	public Person(String firstName, String lastName, String middleName, Date birthday, String passportData,
			Date dateOfGettingPassport,
			 String adress, Integer driverLicense, String category, String violation, Integer primaryId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.birthday = birthday;
		this.passportData = passportData;
		this.dateOfGettingPassport = dateOfGettingPassport;
		this.adress = adress;
		this.driverLicense = driverLicense;
		this.category = category;
		this.violation = violation;
		this.primaryId = primaryId;
	}

	
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getPassportData() {
		return passportData;
	}

	public String getAdress() {
		return adress;
	}

	public Integer getDriverLicense() {
		return driverLicense;
	}

	public String getCategory() {
		return category;
	}

	public String getViolation() {
		return violation;
	}

	public Integer getPrimaryId() {
		return primaryId;
	}
	
}
