package com.example.restfulAPI.JPA.Entity.member;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="member")
@Getter
@Setter
public class Member {
    @Id  // Primary Key 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // AUTO_INCREMENT 설정 (id값이 null일 경우 자동 생성)
    @Column(name = "member_no")  // 컬럼 지정
    private long memberSeq;
    @Column(name = "mb_id")
    private String mbId;

    @Column(name = "mb_pwd")
    private String mbPassword;

    @Column(name = "mb_name")
    private String name;

    @Column(name = "mb_rank")
    private int rank;
    public Member(){}
    public Member(String id, String password, String name, int rank){
        this.mbId = id;
        this.mbPassword = password;
        this.name = name;
        this.rank = rank;
    }


}
