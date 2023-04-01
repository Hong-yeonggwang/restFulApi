package com.example.restfulAPI.JPA.Entity.bus;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="LOCATIONSEQ")
    private Long locationSeq;

    @Column(name = "ATITUDE")
    private String atitude;

    @Column(name = "LONGITUDE")
    private String longitude;

    @Column(name = "LOCATIONTIME")
    private LocalDateTime locationTime;

    @ManyToOne
    @JoinColumn(name = "DEVICESEQ")
    private Device deviceSeq;

    @ManyToOne
    @JoinColumn(name = "BUSSTOPSEQ")
    private BusStop busStopSeq;
}
