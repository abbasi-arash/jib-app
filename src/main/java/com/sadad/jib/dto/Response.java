package com.sadad.jib.dto;

import lombok.Data;

@Data
public class Response<T> {
    T response;
}
