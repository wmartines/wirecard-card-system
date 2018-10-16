package de.com.wirecard.util;

import de.com.wirecard.model.ParameterValueModel;

public class WireCardApplicationException extends RuntimeException {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 2881924346109623356L;
	
	private String errorKey;
	
	private String errorMessage;
	
	private int errorCode;
	
    public WireCardApplicationException() {
    }

    public WireCardApplicationException(ParameterValueModel model , int errorCode) {
        this.errorMessage = model.getDsParameter();
        this.errorCode = errorCode;
        this.errorKey = model.getDsKey();
    }

	public String getErrorKey() {
		return errorKey;
	}

	public void setErrorKey(String errorKey) {
		this.errorKey = errorKey;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
}
