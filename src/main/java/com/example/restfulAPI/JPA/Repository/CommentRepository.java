package com.example.restfulAPI.JPA.Repository;

import com.example.restfulAPI.JPA.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
