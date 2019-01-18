package com.sadad.jib.ws;

import com.sadad.jib.dto.Response;
import com.sadad.jib.ws.dto.response.AccountBalancesResponseFeign;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "accountBalances", url = "http://pfm.myoxygen.ir")
public interface AccountBalancesFeign {
    @GetMapping(value = "/api/sandbox/account/v1/account/balances/{accountNumber}",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    Response<AccountBalancesResponseFeign> findAccountBalances(@PathVariable("accountNumber") String accountNumber);
}
