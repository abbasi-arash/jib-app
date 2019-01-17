package com.sadad.jib.ws.dto.response;

import lombok.Data;

@Data
public class AccountBalancesResponseFeign {

    private String accountNumber;
    private String effectiveBalance;
    private String currentBalance;
    private String usableBalance;
}
