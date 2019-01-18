package com.sadad.jib.service;

import com.sadad.jib.dto.Response;
import com.sadad.jib.dto.request.AccountTransactionsRequest;
import com.sadad.jib.dto.response.AccountTransactionsResponse;
import com.sadad.jib.ws.AccountTransactionsFeign;
import com.sadad.jib.ws.dto.response.AccountTransactionsResponseFeign;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountTransactionsService {
    @Autowired
    private AccountTransactionsFeign accountTransactionsFeign;

    public Response<AccountTransactionsResponse> findAccountTransactions(AccountTransactionsRequest request) {
        Response<AccountTransactionsResponseFeign> response = accountTransactionsFeign.findAccountTransactional(request);
        Response result = new Response();
        result.setResponse(copyProperties(response));
        return result;

    }

    private AccountTransactionsResponse copyProperties(Response<AccountTransactionsResponseFeign> response) {
        AccountTransactionsResponseFeign accountTransactionsResponseFeign = response.getResponse();
        AccountTransactionsResponse result = new AccountTransactionsResponse();
        result.setContent(accountTransactionsResponseFeign.getContent());
        result.setHasContent(accountTransactionsResponseFeign.getHasContent());
        result.setNumber(accountTransactionsResponseFeign.getNumber());
        result.setSize(accountTransactionsResponseFeign.getSize());
        result.setTotalPages(accountTransactionsResponseFeign.getTotalPages());
        result.setTotalElements(accountTransactionsResponseFeign.getTotalElements());
        result.setSort(accountTransactionsResponseFeign.getSort());
        return result;

    }
}
