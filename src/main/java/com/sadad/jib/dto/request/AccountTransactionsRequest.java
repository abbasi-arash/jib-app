package com.sadad.jib.dto.request;

import lombok.Data;

@Data
public class AccountTransactionsRequest {

    private String accountNumber;

    private DateRange dateRange;

    private Pageable pageable;

}
