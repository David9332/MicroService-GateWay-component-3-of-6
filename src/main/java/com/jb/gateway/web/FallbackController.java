package com.jb.gateway.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class FallbackController {


    @GetMapping("fallback/ServiceA")
    public String fallbackA(){
        return "API Gateway Service-A fallback";
    }

    @GetMapping("fallback/ServiceB")
    public String fallbackB(){
        return "API Gateway Service-B fallback";
    }


}
