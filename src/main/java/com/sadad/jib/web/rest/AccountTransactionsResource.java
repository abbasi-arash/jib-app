package com.sadad.jib.web.rest;

import com.sadad.jib.dto.Response;
import com.sadad.jib.dto.request.AccountTransactionsRequest;
import com.sadad.jib.dto.response.AccountTransactionsResponse;
import com.sadad.jib.service.AccountTransactionsService;
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

    @PostMapping("/v1/account-transactions")
    public Response<AccountTransactionsResponse> findAccountTransactions(@RequestBody AccountTransactionsRequest request) {
        return accountTransactionsService.findAccountTransactions(request);

    }
}
