package com.springboot.api.controller;

import com.springboot.api.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1/post-api")
public class PostController {

    @RequestMapping(value = "/domain", method = RequestMethod.POST)
    public String postExample(){
        return "Hello Post API";
    }

    @PostMapping("/member")
    public String postMember(@RequestBody Map<String,String> postData){
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map->
                sb.append(map.getKey() + " : " + map.getValue() + "\n"));

        return sb.toString();
    }
    /*
    {
        "name" : "CCN",
        "email" : "ccn@naver.com",
        "organization" : "LDCC"
    }
    */
    @PostMapping("/member2")
    public String postMember2(@RequestBody MemberDto memberDto){

        return memberDto.toString();
    }
}
