package com.example.restfulAPI.Controller;

import com.example.restfulAPI.DTO.MemberLoginDTO;
import com.example.restfulAPI.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.restfulAPI.DTO.MemberInfoDTO;

@RestController
@RequestMapping("/api/v1/member")
public class MemberController {
    private MemberService memberService;
    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    //http://localhost:8081/api/v1/member/join
    @PostMapping(value="/join")
    public void joinMember(@RequestBody MemberInfoDTO memberDTO){
        memberService.memberJoin(memberDTO);
    }
    @PostMapping(value = "/login")
    public void loginMember(@RequestBody MemberLoginDTO memberLoginDTO){
        memberService.memberLogin(memberLoginDTO);
    }
}
