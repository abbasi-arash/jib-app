package com.sadad.jib.ws.config.dto;

import lombok.Data;

import java.util.List;

@Data
public class AccountTransactionsResponseFeign {

    private Integer totalPages;
    private Integer totalElements;
    private Integer numberOfElements;
    private Integer number;
    private Integer size;
    private Boolean hasContent;
    private Object sort;
    private Boolean first;
    private Boolean last;
    private Boolean next;
    private Boolean previous;
    private List<ContentResponseFeign> content;


}
