package com.sadad.jib.web.rest;

import com.sadad.jib.dto.request.AccountBalanceRequest;
import com.sadad.jib.service.AccountAccountBalanceService;
import com.sadad.jib.dto.Response;
import com.sadad.jib.ws.dto.response.AccountBalancesResponseFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/jib")
public class AccountBalanceResource {
    @Autowired
    private AccountAccountBalanceService accountTransactionsService;

    @PostMapping("/v1/account-balances")
    public Response<AccountBalancesResponseFeign> findAccountAccountBalance(@Valid @RequestBody AccountBalanceRequest request) {

        return accountTransactionsService.findAccountAccountBalance(request.getAccountNumber());
    }
}
