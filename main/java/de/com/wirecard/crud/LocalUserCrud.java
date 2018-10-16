package de.com.wirecard.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.com.wirecard.model.LocalUserModel;

@Repository
public interface LocalUserCrud extends CrudRepository<LocalUserModel , Long> {
	
	public LocalUserModel findByMobileNumber(String mobileNumber);
	
	public LocalUserModel findByLoginName(String loginName);
	
	public LocalUserModel findByEmail(String email);

}
