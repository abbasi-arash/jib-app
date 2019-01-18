package com.sadad.jib.dto.response;

import com.sadad.jib.ws.dto.response.ContentResponseFeign;
import lombok.Data;

import java.util.List;

@Data
public class AccountTransactionsResponse {

    private Integer totalPages;
    private Integer totalElements;
    private Integer number;
    private Integer size;
    private Boolean hasContent;
    private Object sort;
    private List<ContentResponseFeign> content;
}
