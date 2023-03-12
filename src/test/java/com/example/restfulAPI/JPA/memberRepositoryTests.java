package com.example.restfulAPI.JPA;

import com.example.restfulAPI.JPA.Entity.Member;
import com.example.restfulAPI.JPA.Repository.MemberRepository;
import com.example.restfulAPI.RestfulApiApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class memberRepositoryTests extends RestfulApiApplicationTests {  // JpaRepository를 상속하여 사용. <객체, ID>
    @Autowired
    private MemberRepository TestA;

    @Test
    public void create(){
        Member member1 = new Member();

//
//        member1.setId("id");
//        member1.setPassword("chamsk0808");
//        member1.setName("ghddudrhkd");
//        member1.setRank(10);
        List<Member> oneMember = TestA.findByMemberSeq((long)1);
//        List<Member> membername = TestA.findAll();
//        Member newMember = TestA.save(member1);
//        for(Member obj:membername){
//            System.out.println(obj.getId());
//        }
//        membername.forEach(s -> System.out.println(s.getMember_seq()));
        System.out.println(oneMember.get(0).getId());

    }
}