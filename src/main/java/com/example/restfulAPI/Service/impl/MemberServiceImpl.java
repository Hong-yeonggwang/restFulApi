package com.example.restfulAPI.Service.impl;

import com.example.restfulAPI.DAO.MemberDAO;
import com.example.restfulAPI.DTO.MemberInfoDTO;
import com.example.restfulAPI.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    private MemberDAO DAO;
    @Autowired
    public MemberServiceImpl(MemberDAO DAO){this.DAO = DAO;}
    @Override
    public void memberJoin(MemberInfoDTO member){
        DAO.joinMember(member);
    }
}
