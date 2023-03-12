package com.example.restfulAPI.JPA;

import com.example.restfulAPI.RestfulApiApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PostRepositoryTests extends RestfulApiApplicationTests {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void insertDataOneToOne(){
        Post post = new Post();
        Board board = new Board();

        board.setName("광장");
        boardRepository.save(board);

        post.setBoard(board);
        post.setBoardNo(1);
        post.setSubject("테스트데이터");
        post.setContent("일대일 매핑 실습중");
        post.setMemberNo(1);

        postRepository.save(post);


    }
}
