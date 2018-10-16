package de.com.wirecard.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.com.wirecard.crud.LocalUserCrud;
import de.com.wirecard.model.CardModel;
import de.com.wirecard.model.LocalUserModel;
import de.com.wirecard.param.UserRegistrationParam;
import de.com.wirecard.type.CardStatusType;
import de.com.wirecard.type.UserStatusType;

@Service
public class LocalUserService {

	@Autowired
	private LocalUserCrud localUserCrud;
	
	@Autowired
	private CardService cardService;
	
	/**
	 * Register user
	 * @param param
	 * @return LocalUserModel
	 */
	public LocalUserModel save(UserRegistrationParam param) {

		return localUserCrud.save(converToSaveModel(param));
	}
	
	/**
	 * Find user by mobile number
	 * @param param
	 * @return LocalUserModel
	 */
	private LocalUserModel converToSaveModel(UserRegistrationParam param) {
		
		// Creates an active card number
		CardModel cardModel = cardService.save(CardStatusType.ACTIVE.getId() , createHolderName(param));

		LocalUserModel localUserModel = new LocalUserModel();
		localUserModel.setSalutation(param.getSalutation());
		localUserModel.setFirstName(param.getFirsName());
		localUserModel.setLastName(param.getLastName());
		localUserModel.setBirthdate(param.getBirthDate());
		localUserModel.setMobileNumber(param.getMobileNumber());
		localUserModel.setEmail(param.getEmail());
		
		if(StringUtils.isNotEmpty(param.getLoginName())) {
			localUserModel.setLoginName(param.getLoginName());
		}
		
		localUserModel.setPassword(param.getPassword());
		
		// Verify non mandatory fields
		if(StringUtils.isEmpty(param.getLoginName())
				||StringUtils.isEmpty(param.getEmail())) {
			localUserModel.setStatus(UserStatusType.IN_REGISTRATION.getId());
		}else {
			localUserModel.setStatus(UserStatusType.ACTIVE.getId());
		}
		
		// Sets the user card id
		localUserModel.setCdCard(cardModel.getIdCard());
		localUserModel.setCardModel(cardModel);
		
		return localUserModel;
	}
	
	public LocalUserModel findByMobileNumber(String mobileNumber) {
		return localUserCrud.findByMobileNumber(mobileNumber);
	}
	
	public LocalUserModel findByLoginName(String loginName) {
		return localUserCrud.findByLoginName(loginName);
	}
	
	public LocalUserModel findByEmail(String email) {
		return localUserCrud.findByEmail(email);
	}
	
	private String createHolderName(UserRegistrationParam param) {

		String holderName = param.getFirsName() + " " + param.getLastName();

		return holderName;
	}

}
