package com.sadad.jib.exception;


import com.sadad.jib.dto.response.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @author: Arash Abbasi (arash1abbasi@gmail.com)
 */
@ControllerAdvice()
public class CustomExceptionHandler {

    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public ResponseEntity<ExceptionResponse> handleException(CustomException ex) {
        return new ResponseEntity<ExceptionResponse>(buildResponse(ex.getErrorCode()), HttpStatus.valueOf(ex.getErrorCode().getHttpCode()));
    }

    private ExceptionResponse buildResponse(ErrorCode err) {
        ExceptionResponse response = new ExceptionResponse();
        response.setNumber(err.getNumber());
        response.setMessage(err.getMessage());
        response.setStatus(err.getHttpCode());
        response.setCode(err.getCode());
        return response;
    }
}