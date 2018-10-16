package de.com.wirecard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.com.wirecard.crud.ParameterValueCrud;
import de.com.wirecard.model.ParameterValueModel;

@Service
public class ParameterValueService {
	
	@Autowired
	private ParameterValueCrud crud;
	
	public ParameterValueModel findByIdParameter(Integer id) {
		ParameterValueModel model = crud.findByIdParameter(id);
		return model;
	}

}
