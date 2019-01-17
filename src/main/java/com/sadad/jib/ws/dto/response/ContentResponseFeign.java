package com.sadad.jib.ws.dto.response;

import lombok.Data;

@Data
public class ContentResponseFeign {

    private Integer transactionId;
    private String accountNumber;
    private String transactionDateTime;
    private Integer branchCode;
    private String branchName;
    private String debitCredit;
    private String traceNumber;
    private String transactionDescription;
    private Integer transactionAmount;
    private String transactionChannel;
    private Integer terminalId;

}
