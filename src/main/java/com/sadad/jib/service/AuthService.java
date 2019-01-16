package com.sadad.jib.service;

import com.sadad.jib.dto.Token;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
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
public class AuthService {

    public String createToken(String authCode) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.set("Authorization", "Basic " + Base64Utils.encodeToString("2525b046-c2ca-4c93-a320-db982518:2cf5e9b2-8089-46bb-9a18-5904d513b33c".getBytes()));
            MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
            body.add("code", authCode);
            body.add("redirect_uri", "http://localhost:8084");
            body.add("grant_type", "authorization_code");
            body.add("client_id", "2525b046-c2ca-4c93-a320-db982518");
            HttpEntity<Object> entity = new HttpEntity<>(body, headers);
            restTemplate.exchange("http://pfm.myoxygen.ir/auth/realms/master/protocol/openid-connect/token", HttpMethod.POST, entity,Token.class);
        } catch (Exception ex) {
            String responseBodyAsString = ((HttpClientErrorException) ex).getResponseBodyAsString();
        }
        return"";
    }
}
