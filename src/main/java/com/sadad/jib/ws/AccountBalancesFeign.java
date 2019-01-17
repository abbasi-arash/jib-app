package com.sadad.jib.ws;

import com.sadad.jib.ws.dto.ResponseFeign;
import com.sadad.jib.ws.dto.response.AccountBalancesResponseFeign;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "account balances", url = "http://pfm.myoxygen.ir")
public interface AccountBalancesFeign {
    @RequestMapping("api/sandbox/account/v1/account/balances/{accountNumber}")
    ResponseFeign<AccountBalancesResponseFeign> findAccountBalances(@PathVariable String accountNumber);
}
