package com.sadad.jib.web.rest;

import com.sadad.jib.service.AccountsService;
import com.sadad.jib.ws.dto.ResponseFeign;
import com.sadad.jib.ws.dto.response.AccountInfoResponseFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AccountResource {

    @Autowired
    private AccountsService accountsService;

    @GetMapping(value = "v1/account-list")
    public ResponseFeign<AccountInfoResponseFeign> findAllAccount(){
        return accountsService.findAllAccountByUser();
    }

}
