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
@Table(name = "card")
public class CardModel {

	/** The user id. */
	@Id
	@Column(name = "id_card")
	@GeneratedValue
	private java.lang.Integer idCard;

	/** The card number */
	@Column(name = "pan_number")
	private java.lang.String panNumber;

	/** The user id. */
	@Column(name = "card_status")
	private java.lang.Integer cardStatus;
	
	/** The card number */
	@Column(name = "holder_name")
	private java.lang.String holderName;

	public java.lang.Integer getIdCard() {
		return idCard;
	}

	public void setIdCard(java.lang.Integer idCard) {
		this.idCard = idCard;
	}

	public java.lang.String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(java.lang.String panNumber) {
		this.panNumber = panNumber;
	}

	public java.lang.Integer getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(java.lang.Integer cardStatus) {
		this.cardStatus = cardStatus;
	}

	public java.lang.String getHolderName() {
		return holderName;
	}

	public void setHolderName(java.lang.String holderName) {
		this.holderName = holderName;
	}
}
