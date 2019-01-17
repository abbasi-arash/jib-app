package com.sadad.jib.ws;

import com.sadad.jib.dto.request.AccountTransactionsRequest;
import com.sadad.jib.ws.dto.response.AccountTransactionsResponseFeign;
import com.sadad.jib.ws.dto.ResponseFeign;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "transactions", url = "http://pfm.myoxygen.ir")
public interface AccountTransactionsFeign {
    @PostMapping(value = "/api/statement/v1/account/transactions", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseFeign<AccountTransactionsResponseFeign> findAccountTransactional(@RequestBody AccountTransactionsRequest accountTransactionsRequest);
}
