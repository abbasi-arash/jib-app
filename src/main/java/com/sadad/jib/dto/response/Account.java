package com.sadad.jib.dto.response;

import com.sadad.jib.dto.enums.AccountType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Account {
    private String accountNumber;
    private AccountType accountType;
    private BigDecimal balance;
}
