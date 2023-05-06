package com.example.restfulAPI.JPA.Entity.bus;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "BUSSTOP")
public class BusStop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="BUSSTOPSEQ")
    private Long busStopSeq;

    @Column(name = "BUSSTOP")
    private String busStop;

    @Column(name = "ATITUDE")
    private String atitude;

    @Column(name = "LONGITUDE")
    private String longitude;

    @Column(name = "BUSSTOPLINE")
    private String busStopLine; // 상행,하행

    @Column(name = "BUSSTOPORDER")
    private int busStopOrder;

    @OneToOne
    @JoinColumn(name = "BUSSLINESEQ")
    private BusLine busLineSeq;
}
