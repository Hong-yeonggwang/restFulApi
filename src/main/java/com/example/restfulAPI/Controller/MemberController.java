package com.example.restfulAPI.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.restfulAPI.DTO.MemberInfoDTO;

@RestController
@RequestMapping("/api/v1/member")
public class MemberController {

    //http://localhost:8081/api/v1/member/join
    @PostMapping(value="/join")
    public String joinMember(@RequestBody MemberInfoDTO memberDTO){
        return memberDTO.getId();
    }
}
