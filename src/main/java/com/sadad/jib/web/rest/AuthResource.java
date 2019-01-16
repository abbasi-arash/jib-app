package com.sadad.jib.web.rest;

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
@RequestMapping("/auth")
public class AuthResource {
    @Autowired
    private AuthService authService;

    @PostMapping(value = "/v1/token")
    public String createToken(@RequestBody String code) {
        return authService.createToken(code);
    }
}
