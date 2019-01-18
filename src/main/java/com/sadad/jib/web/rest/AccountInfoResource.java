package com.sadad.jib.web.rest;

import com.sadad.jib.service.AccountsInfoService;
import com.sadad.jib.dto.Response;
import com.sadad.jib.ws.dto.response.AccountInfoResponseFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jib")
public class AccountInfoResource {

    @Autowired
    private AccountsInfoService accountsInfoService;

    @GetMapping(value = "/v1/account-list")
    public Response<AccountInfoResponseFeign> findAllAccount(){
        return accountsInfoService.findAllAccount();
    }

}
