package com.example.restfulAPI.JPA.Entity.bus;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "BUSLINE")
public class BusLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="BUSTLINESEQ")
    private Long busLineSeq;

    @Column(name = "BUSLINE")
    private String busLine;

    @Column(name = "BUSLINESTATE")
    private String busLineState;

    @ManyToOne
    @JoinColumn(name = "BUSTYPESEQ")
    private BusType busTypeSeq;
}
