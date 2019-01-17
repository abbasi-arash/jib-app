package com.sadad.jib.util;

import com.sadad.jib.security.TokenBasedAuthentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUtils {
    private SecurityUtils() {
    }

    public static String getToken() {
        SecurityContext context = SecurityContextHolder.getContext();
        TokenBasedAuthentication authentication = (TokenBasedAuthentication) context.getAuthentication();
        if (authentication.getToken().isEmpty()) {
            return null;
        }
        return authentication.getToken();
    }
}
