package com.sadad.jib.security;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

public final class SecurityUtils {
    private SecurityUtils(){};
    public  static String getToken() {
        SecurityContext context = SecurityContextHolder.getContext();

        TokenBasedAuthentication authentication = (TokenBasedAuthentication) context.getAuthentication();
        if (authentication.getToken() == null){
            return null;
        }
        return authentication.getToken();
    }
}
