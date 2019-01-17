package com.sadad.jib.ws;

import com.sadad.jib.ws.dto.ResponseFeign;
import com.sadad.jib.ws.dto.request.AccountInfoRequest;
import com.sadad.jib.ws.dto.response.AccountInfoResponseFeign;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "accountInfo", url = "http://pfm.myoxygen.ir")
public interface AccountInfoFeign {
    @RequestMapping(value = "/api/account/v1/customer/individual/accounts-info}",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseFeign<AccountInfoResponseFeign> findAccountInfo(@RequestBody AccountInfoRequest accountInfoRequest);
}
