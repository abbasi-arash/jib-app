package com.sadad.jib.service;

import com.sadad.jib.dto.response.Account;
import com.sadad.jib.security.SecurityUtils;
import com.sadad.jib.ws.AccountInfoFeign;
import com.sadad.jib.ws.dto.ResponseFeign;
import com.sadad.jib.ws.dto.request.AccountInfoRequest;
import com.sadad.jib.ws.dto.response.AccountInfoResponseFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsService {
    @Autowired
    private AccountInfoFeign accountInfoFeign;
    public ResponseFeign<AccountInfoResponseFeign> findAllAccountByUser(){
        AccountInfoRequest accountInfoRequest = new AccountInfoRequest();
        accountInfoRequest.setNationalIdentifier(SecurityUtils.getNationalNumber());
        ResponseFeign<AccountInfoResponseFeign> responseFeign = accountInfoFeign.findAccountInfo(accountInfoRequest);
        return responseFeign;
    }

}
