package com.sadad.jib.ws;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

@Component
public class FeignClientInterceptor implements RequestInterceptor{
    @Override
    public void apply(RequestTemplate requestTemplate) {

    }
}
