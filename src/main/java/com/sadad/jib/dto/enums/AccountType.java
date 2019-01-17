package com.sadad.jib.dto.enums;

public enum AccountType {
    SHORT_TERM("SHORT_TERM"),
    LONG_TERM("LONG_TERM"),
    INTEREST_FREE_LOAN("INTEREST_FREE_LOAN");

    private String value;

    AccountType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
