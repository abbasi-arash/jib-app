package com.sadad.jib.ws.dto;

import lombok.Data;

@Data
public class ResponseFeign<T> {
    T response;
}
