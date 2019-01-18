package com.sadad.jib.service;

import com.sadad.jib.ws.AccountBalancesFeign;
import com.sadad.jib.dto.Response;
import com.sadad.jib.ws.dto.response.AccountBalancesResponseFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountAccountBalanceService {

    @Autowired
    private AccountBalancesFeign accountBalancesFeign;

    public Response<AccountBalancesResponseFeign> findAccountAccountBalance(String accountNumber) {

        return accountBalancesFeign.findAccountBalances(accountNumber);

    }

}
