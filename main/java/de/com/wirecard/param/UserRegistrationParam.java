package de.com.wirecard.param;

public class UserRegistrationParam {
	
	/** A flag indicating the user’s salutation.*/
	private String salutation;
	
	/** The user’s first name or given name..*/
	private String firsName;
	
	/** The user’s last name or surname.*/
	private String lastName;
	
	/** The user’s birth date.*/
	private String birthDate;
	
	/** The user’s mobile number.*/
	private String mobileNumber;
	
	/** The user’s email address.*/
	private String email;
	
	/** The unique login name.*/
	private String loginName;
	
	/** The password of the user.*/
	private String password;

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
