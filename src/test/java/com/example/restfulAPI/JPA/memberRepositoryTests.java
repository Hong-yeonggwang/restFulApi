package com.example.restfulAPI.JPA;

import com.example.restfulAPI.RestfulApiApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class memberRepositoryTests extends RestfulApiApplicationTests {  // JpaRepository를 상속하여 사용. <객체, ID>
    @Autowired
    private memberRepository TestA;

    @Test
    public void create(){
        Member member1 = new Member();

        member1.setPassword("chamsk0808");
        member1.setName("ghddudrhkd");
        member1.setRank(10);

        System.out.println(member1.getId());
        System.out.println(member1.getPassword());

        Member newMember = TestA.save(member1);
    }
}