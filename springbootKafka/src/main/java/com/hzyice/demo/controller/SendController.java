package com.hzyice.demo.controller;


import com.hzyice.demo.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendController {

    @Autowired
    private Producer producer;


    @GetMapping("/send")
    public String send() {
        try {
            producer.send();
        } catch (Exception e) {
            return "error";
        }
        return "succees";
    }


}
