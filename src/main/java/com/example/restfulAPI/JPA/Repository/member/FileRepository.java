package com.example.restfulAPI.JPA.Repository.member;

import com.example.restfulAPI.JPA.Entity.member.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File,Long> {
}
