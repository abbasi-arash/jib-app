package com.sadad.jib.ws;

import com.sadad.jib.ws.dto.ResponseFeign;
import com.sadad.jib.ws.dto.request.AccountInfoRequest;
import com.sadad.jib.ws.dto.response.AccountInfoResponseFeign;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "accountInfo", url = "http://pfm.myoxygen.ir")
public interface AccountInfoFeign {
    @PostMapping(value = "/api/account/v1/customer/individual/accounts-info", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseFeign<AccountInfoResponseFeign> findAllAccount(@RequestBody AccountInfoRequest accountInfoRequest);
}
