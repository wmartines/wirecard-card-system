package de.com.wirecard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "local_user")
public class LocalUserModel {
	
	 /** The user id. */
	@Id
    @Column(name = "user_id")
	@GeneratedValue
    private java.lang.Integer userId;
    
    /** The salutation */
    @Column(name = "salutation")
    private java.lang.String salutation;

    /** The first name */
    @Column(name = "first_name")
    private java.lang.String firstName;
    
    /** The last name */
    @Column(name = "last_name")
    private java.lang.String lastName;

    /** The birthdate */
    @Column(name = "birthdate")
    private java.lang.String birthdate;
    
    /** The mobile number */
    @Column(name = "mobile_number")
    private java.lang.String mobileNumber;
    
    /** The email */
    @Column(name = "email")
    private java.lang.String email;
    
    /** The login name */
    @Column(name = "login_name")
    private java.lang.String loginName;
    
    /** The password */
    @Column(name = "password")
    private java.lang.String password;
    
    /** The cd card */
    @Column(name = "cd_card")
    private java.lang.Integer cdCard;
    
    /** The status */
    @Column(name = "status")
    private java.lang.Integer status;
    
    /** The card model. */
    @OneToOne
	@JoinColumns({
			@JoinColumn(name = "cd_card", referencedColumnName = "id_card", insertable = false, updatable = false) })
	@com.fasterxml.jackson.annotation.JsonIgnore
	private CardModel cardModel;

	public java.lang.Integer getUserId() {
		return userId;
	}

	public void setUserId(java.lang.Integer userId) {
		this.userId = userId;
	}

	public java.lang.String getSalutation() {
		return salutation;
	}

	public void setSalutation(java.lang.String salutation) {
		this.salutation = salutation;
	}

	public java.lang.String getFirstName() {
		return firstName;
	}

	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	public java.lang.String getLastName() {
		return lastName;
	}

	public void setLastName(java.lang.String lastName) {
		this.lastName = lastName;
	}

	public java.lang.String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(java.lang.String birthdate) {
		this.birthdate = birthdate;
	}

	public java.lang.String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(java.lang.String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public java.lang.String getEmail() {
		return email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getLoginName() {
		return loginName;
	}

	public void setLoginName(java.lang.String loginName) {
		this.loginName = loginName;
	}

	public java.lang.String getPassword() {
		return password;
	}

	public void setPassword(java.lang.String password) {
		this.password = password;
	}

	public CardModel getCardModel() {
		return cardModel;
	}

	public void setCardModel(CardModel cardModel) {
		this.cardModel = cardModel;
	}

	public java.lang.Integer getStatus() {
		return status;
	}

	public void setStatus(java.lang.Integer status) {
		this.status = status;
	}

	public java.lang.Integer getCdCard() {
		return cdCard;
	}

	public void setCdCard(java.lang.Integer cdCard) {
		this.cdCard = cdCard;
	}
}
