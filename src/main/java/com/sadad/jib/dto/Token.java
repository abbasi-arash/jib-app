package com.sadad.jib.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author: Arash Abbasi (arash1abbasi@gmail.com)
 */
@Data
@EqualsAndHashCode
public class Token {

        private String last_logins;
        private String token_type;
        private String expires_in;
        private String access_token;
        private String refresh_token;
}
