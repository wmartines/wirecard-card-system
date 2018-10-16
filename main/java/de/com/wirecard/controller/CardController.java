package de.com.wirecard.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.com.wirecard.model.CardModel;
import de.com.wirecard.presenter.CardPresenter;
import de.com.wirecard.service.CardService;
import de.com.wirecard.service.ParameterValueService;
import de.com.wirecard.type.CardStatusType;
import de.com.wirecard.util.WireCardApplicationException;

@RestController
@RequestMapping(value = "user")
public class CardController {

	@Autowired
	private CardService cardService;
	
	@Autowired
	private ParameterValueService parameterService;
	
	@GetMapping("card")
	public CardPresenter findAll(@RequestParam("card") String card,
            @RequestParam("loginName") String loginName) {
		
		CardModel model = cardService.findByCardNumber(card);
		
		if(model == null) {
			throw new WireCardApplicationException(parameterService.findByIdParameter(6),HttpServletResponse.SC_NOT_FOUND);
		}
		
		
		return convertCardModelToPresenter(model);
	}
	
	public CardPresenter convertCardModelToPresenter(CardModel model) {
		
		CardPresenter presenter = new CardPresenter();
		
		presenter.setHolderName(model.getHolderName());
		presenter.setNumber(model.getPanNumber());
		presenter.setStatus(CardStatusType.getById(model.getCardStatus()).name());
		return presenter;
	}

}
