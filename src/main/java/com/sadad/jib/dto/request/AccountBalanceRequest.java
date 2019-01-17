package com.sadad.jib.dto.request;

import lombok.Data;
import lombok.NonNull;

@Data
public class AccountBalanceRequest {
    @NonNull
    private String accountNumber;
}
