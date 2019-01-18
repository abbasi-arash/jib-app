package com.sadad.jib.security;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.HashMap;
import java.util.Map;

public final class SecurityUtils {
    public static String getToken() {
        SecurityContext context = SecurityContextHolder.getContext();

        TokenBasedAuthentication authentication = (TokenBasedAuthentication) context.getAuthentication();
        if (authentication.getToken().isEmpty()) {
            return null;
        }
        return authentication.getToken();
    }

    public static String getNationalNumber() {
        SecurityContext context = SecurityContextHolder.getContext();

        TokenBasedAuthentication authentication = (TokenBasedAuthentication) context.getAuthentication();
        if (authentication.getPrincipal().getUsername().isEmpty()) {
            return null;
        }
        return authentication.getPrincipal().getUsername();
    }

}
