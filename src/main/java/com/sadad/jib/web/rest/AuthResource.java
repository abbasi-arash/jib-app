package com.sadad.jib.web.rest;

import com.sadad.jib.dto.request.AuthCodeRequest;
import com.sadad.jib.dto.response.Token;
import com.sadad.jib.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Arash Abbasi (arash1abbasi@gmail.com)
 */
@RestController
@RequestMapping("/api/auth")
public class AuthResource {
    @Autowired
    private AuthService authService;

    @PostMapping(value = "/v1/token")
    public Token createToken(@RequestBody AuthCodeRequest authCodeRequest) {
        return authService.createToken(authCodeRequest);
    }
}
