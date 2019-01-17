package com.sadad.jib.ws.config;

import com.sadad.jib.dto.request.AccountTransactionsRequest;
import com.sadad.jib.ws.config.dto.AccountTransactionsResponseFeign;
import com.sadad.jib.ws.config.dto.ResponseFeign;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "transactions", url = "http://pfm.myoxygen.ir")
public interface AccountTransactionsFeign {
    @RequestMapping("/api/statement/v1/account/transactions")
    ResponseFeign<AccountTransactionsResponseFeign> findAccountTransactional(@RequestBody AccountTransactionsRequest accountTransactionsRequest);
}
