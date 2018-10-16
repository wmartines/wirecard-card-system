package de.com.wirecard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parameter_value")
public class ParameterValueModel {
	
	 /** The cg company. */
	@Id
    @Column(name = "id_parameter")
    private java.lang.Integer idParameter;
    
    /** The cg branch. */
    @Column(name = "ds_key")
    private java.lang.String dsKey;

    /** The ds key. */
    @Column(name = "ds_parameter")
    private java.lang.String dsParameter;

	public java.lang.Integer getIdParameter() {
		return idParameter;
	}

	public void setIdParameter(java.lang.Integer idParameter) {
		this.idParameter = idParameter;
	}


	public java.lang.String getDsParameter() {
		return dsParameter;
	}

	public void setDsParameter(java.lang.String dsParameter) {
		this.dsParameter = dsParameter;
	}

	public java.lang.String getDsKey() {
		return dsKey;
	}

	public void setDsKey(java.lang.String dsKey) {
		this.dsKey = dsKey;
	}
	
	
}
