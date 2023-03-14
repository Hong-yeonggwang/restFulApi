package com.example.restfulAPI.DAO;

import com.example.restfulAPI.DTO.MemberInfoDTO;
import com.example.restfulAPI.DTO.MemberLoginDTO;

public interface MemberDAO {
    public void joinMember(MemberInfoDTO memberInfo);
    public void loginMember(MemberLoginDTO memberloginDTO);
}
