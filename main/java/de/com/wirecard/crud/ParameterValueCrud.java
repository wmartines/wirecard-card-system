package de.com.wirecard.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.com.wirecard.model.ParameterValueModel;

@Repository
public interface ParameterValueCrud extends CrudRepository<ParameterValueModel , Long> {
	
	public ParameterValueModel findByIdParameter(Integer idParameter);

}
