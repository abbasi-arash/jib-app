package com.sadad.jib.security;

import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.impl.JwtMap;
import org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerProperties;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;

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

    public static String getNationalNumber() {
        SecurityContext context = SecurityContextHolder.getContext();

        TokenBasedAuthentication authentication = (TokenBasedAuthentication) context.getAuthentication();
        if (authentication.getPrincipal().getUsername() == null){
            return null;
        }
        return authentication.getPrincipal().getUsername();
    }
}
