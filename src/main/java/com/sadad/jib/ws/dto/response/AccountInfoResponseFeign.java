package com.sadad.jib.ws.dto.response;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class AccountInfoResponseFeign {
    List<AccountInfoResponseFeign> accounts;
}
