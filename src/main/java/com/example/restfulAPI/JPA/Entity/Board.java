package com.example.restfulAPI.JPA.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="board_no")
    private Long boardSeq;

    @Column(name = "board_name")
    private String name;


}
