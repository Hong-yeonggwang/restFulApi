package com.example.restfulAPI.Service;

import com.example.restfulAPI.DTO.MemberInfoDTO;
import com.example.restfulAPI.DTO.MemberLoginDTO;

public interface MemberService {
    public void memberJoin(MemberInfoDTO member);
    public void memberLogin(MemberLoginDTO memberLoginDTO);
}
