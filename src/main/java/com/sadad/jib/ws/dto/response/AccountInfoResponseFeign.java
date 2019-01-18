package com.sadad.jib.ws.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class AccountInfoResponseFeign {
    List<AccountInfoFeign> accounts;
}
