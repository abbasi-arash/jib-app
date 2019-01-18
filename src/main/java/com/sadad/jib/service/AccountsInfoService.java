package com.sadad.jib.service;

import com.sadad.jib.security.SecurityUtils;
import com.sadad.jib.ws.AccountInfoFeign;
import com.sadad.jib.dto.Response;
import com.sadad.jib.ws.dto.request.AccountInfoRequest;
import com.sadad.jib.ws.dto.response.AccountInfoResponseFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsInfoService {

    @Autowired
    private AccountInfoFeign accountInfoFeign;

    public Response<AccountInfoResponseFeign> findAllAccount() {
        AccountInfoRequest accountInfoRequest = new AccountInfoRequest();
        accountInfoRequest.setNationalIdentifier(SecurityUtils.getNationalNumber());
        Response<AccountInfoResponseFeign> response = accountInfoFeign.findAllAccount(accountInfoRequest);
        return response;
    }

}
