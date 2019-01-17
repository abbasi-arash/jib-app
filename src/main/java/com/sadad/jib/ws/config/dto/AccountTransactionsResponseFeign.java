package com.sadad.jib.ws.config.dto;

import lombok.Data;

import java.util.List;


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

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    public Integer getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Boolean getHasContent() {
        return hasContent;
    }

    public void setHasContent(Boolean hasContent) {
        this.hasContent = hasContent;
    }

    public Object getSort() {
        return sort;
    }

    public void setSort(Object sort) {
        this.sort = sort;
    }

    public Boolean getFirst() {
        return first;
    }

    public void setFirst(Boolean first) {
        this.first = first;
    }

    public Boolean getLast() {
        return last;
    }

    public void setLast(Boolean last) {
        this.last = last;
    }

    public Boolean getNext() {
        return next;
    }

    public void setNext(Boolean next) {
        this.next = next;
    }

    public Boolean getPrevious() {
        return previous;
    }

    public void setPrevious(Boolean previous) {
        this.previous = previous;
    }

    public List<ContentResponseFeign> getContent() {
        return content;
    }

    public void setContent(List<ContentResponseFeign> content) {
        this.content = content;
    }
}
