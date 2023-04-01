package com.example.restfulAPI.JPA.Repository.member;

import com.example.restfulAPI.JPA.Entity.member.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findByBoardSeq(long boardSeq);
}
