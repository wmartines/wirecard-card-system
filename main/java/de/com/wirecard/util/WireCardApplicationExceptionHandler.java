package de.com.wirecard.util;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class WireCardApplicationExceptionHandler {
	
	@ExceptionHandler(WireCardApplicationException.class)
    @ResponseBody
    public WireCardApplicationExceptionResponse wireCardException(WireCardApplicationException ex , HttpServletResponse status) {
		WireCardApplicationExceptionResponse response = new WireCardApplicationExceptionResponse(ex.getErrorMessage() , ex.getErrorKey(), ex.getErrorCode());
		status.setStatus(ex.getErrorCode());
        return response;
    }

}
