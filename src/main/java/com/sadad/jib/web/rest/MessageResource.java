package com.sadad.jib.web.rest;

import com.sadad.jib.domain.MessageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/jib")
public class MessageResource {

    @GetMapping(value = "/v1/message")
    public MessageResponse findAllMessage() {
        List<String> messages = new ArrayList<>();
        messages.add("زمان پرداخت قسط خرید ماشین فرا رسیده است");
        messages.add("حساب با شماره 0100001012001 از حد مجاز تعیین شده توسط شما کمتر شده است ");
        messages.add("زمان پرداخت اجاره منزل فرا رسیده است");
        messages.add("شما بیش از اندازه تعیین شده هزینه پوشاک نموده اید");
        MessageResponse result = new MessageResponse();
        result.setMessages(messages);
        return result;

    }
}
