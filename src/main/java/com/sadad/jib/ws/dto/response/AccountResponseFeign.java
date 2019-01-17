package com.sadad.jib.ws.dto.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccountResponseFeign {
    String accountNumber;
    String accountType;
    Boolean hasBlockedAmount;
    Boolean hasSpecialRule;
    BigDecimal availableBalance;
}
