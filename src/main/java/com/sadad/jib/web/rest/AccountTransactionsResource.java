package com.sadad.jib.web.rest;

import com.sadad.jib.dto.request.AccountTransactionsRequest;
import com.sadad.jib.service.AccountTransactionsService;
import com.sadad.jib.ws.config.dto.AccountTransactionsResponseFeign;
import com.sadad.jib.ws.config.dto.ResponseFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jib")
public class AccountTransactionsResource {

    @Autowired
    private AccountTransactionsService accountTransactionsService;

    @PostMapping("/account-transactions")
    public ResponseFeign<AccountTransactionsResponseFeign> findAccountTransactions(@RequestBody AccountTransactionsRequest request) {
        return accountTransactionsService.findAccountTransactions(request);

    }
}
