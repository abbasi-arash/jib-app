package com.sadad.jib.ws.config.dto;

import lombok.Data;

@Data
public class ResponseFeign<T> {
    T response;
}
