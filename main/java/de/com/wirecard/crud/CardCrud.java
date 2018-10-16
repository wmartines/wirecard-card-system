package de.com.wirecard.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.com.wirecard.model.CardModel;

@Repository
public interface CardCrud extends CrudRepository<CardModel , Long> {
	
	public CardModel findByPanNumber(String panNumber);
	
	public CardModel findByidCard(Integer idCard);

}
