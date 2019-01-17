package com.sadad.jib.web.rest;

import com.sadad.jib.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AccountResource {

    @Autowired
    private AccountsService accountsService;

    @GetMapping(value = "v1/account-list")
    public ResponseEntity<List<Account>> findAllAccount(){
        return accountsService.
    }

}
