package de.com.wirecard.util;

public class WireCardApplicationExceptionResponse {
	
	private int errorCode;
	
	private String errorKey;
	
	private String errorMessage;

    public WireCardApplicationExceptionResponse(String errorMessage , String errorKey, int errorCode) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
        this.errorKey = errorKey;
    }

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorKey() {
		return errorKey;
	}

	public void setErrorKey(String errorKey) {
		this.errorKey = errorKey;
	}
}
