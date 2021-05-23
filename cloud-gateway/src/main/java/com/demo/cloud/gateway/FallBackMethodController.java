package com.demo.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/creditCardServiceFallBack")
    public String creditCardServiceFallBackMethod() {
        return "CreditCard Service is taking longer than Expected." +
                " Please try again later";
    }
}
