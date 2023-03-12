package com.example.restfulAPI.JPA.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_no")
    private Long commentSeq;
    @Column(name = "comment_contnet")
    private String content;
    @OneToOne
    @JoinColumn(name = "post_no")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "member_no")
    private Member member;

}
