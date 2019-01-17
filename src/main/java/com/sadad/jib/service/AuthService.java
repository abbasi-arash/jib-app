package com.sadad.jib.service;

import com.sadad.jib.dto.Token;
import com.sadad.jib.exception.CustomException;
import com.sadad.jib.exception.ErrorCode;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * @author: Arash Abbasi (arash1abbasi@gmail.com)
 */
@Service
@Data
public class AuthService {
    @Value("${application.client.secret}")
    private String secret;

    @Value("${application.client.id}")
    private String clientId;

    @Value("${outh.server.token}")
    private String tokenServer;

    @Value("${outh.server.path}")
    private String authServer;

    @Value("${application.client.redirect.uri}")
    private String redirectURL;

    public Token createToken(String authCode) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.set("Authorization", "Basic " + Base64Utils.encodeToString
                    ((clientId+":"+secret).getBytes()));
            MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
            body.add("code", authCode);
            body.add("redirect_uri", redirectURL);
            body.add("grant_type", "authorization_code");
            body.add("client_id", clientId);
            HttpEntity<Object> entity = new HttpEntity<>(body, headers);
            ResponseEntity<Token> result = restTemplate.exchange(tokenServer, HttpMethod.POST, entity,Token.class);
            return result.getBody();
        } catch (Exception ex) {
            String responseBodyAsString = ((HttpClientErrorException) ex).getResponseBodyAsString();
            throw new CustomException(responseBodyAsString, ErrorCode.NOT_AUTHORIZED);
        }

    }
}
