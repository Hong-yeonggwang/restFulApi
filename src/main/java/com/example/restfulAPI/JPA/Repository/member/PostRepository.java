package com.example.restfulAPI.JPA.Repository.member;

import com.example.restfulAPI.JPA.Entity.member.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    Post findByPostSeq(long postSeq);
}
