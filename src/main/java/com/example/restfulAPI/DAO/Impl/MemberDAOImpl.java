package com.example.restfulAPI.DAO.Impl;

import com.example.restfulAPI.DAO.MemberDAO;
import com.example.restfulAPI.DTO.MemberInfoDTO;
import com.example.restfulAPI.DTO.MemberLoginDTO;
import com.example.restfulAPI.JPA.Entity.Member;
import com.example.restfulAPI.JPA.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDAOImpl implements MemberDAO {
    private MemberRepository memberRepository;
    @Autowired
    public MemberDAOImpl(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Override
    public void joinMember(MemberInfoDTO memberInfo){
        Member member = new Member(memberInfo.getId(),memberInfo.getPassword(),memberInfo.getName(),1);
        memberRepository.save(member);
        memberRepository.flush();
    }
    @Override
    public void loginMember(MemberLoginDTO memberLoginDTO){
        Member memberInDB = memberRepository.findBymbId(memberLoginDTO.getId());
        if(memberInDB != null){
            System.out.println(memberInDB.getMbPassword());
        }
        else{
            System.out.println("없는 정보입니다.");
        }
    }

}
