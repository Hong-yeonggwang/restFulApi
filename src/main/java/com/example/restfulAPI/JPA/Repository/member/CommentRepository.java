package com.example.restfulAPI.JPA.Repository.member;

import com.example.restfulAPI.JPA.Entity.member.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
