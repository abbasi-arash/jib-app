package com.sadad.jib.service;

import com.sadad.jib.dto.request.AccountTransactionsRequest;
import com.sadad.jib.ws.config.AccountTransactionsFeign;
import com.sadad.jib.ws.config.dto.AccountTransactionsResponseFeign;
import com.sadad.jib.ws.config.dto.ResponseFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountTransactionsService {
    @Autowired
    private AccountTransactionsFeign accountTransactionsFeign;

    public ResponseFeign<AccountTransactionsResponseFeign> findAccountTransactions(AccountTransactionsRequest request) {
        return accountTransactionsFeign.findAccountTransactional(request);
    }
}
