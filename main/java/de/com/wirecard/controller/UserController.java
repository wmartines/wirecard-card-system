package de.com.wirecard.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.com.wirecard.model.LocalUserModel;
import de.com.wirecard.param.UserRegistrationParam;
import de.com.wirecard.presenter.UserRegistrationPresenter;
import de.com.wirecard.service.LocalUserService;
import de.com.wirecard.service.ParameterValueService;
import de.com.wirecard.type.UserStatusType;
import de.com.wirecard.util.WireCardApplicationException;

@RestController
@RequestMapping(value = "user")
public class UserController {
	
	@Autowired
	private ParameterValueService parameterService;
	
	@Autowired
	private LocalUserService localUserService;
	
	@PutMapping("save")
	public UserRegistrationPresenter save(@RequestBody UserRegistrationParam param) throws Exception {
		
		saveValidation(param);
		UserRegistrationPresenter presenter =	convertToPresenter(localUserService.save(param));
		
		return presenter;
	}
	
	public UserRegistrationPresenter convertToPresenter(LocalUserModel model) {
		
		UserRegistrationPresenter presenter = new UserRegistrationPresenter();
		
		presenter.setLoginName(model.getLoginName());
		presenter.setPan(model.getCardModel().getPanNumber());
		presenter.setStatus(UserStatusType.getById(model.getStatus()).name());
		
		return presenter;
		
	};
	
	public void saveValidation(UserRegistrationParam param) throws Exception {
		
		// Validate mandatory fields
		if (StringUtils.isEmpty(param.getBirthDate())
				||StringUtils.isEmpty(param.getSalutation())
				||StringUtils.isEmpty(param.getFirsName())
				||StringUtils.isEmpty(param.getLastName())
				||StringUtils.isEmpty(param.getMobileNumber())
				||StringUtils.isEmpty(param.getPassword())) {
			
			throw new WireCardApplicationException(parameterService.findByIdParameter(5) , HttpServletResponse.SC_BAD_REQUEST);
		}
		
		if (localUserService.findByMobileNumber(param.getMobileNumber()) != null) {
			throw new WireCardApplicationException(parameterService.findByIdParameter(1),
					HttpServletResponse.SC_FORBIDDEN);
		}
		
		if (localUserService.findByLoginName(param.getLoginName()) != null 
				&&StringUtils.isNotEmpty(localUserService.findByLoginName(param.getLoginName()).getLoginName())) {
			throw new WireCardApplicationException(parameterService.findByIdParameter(4),
					HttpServletResponse.SC_FORBIDDEN);
		}
		
		if (localUserService.findByEmail(param.getEmail()) != null) {
			throw new WireCardApplicationException(parameterService.findByIdParameter(3),
					HttpServletResponse.SC_FORBIDDEN);
		}
		
		
	}

}
