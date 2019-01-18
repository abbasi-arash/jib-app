package com.sadad.jib.service;

import com.sadad.jib.domain.User;
import com.sadad.jib.dto.response.AccountInfoResponse;
import com.sadad.jib.repository.UserRepository;
import com.sadad.jib.security.SecurityUtils;
import com.sadad.jib.ws.AccountInfoFeign;
import com.sadad.jib.dto.Response;
import com.sadad.jib.ws.dto.request.AccountInfoRequest;
import com.sadad.jib.ws.dto.response.AccountInfoResponseFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsInfoService {

    @Autowired
    private AccountInfoFeign accountInfoFeign;

    @Autowired
    private UserRepository userRepository;

    public Response<AccountInfoResponse> findAllAccount() {
        AccountInfoRequest accountInfoRequest = new AccountInfoRequest();
        accountInfoRequest.setNationalIdentifier(SecurityUtils.getNationalNumber());
        return createResponse(accountInfoFeign.findAllAccount(accountInfoRequest).getResponse());
    }

    private Response<AccountInfoResponse> createResponse(AccountInfoResponseFeign response) {
        AccountInfoResponse accountInfoResponse = new AccountInfoResponse();
        accountInfoResponse.setAccounts(response.getAccounts());
        User user = userRepository.findByNationalNumber(SecurityUtils.getNationalNumber());
        accountInfoResponse.setName(user.getName());
        Response result = new Response();
        result.setResponse(accountInfoResponse);
        return result;

    }

}
