package com.example.restfulAPI.JPA.Entity.member;

import lombok.Setter;
import lombok.Getter;
import javax.persistence.*;

@Entity
@Table(name = "post")
@Getter
@Setter
public class Post {
    @Id  // Primary Key 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // AUTO_INCREMENT 설정 (id값이 null일 경우 자동 생성)
    @Column(name = "post_no")  // 컬럼 지정
    private long postSeq;

    @Column(name = "post_subject")
    private String subject;

    @Column(name = "post_content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "member_no")
    private Member member;

    @ManyToOne
    @JoinColumn(name= "board_no")
    private Board board;

}


