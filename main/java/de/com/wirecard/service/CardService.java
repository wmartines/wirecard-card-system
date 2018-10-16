package de.com.wirecard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.com.wirecard.crud.CardCrud;
import de.com.wirecard.model.CardModel;
import de.com.wirecard.util.WireCardUtils;

@Service
public class CardService {

	@Autowired
	private CardCrud crud;

	/**
	 * Genaretes and saves a card
	 * 
	 * @param status
	 * @return CardModel
	 */
	public CardModel save(Integer status , String holderName) {

		// Generates and saves the card number
		CardModel model = new CardModel();
		model.setPanNumber(WireCardUtils.generateCardNumber());
		model.setCardStatus(status);
		model.setHolderName(holderName);
		// Returns saved entity
		return crud.save(model);
	}

	/**
	 * Find card by card number
	 * 
	 * @param cardNumber
	 * @return CardModel
	 */
	public CardModel findByCardNumber(String panNumber) {
		
		CardModel model = crud.findByPanNumber(panNumber);

		return model;

	}

	public CardModel convertCardModelToSave(Integer status) {

		CardModel model = new CardModel();
		model.setPanNumber(WireCardUtils.generateCardNumber());
		model.setCardStatus(status);	
		return model;
	};

}
