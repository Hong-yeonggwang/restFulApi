package com.example.restfulAPI.JPA.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "file_no")
    private Long fileSeq;
    @ManyToOne
    @JoinColumn(name ="post_no")
    private Post post;
    @Column(name = "file_type")
    private String fileType;
    @Column(name = "file_content")
    private String content;
    @Column(name = "file_path")
    private String filePath;
}
