package com.sadad.jib.exception;

/**
 * @author: Arash Abbasi (arash1abbasi@gmail.com)
 */
public enum ErrorCode {

;

    private final int number;
    private final String code;
    private final int httpCode;
    private final boolean hasBody;
    private final String message;

    ErrorCode(int number, String code, int httpCode, boolean hasBody, String message) {
        this.number = number;
        this.code = code;
        this.httpCode = httpCode;
        this.hasBody = hasBody;
        this.message = message;
    }
    public int getNumber() {
        return number;
    }

    public String getCode() {
        return code;
    }

    public int getHttpCode() {
        return httpCode;
    }

    public boolean isHasBody() {
        return hasBody;
    }

    public String getMessage() {
        return message;
    }
}
