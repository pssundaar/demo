package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/rest/")
public class HelloResource {

    @GetMapping(path = "/hello")
    public Map<String, String> sayHello() {
        HashMap<String, String> map = new HashMap<>();
        map.put("fulfillmentText", "Hi");
        return map;
    }

}
