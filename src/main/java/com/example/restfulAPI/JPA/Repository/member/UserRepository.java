package com.example.restfulAPI.JPA.Repository.member;

import com.example.restfulAPI.JPA.Entity.member.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User getByUid(String uid);
}
