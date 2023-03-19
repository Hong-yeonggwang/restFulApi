package com.example.restfulAPI.JPA.Repository;

import com.example.restfulAPI.JPA.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User getByUid(String uid);
}
