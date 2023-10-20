package com.springboot.api.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/vi/get-api")
public class GetController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hello Wolrd";
    }

    @GetMapping(value = "/name")
    public String getName(){
        return "Flature";
    }
    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable){
        return variable;
    }

    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param){
        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }
}
