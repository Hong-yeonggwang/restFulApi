package com.example.restfulAPI.JPA;

import com.example.restfulAPI.JPA.Entity.Board;
import com.example.restfulAPI.JPA.Entity.Member;
import com.example.restfulAPI.JPA.Entity.Post;
import com.example.restfulAPI.JPA.Repository.BoardRepository;
import com.example.restfulAPI.JPA.Repository.MemberRepository;
import com.example.restfulAPI.JPA.Repository.PostRepository;
import com.example.restfulAPI.RestfulApiApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PostRepositoryTests extends RestfulApiApplicationTests {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void insertData(){
//        Post post = new Post();
//
//        List<Member> member = memberRepository.findByMemberSeq((long)2);
//
//        List<Board> board = boardRepository.findByBoardSeq((long)2);
//        post.setBoard(board.get(0));
//        post.setSubject("테스트데이터");
//        post.setContent("일대일 매핑 실습중");
//        post.setMember(member.get(0));
//
//        postRepository.save(post);

        Post selectPost = postRepository.findByPostSeq((long)2);

        System.out.println(selectPost.getBoard().getName());
        System.out.println(selectPost.getMember().getMemberSeq());
    }
}
