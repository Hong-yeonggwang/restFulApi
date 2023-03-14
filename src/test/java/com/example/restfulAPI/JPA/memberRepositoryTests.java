package com.example.restfulAPI.JPA;

import com.example.restfulAPI.JPA.Entity.Member;
import com.example.restfulAPI.JPA.Repository.MemberRepository;
import com.example.restfulAPI.RestfulApiApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
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
//        현재 예제로 생성한 서비스가 제대로 작동하는지 확인하는 코드이다. 매개변수를 정확히 받는다면, 오류가 없다,.
//        MemberInfoDTO memberDTO = new MemberInfoDTO();
//        memberDTO.setId("영광쿤");
//        memberDTO.setName("영광쿤");
//        memberDTO.setPassword("영광쿤");
//        memberService.memberJoin(memberDTO);

//        예제 객체를 만들어서 조회할 수 있다. 모든 컬럼이 정의되어있어야 오류가 나지 않으므로 확실한 정보가 있지 않으면
//        사용하지 않는것지 좋다.
//        Member exampleMember = new Member();
//        exampleMember.setMemberSeq(1);
//        exampleMember.setName("아이디");
//        exampleMember.setPassword("password");
//        exampleMember.setRank(10);
//        exampleMember.setName("yeonggwang");
//        Example<Member> example1 = Example.of(exampleMember);
//        Optional<Member> member1 = memberRepository.findOne(example1);
//        Member member = member1.orElseGet(Member::new);
//        System.out.println(member.getPassword());

        //객체를 하나만 조회할라면 findById를 사용하면된다. 하지만 객체가 빈값일 수있기 때문에 분기 처를 해줘야한다
        //그래서 orElse를 사용하면 편리하다. orElse(null)을하면 빈객체로 초기화한다. 이떄 분기를 처리해줘서 로직의 흐름을 정리해야함.
//        Member member = memberRepository.findById((long)1).orElse(null);
//        System.out.println(member.getName());

        Member member = memberRepository.findBymbId("임백");
        if(member == null){

        }
        else{
            System.out.println(member.getName());
        }
    }
}