package com.example.restfulAPI.JPA;

import com.example.restfulAPI.JPA.Entity.Member;
import com.example.restfulAPI.JPA.Repository.MemberRepository;
import com.example.restfulAPI.RestfulApiApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class memberRepositoryTests extends RestfulApiApplicationTests {  // JpaRepository를 상속하여 사용. <객체, ID>
//    @Autowired
//    private PostRepository postRepository;
    @Autowired
    private MemberRepository memberRepository;
//    @Autowired
//    private MemberService memberService;
    @Test
    public void create(){
//        MemberInfoDTO memberDTO = new MemberInfoDTO();
//        memberDTO.setId("영광쿤");
//        memberDTO.setName("영광쿤");
//        memberDTO.setPassword("영광쿤");
//        memberService.memberJoin(memberDTO);
        Member exampleMember = new Member();
        exampleMember.setName("임백윤");
        Example<Member> example1 = Example.of(exampleMember);
        Optional<Member> member1 = memberRepository.findOne(example1);
        Member member = member1.orElseGet(Member::new);
        System.out.println(member.getPassword());

    }
}