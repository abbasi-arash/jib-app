package com.sadad.jib.dto.response;

import com.sadad.jib.ws.dto.response.AccountInfoFeign;
import lombok.Data;

import java.util.List;

@Data
public class AccountInfoResponse {
    private String name;
    List<AccountInfoFeign> accounts;
}
