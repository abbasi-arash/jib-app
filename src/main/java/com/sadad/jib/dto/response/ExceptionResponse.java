package com.sadad.jib.dto.response;

import lombok.Data;
/**
 * @author: Arash Abbasi (arash1abbasi@gmail.com)
 */
@Data
public class ExceptionResponse {
    private int status;
    private int number;
    private String code;
    private String message;
}
