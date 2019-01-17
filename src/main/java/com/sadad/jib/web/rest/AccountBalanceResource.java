package com.sadad.jib.web.rest;

import com.sadad.jib.dto.request.AccountBalanceRequest;
import com.sadad.jib.service.AccountAccountBalanceService;
import com.sadad.jib.ws.dto.ResponseFeign;
import com.sadad.jib.ws.dto.response.AccountBalancesResponseFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/jib")
public class AccountBalanceResource {
    @Autowired
    private AccountAccountBalanceService accountTransactionsService;

    @PostMapping("/account-balances")
    public ResponseFeign<AccountBalancesResponseFeign> findAccountAccountBalance(@Valid @RequestBody AccountBalanceRequest request) {
        return accountTransactionsService.findAccountAccountBalance(request.getAccountNumber());
    }
}
