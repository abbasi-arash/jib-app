package com.sadad.jib.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AuthCodeRequest {
    @NotNull
    private String code;
}
